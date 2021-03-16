package com.classes;

import java.util.ArrayList;

public class Bank {
    // member fields
    private String name;
    private ArrayList<Branch>branches;

    //constructor
    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    //methods
    public boolean addBranch(String branchName){
        if (findBranch(branchName.getName()) >= 0) {
            System.out.println("That branch is already on file.");
            return false;
        }
        branches.add(branchName);
        return true;
    }

    public boolean addCustomer(){

    }

    public boolean addCustomerTransaction(){

    }

    private Branch findBranch(String branchName){
        for (int i = 0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            if (branch.getBranchCode().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean listCustomers(){

    }
}
