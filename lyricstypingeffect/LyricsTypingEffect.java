package lyricstypingeffect;

import javax.sound.sampled.*;
import java.io.File;

public class LyricsTypingEffect {

    static Clip clip;

    
    static void playMusic(String path) {
        try {
            File file = new File(path);

            if (!file.exists()) {
                System.out.println("Music file not found: "
                        + file.getAbsolutePath());
                return;
            }

            AudioInputStream audio =
                    AudioSystem.getAudioInputStream(file);

            clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void typeLine(String text, int speed) {
        try {
            for (char c : text.toCharArray()) {
                System.out.print(c);
                Thread.sleep(speed);
            }

            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    static void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        
        playMusic("lyricstypingeffect/pehla_pyaar.wav.wav");

        pause(3000);

        typeLine("Baatein zaroori hain, tera milna bhi zaroori", 120);
        pause(1500);

        typeLine("Maine mita deni, yeh jo teri-meri doori", 120);
        pause(1500);

        typeLine("Hmm, baatein zaroori hain, tera milna bhi zaroori", 110);
        pause(1500);

        typeLine("Maine mita deni, yeh jo teri-meri doori", 110);
        pause(1800);

        typeLine("Jhoothi hain woh raahein saari duniya ki", 100);
        pause(1400);

        typeLine("Ishq jahaan na chale", 140);
        pause(2200);

        typeLine("Tu pehla-pehla pyaar hai mera", 70);
        pause(700);

        typeLine("Tu pehla-pehla pyaar hai mera", 65);
        pause(700);

        typeLine("Tu pehla-pehla pyaar hai mera", 65);
        pause(700);

        typeLine("Tu pehla-pehla pyaar hai mera", 65);
        pause(2000);

        typeLine("Woh sheher bade honge boriyat bhare", 120);
        pause(1400);

        typeLine("Rehta nahin jin mein tu sang mere", 120);
        pause(1500);

        typeLine("Raunaqein sabhi hoti tere hone se", 110);
        pause(1500);

        typeLine("Tere bina tanha koi kya kare?", 130);
        pause(1800);

        typeLine("Tere liye main na jahaan khada, oh-oh", 100);
        pause(2000);

        typeLine("Tu pehla-pehla pyaar hai mera", 60);
        pause(600);

        typeLine("Tu pehla-pehla pyaar hai mera", 60);
        pause(600);

        typeLine("Tu pehla-pehla pyaar hai mera", 60);
        pause(600);

        typeLine("Tu pehla-pehla pyaar hai mera", 60);

       
        if (clip != null) {
            clip.stop();
            clip.close();
        }
    }
}
