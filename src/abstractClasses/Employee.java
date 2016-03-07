/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractClasses;

import intefaces.Employees;

/**
 *
 * @author jvm
 */
public abstract class Employee extends Person implements Employees{
    private String section;
    private Double salary;

    public Employee() {
    }

    public Employee(String section, Double salary, String name, String family, String code) {
        super(name, family, code);
        this.setSection(section);
        this.setSalary(salary);
    }
    
    @Override
    public void setSalary(Double salary) {
        if(salary==null){
            this.salary=800.00;
        }else{
            this.salary=salary;
        }
    }

    @Override
    public Double getSalary() {
        return this.salary;
    }

    @Override
    public void setSection(String section) {
        this.section=section;
    }
    @Override
    public String getSection() {
        return this.section;
    }


    
}
