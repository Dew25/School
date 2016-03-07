/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import abstractClasses.Person;
import intefaces.Students;

/**
 *
 * @author jvm
 */
public class Student extends Person implements Students{
    
    private String group;
    
    public Student() {
    }

    public Student(String name, String family, String code, String group) {
        super(name, family, code);
        this.setGroup(group);
        
    }
     /**
      * Перегружаем метод родительского класса - добавляем к нему свою строку
      * @return String
      */
    public String toString() {
        return "I am student{\n\t"+
                                        "name="+getName()+
                                        "\n\tfamily="+getFamily()+
                                        "\n\tage="+getAge()+
                                        "\n\tgroup="+getGroup()+
                                    "\n}";
    }

    @Override
    public String getGroup() {
        return this.group;
    }
   
    @Override
    public void setGroup(String group) {
        this.group = group;    
    }

    

    

    
}
