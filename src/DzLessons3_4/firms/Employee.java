package DzLessons3_4.firms;

/**
 * Created by Denni on 25.05.2016.
 */
public class Employee {

    private String surName;
    private String firstName;
    private String lastName;
    private String sex;
    private String birsday;
    private Integer salary;
    private Integer salaryAccount;
    private Integer experience;
    private Integer holidays;
    private String lastHolidays;
    private String department;
    private String spesialty;

    public Employee() {
    }

    public Employee(String surName, String firstName, String lastName, String sex, String birsday, Integer salary, Integer salaryAccount, Integer experience, Integer holidays, String lastHolidays, String department, String spesialty) {
        this.surName = surName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birsday = birsday;
        this.salary = salary;
        this.salaryAccount = salaryAccount;
        this.experience = experience;
        this.holidays = holidays;
        this.lastHolidays = lastHolidays;
        this.department = department;
        this.spesialty=spesialty;
    }



    @Override
    public String toString() {
        return "Employee { " +
                "surName= '" + surName + '\'' +
                ", firstName= '" + firstName + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", sex= '" + sex + '\'' +
                ", birsday= '" + birsday + '\'' +
                ", salary= " + salary +
                ", salaryAccount= " + salaryAccount +
                ", experience= " + experience +
                ", holidays= " + holidays +
                ", lastHolidays= '" + lastHolidays + '\'' +
                ", department= '" + department + '\'' +
                ", Spesiality= '" + spesialty + '\'' +
                 ' ';
    }

    public Integer getSalary() {
        return salary;
    }

    public void giveSeleryForEmploye(){
        setSalaryAccount(getSalary());
    }

    public void setSalaryAccount(Integer salaryAccount) {
        this.salaryAccount = salaryAccount;
    }

    public String getSpesialty() {
        return spesialty;
    }

    public void setSpesialty(String spesialty) {
        this.spesialty = spesialty;
    }

    public Integer getSalaryAccount() {
        return salaryAccount;
    }
}
