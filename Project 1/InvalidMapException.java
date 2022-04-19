public class InvalidMapException extends Exception {
    private String message;
    
    public InvalidMapException(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return message;
    }
}
