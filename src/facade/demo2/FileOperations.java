package facade.demo2;

public class FileOperations {
  public void createFile(String fileName) {
    System.out.println("FileOperations: create file: " + fileName);
  }

  public void deleteFile(String fileName) {
    System.out.println("FileOperations: delete file: " + fileName);
  }
}
