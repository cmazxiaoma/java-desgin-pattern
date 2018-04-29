package 前端控制器模式;

public class FrontControllerPatternDemo {

    public static void main(String[] args) {
        FrontController controller = new FrontController();
        controller.dispatchRequest("home");
        controller.dispatchRequest("student");
    }
}
