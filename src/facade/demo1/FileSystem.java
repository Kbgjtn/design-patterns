package facade.demo1;

public class FileSystem {
  public void load(String fileName) {
    System.out.println("FileSystem: load file: " + fileName);
  }

  public void save() {
    System.out.println("FileSystem: save");
  }
}
