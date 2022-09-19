public class OversleptException extends HumanException{

    String time;
    public OversleptException(Human human) {
        if(human.getDay() % 20 == 0) {
            System.out.println("Oh no I overslept! (09:49) -----");
            System.out.println("I'm going to be late to CodersBay! -----");
            time = "(10:18)";
            human.addNumberOfDaysLateToWork();
        }else{
            System.out.println("Oh no I overslept! (08:02) -----");
            System.out.println("Now I can't do my morning routine! -----");
            time = "(8:30)";
        }
        if(human.getNumberOfDaysLateToWork() == 3){
            human.setHasAJob(false);
        }
    }

    public OversleptException(String message) {
        super(message);
    }
}
