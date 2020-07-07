package com.local.snackbar.models;

public class Snack
{
    private static int maxid = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingid;

    public Snack(String name,
                 int quantity,
                 double cost,
                 int vendingid)
    {
        maxid++;
        id = maxid;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingid = vendingid;
    }

    public int getId()
    {
        return id;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getCost()
    {
        return cost;
    }
    public int getVendingid()
    {
        return vendingid;
    }

    public void setVendingid(int vendingid)
    {
        this.vendingid = vendingid;
    }

    public void addQuantity(int amnt){
        this.quantity = quantity + amnt;
    }
    public void buySnack(int amnt){
        this.quantity = quantity - amnt;
    }
    public double getTotal(int amnt){
        return cost * (double) amnt;
    }
}
