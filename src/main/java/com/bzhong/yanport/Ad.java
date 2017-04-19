
package com.bzhong.yanport;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ad implements Serializable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("imageUrls")
    @Expose
    private List<String> imageUrls = new ArrayList<String>();
    @SerializedName("publicationDate")
    @Expose
    private String publicationDate;
    @SerializedName("deleteDate")
    @Expose
    private String deleteDate;
    @SerializedName("areAgenciesUnwanted")
    @Expose
    private boolean areAgenciesUnwanted;
    @SerializedName("exclusiveMandate")
    @Expose
    private boolean exclusiveMandate;
    @SerializedName("crawlSource")
    @Expose
    private String crawlSource;
    @SerializedName("referenceNumber")
    @Expose
    private String referenceNumber;
    @SerializedName("dealer")
    @Expose
    private Dealer dealer;
    @SerializedName("price")
    @Expose
    private double price;
    @SerializedName("events")
    @Expose
    private List<Event> events = new ArrayList<Event>();
    @SerializedName("deposit")
    @Expose
    private double deposit;
    @SerializedName("fees")
    @Expose
    private double fees;
    @SerializedName("feesIncluded")
    @Expose
    private boolean feesIncluded;
    @SerializedName("rentalExpenses")
    @Expose
    private double rentalExpenses;
    @SerializedName("rentalExpensesIncluded")
    @Expose
    private boolean rentalExpensesIncluded;
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
    private final static long serialVersionUID = -1767018615972285244L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Ad() {
    }

    /**
     * 
     * @param deleteDate
     * @param rentalExpenses
     * @param deposit
     * @param events
     * @param referenceNumber
     * @param priceHC
     * @param imageUrls
     * @param crawlSource
     * @param fees
     * @param priceM2
     * @param rentalExpensesIncluded
     * @param priceM2HC
     * @param url
     * @param feesIncluded
     * @param areAgenciesUnwanted
     * @param id
     * @param dealer
     * @param exclusiveMandate
     * @param price
     * @param priceM2CC
     * @param priceCC
     * @param publicationDate
     */
    public Ad(String id, String url, List<String> imageUrls, String publicationDate, String deleteDate, boolean areAgenciesUnwanted, boolean exclusiveMandate, String crawlSource, String referenceNumber, Dealer dealer, double price, List<Event> events, double deposit, double fees, boolean feesIncluded, double rentalExpenses, boolean rentalExpensesIncluded, double priceHC, double priceCC, double priceM2, double priceM2HC, double priceM2CC) {
        super();
        this.id = id;
        this.url = url;
        this.imageUrls = imageUrls;
        this.publicationDate = publicationDate;
        this.deleteDate = deleteDate;
        this.areAgenciesUnwanted = areAgenciesUnwanted;
        this.exclusiveMandate = exclusiveMandate;
        this.crawlSource = crawlSource;
        this.referenceNumber = referenceNumber;
        this.dealer = dealer;
        this.price = price;
        this.events = events;
        this.deposit = deposit;
        this.fees = fees;
        this.feesIncluded = feesIncluded;
        this.rentalExpenses = rentalExpenses;
        this.rentalExpensesIncluded = rentalExpensesIncluded;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
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

    public boolean isAreAgenciesUnwanted() {
        return areAgenciesUnwanted;
    }

    public void setAreAgenciesUnwanted(boolean areAgenciesUnwanted) {
        this.areAgenciesUnwanted = areAgenciesUnwanted;
    }

    public boolean isExclusiveMandate() {
        return exclusiveMandate;
    }

    public void setExclusiveMandate(boolean exclusiveMandate) {
        this.exclusiveMandate = exclusiveMandate;
    }

    public String getCrawlSource() {
        return crawlSource;
    }

    public void setCrawlSource(String crawlSource) {
        this.crawlSource = crawlSource;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public boolean isFeesIncluded() {
        return feesIncluded;
    }

    public void setFeesIncluded(boolean feesIncluded) {
        this.feesIncluded = feesIncluded;
    }

    public double getRentalExpenses() {
        return rentalExpenses;
    }

    public void setRentalExpenses(double rentalExpenses) {
        this.rentalExpenses = rentalExpenses;
    }

    public boolean isRentalExpensesIncluded() {
        return rentalExpensesIncluded;
    }

    public void setRentalExpensesIncluded(boolean rentalExpensesIncluded) {
        this.rentalExpensesIncluded = rentalExpensesIncluded;
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

}
