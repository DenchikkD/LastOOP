package DzLessons3_4.firms;

/**
 * Created by Denni on 25.05.2016.
 */
public class Seller extends Employee {
    public static final Integer BONUS_OF_SALES = 30;
    private Integer sales;


    public Seller(String surName, String firstName, String lastName, String sex, String birsday, Integer salary, Integer salaryAccount, Integer experience, Integer holidays, String lastHolidays, String department, String specialty, Integer sales) {
        super(surName, firstName, lastName, sex, birsday, salary, salaryAccount, experience, holidays, lastHolidays, department, specialty);
        this.sales = sales;

    }

    public Integer getSales() {
        return sales;
    }

    @Override
    public String toString() {
        return super.toString() + " Sales= " + sales +
                " }";
    }


    @Override
    public void giveSeleryForEmploye() {
        setSalaryAccount(getSalary() + (getSales() * (100 + BONUS_OF_SALES)) / 100);
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }


}
