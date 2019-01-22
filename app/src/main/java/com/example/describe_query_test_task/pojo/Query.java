package com.example.describe_query_test_task.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

public class Query {

    @SerializedName("totalSize")
    @Expose
    private Integer totalSize;
    @SerializedName("done")
    @Expose
    private Boolean done;
    @SerializedName("nextRecordsUrl")
    @Expose
    private String nextRecordsUrl;
    @SerializedName("records")
    @Expose
    private List<JSONObject> records = null;

    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public String getNextRecordsUrl() {
        return nextRecordsUrl;
    }

    public void setNextRecordsUrl(String nextRecordsUrl) {
        this.nextRecordsUrl = nextRecordsUrl;
    }

    public List<JSONObject> getRecords() {
        return records;
    }

    public void setRecords(List<JSONObject> records) {
        this.records = records;
    }
}