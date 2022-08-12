package exercise01.SS03_Array.thuc_hanh;

import java.util.Scanner;

public class TH_ct_chuyen_doi_nhiet_do {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c;
        double f;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter F: ");
                    f = input.nextDouble();
                    System.out.println("F to C: " + fToc(f));
                    break;
                }
                case 2: {
                    System.out.println("Enter C: ");
                    c = input.nextDouble();
                    System.out.println("C to F: " + cTof(c));
                    break;
                }
                case 0: {
                    System.exit(0);
                }
            }
        } while (choice != 0);
    }

        public static double cTof(double c){
            double f = (9.0/5)*c+32;
            return f;
        }

        public static double fToc(double f){
            double c = (5.0/9)*(f -32);
            return c;
        }
    }

