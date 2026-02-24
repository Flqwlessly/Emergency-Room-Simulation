import java.time.LocalTime;
import java.util.Comparator;

public class EmergencyRoom {
    private final Heap<Patient> patientQueue;


    public EmergencyRoom(Comparator<Patient> comparator)
    {
        patientQueue = new Heap<>(comparator);
    }

    public void checkIn(Patient p, Severity s)
    {
        p.setSeverity(s);
        p.setArrivalTime(LocalTime.now());
        patientQueue.add(p);
    }

    public Patient admit()
    {
        return patientQueue.remove();
    }

    public boolean hasPatients()
    {
        return !patientQueue.isEmpty();
    }




}
