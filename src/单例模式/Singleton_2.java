package 单例模式;

public class Singleton_2 {
    private static Singleton_2 instance;
    
    private Singleton_2() {}
    
    public static Singleton_2 getInstance() {
        if (instance == null) {
            instance = new Singleton_2();
        }
        return instance;
    }
}
