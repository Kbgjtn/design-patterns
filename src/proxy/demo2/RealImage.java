package proxy.demo2;

public class RealImage implements Image {
  private String fileName;
  private boolean imageLoaded = false;

  public RealImage(String fileName) {
    this.fileName = fileName;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  private void loadImageFromStorage() {
    try {
      System.out.println("Loading image from data storage ...." + fileName);
      for (int i = 1; i <= 10; i++) { // Simulate a 2-second delay
        System.out.println("Loading image ... " + i * 10 + " %");
        Thread.sleep(100); // Sleep for 1 second
      }

      System.out.println("Image loaded successfully!");
    } catch (Exception e) {
      Thread.currentThread().interrupt();
    }
  }

  @Override
  public void display() {
    if (!imageLoaded) {
      loadImageFromStorage();
      imageLoaded = true;
    }
    System.out.println("Displaying image: .... " + fileName);
  }
}
