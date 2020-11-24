
package audioplayer;

import java.util.Scanner;
import javax.swing.JFrame;


public class AudioPlayer {

    private JFrame frame;
    
    public AudioPlayer() {
        frame = new JFrame();
        frame.setSize(800, 600);
        frame.setTitle("Audio Player");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
                
    }
    
}
