import java.util.Scanner;

public class Person {

    protected String name;
    protected int age;
  protected String address;
    Scanner input = new Scanner(System.in);

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName() {

        System.out.println("enter name ");
        name=input.next();
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        System.out.println("enter age ");
        age= input.nextInt();
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        System.out.println("enter address");
        address=input.next();
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' ;
    }
}

class Student extends Person{
  protected int student_level;
  protected String specialization;
 protected double Gap;

    public Student() {
        this.student_level = student_level;
        this.specialization = specialization;
        Gap = Gap;
    }

    public int getStudent_level() {
        return student_level;
    }

    public void setStudent_level() {
        System.out.println("enter setStudent_level ");
        student_level=input.nextInt();
        this.student_level = student_level;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization() {
        System.out.println("enter specialization");
        specialization=input.next();
        this.specialization = specialization;
    }

    public double getGap() {
        return Gap;
    }

    public void setGap() {
        System.out.println("enter gap");
        double gap=input.nextDouble();
        Gap = gap;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
class Employee extends Person{
    double salary;
    int rank;
    String job;

    public Employee() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary() {
        System.out.println("enter salary");
        salary=input.nextDouble();

        this.salary = salary;
    }

    public int getRank() {
        return rank;
    }

    public void setRank() {
        System.out.println("enter the rank ");
        rank=input.nextInt();
        this.rank = rank;
    }

    public String getJob() {
        return job;
    }

    public void setJob() {
        System.out.println("enter the job");
        job=input.next();
        this.job = job;
    }

    @Override
    public String toString() {

        return null;
    }
}

class Salaried_Employee extends Employee{
    double bonus;
    double deductions;

    public Salaried_Employee() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus() {
        System.out.println("enter Bonus");
        bonus=input.nextInt();
        this.bonus = bonus;
    }

    public double getDeductions() {

        return deductions;
    }

    public void setDeductions() {
        System.out.println("enter Deductions ");
        deductions=input.nextDouble();
        this.deductions = deductions;
    }

    @Override
    public double getSalary() {
        return salary+=bonus-deductions;
    }

    @Override
    public String toString() {
        return "Salaried_Employee{" +
                "bonus=" + bonus +
                ", deductions=" + deductions +
                ", salary=" + salary +
                ", rank=" + rank +
                ", job='" + job + '\'' +
                ", input=" + input +
                '}';
    }
}
 class Main {
    public static void main(String[] args) {



        Salaried_Employee se=new Salaried_Employee();
        se.setSalary();
        se.setBonus();
        se.setDeductions();
        System.out.println(se.getSalary());
    }
}