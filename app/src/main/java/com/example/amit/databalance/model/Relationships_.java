
package com.example.amit.databalance.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Relationships_ {

    @SerializedName("subscriptions")
    @Expose
    private Subscriptions subscriptions;
    @SerializedName("service")
    @Expose
    private Service service;
    @SerializedName("product")
    @Expose
    private Product product;
    @SerializedName("downgrade")
    @Expose
    private Downgrade downgrade;

    public Subscriptions getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(Subscriptions subscriptions) {
        this.subscriptions = subscriptions;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Downgrade getDowngrade() {
        return downgrade;
    }

    public void setDowngrade(Downgrade downgrade) {
        this.downgrade = downgrade;
    }

}
