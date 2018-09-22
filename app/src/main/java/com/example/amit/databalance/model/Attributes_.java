
package com.example.amit.databalance.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attributes_ {

    @SerializedName("msn")
    @Expose
    private String msn;
    @SerializedName("credit")
    @Expose
    private Integer credit;
    @SerializedName("credit-expiry")
    @Expose
    private String creditExpiry;
    @SerializedName("data-usage-threshold")
    @Expose
    private Boolean dataUsageThreshold;
    @SerializedName("included-data-balance")
    @Expose
    private Integer includedDataBalance;
    @SerializedName("included-credit-balance")
    @Expose
    private Object includedCreditBalance;
    @SerializedName("included-rollover-credit-balance")
    @Expose
    private Object includedRolloverCreditBalance;
    @SerializedName("included-rollover-data-balance")
    @Expose
    private Object includedRolloverDataBalance;
    @SerializedName("included-international-talk-balance")
    @Expose
    private Object includedInternationalTalkBalance;
    @SerializedName("expiry-date")
    @Expose
    private String expiryDate;
    @SerializedName("auto-renewal")
    @Expose
    private Boolean autoRenewal;
    @SerializedName("primary-subscription")
    @Expose
    private Boolean primarySubscription;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("included-data")
    @Expose
    private Object includedData;
    @SerializedName("included-credit")
    @Expose
    private Object includedCredit;
    @SerializedName("included-international-talk")
    @Expose
    private Object includedInternationalTalk;
    @SerializedName("unlimited-text")
    @Expose
    private Boolean unlimitedText;
    @SerializedName("unlimited-talk")
    @Expose
    private Boolean unlimitedTalk;
    @SerializedName("unlimited-international-text")
    @Expose
    private Boolean unlimitedInternationalText;
    @SerializedName("unlimited-international-talk")
    @Expose
    private Boolean unlimitedInternationalTalk;
    @SerializedName("price")
    @Expose
    private Integer price;

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getCreditExpiry() {
        return creditExpiry;
    }

    public void setCreditExpiry(String creditExpiry) {
        this.creditExpiry = creditExpiry;
    }

    public Boolean getDataUsageThreshold() {
        return dataUsageThreshold;
    }

    public void setDataUsageThreshold(Boolean dataUsageThreshold) {
        this.dataUsageThreshold = dataUsageThreshold;
    }

    public Integer getIncludedDataBalance() {
        return includedDataBalance;
    }

    public void setIncludedDataBalance(Integer includedDataBalance) {
        this.includedDataBalance = includedDataBalance;
    }

    public Object getIncludedCreditBalance() {
        return includedCreditBalance;
    }

    public void setIncludedCreditBalance(Object includedCreditBalance) {
        this.includedCreditBalance = includedCreditBalance;
    }

    public Object getIncludedRolloverCreditBalance() {
        return includedRolloverCreditBalance;
    }

    public void setIncludedRolloverCreditBalance(Object includedRolloverCreditBalance) {
        this.includedRolloverCreditBalance = includedRolloverCreditBalance;
    }

    public Object getIncludedRolloverDataBalance() {
        return includedRolloverDataBalance;
    }

    public void setIncludedRolloverDataBalance(Object includedRolloverDataBalance) {
        this.includedRolloverDataBalance = includedRolloverDataBalance;
    }

    public Object getIncludedInternationalTalkBalance() {
        return includedInternationalTalkBalance;
    }

    public void setIncludedInternationalTalkBalance(Object includedInternationalTalkBalance) {
        this.includedInternationalTalkBalance = includedInternationalTalkBalance;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Boolean getAutoRenewal() {
        return autoRenewal;
    }

    public void setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
    }

    public Boolean getPrimarySubscription() {
        return primarySubscription;
    }

    public void setPrimarySubscription(Boolean primarySubscription) {
        this.primarySubscription = primarySubscription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getIncludedData() {
        return includedData;
    }

    public void setIncludedData(Object includedData) {
        this.includedData = includedData;
    }

    public Object getIncludedCredit() {
        return includedCredit;
    }

    public void setIncludedCredit(Object includedCredit) {
        this.includedCredit = includedCredit;
    }

    public Object getIncludedInternationalTalk() {
        return includedInternationalTalk;
    }

    public void setIncludedInternationalTalk(Object includedInternationalTalk) {
        this.includedInternationalTalk = includedInternationalTalk;
    }

    public Boolean getUnlimitedText() {
        return unlimitedText;
    }

    public void setUnlimitedText(Boolean unlimitedText) {
        this.unlimitedText = unlimitedText;
    }

    public Boolean getUnlimitedTalk() {
        return unlimitedTalk;
    }

    public void setUnlimitedTalk(Boolean unlimitedTalk) {
        this.unlimitedTalk = unlimitedTalk;
    }

    public Boolean getUnlimitedInternationalText() {
        return unlimitedInternationalText;
    }

    public void setUnlimitedInternationalText(Boolean unlimitedInternationalText) {
        this.unlimitedInternationalText = unlimitedInternationalText;
    }

    public Boolean getUnlimitedInternationalTalk() {
        return unlimitedInternationalTalk;
    }

    public void setUnlimitedInternationalTalk(Boolean unlimitedInternationalTalk) {
        this.unlimitedInternationalTalk = unlimitedInternationalTalk;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
