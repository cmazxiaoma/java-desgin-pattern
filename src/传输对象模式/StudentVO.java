package 传输对象模式;

public class StudentVO {
    private int id;
    private String name;

    public StudentVO(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentVO [id=" + id + ", name=" + name + "]";
    }
}
