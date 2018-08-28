package domain;

import java.util.Date;

public class Prescription {

    private Date date;
    private String presription;

    public Prescription(Date date, String prescription){
        this.date = date;
        this.presription = prescription;
    }

    public Date getDate() {
        return date;
    }

    public String getPresription() {
        return presription;
    }

}
