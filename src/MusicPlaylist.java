import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MusicPlaylist {

    LinkedList<String> playlist = new LinkedList<>();
    ListIterator<String> iterator = playlist.listIterator();
    String currentSong = null;

    // Add Song
    public void addSong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter song name: ");
        String song = sc.nextLine();

        playlist.add(song);
        System.out.println("Song added to playlist!\n");
    }

    // Play Next Song
    public void playNext() {
        if (iterator.hasNext()) {
            currentSong = iterator.next();
            System.out.println("Playing Next: " + currentSong + "\n");
        } else {
            System.out.println("No next song available.\n");
        }
    }

    // Play Previous Song
    public void playPrevious() {
        if (iterator.hasPrevious()) {
            currentSong = iterator.previous();
            System.out.println("Playing Previous: " + currentSong + "\n");
        } else {
            System.out.println("No previous song available.\n");
        }
    }

    // Remove Song
    public void removeSong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter song name to remove: ");
        String song = sc.nextLine();

        if (playlist.remove(song)) {
            System.out.println("Song removed successfully!\n");
        } else {
            System.out.println("Song not found in playlist.\n");
        }
    }

    // Display Playlist
    public void showPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.\n");
            return;
        }

        System.out.println("\n---- Playlist ----");
        for (String s : playlist) {
            System.out.println(s);
        }
        System.out.println();
    }

    // MENU
    public static void main(String[] args) {

        MusicPlaylist mp = new MusicPlaylist();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==== Music Playlist Manager ====");
            System.out.println("1. Add Song");
            System.out.println("2. Play Next Song");
            System.out.println("3. Play Previous Song");
            System.out.println("4. Remove Song");
            System.out.println("5. Show Playlist");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1 -> mp.addSong();
                case 2 -> mp.playNext();
                case 3 -> mp.playPrevious();
                case 4 -> mp.removeSong();
                case 5 -> mp.showPlaylist();
                case 6 -> {
                    System.out.println("Exiting... Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice!\n");
            }
        }
    }
}