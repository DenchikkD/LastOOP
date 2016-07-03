package DzLessons1_2;

/**
 * Created by Denni on 16.05.2016.
 */
public class MainFirm {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Юля", "Саприкіна", 1250, 0, 2008, 6, "Жіноча", "Бухгалтерія");
        Employee employee2 = new Employee("Юля1", "Саприкіна", 1350, 0, 2001, 2, "Жіноча", "Бухгалтерія");
        Employee employee3 = new Employee("Юля2", "Саприкіна", 1150, 0, 2004, 3, "Жіноча", "Бухгалтерія");
        Employee employee4 = new Employee("Юля3", "Саприкіна", 1450, 0, 2007, 1, "Жіноча", "Бухгалтерія");
        Employee employee5 = new Employee("Юля4", "Саприкіна", 1550, 0, 2009, 8, "Жіноча", "Бухгалтерія");
        Employee employee6 = new Employee("Юля5", "Саприкіна", 1650, 0, 2011, 12, "Жіноча", "Бухгалтерія");
        Employee employee7 = new Employee("Денис1", "Кондратюк", 1250, 0, 2012, 1, "Жіноча", "Бухгалтерія");
        Employee employee8 = new Employee("Денис2", "Кондратюк", 1450, 0, 2003, 2, "Жіноча", "Бухгалтерія");
        Employee employee9 = new Employee("Денис3", "Кондратюк", 1150, 0, 2008, 6, "Жіноча", "Бухгалтерія");
        Employee employee10 = new Employee("Денис4", "Кондратюк", 1450, 0, 2016, 5, "Жіноча", "Бухгалтерія");
        Employee employee11 = new Employee("Денис5", "Кондратюк", 1650, 0, 2013, 3, "Жіноча", "Бухгалтерія");
        Employee employee12 = new Employee("Денис6", "Кондратюк", 1750, 0, 2012, 4, "Жіноча", "Бухгалтерія");

        Firm firm = new Firm("TST System", "Kiev 19");
        firm.addWorkers(employee1);
        firm.addWorkers(employee2);
        firm.addWorkers(employee3);
        firm.addWorkers(employee4);
        firm.addWorkers(employee5);
        firm.addWorkers(employee6);
        firm.addWorkers(employee7);
        firm.addWorkers(employee8);
        firm.addWorkers(employee9);
        firm.addWorkers(employee10);
        firm.addWorkers(employee11);
        firm.addWorkers(employee12);


        firm.printFirm();
        firm.printAllWorkers();
        firm.setRahynokZp(50_000);
        System.out.println("Залишок на рахунку = " + firm.getRahynokZp());
        firm.giveSalaryForAll();
        firm.printAllWorkers();
        System.out.println("Залишок на рахунку = " + firm.getRahynokZp());
        firm.calcVocations();
    }
}
