/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author rafae
 */
public class Program {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        List<Employee> list = new ArrayList<>();
        
        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();
        System.out.println("");
        Employee Emp;
        
        for (int i=0; i < n;i++){
            
            System.out.println("Employee #"+(i+1)+":");
            System.out.println("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();
            
            Emp = new Employee(id, name, salary);
            list.add(Emp);
            
        }
        
        System.out.println("Enter the employee id that will have salary increase : ");
        int idsalary = sc.nextInt();
        Integer pos = position(list, idsalary);
        if(pos == null){
            System.out.println("This id does not exist!");
        }else{
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }
        
        System.out.println("");
        System.out.println("List of employees: ");
        for(Employee Obj : list){
            System.out.println(Obj);
        }
        
        
        sc.close();
    }
    public static Integer position(List<Employee> list,int id){
        for (int i = 0; i< list.size();i++){
            if(list.get(i).getId() == id){
                return i;
            }
                
    }
        return null;
        
    
}
    
    
}

