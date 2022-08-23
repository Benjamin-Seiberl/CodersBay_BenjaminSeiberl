import java.time.LocalDate;

public class Appointment {
    private String name;
    private LocalDate time;

    public Appointment(String name, LocalDate time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public LocalDate getTime() {
        return time;
    }
}
