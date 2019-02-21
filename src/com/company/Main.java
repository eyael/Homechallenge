package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user="";
        while(!user.equalsIgnoreCase("n"))


          //  Customer items= new Customer();

          //  ArrayList<Customer> items = new ArrayList<>();
          //  items.add(invoiceitem);

            System.out.println("Enter Customer name: ");
            String customername = sc.nextLine();

            System.out.println("Enter your Address: ");
            String address = sc.nextLine();

            System.out.println("Enter the Date: ");
            String date = sc.nextLine();

            System.out.println("Enter your Account number: ");
            String accountnumber = sc.nextLine();


    }
}
