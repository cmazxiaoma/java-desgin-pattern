package 拦截过滤器模式;

public class Target {

    public void execute(String request) {
        System.out.println("executing request:" + request);
    }
}
