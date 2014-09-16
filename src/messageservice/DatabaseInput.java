package messageservice;
import java.util.Random;


/**
 *
 * @author Daniel
 */
public class DatabaseInput implements MessageInput{

    FabricatedDatabase fakeDb = new FabricatedDatabase();
    private String message;
    
    
    @Override
    public String retrieveMessage() {
        Random rand = new Random();
        int num = rand.nextInt(4);
        message = fakeDb.getFakeMessage(num);
        return message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    
}
