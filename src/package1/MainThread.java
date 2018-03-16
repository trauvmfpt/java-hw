/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

/**
 *
 * @author Adminis
 */
public class MainThread {

    public static void main(String[] args) {
        EmployeeController empController = new EmployeeController();
        Employee emp = empController.getEmpInformation();
        empController.printEmpController(emp);
    }
}

