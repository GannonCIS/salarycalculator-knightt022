/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author jkni1
 */
public class SalaryCalculator {
    private String employeeName;
    private int hours;
    private int salary;
    private double rate, pay;
    private int taxRate;
    private int weeks;
    private int hourlyRate;
    
    public void employeeName( String John){
        employeeName = John;
    }
    
    public int calcSalary(int hourlyRate){
        hours = 40;
        weeks = 52;
        rate = 8.25;
        salary = (int) (rate * hours * weeks);
        
        System.out.println(salary);
        
        return salary;
    }
    
    public void calcHourly(int salary){
        salary = (int) (rate * hours * weeks);
        weeks = 52;
        hours = 40;
        hourlyRate = salary / weeks*hours;
        
        System.out.println(hourlyRate);
    }
    
    public void calcTakeHome(int salary){
        taxRate = (int) .20;
        salary = (int) (rate * hours * weeks);
        int takeHome = salary * taxRate;
        
        System.out.println(takeHome);
        
    }
    
    public void calcTaxes(int salary, double taxRate){
        
    }
}   





