package 拦截过滤器模式;

public class Client {

    private FilterManager filterManager;

    public void setFilterManager(FilterManager manager) {
        this.filterManager = manager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
