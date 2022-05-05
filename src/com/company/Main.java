package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int san = scanner.nextInt();
	Car mashina = new Car();
    mashina.setName("Honda");
    mashina.setModel("Accord");
    mashina.setColor("Ak");
    mashina.setYear(2020);
    mashina.setSpeed(280);
        System.out.println(mashina.getName());
        System.out.println(mashina.getModel());
        System.out.println(mashina.getColor());
        System.out.println(mashina.getYear());
        System.out.println(mashina.getSpeed());
    }
}
