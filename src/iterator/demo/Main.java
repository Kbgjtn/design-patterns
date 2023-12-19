package iterator.demo;

public class Main {
  public static void main(String[] args) {
    MusicPlaylist musicPlaylist = new MusicPlaylist();

    musicPlaylist.addSong(new Song("Song 1", "Artist 1"));
    musicPlaylist.addSong(new Song("Song 2", "Artist 2"));
    musicPlaylist.addSong(new Song("Song 3", "Artist 3"));

    SongIterator iterator = musicPlaylist.iterator();
    while (iterator.hasNext()) {
      Song song = iterator.next();
      System.out.print("Currently playing: ");
      System.out.println(song.toString());
    }
  }
}
