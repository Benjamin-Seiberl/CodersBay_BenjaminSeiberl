public class WorkingOvertimeException extends HumanException{
    public WorkingOvertimeException(Human human) {
        human.setFreetime(false);
    }

    public WorkingOvertimeException(String message) {
        super(message);
    }

    @Override
    public void message() {
        System.out.println(" I have to work overtime today!");
    }
}
