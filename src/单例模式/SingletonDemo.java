package 单例模式;

public class SingletonDemo {
    
    public static void main(String[] args) {
        Singleton_5 singleton1 = Singleton_5.getInstance();
        Singleton_5 singleton2 = Singleton_5.getInstance();
        
        System.out.println(singleton1);
        System.out.println(singleton2);
        
        if (singleton1 == singleton2) {
            System.out.println("same");
        }
    }
}
