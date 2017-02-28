package t2.app;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;

public class Appointment {

    public final String purpose;
    public final String room;
    public final LocalDate date;
    public final Date from;
    public final Date to;
    public final Integer daysBetween;
    public final LocalDate toDate;

    public Appointment(AppointmentBuilder builder) {
        this.purpose = builder.purpose;
        this.room = builder.room;
        this.date = builder.date;
        this.from = builder.from;
        this.to = builder.to;
        this.daysBetween = builder.daysBetween;
        this.toDate = builder.toDate;
    }
    



}
