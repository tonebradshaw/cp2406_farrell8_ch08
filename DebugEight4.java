import javax.swing.*;

/**
 * Created by tony on 28/08/2016.
 */
public class DebugEight4 {

    public static void main(String[] args){
        int x = 0, y;
        String[] array = new String[100];
        String entry;
        final String STOP = "XXX";
        StringBuffer message = new
                StringBuffer("The words in reverse order are\n");

        entry = JOptionPane.showInputDialog(null,
                "Enter any word\n" +
                        "Enter " + STOP + " when you want to stop");
        while(!(entry.equals(STOP))){

            array[x] = entry;
            entry = JOptionPane.showInputDialog(null,
                    "Enter another word\n" +
                            "Enter " + STOP + " when you want to stop");
            x++;
        }
        for(y = x - 1; y >= 0; --y){

            message.append(array[y]);
            message.append("\n");
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
