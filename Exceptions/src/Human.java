import java.time.LocalTime;

public class Human {

    //region Fields
    private String name;
    private boolean hasAJob = true;
    private boolean overslept = false;
    private boolean freetime = true;
    private int day = 1;
    private int numberOfDaysLateToWork = 0;
    private LocalTime time = LocalTime.of(00, 00);
    private LocalTime endTime = LocalTime.of(23, 55);

    //endregion

    //region Constructor
    public Human(String name) {
        this.name = name;
    }

    //endregion

    //region Getter and Setter


    public boolean isFreetime() {
        return freetime;
    }

    public void setFreetime(boolean freetime) {
        this.freetime = freetime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasAJob() {
        return hasAJob;
    }

    public void setHasAJob(boolean hasAJob) {
        this.hasAJob = hasAJob;
    }

    public boolean isOverslept() {
        return overslept;
    }

    public void setOverslept(boolean overslept) {
        this.overslept = overslept;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getNumberOfDaysLateToWork() {
        return numberOfDaysLateToWork;
    }

    public void setNumberOfDaysLateToWork(int numberOfDaysLateToWork) {
        this.numberOfDaysLateToWork = numberOfDaysLateToWork;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }


    //endregion

    //region Methods
    public void sleep() throws OversleptException {
        System.out.print(" Sleeps..");
    }

    public void wakeUp() throws GettingFiredException, OversleptException {
        if(day % 5 == 0){
            throw new OversleptException(this);
        }
        overslept = false;
        System.out.print(" Waking up!");
    }

    public void morningRoutine() {
        System.out.print(" Doing my morning routine.");
    }

    public void working() throws WorkingOvertimeException, GettingFiredException {
        if(day%3 == 0){
            throw new WorkingOvertimeException(this);
        }
        System.out.print(" I'm at CodersBay now!");
    }

    public void freeTime() {
        System.out.print(" Now i have free time! ");
    }

    public void goingHome(){
        freetime = true;
        System.out.print(" I'm going home! ");
    }
    public void nightTimeRoutine() {
        System.out.print(" Making myself ready for bed. ");
    }

    public void goToSleep() {
        System.out.print(" I'm going to sleep now!");
    }

    //endregion
}
