package domain;

import pattern.PrescribtionGiver;
import pattern.PrescribtionTaker;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Doctor extends User implements PrescribtionGiver<Prescription> {

    List<PrescribtionTaker> patients = new ArrayList<PrescribtionTaker>();



    public String sendReports(PrescribtionTaker taker, List<Prescription> prescriptionList) {
        if(prescriptionList !=null)
        {
            taker.updatePrescription(new Prescription(new Date(), "This is the updated susbscription "));
            return "Patient Prescribed!";
        }
        else
            return "Patient denied medical records!";

    }



    public void registerPatientVisit(Patient patient){
        patients.add(patient);
    }

    public List<String> askForPatientMedicalRecords(){
        List<String> result = new ArrayList<>();
        patients.forEach(x -> result.add(x.askReports(this)));
        return result;
    }
}
