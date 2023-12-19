package iterator.demo;

import java.util.ArrayList;
import java.util.List;

public class MusicPlaylist implements Playlist {
  private List<Song> playlist;

  public MusicPlaylist() {
    this.playlist = new ArrayList<>();
  }

  public void addSong(Song song) {
    playlist.add(song);
  }

  public SongIterator iterator() {
    return new PlaylistIterator(playlist);
  }
}
