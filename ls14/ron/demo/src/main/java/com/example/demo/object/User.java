package com.example.demo.object;

public class User {
    private String name;
    private String name2;
    private String nik;
    public User (String nik, String name, String name2){
        this.nik = nik;
        this.name=name;
        this.name2 = name2;

    }

    public String getName() {
        return name;
    }

    public String getName2() {
        return name2;
    }

    public String getNik() {
        return nik;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
    public String getInfo(){
       String n = "Ник гитхаб: " +nik + ". Имя и фамилия: " + name + " " + name2;
       return n;
    }
}
