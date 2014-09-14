package messageservice;

import java.util.Scanner;

public class KeyboardInput implements MessageInput{

    Scanner keyboard = new Scanner(System.in);
        
    private String message;

    public KeyboardInput() {
        
    }
    
    
    
    //this method has the user actually enter a message, then sets it to the "message" variable
    @Override
    public void retrieveMessage(){
        System.out.println("Using the keyboard, please enter a message: ");
        setMessage(keyboard.nextLine());
//        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    
    
    
    
}
