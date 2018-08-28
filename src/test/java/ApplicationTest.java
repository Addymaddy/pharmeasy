import domain.Doctor;
import domain.Patient;
import domain.Pharmacist;
import domain.Prescription;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ApplicationTest {

    Application application=new Application();

    @Test
    public void testProcessFlowWherePatientApprovesAndSendsReportsToDoctor(){
        Prescription prescription= new Prescription(new Date(), "Default prescription");
        List<Prescription> prescriptions=new ArrayList<>();
        Patient patient=new Patient(true, prescriptions);
        Doctor doctor = new Doctor();

        List<String> result = application.processFlow(doctor, patient);
        Assert.assertEquals(  "Patient Prescribed!",result.get(0));
    }

    @Test
    public void testProcessFlowWherePatientDenyToSendReportsToDoctor(){
        Prescription prescription= new Prescription(new Date(), "Default prescription");
        List<Prescription> prescriptions=new ArrayList<>();
        Patient patient=new Patient(false, prescriptions);
        Doctor doctor = new Doctor();

        List<String> result = application.processFlow(doctor, patient);
        Assert.assertEquals(  "Patient denied medical records!",result.get(0));
    }

    @Test
    public void testProcessFlowWherePatientApprovesAnsSendMedicalReportsToPharmacist(){
        Prescription prescription= new Prescription(new Date(), "Default prescription");
        List<Prescription> prescriptions=new ArrayList<>();
        Patient patient=new Patient(true, prescriptions);
        Pharmacist pharmacist = new Pharmacist();

        List<String> result = application.processFlow(pharmacist, patient);
        Assert.assertEquals(  "Medicines Provided to patient!",result.get(0));
    }

    @Test
    public void testProcessFlowWherePatientDenyToSendReportsToPharmacist(){
        Prescription prescription= new Prescription(new Date(), "Default prescription");
        List<Prescription> prescriptions=new ArrayList<>();
        Patient patient=new Patient(false, prescriptions);
        Pharmacist pharmacist = new Pharmacist();

        List<String> result = application.processFlow(pharmacist, patient);
        Assert.assertEquals(  "Patient Denied Medical records!",result.get(0));
    }

}
