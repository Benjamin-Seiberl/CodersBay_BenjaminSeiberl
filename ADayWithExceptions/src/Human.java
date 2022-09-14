public class Human {
    String Name;
    private int day = 1;
    private int numberOfDaysLateToWork = 0;

    public Human(String name) {
        Name = name;
    }

    public void addNumberOfDaysLateToWork(){
        numberOfDaysLateToWork++;
    }

    public void sleep() throws OversleptException {

        System.out.println("Sleeps...");
        try{
            Thread.sleep(1500);
        }catch (Exception e){}
        System.out.println("\nDay: " + day);
        if (day % 10 == 0) {
            System.out.println("Oh no I overslept! -----");
            System.out.println("Now I can't do my morning routine! -----");
            throw new OversleptException();
        }

        if (day % 18 == 0){
            System.out.println("Oh no! I overslept so much that I'm late to work!");

        }
    }

    public void wakeUp() {
        System.out.println("Waking up!");
    }

    public void morningRoutine() {
        System.out.println("Doing morning routine.\n");
    }

    public void working() throws WorkingOvertimeException {
        if(numberOfDaysLateToWork == 3){
            System.out.println("\nI GOT FIRED FROM MY JOB!\n");
            System.out.println(("... my life is over now ..."));
        }
        if (day % 7 == 0){
            System.out.println("I have to work overtime today! ------\n");
            throw new WorkingOvertimeException();
        }else{
            System.out.println("Normal day at work!\n");
        }
    }

    public void freeTime() {
        System.out.println("Now i have free time.");
    }

    public void nightTimeRoutine() {
        System.out.println("Making myself ready for bed.");
    }

    public void goToSleep() {
        System.out.println("I'm going to sleep now!");
        day++;
        System.out.println("\n\n");
    }
}
