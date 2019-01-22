
package com.example.describe_query_test_task.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ActionOverride {

    @SerializedName("formFactor")
    @Expose
    private String formFactor;
    @SerializedName("isAvailableInTouch")
    @Expose
    private Boolean isAvailableInTouch;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("pageId")
    @Expose
    private String pageId;
    @SerializedName("url")
    @Expose
    private Object url;

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public Boolean getIsAvailableInTouch() {
        return isAvailableInTouch;
    }

    public void setIsAvailableInTouch(Boolean isAvailableInTouch) {
        this.isAvailableInTouch = isAvailableInTouch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

}
