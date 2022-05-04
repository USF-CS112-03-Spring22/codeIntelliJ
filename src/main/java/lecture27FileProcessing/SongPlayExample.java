package lecture27FileProcessing;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

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

        public void run() {
            try {
                player.play();
            }
            catch(Exception e) {
                e.getMessage();
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        // Without multithreading: do NOT use for the project
        FileInputStream file = new FileInputStream("input/1.mp3");
        try {
            Player player = new Player(file);
            player.play();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }

        // With multithreading - this is what we want to use for the project
        //Thread helperThread  = new PlayerThread("input/1.mp3");
        //helperThread.start();
    }
}
