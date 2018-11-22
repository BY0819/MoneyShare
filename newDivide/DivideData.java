package com.example.vmfld.moneyshare;

public class DivideData {

    //보내야 하는 값
    private String name;
    private int getpermoney;
    private int personalused;
    private int publicused;
    private int leftmoney;

    //계산을 위해 필요한 값
    private int[] personalusedlist;
    private int memnum;
    private int personaltotalused;

    public DivideData(String name, int personalused, int publicused, int leftmoney, int[] personalusedlist, int memnum) {
        this.name = name;
        this.personalused = personalused;
        this.publicused = publicused;
        this.leftmoney = leftmoney;
        this.personalusedlist = personalusedlist;
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

    public void setPersonaltotalused(int[] personalusedlist) {
        for(int i = 0; i < personalusedlist.length; i++){
            this.personaltotalused = this.personaltotalused + personalusedlist[i];
        }
    }

    public int getPublicused() {
        return publicused;
    }

    public void setPublicused(int publicused) {
        this.publicused = publicused;
    }

    public int getLeftmoney() {
        return leftmoney;
    }

    public void setLeftmoney(int leftmoney) {
        this.leftmoney = leftmoney;
    }

    public int getGetpermoney(){
        setPersonaltotalused(personalusedlist);
        int totalpersonalused = getPersonaltotalused();

        getpermoney = ((leftmoney + totalpersonalused) / memnum) - personalused;

        return getpermoney;
    }

}
