/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import abstractClasses.Employee;

/**
 *
 * @author jvm
 */
public class Administrator extends Employee{
    
    private String status;
    
    public Administrator() {
    }

    public Administrator(String section, Double salary, String name, String family, String code, String status) {
        super(section, salary, name, family, code);
        this.setStatus(status);
       
    }
    
    /**
      * Реализуем абстрактный метод родительского класса
      * @return String
      */
    public String getStatus() {
        return this.status;
    }

    private void setStatus(String status) {
        this.status = status;
    }
    
    
    public String toString() {
        return "I am Administrator{\n\t" + 
                "name=" + this.getName() +
                "\n\tfamily=" + this.getFamily() +
                "\n\tage=" + this.age() +
                "\n\tsection=" + this.getSection()+
                "\n\tstatus=" + this.getStatus()+
                "\n\tsalary=" + this.getSalary()+
                 "\n\tМой день рождения:"+birthdey()+      
                "\n\t}";
    }

    
}
