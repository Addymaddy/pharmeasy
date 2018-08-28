package pattern;

public interface PrescribtionTaker<T,A> {

    String askReports(PrescribtionGiver<T> giver);
    String askMedications(PrescribtionGiver<A> giver);
    void updatePrescription(T prescription);
    void updateMedicine(A medicine);
}
