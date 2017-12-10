package byui.cit260.oregontrail.model;

import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

import byui.cit260.oregontrail.view.BuildView;

public class ConstructionAudio extends Thread {
    
    public ConstructionAudio() {
        start();
    }
    
    @Override
    public void run() {
        try {
            playAudio();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void playAudio() throws IOException {
        AudioInputStream din = null;
        SourceDataLine line = null;
        try (AudioInputStream in = AudioSystem.getAudioInputStream(new URL(BuildView.getPath()))) {
            
            AudioFormat baseFormat = in.getFormat();
            AudioFormat decodedFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, baseFormat.getSampleRate(), 16, baseFormat.getChannels(), baseFormat.getChannels() * 2, baseFormat.getSampleRate(), false);
            din = AudioSystem.getAudioInputStream(decodedFormat, in);
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, decodedFormat);
            line = (SourceDataLine) AudioSystem.getLine(info);
            if (line != null) {
                line.open(decodedFormat);
                byte[] data = new byte[4096];
                // Start
                line.start();

                int nBytesRead;
                while ((nBytesRead = din.read(data, 0, data.length)) != -1) {
                    line.write(data, 0, nBytesRead);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (din != null) {
                din.close();
            }
            if (line != null) {
                line.drain();
                line.stop();
                line.close();
            }
        }
    }
}