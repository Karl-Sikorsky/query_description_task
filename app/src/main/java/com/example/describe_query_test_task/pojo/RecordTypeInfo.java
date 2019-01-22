
package com.example.describe_query_test_task.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecordTypeInfo {

    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("available")
    @Expose
    private Boolean available;
    @SerializedName("defaultRecordTypeMapping")
    @Expose
    private Boolean defaultRecordTypeMapping;
    @SerializedName("developerName")
    @Expose
    private String developerName;
    @SerializedName("master")
    @Expose
    private Boolean master;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("recordTypeId")
    @Expose
    private String recordTypeId;
    @SerializedName("urls")
    @Expose
    private Urls urls;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Boolean getDefaultRecordTypeMapping() {
        return defaultRecordTypeMapping;
    }

    public void setDefaultRecordTypeMapping(Boolean defaultRecordTypeMapping) {
        this.defaultRecordTypeMapping = defaultRecordTypeMapping;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public Boolean getMaster() {
        return master;
    }

    public void setMaster(Boolean master) {
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecordTypeId() {
        return recordTypeId;
    }

    public void setRecordTypeId(String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }

    public Urls getUrls() {
        return urls;
    }

    public void setUrls(Urls urls) {
        this.urls = urls;
    }

}
