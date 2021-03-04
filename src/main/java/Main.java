/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raspb
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Input your age");
        int age = keyboard.nextInt();
        
        double insuranceCost =insuranceFormula(age);
        System.out.println("Your insurane will cost $" + insuranceCost +"/year.");
    }
    public static double insuranceFormula(double age) {
        return (age * 5) + 300;
    }
}
