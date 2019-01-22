
package com.example.describe_query_test_task.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Field {

    @SerializedName("aggregatable")
    @Expose
    private Boolean aggregatable;
    @SerializedName("aiPredictionField")
    @Expose
    private Boolean aiPredictionField;
    @SerializedName("autoNumber")
    @Expose
    private Boolean autoNumber;
    @SerializedName("byteLength")
    @Expose
    private Integer byteLength;
    @SerializedName("calculated")
    @Expose
    private Boolean calculated;
    @SerializedName("calculatedFormula")
    @Expose
    private Object calculatedFormula;
    @SerializedName("cascadeDelete")
    @Expose
    private Boolean cascadeDelete;
    @SerializedName("caseSensitive")
    @Expose
    private Boolean caseSensitive;
    @SerializedName("compoundFieldName")
    @Expose
    private Object compoundFieldName;
    @SerializedName("controllerName")
    @Expose
    private Object controllerName;
    @SerializedName("createable")
    @Expose
    private Boolean createable;
    @SerializedName("custom")
    @Expose
    private Boolean custom;
    @SerializedName("defaultValue")
    @Expose
    private Boolean defaultValue;
    @SerializedName("defaultValueFormula")
    @Expose
    private Object defaultValueFormula;
    @SerializedName("defaultedOnCreate")
    @Expose
    private Boolean defaultedOnCreate;
    @SerializedName("dependentPicklist")
    @Expose
    private Boolean dependentPicklist;
    @SerializedName("deprecatedAndHidden")
    @Expose
    private Boolean deprecatedAndHidden;
    @SerializedName("digits")
    @Expose
    private Integer digits;
    @SerializedName("displayLocationInDecimal")
    @Expose
    private Boolean displayLocationInDecimal;
    @SerializedName("encrypted")
    @Expose
    private Boolean encrypted;
    @SerializedName("externalId")
    @Expose
    private Boolean externalId;
    @SerializedName("extraTypeInfo")
    @Expose
    private Object extraTypeInfo;
    @SerializedName("filterable")
    @Expose
    private Boolean filterable;
    @SerializedName("filteredLookupInfo")
    @Expose
    private Object filteredLookupInfo;
    @SerializedName("formulaTreatNullNumberAsZero")
    @Expose
    private Boolean formulaTreatNullNumberAsZero;
    @SerializedName("groupable")
    @Expose
    private Boolean groupable;
    @SerializedName("highScaleNumber")
    @Expose
    private Boolean highScaleNumber;
    @SerializedName("htmlFormatted")
    @Expose
    private Boolean htmlFormatted;
    @SerializedName("idLookup")
    @Expose
    private Boolean idLookup;
    @SerializedName("inlineHelpText")
    @Expose
    private Object inlineHelpText;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("length")
    @Expose
    private Integer length;
    @SerializedName("mask")
    @Expose
    private Object mask;
    @SerializedName("maskType")
    @Expose
    private Object maskType;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("nameField")
    @Expose
    private Boolean nameField;
    @SerializedName("namePointing")
    @Expose
    private Boolean namePointing;
    @SerializedName("nillable")
    @Expose
    private Boolean nillable;
    @SerializedName("permissionable")
    @Expose
    private Boolean permissionable;
    @SerializedName("picklistValues")
    @Expose
    private List<PicklistValue> picklistValues = null;
    @SerializedName("polymorphicForeignKey")
    @Expose
    private Boolean polymorphicForeignKey;
    @SerializedName("precision")
    @Expose
    private Integer precision;
    @SerializedName("queryByDistance")
    @Expose
    private Boolean queryByDistance;
    @SerializedName("referenceTargetField")
    @Expose
    private Object referenceTargetField;
    @SerializedName("referenceTo")
    @Expose
    private List<String> referenceTo = null;
    @SerializedName("relationshipName")
    @Expose
    private Object relationshipName;
    @SerializedName("relationshipOrder")
    @Expose
    private Object relationshipOrder;
    @SerializedName("restrictedDelete")
    @Expose
    private Boolean restrictedDelete;
    @SerializedName("restrictedPicklist")
    @Expose
    private Boolean restrictedPicklist;
    @SerializedName("scale")
    @Expose
    private Integer scale;
    @SerializedName("searchPrefilterable")
    @Expose
    private Boolean searchPrefilterable;
    @SerializedName("soapType")
    @Expose
    private String soapType;
    @SerializedName("sortable")
    @Expose
    private Boolean sortable;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("unique")
    @Expose
    private Boolean unique;
    @SerializedName("updateable")
    @Expose
    private Boolean updateable;
    @SerializedName("writeRequiresMasterRead")
    @Expose
    private Boolean writeRequiresMasterRead;

    public Boolean getAggregatable() {
        return aggregatable;
    }

    public void setAggregatable(Boolean aggregatable) {
        this.aggregatable = aggregatable;
    }

    public Boolean getAiPredictionField() {
        return aiPredictionField;
    }

    public void setAiPredictionField(Boolean aiPredictionField) {
        this.aiPredictionField = aiPredictionField;
    }

    public Boolean getAutoNumber() {
        return autoNumber;
    }

    public void setAutoNumber(Boolean autoNumber) {
        this.autoNumber = autoNumber;
    }

    public Integer getByteLength() {
        return byteLength;
    }

    public void setByteLength(Integer byteLength) {
        this.byteLength = byteLength;
    }

    public Boolean getCalculated() {
        return calculated;
    }

    public void setCalculated(Boolean calculated) {
        this.calculated = calculated;
    }

    public Object getCalculatedFormula() {
        return calculatedFormula;
    }

    public void setCalculatedFormula(Object calculatedFormula) {
        this.calculatedFormula = calculatedFormula;
    }

    public Boolean getCascadeDelete() {
        return cascadeDelete;
    }

    public void setCascadeDelete(Boolean cascadeDelete) {
        this.cascadeDelete = cascadeDelete;
    }

    public Boolean getCaseSensitive() {
        return caseSensitive;
    }

    public void setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    public Object getCompoundFieldName() {
        return compoundFieldName;
    }

    public void setCompoundFieldName(Object compoundFieldName) {
        this.compoundFieldName = compoundFieldName;
    }

    public Object getControllerName() {
        return controllerName;
    }

    public void setControllerName(Object controllerName) {
        this.controllerName = controllerName;
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

    public Boolean getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Boolean defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Object getDefaultValueFormula() {
        return defaultValueFormula;
    }

    public void setDefaultValueFormula(Object defaultValueFormula) {
        this.defaultValueFormula = defaultValueFormula;
    }

    public Boolean getDefaultedOnCreate() {
        return defaultedOnCreate;
    }

    public void setDefaultedOnCreate(Boolean defaultedOnCreate) {
        this.defaultedOnCreate = defaultedOnCreate;
    }

    public Boolean getDependentPicklist() {
        return dependentPicklist;
    }

    public void setDependentPicklist(Boolean dependentPicklist) {
        this.dependentPicklist = dependentPicklist;
    }

    public Boolean getDeprecatedAndHidden() {
        return deprecatedAndHidden;
    }

    public void setDeprecatedAndHidden(Boolean deprecatedAndHidden) {
        this.deprecatedAndHidden = deprecatedAndHidden;
    }

    public Integer getDigits() {
        return digits;
    }

    public void setDigits(Integer digits) {
        this.digits = digits;
    }

    public Boolean getDisplayLocationInDecimal() {
        return displayLocationInDecimal;
    }

    public void setDisplayLocationInDecimal(Boolean displayLocationInDecimal) {
        this.displayLocationInDecimal = displayLocationInDecimal;
    }

    public Boolean getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Boolean getExternalId() {
        return externalId;
    }

    public void setExternalId(Boolean externalId) {
        this.externalId = externalId;
    }

    public Object getExtraTypeInfo() {
        return extraTypeInfo;
    }

    public void setExtraTypeInfo(Object extraTypeInfo) {
        this.extraTypeInfo = extraTypeInfo;
    }

    public Boolean getFilterable() {
        return filterable;
    }

    public void setFilterable(Boolean filterable) {
        this.filterable = filterable;
    }

    public Object getFilteredLookupInfo() {
        return filteredLookupInfo;
    }

    public void setFilteredLookupInfo(Object filteredLookupInfo) {
        this.filteredLookupInfo = filteredLookupInfo;
    }

    public Boolean getFormulaTreatNullNumberAsZero() {
        return formulaTreatNullNumberAsZero;
    }

    public void setFormulaTreatNullNumberAsZero(Boolean formulaTreatNullNumberAsZero) {
        this.formulaTreatNullNumberAsZero = formulaTreatNullNumberAsZero;
    }

    public Boolean getGroupable() {
        return groupable;
    }

    public void setGroupable(Boolean groupable) {
        this.groupable = groupable;
    }

    public Boolean getHighScaleNumber() {
        return highScaleNumber;
    }

    public void setHighScaleNumber(Boolean highScaleNumber) {
        this.highScaleNumber = highScaleNumber;
    }

    public Boolean getHtmlFormatted() {
        return htmlFormatted;
    }

    public void setHtmlFormatted(Boolean htmlFormatted) {
        this.htmlFormatted = htmlFormatted;
    }

    public Boolean getIdLookup() {
        return idLookup;
    }

    public void setIdLookup(Boolean idLookup) {
        this.idLookup = idLookup;
    }

    public Object getInlineHelpText() {
        return inlineHelpText;
    }

    public void setInlineHelpText(Object inlineHelpText) {
        this.inlineHelpText = inlineHelpText;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Object getMask() {
        return mask;
    }

    public void setMask(Object mask) {
        this.mask = mask;
    }

    public Object getMaskType() {
        return maskType;
    }

    public void setMaskType(Object maskType) {
        this.maskType = maskType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getNameField() {
        return nameField;
    }

    public void setNameField(Boolean nameField) {
        this.nameField = nameField;
    }

    public Boolean getNamePointing() {
        return namePointing;
    }

    public void setNamePointing(Boolean namePointing) {
        this.namePointing = namePointing;
    }

    public Boolean getNillable() {
        return nillable;
    }

    public void setNillable(Boolean nillable) {
        this.nillable = nillable;
    }

    public Boolean getPermissionable() {
        return permissionable;
    }

    public void setPermissionable(Boolean permissionable) {
        this.permissionable = permissionable;
    }

    public List<PicklistValue> getPicklistValues() {
        return picklistValues;
    }

    public void setPicklistValues(List<PicklistValue> picklistValues) {
        this.picklistValues = picklistValues;
    }

    public Boolean getPolymorphicForeignKey() {
        return polymorphicForeignKey;
    }

    public void setPolymorphicForeignKey(Boolean polymorphicForeignKey) {
        this.polymorphicForeignKey = polymorphicForeignKey;
    }

    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public Boolean getQueryByDistance() {
        return queryByDistance;
    }

    public void setQueryByDistance(Boolean queryByDistance) {
        this.queryByDistance = queryByDistance;
    }

    public Object getReferenceTargetField() {
        return referenceTargetField;
    }

    public void setReferenceTargetField(Object referenceTargetField) {
        this.referenceTargetField = referenceTargetField;
    }

    public List<String> getReferenceTo() {
        return referenceTo;
    }

    public void setReferenceTo(List<String> referenceTo) {
        this.referenceTo = referenceTo;
    }

    public Object getRelationshipName() {
        return relationshipName;
    }

    public void setRelationshipName(Object relationshipName) {
        this.relationshipName = relationshipName;
    }

    public Object getRelationshipOrder() {
        return relationshipOrder;
    }

    public void setRelationshipOrder(Object relationshipOrder) {
        this.relationshipOrder = relationshipOrder;
    }

    public Boolean getRestrictedDelete() {
        return restrictedDelete;
    }

    public void setRestrictedDelete(Boolean restrictedDelete) {
        this.restrictedDelete = restrictedDelete;
    }

    public Boolean getRestrictedPicklist() {
        return restrictedPicklist;
    }

    public void setRestrictedPicklist(Boolean restrictedPicklist) {
        this.restrictedPicklist = restrictedPicklist;
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public Boolean getSearchPrefilterable() {
        return searchPrefilterable;
    }

    public void setSearchPrefilterable(Boolean searchPrefilterable) {
        this.searchPrefilterable = searchPrefilterable;
    }

    public String getSoapType() {
        return soapType;
    }

    public void setSoapType(String soapType) {
        this.soapType = soapType;
    }

    public Boolean getSortable() {
        return sortable;
    }

    public void setSortable(Boolean sortable) {
        this.sortable = sortable;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getUnique() {
        return unique;
    }

    public void setUnique(Boolean unique) {
        this.unique = unique;
    }

    public Boolean getUpdateable() {
        return updateable;
    }

    public void setUpdateable(Boolean updateable) {
        this.updateable = updateable;
    }

    public Boolean getWriteRequiresMasterRead() {
        return writeRequiresMasterRead;
    }

    public void setWriteRequiresMasterRead(Boolean writeRequiresMasterRead) {
        this.writeRequiresMasterRead = writeRequiresMasterRead;
    }

}
