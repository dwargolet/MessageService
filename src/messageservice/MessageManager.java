package messageservice;

/* This class takes place of "MessageService". I felt that best name practices
required a more suitable name for the "managing" class, so I renamed it.
*/

public class MessageManager {

   private MessageInput input;
   private MessageOutput output;

    public MessageManager(MessageInput input, MessageOutput output) {
        this.input = input;
        this.output = output;
    }

    public final MessageInput getInput() {
        return input;
    }

    public final void setInput(MessageInput input) {
        this.input = input;
    }

    public final MessageOutput getOutput() {
        return output;
    }

    public final void setOutput(MessageOutput output) {
        this.output = output;
    }
   
    
 
   public void processMessage(){
       input.retrieveMessage();
       output.outPutMessage(input.getMessage());
       
   }
   
   
    
    
}
