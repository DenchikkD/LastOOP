package DzLessons1_2;

import java.util.ArrayList;

/**
 * Created by Denni on 16.05.2016.
 */
public class Firm {
    private static final Integer THIS_YEAR = 2016;
    private static final Integer THIS_MOUNTH = 5;
    private String name;
    private String adress;
    private Integer rahynokZp;
    private ArrayList<Employee> workers;


    public Firm(String name, String adress) {
        this.name = name;
        this.adress = adress;
        this.workers = new ArrayList<Employee>();
    }

    public void addWorkers(Employee employ) {
        this.workers.add(employ);

    }

    public void printFirm() {

        System.out.println("Name : " + name + " Adress : " + adress);

    }

    public void printAllWorkers() {
        for (Employee employ : workers) {
//            employ.printEmploye();
            System.out.println(employ);

        }
    }

    public Integer getRahynokZp() {
        return rahynokZp;
    }

    public Integer setRahynokZp(Integer rahynokZp) {
        this.rahynokZp = rahynokZp;
        return rahynokZp;
    }

    public void giveSalaryForAll() {
        for (Employee employ : workers) {
            employ.setPrivateZpRah(employ.getStavksZp());
            this.rahynokZp = setRahynokZp(getRahynokZp() - employ.getStavksZp());
        }
    }

    public void calcVocations() {
        for (Employee employ : workers) {
            Integer sel = (12 - employ.getMonth() + (THIS_YEAR - employ.getYear() - 1) * 6 + THIS_MOUNTH);
            if (sel >= 6) {
                employ.setSelling(sel * 2);
            }
            System.out.println("Name : " + employ.getName() + " SurName ; " + employ.getSurName() + " Selling : " + employ.getSelling());

        }

    }

}
