import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {

    public int compare (Patient A, Patient B)
    {
        int severityNum = B.getSeverity().ordinal() - A.getSeverity().ordinal(); //Compares severity of two patients
        if (severityNum != 0)
        {
            return severityNum;
        }

        int ageCompare = A.getDOB().compareTo(B.getDOB()); //If severity same, comes here to compare the age of two patients
        if (ageCompare != 0)
        {
            return ageCompare;
        }

        return A.getArrivalTime().compareTo(B.getArrivalTime()); //If same severity and age, then comes here to see who arrived first
    }




}
