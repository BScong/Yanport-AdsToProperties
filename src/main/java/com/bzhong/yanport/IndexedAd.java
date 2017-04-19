
package com.bzhong.yanport;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IndexedAd implements Serializable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("propertyId")
    @Expose
    private String propertyId;
    @SerializedName("consistent")
    @Expose
    private boolean consistent;
    @SerializedName("consistencyErrorMessages")
    @Expose
    private List<String> consistencyErrorMessages = new ArrayList<String>();
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("imageUrls")
    @Expose
    private List<String> imageUrls = new ArrayList<String>();
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("publicationDate")
    @Expose
    private String publicationDate;
    @SerializedName("deleteDate")
    @Expose
    private String deleteDate;
    @SerializedName("durationDays")
    @Expose
    private long durationDays;
    @SerializedName("surface")
    @Expose
    private double surface;
    @SerializedName("marketingType")
    @Expose
    private String marketingType;
    @SerializedName("propertyType")
    @Expose
    private String propertyType;
    @SerializedName("roomCount")
    @Expose
    private long roomCount;
    @SerializedName("furnished")
    @Expose
    private boolean furnished;
    @SerializedName("newBuild")
    @Expose
    private boolean newBuild;
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
    @SerializedName("zipCode")
    @Expose
    private String zipCode;
    @SerializedName("city")
    @Expose
    private City city;
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
    private final static long serialVersionUID = -2803120442726517940L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public IndexedAd() {
    }

    /**
     * 
     * @param surface
     * @param consistencyErrorMessages
     * @param newBuild
     * @param rentalExpenses
     * @param deposit
     * @param events
     * @param referenceNumber
     * @param areAgenciesUnwanted
     * @param city
     * @param id
     * @param dealer
     * @param title
     * @param exclusiveMandate
     * @param propertyId
     * @param roomCount
     * @param description
     * @param zipCode
     * @param publicationDate
     * @param deleteDate
     * @param priceHC
     * @param imageUrls
     * @param crawlSource
     * @param fees
     * @param priceM2
     * @param rentalExpensesIncluded
     * @param marketingType
     * @param priceM2HC
     * @param url
     * @param feesIncluded
     * @param furnished
     * @param price
     * @param propertyType
     * @param priceM2CC
     * @param durationDays
     * @param consistent
     * @param priceCC
     */
    public IndexedAd(String id, String propertyId, boolean consistent, List<String> consistencyErrorMessages, String title, String description, List<String> imageUrls, String url, String publicationDate, String deleteDate, long durationDays, double surface, String marketingType, String propertyType, long roomCount, boolean furnished, boolean newBuild, boolean areAgenciesUnwanted, boolean exclusiveMandate, String crawlSource, String referenceNumber, String zipCode, City city, Dealer dealer, double price, List<Event> events, double deposit, double fees, boolean feesIncluded, double rentalExpenses, boolean rentalExpensesIncluded, double priceHC, double priceCC, double priceM2, double priceM2HC, double priceM2CC) {
        super();
        this.id = id;
        this.propertyId = propertyId;
        this.consistent = consistent;
        this.consistencyErrorMessages = consistencyErrorMessages;
        this.title = title;
        this.description = description;
        this.imageUrls = imageUrls;
        this.url = url;
        this.publicationDate = publicationDate;
        this.deleteDate = deleteDate;
        this.durationDays = durationDays;
        this.surface = surface;
        this.marketingType = marketingType;
        this.propertyType = propertyType;
        this.roomCount = roomCount;
        this.furnished = furnished;
        this.newBuild = newBuild;
        this.areAgenciesUnwanted = areAgenciesUnwanted;
        this.exclusiveMandate = exclusiveMandate;
        this.crawlSource = crawlSource;
        this.referenceNumber = referenceNumber;
        this.zipCode = zipCode;
        this.city = city;
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

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public boolean isConsistent() {
        return consistent;
    }

    public void setConsistent(boolean consistent) {
        this.consistent = consistent;
    }

    public List<String> getConsistencyErrorMessages() {
        return consistencyErrorMessages;
    }

    public void setConsistencyErrorMessages(List<String> consistencyErrorMessages) {
        this.consistencyErrorMessages = consistencyErrorMessages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
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
