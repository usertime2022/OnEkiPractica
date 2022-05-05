package com.company;

import java.util.Scanner;

public class Car {
    private String name;
    private String model;
    private String color;
    private int year;
    private int speed;

    void chekSpeed(int f) {
        Scanner scanner = new Scanner(System.in);
        int san = scanner.nextInt();
        if (san > 110) {
            System.out.println("too fast");
        } else if (san < 30) {
            System.out.println("too slow");
        } else {
            System.out.println("You are good at driving");
        }
        speed = f;
    }

    void setName(String name) {
        this.name = name;
    }

    void setModel(String b) {
        model = b;
    }

    void setColor(String c) {
        color = c;
    }

    void setYear(int d) {
        year = d;
    }

    String setSpeed(int f) {
            return name;
        }
    String getName () {
        return name;
    }
        String getModel () {
            return model;
        }
        String getColor () {
            return color;
        }
        int getYear () {
            return year;
        }
        int getSpeed () {
            return speed;
        }
    }

