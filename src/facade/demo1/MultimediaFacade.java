package facade.demo1;

public class MultimediaFacade {
  private AudioSystem audioSystem;
  private VideoSystem videoSystem;
  private FileSystem fileSystem;

  public MultimediaFacade() {
    audioSystem = new AudioSystem();
    videoSystem = new VideoSystem();
    fileSystem = new FileSystem();
  }

  public void startMultimedia(String fileName) {
    audioSystem.turnOn();
    videoSystem.start();
    fileSystem.load(fileName);
  }

  public void stopMultimedia() {
    audioSystem.turnOff();
    videoSystem.stop();
  }

  public void loadAndPlayMultimedia(String fileName) {
    fileSystem.load(fileName);
    startMultimedia(fileName);
  }

  public void saveAndStopMultimedia() {
    stopMultimedia();
    fileSystem.save();
  }
}
