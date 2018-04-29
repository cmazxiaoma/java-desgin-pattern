package 单例模式;

public class Singleton_5 {

    private Singleton_5() {
        
    }
    
    public static Singleton_5 getInstance() {
        return Singleton_5Holder.instance;
    }
    
    private static class Singleton_5Holder {
        private static final Singleton_5 instance = new Singleton_5();
    }
}
