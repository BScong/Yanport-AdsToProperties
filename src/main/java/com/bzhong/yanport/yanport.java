package com.bzhong.yanport;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Benoit
 */
public class yanport {
    public static void main(String[] args) throws FileNotFoundException
    {
        //Chargement Json
        Gson gson = new Gson();
        String filename = "C:/2017-03-29_annonces_paris.json";
        JsonReader reader = new JsonReader(new FileReader(filename));
        IndexedAd[] ads = gson.fromJson(reader, IndexedAd[].class);
        System.out.println(ads.length + " lignes");
        
        
        long idCount = 1; // idCount que l'on peut assimiler à un idProperty
        Map<Long, IndexedProperty> properties = new HashMap<>();
        System.out.println("Traitement en cours...");
        
        for(int i=0; i<ads.length;i++)
        {
            boolean added = false;
            IndexedAd ia = ads[i];
            Ad newAd = new Ad(ia.getId(),ia.getUrl(),ia.getImageUrls(), ia.getPublicationDate(), ia.getDeleteDate(), ia.isAreAgenciesUnwanted(), ia.isExclusiveMandate(), ia.getCrawlSource(), ia.getReferenceNumber(), ia.getDealer(), ia.getPrice(), ia.getEvents(), ia.getDeposit(), ia.getFees(), ia.isFeesIncluded(), ia.getRentalExpenses(), ia.isRentalExpensesIncluded(), ia.getPriceHC(), ia.getPriceCC(), ia.getPriceM2(), ia.getPriceM2HC(), ia.getPriceM2CC());
            
            for (IndexedProperty ip : properties.values())
            {
                //comparaison pour chaque ligne
                if(ip.isSameProperty(ia.getMarketingType(), ia.getPropertyType(), ia.getRoomCount(), ia.getSurface(), ia.isFurnished(), ia.isNewBuild(), ia.getZipCode(), ia.getCity(), ia.getPrice()))
                {
                    ip.addAd(newAd);
                    added = true;
                    //Mise à jour CrawlSources et Dealers (non testé)
                    if(!ip.getCrawlSources().contains(ia.getCrawlSource()))
                    {
                        ip.getCrawlSources().add(ia.getCrawlSource());
                    }
                    if(!ip.getDealers().contains(ia.getDealer()))
                    {
                        ip.getDealers().add(ia.getDealer());
                    }
                    break;
                }
            }
            if(!added)
            {
               List<Ad> adList = new ArrayList();
               adList.add(newAd);
               List<String> crawlSources = new ArrayList();
               crawlSources.add(ia.getCrawlSource()); 
               List<Dealer> dealers = new ArrayList();
               dealers.add(ia.getDealer());
               IndexedProperty newIp = new IndexedProperty(ia.getPropertyId(), adList, ia.isConsistent(), ia.getDescription(), crawlSources, ia.getMarketingType(), ia.getPropertyType(), ia.getRoomCount(), ia.getSurface(), ia.isFurnished(), ia.isNewBuild(), ia.isExclusiveMandate(), ia.getPublicationDate(), ia.getDeleteDate(), ia.getDurationDays(), null, ia.getZipCode(), ia.getCity(), dealers, ia.getFees(), ia.getRentalExpenses(), ia.getPrice(), ia.getPriceHC(), ia.getPriceCC(), ia.getPriceM2(), ia.getPriceM2HC(), ia.getPriceM2CC()) ;
                //LastDecreaseDate non gérée
              
               properties.put(idCount++, newIp);
            }
            
        } 
        
        System.out.println(properties.size() + " biens"); 
        
        //Ecriture des résultats en Json
        try
        {
            File fichier = new File("./biens_paris.json");
            fichier.createNewFile();
            FileOutputStream fOut = new FileOutputStream(fichier);
            OutputStreamWriter writer =new OutputStreamWriter(fOut);
            Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create(); //.setPrettyPrinting() pour lisibilité
            gsonBuilder.toJson(properties.values(), writer);
            writer.close();
            fOut.close();
        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
