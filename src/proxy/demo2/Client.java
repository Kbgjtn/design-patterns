package proxy.demo2;

public class Client {
  public static void main(String[] args) {
    String fileName = "hello_world.jpeg";
    Image image = new ImageProxy(fileName);
    /* First call should be delay by loaded file from disk or data storage */
    System.out.println("First Load image");
    image.display();

    /* Second call should be not delay cause the image is
     * already loaded before */
    System.out.println("\nSecond Call");
    image.display();
  }
}
