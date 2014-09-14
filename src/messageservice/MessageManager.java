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
   
   private void processMessage(MessageInput input, MessageOutput output){
       input.retrieveMessage();
       output.outPutMessage(input.getMessage());
       
   }
   
   public void completeMessageProcess(){
       processMessage(MessageInput input, MessageOutput output);
   }
    
    
    
}
