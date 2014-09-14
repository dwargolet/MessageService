package messageservice;

/**
 *
 * @author Daniel
 */


/**The idea for this class came when researching possibilites for a second input class
 * I decided to borrow the idea of making a class with an array of statements, and use
 * a random number to choose which statement is inputed.
 * 
 */
public class FabricatedDatabase {
    private String messages[] = {"Today at ten.",
        "I already ate.",
        "The client is waiting.",
        "Go brush your teeth!"};
    
    
    public String getFakeMessage(int randNumber){
        return messages[randNumber];
    } 
    
}
