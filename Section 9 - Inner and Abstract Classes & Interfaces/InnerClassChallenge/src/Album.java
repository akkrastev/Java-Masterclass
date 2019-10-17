import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String title;
    private String artist;
    private SongList songs;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new SongList();
    }

    public String getTitle() {
        return title;
    }

    public SongList getSongs() {
        return songs;
    }

    public boolean addSong(String title, double duration){
        return this.songs.addSong(new Song(title,duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){

        Song songToAdd = songs.findSong(trackNumber);
        if (songToAdd != null){
            playList.add(songToAdd);
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;

    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song checkedSong = songs.findSong(title);
        if (checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + title);
        return false;
    }


    private class SongList{

        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean addSong(Song song){
            if (songs.contains(song)){
                return false;
            }
            songs.add(song);
            return true;
        }

        private Song findSong(String title){
            for (Song checkedSong: songs) {
                if (checkedSong.getTitle().equals(title)){
                    return checkedSong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber){

            int index = trackNumber -1;

            if (index >= 0 && index < songs.size()){
                return songs.get(index);
            }
            return null;
        }
    }

}
