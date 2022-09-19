import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Human benni = new Human("Benni");
        System.out.println("Day: " + benni.getDay());
        while (benni.isHasAJob()) {
            try {
                simulate(benni);
            } catch (OversleptException oe) {
                oe.message();
            } catch (WorkingOvertimeException we) {
                we.message();
            } catch (GettingFiredException ge) {
                ge.message();
            } finally {
                if (benni.getTime().equals(benni.getEndTime())) {
                    benni.setDay(benni.getDay() + 1);
                    benni.setTime(LocalTime.of(00, 00));
                    System.out.println("\nDay: " + benni.getDay());
                } else {
                    benni.setTime(benni.getTime().plusMinutes(5));
                }
            }
        }
    }

    public static void simulate(Human benni) throws OversleptException, GettingFiredException, WorkingOvertimeException {
        System.out.print(benni.getTime());
        if (benni.isOverslept()) {
            if (benni.getTime().equals(LocalTime.of(7, 00))) {
                benni.sleep();
            } else if (benni.getTime().equals(LocalTime.of(9, 30))) {
                benni.wakeUp();
            }
        } else if (!benni.isFreetime()) {
            if(benni.getTime().equals(LocalTime.of(19, 30))){
                benni.goingHome();
            }
        } else {
            if (benni.getTime().equals(LocalTime.of(0, 00))) {
                benni.sleep();
            } else if (benni.getTime().equals(LocalTime.of(7, 00))) {
                benni.wakeUp();
            } else if (benni.getTime().equals(LocalTime.of(7, 05))) {
                benni.morningRoutine();
            } else if (benni.getTime().equals(LocalTime.of(8, 30))) {
                benni.working();
            } else if (benni.getTime().equals(LocalTime.of(15, 30))) {
                benni.goingHome();
            } else if (benni.getTime().equals(LocalTime.of(16, 00))) {
                benni.freeTime();
            } else if (benni.getTime().equals(LocalTime.of(23, 40))) {
                benni.nightTimeRoutine();
            } else if (benni.getTime().equals(LocalTime.of(23, 50))) {
                benni.goToSleep();
            }
        }
        System.out.println();


    }
}
