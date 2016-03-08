/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import abstractClasses.Employee;

/**
 * Класс представляет работников школы, которые являются учителями
 * @author jvm
 */
public class Teacher extends Employee{
    

    public Teacher(){
    }

    public Teacher(String section, Double salary, String name, String family, String code) {
        super(section, salary, name, family, code);
    }

   
    public String toString() {
        return "I am Teacher{\n\t" + 
                "name=" + this.getName() +
                "\n\tfamily=" + this.getFamily() +
                "\n\tage=" + this.age() +
                "\n\tsection=" + this.getSection()+
                "\n\tsalary=" + this.getSalary()+
                "\n\tМой день рождения:"+birthdey()+
                       
                "\n\t}";
    }

       
}
