package 过滤器模式;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements ICriteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("male")) {
                malePersons.add(person);
            }
        }
        
        return malePersons;
    }
}
