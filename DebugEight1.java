import javax.swing.*;

/**
 * Created by tony on 28/08/2016.
 */
public class DebugEight1 {

    public static void main(String args[]){
        char userCode;
        String entry, message;
        boolean found = false;
        char[] okayCodes = {'A','C','T','H'};
        StringBuffer prompt = new
                StringBuffer("Enter shipping code for this delivery\nValid codes are: ");
        for(int x = 0; x < okayCodes.length; ++x){

            prompt.append(okayCodes[x]);

            if(x != (okayCodes.length - 1))
                prompt.append(", ");
        }
        entry = JOptionPane.showInputDialog(null,
                prompt);

        userCode = entry.charAt(0);

        for(int i = 0; i < okayCodes.length; ++i){

            if(userCode == okayCodes[i]){
                found = true;
            }
        }
        if(found)
            message = "Good code";
        else
            message = "Sorry code not found";
        JOptionPane.showMessageDialog(null, message);
    }
}
