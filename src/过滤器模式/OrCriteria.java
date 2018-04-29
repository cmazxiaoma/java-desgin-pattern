package 过滤器模式;

import java.util.List;

public class OrCriteria implements ICriteria {
    
    private ICriteria criteria;
    private ICriteria otherCriteria;
    
    public OrCriteria(ICriteria criteria, ICriteria otherCriteria) {
        super();
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
        
        for (Person person : otherCriteriaItems) {
           if (!firstCriteriaItems.contains(person)) {
               firstCriteriaItems.add(person);
           }
        }
        
        return firstCriteriaItems;
    }
}
