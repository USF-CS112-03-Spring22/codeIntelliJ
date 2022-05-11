package lecture27FileProcessing;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SongPlayExample {
    public static class PlayerThread extends Thread {
        Player player;
        PlayerThread(String filename) {
            FileInputStream file;
            try {
            // filename here contains mp3 you want to play
                file = new FileInputStream(filename);
                player = new Player(file);

            } catch (FileNotFoundException e) {
                e.getMessage();
            }
            catch (JavaLayerException e) {
                e.getMessage();
            }
        }

        @Override
        public void run() {
            try {
                player.play();
            }
            catch(Exception e) {
                e.getMessage();
            }
        }

        public void stopPlay() {
            player.close();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        // Without multithreading: do NOT use for the project
        /*FileInputStream file = new FileInputStream("input/1.mp3");
        try {
            Player player = new Player(file);
            player.play();

        } catch (JavaLayerException e) {
            e.printStackTrace();
        }*/

        // Note: for this to work, you need to place a file 1.mp3 in the input folder
        // With multithreading - this is what we want to use for the project
        PlayerThread helperThread  = new PlayerThread("input/1.mp3");
        helperThread.start();

        // An example of closing the player to stop playing the song
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Q to stop: ");
        String command = sc.nextLine();
        if (command.equals("Q"))
            helperThread.stopPlay();

    }
}
