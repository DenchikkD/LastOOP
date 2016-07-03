package DzLessons3_4.firms;

/**
 * Created by Denni on 25.05.2016.
 */
public class MainFirm {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Кондратюк", "Денис", "Олександрович", "Чоловіча", "07,06,1994", 2000, 0, 15, 0, "02,03,2016", "Бухгалтерія", "Бухгалтер");
        Employee employee2 = new Employee("Кондратюк", "Денис", "Олександрович", "Чоловіча", "07,06,1994", 2050, 0, 15, 0, "02,03,2016", "Бухгалтерія", "Бухгалтер");
        Employee employee3 = new Employee("Кондратюк", "Денис", "Олександрович", "Чоловіча", "07,06,1994", 2100, 0, 15, 0, "02,03,2016", "Бухгалтерія", "Бухгалтер");
        Employee employee4 = new Employee("Кондратюк", "Юлія", "Олександрівна", "Жіноча", "20,08,1995", 2250, 0, 15, 0, "02,03,2016", "Бухгалтерія", "Бухгалтер");
        Employee employee5 = new Employee("Кондратюк", "Юлія", "Олександрівна", "Жіноча", "20,08,1995", 2350, 0, 15, 0, "02,03,2016", "Бухгалтерія", "Бухгалтер");
        Employee employee6 = new Employee("Кондратюк", "Юлія", "Олександрівна", "Жіноча", "20,08,1995", 2850, 0, 15, 0, "02,03,2016", "Бухгалтерія", "Бухгалтер");
        Firm firm = new Firm();
        firm.addEmployee(employee1);
        firm.addEmployee(employee2);
        firm.addEmployee(employee3);
        firm.addEmployee(employee4);
        firm.addEmployee(employee5);
        firm.addEmployee(employee6);

        Seller saller1 = new Seller("Кондратюк", "Денис", "Олександрович", "Чоловіча", "07,06,1994", 2410, 0, 15, 0, "02,03,2016", "Продажу", "Продавець", 550);
        Seller saller2 = new Seller("Кондратюк", "Денис", "Олександрович", "Чоловіча", "07,06,1994", 2185, 0, 15, 0, "02,03,2016", "Продажу", "Продавець", 551);
        Seller saller3 = new Seller("Кондратюк", "Денис", "Олександрович", "Чоловіча", "07,06,1994", 3100, 0, 15, 0, "02,03,2016", "Продажу", "Продавець", 552);
        Seller saller4 = new Seller("Кондратюк", "Денис", "Олександрович", "Чоловіча", "07,06,1994", 2800, 0, 15, 0, "02,03,2016", "Продажу", "Продавець", 553);
        Seller saller5 = new Seller("Кондратюк", "Денис", "Олександрович", "Чоловіча", "07,06,1994", 2150, 0, 15, 0, "02,03,2016", "Продажу", "Продавець", 554);
        Seller saller6 = new Seller("Кондратюк", "Денис", "Олександрович", "Чоловіча", "07,06,1994", 3150, 0, 15, 0, "02,03,2016", "Продажу", "Продавець", 555);

        firm.addEmployee(saller1);
        firm.addEmployee(saller2);
        firm.addEmployee(saller3);
        firm.addEmployee(saller4);
        firm.addEmployee(saller5);
        firm.addEmployee(saller6);

        Manager manager1 = new Manager("Кондратюк", "Денис", "Олександрович", "Чоловіча", "07,06,1994", 4500, 0, 15, 0, "02,03,2016", "Продажу", "Менеджер");

        firm.addEmployee(manager1);

        manager1.addSalerToManager(saller1);
        manager1.addSalerToManager(saller2);
        manager1.addSalerToManager(saller3);
        manager1.addSalerToManager(saller4);
        manager1.addSalerToManager(saller5);
        manager1.addSalerToManager(saller6);
        firm.printEmployee();

        firm.setFirmSalaryAccount(60_000);
        System.out.println("\nНа рахунку фырми: " + firm.getFirmSalaryAccount());

        firm.giveSalaryForAll();
        firm.printEmployee();

        firm.setSalesForSaller();
        firm.giveSalaryForAll();
        firm.printEmployee();
//        firm.giveSalaryForAll();
        System.out.println("\nНа рахунку фырми: " + firm.getFirmSalaryAccount());

    }

}
