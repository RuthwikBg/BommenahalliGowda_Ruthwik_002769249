/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Rutu
 */
public class EmpList {
    
    private ArrayList<Employee> empList ;
    
    public EmpList(){
        this.empList = new ArrayList<>();
    }
    
    public void setList(ArrayList<Employee> empList){        
       this.empList = empList;               
    }
    public ArrayList<Employee> getList(){
        return empList;
    }
    public void addNewEmployee(Employee e){
        empList.add(e);      
        
    }
    
    public void deleteEmployee(Employee emp){
        empList.remove(emp);
    }
    
    
    
    
}
