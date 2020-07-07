package com.local.snackbar.models;

public class Customer
{
    private static int maxId = 0;

    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand){
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getCashOnHand(){
        return cashOnHand;
    }
    public void addCash(double amount){
        this.cashOnHand = this.cashOnHand + amount;
    }
    public void buySnacks(double total){
        this.cashOnHand = this.cashOnHand - total;
    }

    @Override
    public String toString()
    {
        String value1 = "id: " + id + "\n" + "Customer: " + name + "\n" + "cash: " + cashOnHand + "\n";

        return value1;
    }
}
