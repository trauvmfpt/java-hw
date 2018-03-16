/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package8;

import java.util.Scanner;

/**
 *
 * @author Adminis
 */

public class EmployeeController {
    public void printEmpController(Employee emp){
        if(emp.isStatus()==0){
            System.err.println("Employee is no longer working/ Can't find employee.");
            return;
        }
        
        System.out.println("Employee's name: " + emp.getName() + " email: " + emp.getEmail()
         + " phone: " + emp.getPhone() + " address: " + emp.getAddress()
         + " total wage: " + (emp.getSalaryPerHour()*emp.getWorkingHours()));
       
    }
    
    public Employee getEmpInformation(){
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Please input employee's name: ");
        String name = sc1.nextLine();
        System.out.println("Please input employee's email: ");
        String email = sc1.nextLine();
        System.out.println("Please input employee's phone: ");
        String phone = sc1.nextLine();
        System.out.println("Please input employee's birthday: ");
        long birthday = sc1.nextLong();
        System.out.println("Please input employee's address: ");
        String address = sc1.nextLine();
        System.out.println("Please input employee's working hours: ");
        int workingHours = sc1.nextInt();
        System.out.println("Please input employee's salary per hour: ");
        int salaryPerHour = sc1.nextInt();
        System.out.println("Please input employee's status (1 for active, 0 for inactive employee): ");
        int status = sc1.nextInt();
        
        Employee emp = new Employee(name, email, phone, birthday, address, workingHours, salaryPerHour, status);
        return emp;
    }
}

