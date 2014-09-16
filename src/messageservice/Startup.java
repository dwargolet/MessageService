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

        
      MessageManager message = new MessageManager(new KeyboardInput(), new ConsoleOutput());
      message.processMessage();
        
//      MessageManager message2 = new MessageManager(new KeyboardInput(), new GuiOutput());     
//      message2.processMessage();
        
//      MessageManager message3 = new MessageManager(new DatabaseInput(), new ConsoleOutput());     
//      message3.processMessage();
//        
//      MessageManager message4 = new MessageManager(new DatabaseInput(), new GuiOutput());     
//      message4.processMessage();
    }
    
}
