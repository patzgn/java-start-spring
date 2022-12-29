package com.example.exercise10;

class BMRDto {
    private String gender;
    private double weight;
    private double height;
    private int age;
    private int bmr;

    public BMRDto(String gender, double weight, double height, int age, int bmr) {
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.bmr = bmr;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public int getBmr() {
        return bmr;
    }
}
