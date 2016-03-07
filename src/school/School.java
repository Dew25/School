/**
 * Класс демонстрирует приемы работы с классами.
 * 1. создание списка List типа ArreyList, который содержит объекты типа Persons
 * 2. т.к от абстрактного класса Person, который имплементирует интерфейс Persons
 *      наследуются другие классы, то они тоже являются типом Persons
 * 3. перебор списка через класс ListIterator
 * 4. вывод класса в консоль методом toString
 * 5. демонстрируется инкапсуляция методов в классе
 * 6. демонстрируется полиморфизм в действии.
 * 
 */
package school;

import classes.ListPersons;
import abstractClasses.Person;
import intefaces.Persons;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author jvm
 */
public class School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ListPersons listPersons = new ListPersons(); 
        List<Persons> persons = listPersons.getPersons();
        //выводим статическое поле класса Person, в котором хранится количество созданных персон
        System.out.println("Всего работников: " + Person.personCount + ".");
        ListIterator<Persons> iter = persons.listIterator();// сооздаем итератор 
        int i=1; //счетчик вывода строк
        while (iter.hasNext()) {//если hesNext() == true
            Persons person = iter.next(); // помещаем первую строку списка в person
            System.out.println(i+". "+person.toString());
            i++; //увеличиваем счетчик
        }
        System.out.println("");
    }

}
