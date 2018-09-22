
package com.example.amit.databalance.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataBalance {

    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("included")
    @Expose
    private List<Included> included = null;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public List<Included> getIncluded() {
        return included;
    }

    public void setIncluded(List<Included> included) {
        this.included = included;
    }

}
