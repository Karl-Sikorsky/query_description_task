
package com.example.describe_query_test_task.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChildRelationship {

    @SerializedName("cascadeDelete")
    @Expose
    private Boolean cascadeDelete;
    @SerializedName("childSObject")
    @Expose
    private String childSObject;
    @SerializedName("deprecatedAndHidden")
    @Expose
    private Boolean deprecatedAndHidden;
    @SerializedName("field")
    @Expose
    private String field;
    @SerializedName("junctionIdListNames")
    @Expose
    private List<Object> junctionIdListNames = null;
    @SerializedName("junctionReferenceTo")
    @Expose
    private List<Object> junctionReferenceTo = null;
    @SerializedName("relationshipName")
    @Expose
    private String relationshipName;
    @SerializedName("restrictedDelete")
    @Expose
    private Boolean restrictedDelete;

    public Boolean getCascadeDelete() {
        return cascadeDelete;
    }

    public void setCascadeDelete(Boolean cascadeDelete) {
        this.cascadeDelete = cascadeDelete;
    }

    public String getChildSObject() {
        return childSObject;
    }

    public void setChildSObject(String childSObject) {
        this.childSObject = childSObject;
    }

    public Boolean getDeprecatedAndHidden() {
        return deprecatedAndHidden;
    }

    public void setDeprecatedAndHidden(Boolean deprecatedAndHidden) {
        this.deprecatedAndHidden = deprecatedAndHidden;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public List<Object> getJunctionIdListNames() {
        return junctionIdListNames;
    }

    public void setJunctionIdListNames(List<Object> junctionIdListNames) {
        this.junctionIdListNames = junctionIdListNames;
    }

    public List<Object> getJunctionReferenceTo() {
        return junctionReferenceTo;
    }

    public void setJunctionReferenceTo(List<Object> junctionReferenceTo) {
        this.junctionReferenceTo = junctionReferenceTo;
    }

    public String getRelationshipName() {
        return relationshipName;
    }

    public void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName;
    }

    public Boolean getRestrictedDelete() {
        return restrictedDelete;
    }

    public void setRestrictedDelete(Boolean restrictedDelete) {
        this.restrictedDelete = restrictedDelete;
    }

}
