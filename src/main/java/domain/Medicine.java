package domain;

public class Medicine {
    private String name;
    private String power;
    private String noOfTimesAday;

    public Medicine(String name, String power, String noOfTimesAday){
        this.name =  name;
        this.power = power;
        this.noOfTimesAday = noOfTimesAday;
    }

    public String getName() {
        return name;
    }

    public String getPower() {
        return power;
    }

    public String getNoOfTimesAday() {
        return noOfTimesAday;
    }






}
