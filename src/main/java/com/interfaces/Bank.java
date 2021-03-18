package com.interfaces;

import com.classes.Branch;
import com.classes.Customer;

import java.util.ArrayList;

public interface Bank {
    //methods
    public boolean addBranch(String branchName);

    public boolean addCustomer(String branchName, String customerName, double initialTransaction);

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction);
    public Branch findBranch(String branchName);

    public boolean listCustomers(String branchName, boolean printTransactions);
}
