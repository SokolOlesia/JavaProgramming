package day42_Exceptions;

//custom unchecked exceptions
class FadyException extends RuntimeException {
    public FadyException(String message) {
        super(message);
    }

    public FadyException() {
        super("Time for short break");
    }
}

class NoBreakException extends Exception {

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
