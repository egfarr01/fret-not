import java.awt.Color;
import javax.swing.*;

public class HomeScreen {
    JFrame f = new JFrame();
    public static String noteProg[] = { "A","A#", "B", "C","C#","D", "D#","E", "F","F#","G", "G#"};
    
    public void PrintString(int stringNum, int note, int numFrets) {
        int i = 0; 
        while (i < numFrets) {
            JButton b = new JButton(noteProg[note]);
            if(noteProg[note] == "A") {
                b.setForeground(new Color(252, 3, 3));
            }
            if(noteProg[note] == "A#") {
                b.setForeground(new Color(252, 90, 3));
            }
            if(noteProg[note] == "B") {
                b.setForeground(new Color(252, 177, 3));
            }
            if(noteProg[note] == "C") {
                b.setForeground(new Color(173, 252, 3));
            }
            if(noteProg[note] == "C#") {
                b.setForeground(new Color(69, 252, 3));
            }
            if(noteProg[note] == "D") {
                b.setForeground(new Color(3, 252, 136));
            }
            if(noteProg[note] == "D#") {
                b.setForeground(new Color(3, 252, 223));
            }
            if(noteProg[note] == "E") {
                b.setForeground(new Color(3, 136, 252));
            }
            if(noteProg[note] == "F") {
                b.setForeground(new Color(3, 44, 252));
            }
            if(noteProg[note] == "F#") {
                b.setForeground(new Color(136, 3, 252));
            }
            if(noteProg[note] == "G") {
                b.setForeground(new Color(252, 3, 219));
            }
            if(noteProg[note] == "G#") {
                b.setForeground(new Color(252, 3, 127));
            }
            b.setBounds((i * 40 + 30),(50 + stringNum * 50),40 ,40);
            f.add(b);
            if(note == 11) {
                note = -1;
            }
            note++;
            i++;
        }
    }   

    public void Render() {
        f.setVisible(true);
    }

    public HomeScreen() {
        f.setSize(1000,500);
        f.setLayout(null);
        

    }


    
}
