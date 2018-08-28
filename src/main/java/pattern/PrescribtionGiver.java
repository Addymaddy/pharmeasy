package pattern;

import java.util.List;

public interface PrescribtionGiver<T> {
    String sendReports(PrescribtionTaker taker, List<T> medicationList);
}
