package DzLessons3_4.firms;

import java.awt.datatransfer.DataFlavor;
import java.util.ArrayList;

/**
 * Created by Denni on 25.05.2016.
 */
public class Manager extends Employee {


    protected ArrayList<Seller> sellerArrayList = new ArrayList<Seller>();

    public Manager(String surName, String firstName, String lastName, String sex, String birsday, Integer salary, Integer salaryAccount, Integer experience, Integer holidays, String lastHolidays, String department, String specialty) {
        super(surName, firstName, lastName, sex, birsday, salary, salaryAccount, experience, holidays, lastHolidays, department, specialty);

    }

    public void addSalerToManager(Seller seller) {
        sellerArrayList.add(seller);
        System.out.println("1");


    }
    @Override
    public void giveSeleryForEmploye() {
        setSalaryAccount(getSalary() + sellerArrayList.size() * 50);
    }



}
