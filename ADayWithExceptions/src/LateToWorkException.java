public class LateToWorkException extends HumanException{
    public LateToWorkException(Human human) {
        human.addNumberOfDaysLateToWork();
    }

    public LateToWorkException(String message, Human human) {
        super(message);
        human.addNumberOfDaysLateToWork();
    }
}
