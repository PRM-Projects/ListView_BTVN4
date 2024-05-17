package com.example.prm_listview_btvn4;

public class Amongus {
    private String name;
    private String age;
    private int profile;

    public Amongus(String name, String age, int profile) {
        this.name = name;
        this.age = age;
        this.profile = profile;
    }

    public Amongus() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }
}
