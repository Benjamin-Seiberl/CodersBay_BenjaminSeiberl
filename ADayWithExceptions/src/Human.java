public class Human {
    String name;
    private boolean hasAJob = true;
    private int day = 1;
    private int numberOfDaysLateToWork = 0;

    public Human(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public boolean isHasAJob() {
        return hasAJob;
    }

    public void setHasAJob(boolean hasAJob) {
        this.hasAJob = hasAJob;
    }

    public int getNumberOfDaysLateToWork() {
        return numberOfDaysLateToWork;
    }

    public void addNumberOfDaysLateToWork(){
        numberOfDaysLateToWork++;
    }

    public void sleep() throws OversleptException{
        System.out.println("\nDay: " + day);
        System.out.println("Sleeps (00:00)");
        if (day % 10 == 0) {
            throw new OversleptException(this);
        }
    }

    public void wakeUp() {
        System.out.println("Waking up! (06:30)");
    }

    public void morningRoutine() {
        System.out.println("Doing my morning routine. (06:35)\n");
    }

    public void working(String time) throws WorkingOvertimeException, GettingFiredException {
        if(numberOfDaysLateToWork == 3){
            System.out.println("\nYou're getting fired " + name + "! You overslept too many times! -----");
            throw new GettingFiredException();
        }
        if (day % 7 == 0){
            System.out.println("I have to work overtime today! " + time + " ------");
            throw new WorkingOvertimeException();
        }else{
            System.out.println("I'm at CodersBay now! " + time + "\n");
        }
    }

    public void freeTime() {
        System.out.println("Now i have free time! (15:30)");
    }

    public void nightTimeRoutine() {
        System.out.println("Making myself ready for bed. (23:30)");
    }

    public void goToSleep() {
        System.out.println("I'm going to sleep now! (23:55)");
        day++;
        System.out.println("\n\n");
    }
}
