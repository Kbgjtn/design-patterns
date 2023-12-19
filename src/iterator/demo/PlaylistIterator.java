package iterator.demo;

import java.util.List;

public class PlaylistIterator implements SongIterator {
  private List<Song> playlist;
  private int position;

  public PlaylistIterator(List<Song> playlist) {
    this.playlist = playlist;
    this.position = 0;
  }

  @Override
  public boolean hasNext() {
    return position < playlist.size();
  }

  @Override
  public Song next() {
    if (hasNext()) {
      Song song = playlist.get(position);
      position++;
      return song;
    } else {
      System.out.println("No more songs in playlist");
      return null;
    }
  }
}
