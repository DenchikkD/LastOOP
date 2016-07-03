package DzLessons3_4.firms;

import java.util.ArrayList;

/**
 * Created by Denni on 25.05.2016.
 */
public class Firm {

    private Integer firmSalaryAccount;

    protected ArrayList<Employee> worker = new ArrayList<Employee>();

    public Integer getFirmSalaryAccount() {
        return firmSalaryAccount;
    }

    public void setFirmSalaryAccount(Integer firmSalaryAccount) {
        this.firmSalaryAccount = firmSalaryAccount;
    }

    public void addEmployee(Employee employee) {
        worker.add(employee);
    }

    public void printEmployee() {
        for (Employee emp : worker) {
            System.out.println(emp);
        }
    }

    public void setSalesForSaller() {
        for (Employee emp : worker) {
            if (emp.getSpesialty().equals("Продавець")) {
                Seller s = (Seller) emp;
                s.setSales(10000);
            }

        }
    }

    public void giveSalaryForAll() {
        if (getFirmSalaryAccount() == 0) {
            System.out.println("bla-bla-bla");
        } else {
            for (Employee emp : worker) {
                if (getFirmSalaryAccount() >= (0 + emp.getSalary())) {
                    emp.giveSeleryForEmploye();
                    setFirmSalaryAccount(getFirmSalaryAccount() - emp.getSalary());
                } else if (getFirmSalaryAccount() < emp.getSalary()) {
                    emp.setSalaryAccount(getFirmSalaryAccount());
                    setFirmSalaryAccount(getFirmSalaryAccount() - emp.getSalaryAccount());
                }
            }

        }
    }
}
