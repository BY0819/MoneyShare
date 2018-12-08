package com.example.vmfld.moneyshare;

import com.google.gson.annotations.SerializedName;

public class DividePersonalSumData {
    @SerializedName("userid")
        int userid;
    @SerializedName("sum")
        String name;
    @SerializedName("name")
        int personalused;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonalused() {
        return personalused;
    }

    public void setPersonalused(int personalused) {
        this.personalused = personalused;
    }
}
