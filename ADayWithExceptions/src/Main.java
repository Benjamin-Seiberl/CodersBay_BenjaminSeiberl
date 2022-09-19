public class Main {
    public static void main(String[] args) {
        Human benni = new Human("Benni");
        while(benni.isHasAJob()){
            try {
                benni.sleep();
                benni.wakeUp();
                benni.morningRoutine();
                benni.working("(08:30)");
                benni.freeTime();
                benni.nightTimeRoutine();
                benni.goToSleep();
            } catch (OversleptException oversleptE) {
                try {
                    benni.working(oversleptE.time);
                    benni.freeTime();
                    benni.nightTimeRoutine();
                    benni.goToSleep();
                }catch(WorkingOvertimeException workerE){
                    System.out.println("No freetime for me! (20:30)  -----\n");
                    benni.nightTimeRoutine();
                    benni.goToSleep();
                } catch (GettingFiredException e) {
                    System.out.println(("\n... my life is over now ..."));
                }
            }catch (WorkingOvertimeException workerE){
                System.out.println("No freetime for me! (20:30) -----\n");
                benni.nightTimeRoutine();
                benni.goToSleep();
            } catch (GettingFiredException gettingFiredException){
                System.out.println(("\n... my life is over now ..."));
            }

        }
    }
}
