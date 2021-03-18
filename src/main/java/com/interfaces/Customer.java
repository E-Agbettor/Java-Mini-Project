package com.interfaces;

import java.util.ArrayList;

public interface Customer {

    public void addTransaction();
    public String getName();
    public ArrayList<Double> getTransactions();
}
