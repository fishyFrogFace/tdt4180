package t2.app;

import java.util.Date;
import java.time.LocalDate;

public class AppointmentBuilder {

    protected String purpose;
    protected String room;
    protected LocalDate date;
    protected Date from;
    protected Date to;
    protected Integer daysBetween;
    protected LocalDate toDate;


    public static AppointmentBuilder appointment() {
        return new AppointmentBuilder();
    }

    public AppointmentBuilder withPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }

    public AppointmentBuilder withRoom(String room) {
        this.room = room;
        return this;
    }

    public AppointmentBuilder withDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public AppointmentBuilder withFromTime(Date from) {
        this.from = from;
        return this;
    }

    public AppointmentBuilder withToTime(Date to) {
        this.to = to;
        return this;
    }

    public AppointmentBuilder withFrequency(Integer daysBetween) {
        this.daysBetween = daysBetween;
        return this;
    }

    public AppointmentBuilder withToDate(LocalDate toDate) {
        this.toDate = toDate;
        return this;
    }

    public Appointment build() {
        return new Appointment(this);
    }
}