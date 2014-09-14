package messageservice;

public interface MessageInput {
    
    public abstract void retrieveMessage();
    
    public abstract void setMessage(String message);
    
    public abstract String getMessage();
}
