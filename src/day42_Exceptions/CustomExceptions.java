package day42_Exceptions;

//custom unchecked exceptions
class FadyException extends RuntimeException {
    public FadyException(String message) {// unchecked exception
        super(message);
    }

    public FadyException() {
        super("Time for short break");
    }
}

class NoBreakException extends Exception {// checked exception

}

public class CustomExceptions {
    public static void main(String[] args) {

        //throw new FadyException("It's time for lunch");
        try {
            throw new NoBreakException(); // unhandled exception
        } catch (NoBreakException e) {
            e.printStackTrace();
        }
    }
}
