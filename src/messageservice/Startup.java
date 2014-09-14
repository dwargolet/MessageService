package messageservice;

/**
 *
 * @author Daniel
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        MessageInput messageIn = new KeyboardInput();
//        MessageOutput messageOut = new ConsoleOutput();
        messageIn.setMessage("Yo");
        
//        messageOut(messageIn);
    }
    
}
