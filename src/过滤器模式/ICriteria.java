package 过滤器模式;

import java.util.List;

public interface ICriteria {
    
    public List<Person> meetCriteria(List<Person> persons);
}
