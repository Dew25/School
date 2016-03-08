/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import intefaces.Persons;
import java.util.ArrayList;
import java.util.List;

/**
 *  Класс возвращает список объектов класса Person
 * @author jvm
 */
public class ListPersons {
    public List<Persons> getPersons(){
        List<Persons> person = new ArrayList<>();
        person.add(new Administrator("IVKHK", 2000.00, "Hannes", "Mets", "35807142543", "Director"));
        person.add(new Teacher("IT", null, "Ants", "Tamm", "35807142543"));
        person.add(new Student("Ivan", "Vassiljev", "39206124353", "1KTVR"));
        person.add(new Student("Fedja", "Fjodorov", "39606031223", "1PTVR"));
                
       
        return person;
    }
}