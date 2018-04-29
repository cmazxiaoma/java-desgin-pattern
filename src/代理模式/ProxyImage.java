package 代理模式;

public class ProxyImage implements Image {
    
    private RealImage realImage;
    private String fileName;
    
    public ProxyImage(RealImage realImage, String fileName) {
        this.fileName = fileName;
        this.realImage = realImage;
    }


    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
