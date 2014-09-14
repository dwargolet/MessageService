package messageservice;

import java.util.Scanner;

public class KeyboardInput implements MessageInput{

    Scanner keyboard = new Scanner(System.in);
    String message;    
    
    
    
    @Override
    public void inputMessage(){
        
        message = keyboard.nextLine();
    }
    
    
    
}
