package 代理模式;

public class RealImage implements Image {
    
    private String fileName;
    
    public RealImage(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public void display() {
        System.out.println("display " + fileName);
    }
    
    public void loadFromDisk(String fileName) {
        System.out.println("loading " + fileName);
    }
}
