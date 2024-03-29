import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String title;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(String title, double duration){
        if (findSong(title) == null){
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber -1;
        if ((index >= 0) && (index <= this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track" + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song checkedSong = findSong(title);
        if (checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + title);
        return false;
    }

    private Song findSong(String title){
        for (Song checkedSong: songs) {
            if (checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }

    
}
