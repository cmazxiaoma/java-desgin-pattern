package 单例模式;

public class Singleton_4 {
    private volatile static Singleton_4 instance;
    
    private Singleton_4() { }
    
    public static Singleton_4 getInstance() {
        if (instance == null) {
            synchronized(Singleton_4.class) {
                if (instance == null) {
                    instance = new Singleton_4();
                }
            }
        }
        return instance;
    }
    
}
