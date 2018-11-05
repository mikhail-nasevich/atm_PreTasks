package staff;

import java.util.ArrayList;
import java.util.List;

public abstract class ParkStaff {


    private String name;
    private String surname;
    private int id;
    private double salary;


    public ParkStaff(String name, String surname, int id, double salary) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.salary = salary;
    }

    protected static final List<ParkStaff> people = new ArrayList<ParkStaff>();

    public static boolean addPeople(ParkStaff newPeople) {
        return people.add(newPeople);
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary){this.salary = salary;}



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public double getSalary(){return salary;}


    public static void showStaff(){

        System.out.println("Taxi Park staff:");

        for (ParkStaff staff : people) {
            System.out.println(staff.getId()+ ": " + staff.getName()+ "_" +staff.getSurname());

        }
        people.clear();
    }


}
