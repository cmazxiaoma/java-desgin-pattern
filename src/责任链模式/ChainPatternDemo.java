package 责任链模式;

public class ChainPatternDemo {
    
    private static AbstractLogger getChainOfLoggers() {
        
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.DEBUG);
        
        errorLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
    
    public static void main(String[] args) {
        AbstractLogger chain = getChainOfLoggers();
        
        chain.logMessage(AbstractLogger.INFO, "i am garrett");
        chain.logMessage(AbstractLogger.DEBUG, "i am xiaoma");
        chain.logMessage(AbstractLogger.ERROR, "i am dodou");
      
    }
}
