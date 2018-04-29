package 组合模式;

public class CompositePatternDemo {
    
    public static void main(String[] args) {
        Employee seniorArchitect = new Employee("garrett", "senior architect", 50000);
        Employee architect = new Employee("doudou", "architect", 30000);
        Employee sse = new Employee("dingxiao", "sse", 15000);
        Employee se = new Employee("hexin", "se", 8000);
        
        seniorArchitect.add(architect);
        architect.add(sse);
        sse.add(se);
        
        printEmployee(seniorArchitect);
    }
    
    public static void printEmployee(Employee head) {
        if (head == null) {
            throw new IllegalArgumentException("employee is null");
        }
        
        System.out.println(head);
        
        if (head.getSubordinates().isEmpty()) {
            throw new IllegalArgumentException("employee suboradinates is null");
        }
        
        for (Employee e : head.getSubordinates()) {
            printEmployee(e);
        }
    }
}
