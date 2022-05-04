package lecture27FileProcessing;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

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

    public static void main(String[] args) {
        Thread helperThread  = new PlayerThread("input/1.mp3");
        helperThread.start();
    }
}
