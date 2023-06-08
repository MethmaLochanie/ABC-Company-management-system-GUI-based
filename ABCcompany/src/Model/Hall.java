package Model;

public class Hall {
    private String hallID;
    private int capacity;
    private String hallName;
    private String availability;

    public Hall(String hallID, String hallName,int capacity) {
        this.hallID = hallID;
        this.capacity = capacity;
        this.hallName = hallName;
        this.availability = "yes";
    }

    public String getHallID() {
        return hallID;
    }

    public void setHallID(String hallID) {
        this.hallID = hallID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
