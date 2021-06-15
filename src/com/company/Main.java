package com.company;

enum Season {
    WINTER(-25),
    SPRING(20),
    SUMMER(40) {
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(20);
    private double avgTmp;

    Season(double avgTmp) {
        this.avgTmp = avgTmp;
    }

    public double getAvgTmp() {
        return avgTmp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}

public class Main {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season);
        print(Season.AUTUMN);
        printAllValues();
    }

    public static void print(Season season) {
        switch (season) {
            case AUTUMN:
                System.out.print("A lot of rain in Autumn");
                break;
            case SPRING:
                System.out.print("Spring season is beautiful");
                break;
            case SUMMER:
                System.out.print("I love Summer");
                break;
            case WINTER:
                System.out.print("Winter is cold season");
                break;
        }
    }

    public static void printAllValues() {
        for (Season s : Season.values()) {
            System.out.println(s + " " + s.getAvgTmp() + " " + s.getDescription());
        }
    }
}