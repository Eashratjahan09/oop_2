package HAQ2;

import java.util.Scanner;

public class Employee {
    String id;
    String name;
    double currentSalary=0;
    Employee( String name,String id){
        this.name=name;
        this.id=id;
    }
    String updateName(String name){
        return this.name=name;
    }
    void printAll(){
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
    }
}
 class SalariedEmployee extends Employee{
     int monthlyAmount;
    SalariedEmployee(String name,String id, int monthlyAmount){
        super(name, id);
        this.monthlyAmount=monthlyAmount;
    }
     public double getCurrentSalary(){
         return monthlyAmount;
     }
     void printAll(){
        super.printAll();
         System.out.println("Current Salary:"+monthlyAmount);
     }

 }
 class HourlySalariedEmployee extends Employee{
    double SalaryPerHr;
    double noOfHr;
     HourlySalariedEmployee(String name,String id,double SalaryPerHr,double noOfHr){
         super(name, id);
         this.SalaryPerHr=SalaryPerHr;
         this.noOfHr=noOfHr;
     }
     public double getCurrentSalary(double SalaryPerHr,double noOfHr){
         return (SalaryPerHr*noOfHr);
     }
     void printAll(){
         super.printAll();
         System.out.println("Current Salary:"+(SalaryPerHr*noOfHr));
     }

 }
class CommissonedEmployee extends Employee{
    double base_salary;
    double no_of_sold_product;
    double commission_for_each_product;
    CommissonedEmployee(String name,String id,double base_salary,double no_of_sold_product,double commission_for_each_product){
        super(name, id);
        this.base_salary=base_salary;
        this.no_of_sold_product=no_of_sold_product;
        this.commission_for_each_product=commission_for_each_product;
    }
    public double getCurrentSalary(double base_salary,double no_of_sold_product,double commission_for_each_product){
        return (base_salary+(no_of_sold_product*commission_for_each_product));
    }
    void printAll(){
        super.printAll();
        System.out.println("Current Salary:"+(base_salary+(no_of_sold_product*commission_for_each_product)));
    }
}
class Check{
    public static void main(String[] args) {
        Employee []p=new Employee[6];
        p[0]=new SalariedEmployee("pikachu", "39483463", 9000);
        p[1]=new SalariedEmployee("nobita", "54785463", 9000);
        p[2]=new HourlySalariedEmployee("Yushiko", "957435", 500, 8);
        p[3]=new HourlySalariedEmployee("hanji", "345435", 500, 7);
        p[4]=new CommissonedEmployee("kukku", "834535", 4500, 5, 150);
        p[5]=new CommissonedEmployee("pkiku", "458455", 4500, 9, 150);
         for (Employee e:p){
             e.printAll();
         }
 //if take input id & want to search//
         //int i;

           // System.out.println("Write the id which you want to check:");
           // Scanner sc=new Scanner(System.in);
           // String idn=sc.next();
        //for(i=0;i < 6; i++){
          //  if(p[i].id==idn){
              //  p[i].printAll();
           // }
        //}

    }
}
