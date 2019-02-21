package com.company;

import java.util.ArrayList;

public class Customer {

    public class Item {
        private String invoiceitem;
        private String customername;
        private String address;
        private String date;
        private String accountnumber;

        public Item() {


        }

        private ArrayList<Item> items;


        public Item(String invoiceitem, String customername, String address, String date, String accountnumber) {
            this.invoiceitem = invoiceitem;
            this.customername = customername;
            this.address = address;
            this.date = date;
            this.accountnumber = accountnumber;

        }

        @Override
        public String toString() {
            return "Item{" +
                    "invoiceitem='" + invoiceitem + '\'' +
                    ", customername='" + customername + '\'' +
                    ", address='" + address + '\'' +
                    ", date='" + date + '\'' +
                    ", accountnumber='" + accountnumber + '\'' +
                    ", items=" + items +
                    '}';
        }

        public String getInvoiceitem() {
            return invoiceitem;
        }

        public void setInvoiceitem(String invoiceitem) {
            this.invoiceitem = invoiceitem;
        }

        public String getCustomername() {
            return customername;
        }

        public void setCustomername(String customername) {
            this.customername = customername;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getAccountnumber() {
            return accountnumber;
        }

        public void setAccountnumber(String accountnumber) {
            this.accountnumber = accountnumber;
        }


        }


    }






