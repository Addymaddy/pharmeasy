package domain;

import pattern.PrescribtionGiver;
import pattern.PrescribtionTaker;

import java.util.ArrayList;
import java.util.List;

public class Pharmacist extends User implements PrescribtionGiver<Medicine> {



    List<PrescribtionTaker> patients = new ArrayList<>();


    @Override
    public String sendReports(PrescribtionTaker taker, List<Medicine> prescriptionList) {
        if(prescriptionList !=null)
        {
            taker.updateMedicine(new Medicine("Medicine A", "200mg", "3 times a day"));
            return "Medicines Provided to patient!";
        }
        else
            return "Patient Denied Medical records!";

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
