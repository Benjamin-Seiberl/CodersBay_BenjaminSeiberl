public class Main {
    public static void main(String[] args) {
        Human benni = new Human("Benni");
        while(true){
            try {
                benni.sleep();
                benni.wakeUp();
                benni.morningRoutine();
                benni.working();
                benni.freeTime();
                benni.nightTimeRoutine();
                benni.goToSleep();
            } catch (OversleptException oversleptE) {

                try {
                    benni.working();
                    benni.freeTime();
                    benni.nightTimeRoutine();
                    benni.goToSleep();
                }catch(WorkingOvertimeException workerE){
                    System.out.println("No freetime for me today!");
                    benni.nightTimeRoutine();
                    benni.goToSleep();
                }
            }catch (WorkingOvertimeException workerE){
                System.out.println("No freetime for me today!");
                benni.nightTimeRoutine();
                benni.goToSleep();
            }
        }
    }


}
