import java.time.LocalTime;
import java.time.LocalDate;

public class Patient {

    private final String name;
    private final LocalDate DOB;
    private Severity severity;
    private LocalTime arrivalTime;

    public Patient(String n, LocalDate d)
    {
        this.name = n;
        this.DOB = d;
    }

    //Getter methods
    public String getName()
    {
        return name;
    }
    public LocalDate getDOB()
    {
        return DOB;
    }
    public Severity getSeverity()
    {
        return severity;
    }
    public LocalTime getArrivalTime()
    {
        return arrivalTime;
    }

    //Setter methods
    public void setSeverity(Severity s)
    {
        severity = s;
    }
    public void setArrivalTime(LocalTime t)
    {
        arrivalTime = t;
    }

    @Override
    public String toString()
    {
        return  name
                + "\nDOB=" + DOB
                + "\nSeverity=" + severity
                + "\narrivalTime=" + arrivalTime + " admitted";
    }



}
