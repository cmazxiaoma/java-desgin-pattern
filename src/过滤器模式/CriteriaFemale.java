package 过滤器模式;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements ICriteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("female")) {
                femalePersons.add(person);
            }
        }
        
        return femalePersons;
    } 
}
