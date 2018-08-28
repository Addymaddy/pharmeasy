package domain;

import pattern.PrescribtionGiver;
import pattern.PrescribtionTaker;

import java.util.ArrayList;
import java.util.List;

public class Patient extends User implements PrescribtionTaker<Prescription, Medicine> {
    List<Prescription> prescriptions = new ArrayList<>();
    List<Medicine> medicines = new ArrayList<>();
    boolean patientProvidePrescription;


    public Patient(boolean patientProvidePrescription, List<Prescription> prescriptions){
        this.patientProvidePrescription=patientProvidePrescription;
        this.prescriptions=prescriptions;
    }



    @Override
    public String askReports(PrescribtionGiver<Prescription> giver) {
        if(patientProvidePrescription)
        {
            return giver.sendReports(this , new ArrayList<>(prescriptions));

        }
        else
        {
            return giver.sendReports(this, null);
        }

    }


    @Override
    public String askMedications(PrescribtionGiver<Medicine> giver) {
        if(patientProvidePrescription)
        {
            return giver.sendReports(this , new ArrayList<>(medicines));

        }
        else
        {
            return giver.sendReports(this, null);
        }

    }

    @Override
    public void updatePrescription(Prescription prescription) {
            prescriptions.add(prescription);
    }


    public void visit(Doctor doctor){
        doctor.registerPatientVisit(this);
    }


    public void updateMedicine(Medicine med){
        medicines.add(med);
    }

    public void visit(Pharmacist pharmacist){
        pharmacist.registerPatientVisit(this);
    }
}
