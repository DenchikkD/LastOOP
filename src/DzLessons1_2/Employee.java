package DzLessons1_2;

/**
 * Created by Denni on 16.05.2016.
 */
public class Employee {
    private String name;
    private String surName;
    private Integer stavksZp;
    private Integer privateZpRah;
    private Integer year;
    private Integer month;
    private String sex;
    private String department;
    private Integer selling;



    public Employee(String name, String surName, Integer stavksZp, Integer privateZpRah, Integer year, Integer month, String sex, String department) {
        this.name = name;
        this.surName = surName;
        this.stavksZp = stavksZp;
        this.privateZpRah = privateZpRah;
        this.year = year;
        this.month = month;
        this.sex = sex;
        this.department = department;
    }

//    public void printEmploye() {
//        System.out.println("Ім’я : " + name + " Прізвище : " + surName + " Ставка ЗП : " + stavksZp + " р/р : " + privateZpRah + " Рік прийняття на роботу : " + year + " Місяць прийняття : " + month + " Стать : " + sex + " Відділ : " + department);
//
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "name = '" + name + '\'' +
                ", surName = '" + surName + '\'' +
                ", stavksZp = " + stavksZp +
                ", privateZpRah = " + privateZpRah +
                ", year = " + year +
                ", month = " + month +
                ", sex = '" + sex + '\'' +
                ", department = '" + department + '\'' +
                '}';
    }

    public Integer getStavksZp() {
        return stavksZp;
    }

    public void setStavksZp(Integer stavksZp) {
        this.stavksZp = stavksZp;
    }

    public Integer getPrivateZpRah() {
        return privateZpRah;
    }

    public void setPrivateZpRah(Integer privateZpRah) {
        this.privateZpRah = privateZpRah;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getSelling() {
        return selling;
    }

    public void setSelling(int selling) {
        this.selling = selling;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getDepartment() {
        return department;
    }
}
