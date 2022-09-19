public class GettingFiredException extends HumanException{
    public GettingFiredException() {
    }

    public GettingFiredException(String message) {
        super(message);
    }

    @Override
    public void message() {
        System.out.println("I overslept too many times. I got fired!!");
        System.out.println(("\n... my life is over now ..."));
    }
}
