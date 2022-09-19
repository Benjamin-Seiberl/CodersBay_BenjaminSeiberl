public class OversleptException extends HumanException{

    String time;
    public OversleptException(Human human) throws GettingFiredException {
        if(human.getDay() % 10 == 0) {
            human.setOverslept(true);
            human.setNumberOfDaysLateToWork(human.getNumberOfDaysLateToWork()+1);
        }if(human.getDay() % 5 == 0) {
            human.setOverslept(true);
        }
        if(human.getNumberOfDaysLateToWork() == 3){
            human.setHasAJob(false);
            throw new GettingFiredException();
        }
    }

    @Override
    public void message() {
        System.out.println("Still sleeping ...");
    }

    public OversleptException(String message) {
        super(message);
    }
}
