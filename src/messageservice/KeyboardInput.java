package messageservice;

//import java.util.Scanner;

public class KeyboardInput implements MessageInput{

//    Scanner keyboard = new Scanner(System.in);
        
    private String message;

    public KeyboardInput() {
        
    }
    
    
    
    
//    @Override
//    public void inputMessage(){
//        
//        message = keyboard.nextLine();
//    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    
    
    
    
}
