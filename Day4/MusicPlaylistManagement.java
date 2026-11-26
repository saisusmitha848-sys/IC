import java.util.LinkedList;

public class MusicPlaylistManagement {

    public static void main(String[] args) {

        
        LinkedList<String> playlist = new LinkedList<>();

      
        playlist.add("Perfect");
        playlist.add("Shape of You");
        playlist.add("Believer");
        playlist.add("Memories");
        playlist.add("Let Me Love You");

        
        playlist.addFirst("Kesariya");

       
        playlist.addLast("Night Changes");

      
        System.out.println("Current Playlist:");
        for (String song : playlist) {
            System.out.println(song);
        }

        
        System.out.println("\nFirst Song: " + playlist.getFirst());
        System.out.println("Last Song: " + playlist.getLast());

       
        String searchSong = "Believer";

        if (playlist.contains(searchSong)) {
            System.out.println("\n" + searchSong + " is available in the playlist.");
        } else {
            System.out.println("\n" + searchSong + " is not available in the playlist.");
        }

      
        String removedFirst = playlist.removeFirst();
        System.out.println("\nRemoved First Song: " + removedFirst);

       
        String removedLast = playlist.removeLast();
        System.out.println("Removed Last Song: " + removedLast);

        
        System.out.println("\nPlaylist After Removing First and Last Songs:");
        System.out.println(playlist);

       
        if (!playlist.isEmpty()) {
            String playingSong = playlist.removeFirst();
            System.out.println("\nNow Playing: " + playingSong);
        } else {
            System.out.println("\nPlaylist is empty. No song to play.");
        }

        
        System.out.println("\nRemaining Playlist:");
        System.out.println(playlist);
    }
}
