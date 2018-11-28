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

    public int getPersonalused(){
        return personalused;
    }
    public String getstrPersonalused() {
        String str_personalused = makeComma(personalused);
        return str_personalused;
    }

    public String getstrPublicused() {
        String str_publicused = makeComma(publicused);
        return str_publicused;
    }

    public String getstrGetpermoney(){

        if(getpermoney == 0){
            getpermoney = ((totalLeft + personaltotalused) / memnum) - personalused;
        }

        String str_getpermoney = makeComma(getpermoney);
        return str_getpermoney;
    }

    private String makeComma(int num){
        String str_num =Integer.toString(num);

        if(num>999){
            if(num%1000 == 0){
                str_num = "," + "000";
            }
            else{
                str_num = "," +  Integer.toString(num % 1000);
            }
            return makeComma(num/1000) + str_num;
        }
        else{
            return Integer.toString(num);
        }

    }

}
