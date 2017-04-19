
package com.bzhong.yanport;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IndexedProperty implements Serializable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("ads")
    @Expose
    private List<Ad> ads = new ArrayList<Ad>();
    @SerializedName("consistent")
    @Expose
    private boolean consistent;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("crawlSources")
    @Expose
    private List<String> crawlSources = new ArrayList<String>();
    @SerializedName("marketingType")
    @Expose
    private String marketingType;
    @SerializedName("propertyType")
    @Expose
    private String propertyType;
    @SerializedName("roomCount")
    @Expose
    private long roomCount;
    @SerializedName("surface")
    @Expose
    private double surface;
    @SerializedName("furnished")
    @Expose
    private boolean furnished;
    @SerializedName("newBuild")
    @Expose
    private boolean newBuild;
    @SerializedName("exclusiveMandate")
    @Expose
    private boolean exclusiveMandate;
    @SerializedName("publicationDate")
    @Expose
    private String publicationDate;
    @SerializedName("deleteDate")
    @Expose
    private String deleteDate;
    @SerializedName("durationDays")
    @Expose
    private long durationDays;
    @SerializedName("lastPriceDecreaseDate")
    @Expose
    private String lastPriceDecreaseDate;
    @SerializedName("zipCode")
    @Expose
    private String zipCode;
    @SerializedName("city")
    @Expose
    private City city;
    @SerializedName("dealers")
    @Expose
    private List<Dealer> dealers = new ArrayList<Dealer>();
    @SerializedName("fees")
    @Expose
    private double fees;
    @SerializedName("rentalExpenses")
    @Expose
    private double rentalExpenses;
    @SerializedName("price")
    @Expose
    private double price;
    @SerializedName("priceHC")
    @Expose
    private double priceHC;
    @SerializedName("priceCC")
    @Expose
    private double priceCC;
    @SerializedName("priceM2")
    @Expose
    private double priceM2;
    @SerializedName("priceM2HC")
    @Expose
    private double priceM2HC;
    @SerializedName("priceM2CC")
    @Expose
    private double priceM2CC;
    private final static long serialVersionUID = -3707054402278187852L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public IndexedProperty() {
    }

    /**
     * 
     * @param dealers
     * @param crawlSources
     * @param surface
     * @param lastPriceDecreaseDate
     * @param deleteDate
     * @param newBuild
     * @param rentalExpenses
     * @param priceHC
     * @param fees
     * @param priceM2
     * @param marketingType
     * @param priceM2HC
     * @param city
     * @param id
     * @param furnished
     * @param exclusiveMandate
     * @param price
     * @param propertyType
     * @param roomCount
     * @param description
     * @param zipCode
     * @param priceM2CC
     * @param durationDays
     * @param ads
     * @param consistent
     * @param priceCC
     * @param publicationDate
     */
    public IndexedProperty(String id, List<Ad> ads, boolean consistent, String description, List<String> crawlSources, String marketingType, String propertyType, long roomCount, double surface, boolean furnished, boolean newBuild, boolean exclusiveMandate, String publicationDate, String deleteDate, long durationDays, String lastPriceDecreaseDate, String zipCode, City city, List<Dealer> dealers, double fees, double rentalExpenses, double price, double priceHC, double priceCC, double priceM2, double priceM2HC, double priceM2CC) {
        super();
        this.id = id;
        this.ads = ads;
        this.consistent = consistent;
        this.description = description;
        this.crawlSources = crawlSources;
        this.marketingType = marketingType;
        this.propertyType = propertyType;
        this.roomCount = roomCount;
        this.surface = surface;
        this.furnished = furnished;
        this.newBuild = newBuild;
        this.exclusiveMandate = exclusiveMandate;
        this.publicationDate = publicationDate;
        this.deleteDate = deleteDate;
        this.durationDays = durationDays;
        this.lastPriceDecreaseDate = lastPriceDecreaseDate;
        this.zipCode = zipCode;
        this.city = city;
        this.dealers = dealers;
        this.fees = fees;
        this.rentalExpenses = rentalExpenses;
        this.price = price;
        this.priceHC = priceHC;
        this.priceCC = priceCC;
        this.priceM2 = priceM2;
        this.priceM2HC = priceM2HC;
        this.priceM2CC = priceM2CC;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Ad> getAds() {
        return ads;
    }

    public void setAds(List<Ad> ads) {
        this.ads = ads;
    }
    
    public void addAd(Ad a){
        this.ads.add(a);
    }

    public boolean isConsistent() {
        return consistent;
    }

    public void setConsistent(boolean consistent) {
        this.consistent = consistent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getCrawlSources() {
        return crawlSources;
    }

    public void setCrawlSources(List<String> crawlSources) {
        this.crawlSources = crawlSources;
    }

    public String getMarketingType() {
        return marketingType;
    }

    public void setMarketingType(String marketingType) {
        this.marketingType = marketingType;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public long getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(long roomCount) {
        this.roomCount = roomCount;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public boolean isFurnished() {
        return furnished;
    }

    public void setFurnished(boolean furnished) {
        this.furnished = furnished;
    }

    public boolean isNewBuild() {
        return newBuild;
    }

    public void setNewBuild(boolean newBuild) {
        this.newBuild = newBuild;
    }

    public boolean isExclusiveMandate() {
        return exclusiveMandate;
    }

    public void setExclusiveMandate(boolean exclusiveMandate) {
        this.exclusiveMandate = exclusiveMandate;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(String deleteDate) {
        this.deleteDate = deleteDate;
    }

    public long getDurationDays() {
        return durationDays;
    }

    public void setDurationDays(long durationDays) {
        this.durationDays = durationDays;
    }

    public String getLastPriceDecreaseDate() {
        return lastPriceDecreaseDate;
    }

    public void setLastPriceDecreaseDate(String lastPriceDecreaseDate) {
        this.lastPriceDecreaseDate = lastPriceDecreaseDate;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Dealer> getDealers() {
        return dealers;
    }

    public void setDealers(List<Dealer> dealers) {
        this.dealers = dealers;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public double getRentalExpenses() {
        return rentalExpenses;
    }

    public void setRentalExpenses(double rentalExpenses) {
        this.rentalExpenses = rentalExpenses;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceHC() {
        return priceHC;
    }

    public void setPriceHC(double priceHC) {
        this.priceHC = priceHC;
    }

    public double getPriceCC() {
        return priceCC;
    }

    public void setPriceCC(double priceCC) {
        this.priceCC = priceCC;
    }

    public double getPriceM2() {
        return priceM2;
    }

    public void setPriceM2(double priceM2) {
        this.priceM2 = priceM2;
    }

    public double getPriceM2HC() {
        return priceM2HC;
    }

    public void setPriceM2HC(double priceM2HC) {
        this.priceM2HC = priceM2HC;
    }

    public double getPriceM2CC() {
        return priceM2CC;
    }

    public void setPriceM2CC(double priceM2CC) {
        this.priceM2CC = priceM2CC;
    }
    
    public boolean isSameProperty(String marketingType, String type, long rooms, double surf, boolean furniture, boolean newBuild, String zip, City c, double price)
    {
        try{
            if(marketingType.equals(this.marketingType) && type.equals(this.propertyType) && rooms == this.roomCount && surf == this.surface && furniture == this.furnished && newBuild == this.newBuild && zip.equals(this.zipCode) && c.equals(this.city) && price==this.price){
                return true;
            }
        } catch (Exception e)
        {    
        }

        return false;
    }

}
