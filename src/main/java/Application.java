import domain.Doctor;
import domain.Patient;
import domain.Pharmacist;

import java.util.List;

public class Application {

    public List<String> processFlow(Doctor doctor , Patient patient){
        doctor.registerPatientVisit(patient);
        return doctor.askForPatientMedicalRecords();

    }


    public List<String> processFlow(Pharmacist pharmacist, Patient patient){
        pharmacist.registerPatientVisit(patient);
        return pharmacist.askForPatientMedicalRecords();

    }
}
