package com.example.vmfld.moneyshare;

public class DivideData {

    //보내야 하는 값
    private String name;
    private int getpermoney;
    private int personalused;
    private int publicused;
    private int totalLeft;

    //계산을 위해 필요한 값
    private int memnum;
    private int personaltotalused;

    public DivideData() {
    }

    public DivideData(String name, int personalused, int publicused, int totalLeft, int personaltotalused, int memnum) {
        this.name = name;
        this.personalused = personalused;
        this.publicused = publicused;
        this.totalLeft = totalLeft;
        this.personaltotalused = personaltotalused;
        this.memnum = memnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGetpermoney(int getpermoney) {
        this.getpermoney = getpermoney;
    }

    public int getPersonalused() {
        return personalused;
    }

    public void setPersonalused(int personalused) {
        this.personalused = personalused;
    }

    public int getPersonaltotalused() {
        return personaltotalused;
    }

    public void setPersonaltotalused(int personaltotalused) {
        this.personaltotalused = personaltotalused;
    }

    public int getPublicused() {
        return publicused;
    }

    public void setPublicused(int publicused) {
        this.publicused = publicused;
    }

    public int getTotalLeft() {
        return totalLeft;
    }

    public void setTotalLeft(int totalLeft) {
        this.totalLeft = totalLeft;
    }

    public int getGetpermoney(){

        if(getpermoney == 0){
            getpermoney = ((totalLeft + personaltotalused) / memnum) - personalused;
        }

        return getpermoney;
    }

}
