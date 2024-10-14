package com.desarrollo.apptraducir;

public class Palabra {
    private String enEsp,EnIngl;
    private int laImg;

    public Palabra(String enEsp,String enIngl,int laImg){
        this.enEsp = enEsp;
        this.EnIngl = enIngl;
        this.laImg = laImg;
    }

    public String getEnEsp(){
        return this.enEsp;
    }

    public void setEnEsp(String esp){
        this.enEsp = esp;
    }

    public String getEnIngl(){
        return this.EnIngl;
    }

    public void setEnIngl(String ingl){
        this.EnIngl = ingl;
    }

    public int getLaImg(){
        return this.laImg;
    }

    public void setLaImg(int num){
        this.laImg = num;
    }
}