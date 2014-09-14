package messageservice;


public class ConsoleOutput implements MessageOutput {

    
    @Override
    public void outPutMessage(String message) {
        System.out.println("Retrieved the following message-");
        System.out.println(message);
    }
    
    
}
