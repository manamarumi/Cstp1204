public class NegativeException extends Exception {

    private String message;   
    
    public NegativeException(String msg) {
      this.message = msg;
    }

    public String getMessage() {
      return "Hey Man, this is a negative exception: " + message;

    }
}
