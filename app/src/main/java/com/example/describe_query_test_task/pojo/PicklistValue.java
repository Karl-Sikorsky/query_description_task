
package com.example.describe_query_test_task.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PicklistValue {

    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("defaultValue")
    @Expose
    private Boolean defaultValue;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("validFor")
    @Expose
    private Object validFor;
    @SerializedName("value")
    @Expose
    private String value;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Boolean defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Object getValidFor() {
        return validFor;
    }

    public void setValidFor(Object validFor) {
        this.validFor = validFor;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
