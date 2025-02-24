import javax.swing.JOptionPane;
import java.awt.GraphicsEnvironment;

public class Main {
    public static void main(String[] args) {
        // Check if a graphical environment is available
        if (GraphicsEnvironment.isHeadless()) {
            System.out.println("Error: GUI is not available. Run this program in a graphical environment.");
            System.exit(1);
        }

        int ECount, eCount;
        String sentence;

        while (true) {
            // Show input dialog to get user input
            sentence = JOptionPane.showInputDialog(null, "Type a sentence (type 'stop' to exit):");

            // If user clicks "Cancel" or types "stop", exit the loop
            if (sentence == null || sentence.equalsIgnoreCase("stop")) {
                break;
            }

            // Reset counters for each new sentence
            ECount = 0;
            eCount = 0;

            // Count occurrences of 'E' and 'e'
            for (char c : sentence.toCharArray()) {
                if (c == 'E') {
                    ECount++;
                } else if (c == 'e') {
                    eCount++;
                }
            }

            // Show results in a message dialog
            JOptionPane.showMessageDialog(null, "There are " + ECount + " uppercase E's and " 
                                          + eCount + " lowercase e's in:\n" + sentence);
        }

        // Exit the program properly
        System.exit(0);
    }
}

// This is with GUI
