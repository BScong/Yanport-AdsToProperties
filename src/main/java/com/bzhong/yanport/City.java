
package com.bzhong.yanport;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class City implements Serializable
{

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("deptCode")
    @Expose
    private String deptCode;
    @SerializedName("deptName")
    @Expose
    private String deptName;
    @SerializedName("zipCodes")
    @Expose
    private List<String> zipCodes = new ArrayList<String>();
    @SerializedName("usageName")
    @Expose
    private String usageName;
    @SerializedName("regionName")
    @Expose
    private String regionName;
    private final static long serialVersionUID = -4878591254092962298L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public City() {
    }

    /**
     * 
     * @param usageName
     * @param deptName
     * @param id
     * @param zipCodes
     * @param regionName
     * @param deptCode
     */
    public City(long id, String deptCode, String deptName, List<String> zipCodes, String usageName, String regionName) {
        super();
        this.id = id;
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.zipCodes = zipCodes;
        this.usageName = usageName;
        this.regionName = regionName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<String> getZipCodes() {
        return zipCodes;
    }

    public void setZipCodes(List<String> zipCodes) {
        this.zipCodes = zipCodes;
    }

    public String getUsageName() {
        return usageName;
    }

    public void setUsageName(String usageName) {
        this.usageName = usageName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
    
    public boolean equals(City city){
        return this.id==city.getId();
    }

}
