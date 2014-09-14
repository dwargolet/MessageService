package messageservice;

public interface MessageInput {
    
    public abstract String retrieveMessage();
    
    public abstract void setMessage(String message);
    
    public abstract String getMessage();
}
