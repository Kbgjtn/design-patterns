package facade.demo1;

public class Client {
  public static void main(String[] args) {
    MultimediaFacade multimediaFacade = new MultimediaFacade();
    String file = "test.mp4";

    multimediaFacade.startMultimedia(file);

    file = "some_movie.mp4";

    multimediaFacade.loadAndPlayMultimedia(file);

    multimediaFacade.saveAndStopMultimedia();
  }
}
