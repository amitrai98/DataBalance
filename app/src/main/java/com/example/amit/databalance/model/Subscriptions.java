
package com.example.amit.databalance.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subscriptions {

    @SerializedName("links")
    @Expose
    private Links___ links;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    public Links___ getLinks() {
        return links;
    }

    public void setLinks(Links___ links) {
        this.links = links;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

}
