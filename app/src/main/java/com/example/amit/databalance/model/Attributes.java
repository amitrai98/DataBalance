
package com.example.amit.databalance.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attributes {

    @SerializedName("payment-type")
    @Expose
    private String paymentType;
    @SerializedName("unbilled-charges")
    @Expose
    private Object unbilledCharges;
    @SerializedName("next-billing-date")
    @Expose
    private Object nextBillingDate;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("first-name")
    @Expose
    private String firstName;
    @SerializedName("last-name")
    @Expose
    private String lastName;
    @SerializedName("date-of-birth")
    @Expose
    private String dateOfBirth;
    @SerializedName("contact-number")
    @Expose
    private String contactNumber;
    @SerializedName("email-address")
    @Expose
    private String emailAddress;
    @SerializedName("email-address-verified")
    @Expose
    private Boolean emailAddressVerified;
    @SerializedName("email-subscription-status")
    @Expose
    private Boolean emailSubscriptionStatus;

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Object getUnbilledCharges() {
        return unbilledCharges;
    }

    public void setUnbilledCharges(Object unbilledCharges) {
        this.unbilledCharges = unbilledCharges;
    }

    public Object getNextBillingDate() {
        return nextBillingDate;
    }

    public void setNextBillingDate(Object nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Boolean getEmailAddressVerified() {
        return emailAddressVerified;
    }

    public void setEmailAddressVerified(Boolean emailAddressVerified) {
        this.emailAddressVerified = emailAddressVerified;
    }

    public Boolean getEmailSubscriptionStatus() {
        return emailSubscriptionStatus;
    }

    public void setEmailSubscriptionStatus(Boolean emailSubscriptionStatus) {
        this.emailSubscriptionStatus = emailSubscriptionStatus;
    }

}
