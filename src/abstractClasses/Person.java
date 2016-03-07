
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
    public String getBirthdey(){
        return null;
    }
    public Integer getAge() {
        String youCode = this.code;
        String g=youCode.substring(0, 1);
        int gen=Integer.parseInt(g);
        String year;
        switch (gen) {
            case 3:
                {
                    year= "19"+youCode.substring(1,3);
                    break;
                }
            case 5:
                {
                    year= "20"+youCode.substring(1,3);
                    break;
                }
            default:
                {
                    year= "0";
                    break;
                }
        }
        String month = youCode.substring(3,5);
        String dey = youCode.substring(5,7);
     
        //Integer age = calculateAge(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(dey));//"2012,12,13"
       // System.out.println(" year="+year+" month="+month+" dey="+dey+" age="+age);
       ParseCode parseCode=new ParseCode(this.code); 
       return parseCode.getAge();
    }
   

    
}
