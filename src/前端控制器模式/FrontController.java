package 前端控制器模式;

public class FrontController {

    private Dispatcher dispatcher;

    public FrontController() {
        super();
        this.dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authentic successfully");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page requested:" + request);
    }

    public void dispatchRequest(String request) {
        trackRequest(request);

        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }
}
