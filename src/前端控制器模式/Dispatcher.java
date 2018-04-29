package 前端控制器模式;

public class Dispatcher {

    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher() {
        super();
        this.studentView = new StudentView();
        this.homeView = new HomeView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("student")) {
            studentView.show();
        } else {
            homeView.show();
        }
    }
}
