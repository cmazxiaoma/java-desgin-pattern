package 过滤器模式;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CriteriaPatternDemo {
    
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        
        persons.add(new Person("garrett", "male", "married"));
        persons.add(new Person("xiaoma", "female", "married"));
        persons.add(new Person("hexin", "male", "single"));
        persons.add(new Person("dingxiao", "male", "single"));
        
        ICriteria male = new CriteriaMale();
        ICriteria female = new CriteriaFemale();
        ICriteria single = new CriteriaSingle();
        
        ICriteria singleAndMales = new AndCriteria(male, single);
        ICriteria singleOrFemales = new OrCriteria(female, single);
        
        printfPersons(male.meetCriteria(persons));
        printfPersons(female.meetCriteria(persons));
        printfPersons(single.meetCriteria(persons));
        printfPersons(singleAndMales.meetCriteria(persons));
        printfPersons(singleOrFemales.meetCriteria(persons));
    }
    
    public static void printfPersons(List<Person> persons) {
        if (persons == null || persons.size() <= 0) {
            System.out.println("null");
        }
        
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println("");
    }
}
