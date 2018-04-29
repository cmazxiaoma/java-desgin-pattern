package 单例模式;

public class Singleton_3 {
    private static Singleton_3 instance;
    
    private Singleton_3() {}
    
    public static synchronized Singleton_3 getInstance() {
        if (instance == null) {
            instance = new Singleton_3();
        }
        
        return instance;
    }
}
