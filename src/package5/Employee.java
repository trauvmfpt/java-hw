/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package5;

/**
 *
 * @author Adminis
 */

public class Employee {
    private long id;
    private String name;
    private String email;
    private String phone;
    private long birthday;
    private String address;
    private int workingHours;
    private int salaryPerHour;
    private long joinedDate;
    private int status; // 0. Off | 1. On

    public void setId(long id){
        this.id = id;
    }
    
    public long getId(){
        return id;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public long getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(long joinedDate) {
        this.joinedDate = joinedDate;
    }

    public int isStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Employee(){
        
    }
        
    public Employee(String name, String email, String phone, long birthday, String address,
                        int workingHours, int salaryPerHour, int status){
        this.id = System.currentTimeMillis();
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.address = address;
        this.workingHours = workingHours;
        this.salaryPerHour = salaryPerHour;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", birthday=" + birthday + ", address=" + address + ", workingHours=" + workingHours + ", salaryPerHour=" + salaryPerHour + ", joinedDate=" + joinedDate + ", status=" + status + '}';
    }
    
    
}
