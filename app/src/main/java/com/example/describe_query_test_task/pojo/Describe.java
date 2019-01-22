
package com.example.describe_query_test_task.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Describe {

    @SerializedName("actionOverrides")
    @Expose
    private List<ActionOverride> actionOverrides = null;
    @SerializedName("activateable")
    @Expose
    private Boolean activateable;
    @SerializedName("childRelationships")
    @Expose
    private List<ChildRelationship> childRelationships = null;
    @SerializedName("compactLayoutable")
    @Expose
    private Boolean compactLayoutable;
    @SerializedName("createable")
    @Expose
    private Boolean createable;
    @SerializedName("custom")
    @Expose
    private Boolean custom;
    @SerializedName("customSetting")
    @Expose
    private Boolean customSetting;
    @SerializedName("deletable")
    @Expose
    private Boolean deletable;
    @SerializedName("deprecatedAndHidden")
    @Expose
    private Boolean deprecatedAndHidden;
    @SerializedName("feedEnabled")
    @Expose
    private Boolean feedEnabled;
    @SerializedName("fields")
    @Expose
    private List<Field> fields = null;
    @SerializedName("hasSubtypes")
    @Expose
    private Boolean hasSubtypes;
    @SerializedName("isSubtype")
    @Expose
    private Boolean isSubtype;
    @SerializedName("keyPrefix")
    @Expose
    private String keyPrefix;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("labelPlural")
    @Expose
    private String labelPlural;
    @SerializedName("layoutable")
    @Expose
    private Boolean layoutable;
    @SerializedName("listviewable")
    @Expose
    private Object listviewable;
    @SerializedName("lookupLayoutable")
    @Expose
    private Object lookupLayoutable;
    @SerializedName("mergeable")
    @Expose
    private Boolean mergeable;
    @SerializedName("mruEnabled")
    @Expose
    private Boolean mruEnabled;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("namedLayoutInfos")
    @Expose
    private List<Object> namedLayoutInfos = null;
    @SerializedName("networkScopeFieldName")
    @Expose
    private Object networkScopeFieldName;
    @SerializedName("queryable")
    @Expose
    private Boolean queryable;
    @SerializedName("recordTypeInfos")
    @Expose
    private List<RecordTypeInfo> recordTypeInfos = null;
    @SerializedName("replicateable")
    @Expose
    private Boolean replicateable;
    @SerializedName("retrieveable")
    @Expose
    private Boolean retrieveable;
    @SerializedName("searchLayoutable")
    @Expose
    private Boolean searchLayoutable;
    @SerializedName("searchable")
    @Expose
    private Boolean searchable;
    @SerializedName("supportedScopes")
    @Expose
    private List<SupportedScope> supportedScopes = null;
    @SerializedName("triggerable")
    @Expose
    private Boolean triggerable;
    @SerializedName("undeletable")
    @Expose
    private Boolean undeletable;
    @SerializedName("updateable")
    @Expose
    private Boolean updateable;
    @SerializedName("urls")
    @Expose
    private Urls_ urls;

    public List<ActionOverride> getActionOverrides() {
        return actionOverrides;
    }

    public void setActionOverrides(List<ActionOverride> actionOverrides) {
        this.actionOverrides = actionOverrides;
    }

    public Boolean getActivateable() {
        return activateable;
    }

    public void setActivateable(Boolean activateable) {
        this.activateable = activateable;
    }

    public List<ChildRelationship> getChildRelationships() {
        return childRelationships;
    }

    public void setChildRelationships(List<ChildRelationship> childRelationships) {
        this.childRelationships = childRelationships;
    }

    public Boolean getCompactLayoutable() {
        return compactLayoutable;
    }

    public void setCompactLayoutable(Boolean compactLayoutable) {
        this.compactLayoutable = compactLayoutable;
    }

    public Boolean getCreateable() {
        return createable;
    }

    public void setCreateable(Boolean createable) {
        this.createable = createable;
    }

    public Boolean getCustom() {
        return custom;
    }

    public void setCustom(Boolean custom) {
        this.custom = custom;
    }

    public Boolean getCustomSetting() {
        return customSetting;
    }

    public void setCustomSetting(Boolean customSetting) {
        this.customSetting = customSetting;
    }

    public Boolean getDeletable() {
        return deletable;
    }

    public void setDeletable(Boolean deletable) {
        this.deletable = deletable;
    }

    public Boolean getDeprecatedAndHidden() {
        return deprecatedAndHidden;
    }

    public void setDeprecatedAndHidden(Boolean deprecatedAndHidden) {
        this.deprecatedAndHidden = deprecatedAndHidden;
    }

    public Boolean getFeedEnabled() {
        return feedEnabled;
    }

    public void setFeedEnabled(Boolean feedEnabled) {
        this.feedEnabled = feedEnabled;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public Boolean getHasSubtypes() {
        return hasSubtypes;
    }

    public void setHasSubtypes(Boolean hasSubtypes) {
        this.hasSubtypes = hasSubtypes;
    }

    public Boolean getIsSubtype() {
        return isSubtype;
    }

    public void setIsSubtype(Boolean isSubtype) {
        this.isSubtype = isSubtype;
    }

    public String getKeyPrefix() {
        return keyPrefix;
    }

    public void setKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabelPlural() {
        return labelPlural;
    }

    public void setLabelPlural(String labelPlural) {
        this.labelPlural = labelPlural;
    }

    public Boolean getLayoutable() {
        return layoutable;
    }

    public void setLayoutable(Boolean layoutable) {
        this.layoutable = layoutable;
    }

    public Object getListviewable() {
        return listviewable;
    }

    public void setListviewable(Object listviewable) {
        this.listviewable = listviewable;
    }

    public Object getLookupLayoutable() {
        return lookupLayoutable;
    }

    public void setLookupLayoutable(Object lookupLayoutable) {
        this.lookupLayoutable = lookupLayoutable;
    }

    public Boolean getMergeable() {
        return mergeable;
    }

    public void setMergeable(Boolean mergeable) {
        this.mergeable = mergeable;
    }

    public Boolean getMruEnabled() {
        return mruEnabled;
    }

    public void setMruEnabled(Boolean mruEnabled) {
        this.mruEnabled = mruEnabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getNamedLayoutInfos() {
        return namedLayoutInfos;
    }

    public void setNamedLayoutInfos(List<Object> namedLayoutInfos) {
        this.namedLayoutInfos = namedLayoutInfos;
    }

    public Object getNetworkScopeFieldName() {
        return networkScopeFieldName;
    }

    public void setNetworkScopeFieldName(Object networkScopeFieldName) {
        this.networkScopeFieldName = networkScopeFieldName;
    }

    public Boolean getQueryable() {
        return queryable;
    }

    public void setQueryable(Boolean queryable) {
        this.queryable = queryable;
    }

    public List<RecordTypeInfo> getRecordTypeInfos() {
        return recordTypeInfos;
    }

    public void setRecordTypeInfos(List<RecordTypeInfo> recordTypeInfos) {
        this.recordTypeInfos = recordTypeInfos;
    }

    public Boolean getReplicateable() {
        return replicateable;
    }

    public void setReplicateable(Boolean replicateable) {
        this.replicateable = replicateable;
    }

    public Boolean getRetrieveable() {
        return retrieveable;
    }

    public void setRetrieveable(Boolean retrieveable) {
        this.retrieveable = retrieveable;
    }

    public Boolean getSearchLayoutable() {
        return searchLayoutable;
    }

    public void setSearchLayoutable(Boolean searchLayoutable) {
        this.searchLayoutable = searchLayoutable;
    }

    public Boolean getSearchable() {
        return searchable;
    }

    public void setSearchable(Boolean searchable) {
        this.searchable = searchable;
    }

    public List<SupportedScope> getSupportedScopes() {
        return supportedScopes;
    }

    public void setSupportedScopes(List<SupportedScope> supportedScopes) {
        this.supportedScopes = supportedScopes;
    }

    public Boolean getTriggerable() {
        return triggerable;
    }

    public void setTriggerable(Boolean triggerable) {
        this.triggerable = triggerable;
    }

    public Boolean getUndeletable() {
        return undeletable;
    }

    public void setUndeletable(Boolean undeletable) {
        this.undeletable = undeletable;
    }

    public Boolean getUpdateable() {
        return updateable;
    }

    public void setUpdateable(Boolean updateable) {
        this.updateable = updateable;
    }

    public Urls_ getUrls() {
        return urls;
    }

    public void setUrls(Urls_ urls) {
        this.urls = urls;
    }

}
