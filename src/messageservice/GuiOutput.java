package messageservice;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class GuiOutput implements MessageOutput {

    @Override
    public void outPutMessage(String message) {
       System.out.println("Retrieving your message-");
       JOptionPane.showMessageDialog(null, message);
    }
    
}
