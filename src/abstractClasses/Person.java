
package abstractClasses;

import intefaces.Persons;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import util.ParseCode;

/**
 * Базовый класс, который представляет персон школы.
 * Класс содержит поля для описания и идентификации работника  
 * @author jvm
 */
public abstract class Person implements Persons{
    public static int personCount; // статическое поле содержит количество работников (принадлежит всем экземплярам класса)
    private int id; // идентификатор конкретного работника
    private String name;
    private String family;
    private String code;

    public Person() {
    }

    public Person(String name, String family, String code) {
        this.setId(personCount);
        this.setName(name);
        this.setFamily(family);
        this.setCode(code);
    }
       
    private void setId(int personCount) {
        Person.personCount++;
        this.id=Person.personCount;
    }
    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the family
     */
    public String getFamily() {
        return this.family;
    }

    /**
     * @param family the family to set
     */
    public void setFamily(String family) {
        this.family = family;
    }
    public String getCode(){
        return this.code;
    }  
    
    @Override
    public void setCode(String code){
        if(code.length()== 11){
          if(stringIsNumber(code)){
              this.code=code;
          }else{
           throw new IllegalArgumentException("Вводите тлько цифры!"); 
          }
        }else{
            throw new IllegalArgumentException(" Несоответствие длинны!");   
        }
    }
    private boolean stringIsNumber(String S) {
 
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(S);
 
        return m.matches();
    }

    public Integer age() {
       ParseCode parseCode=new ParseCode(this.code); 
       return parseCode.getAge();
    }
   public String birthdey(){
       ParseCode parseCode=new ParseCode(this.code); 
       return parseCode.getBirthdey();
   }

    
}
