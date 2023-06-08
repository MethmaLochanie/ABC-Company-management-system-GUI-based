package Model;

import java.util.Date;
import java.util.Objects;

public class Admin extends Person {
    private String adminID;

    public Admin(String name, String surname,Date dateOfBirth,String mobile_number, String adminID) {
        super(name, surname,dateOfBirth, mobile_number);
        this.adminID = adminID;
    }

    public String getAdminID() {

        return adminID;
    }

    public void setAdminID(String adminID) {

        this.adminID = adminID;
    }

    @Override
    public String toString() {
        return "Admin{" + super.toString() +
                "adminID='" + adminID + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Admin admin = (Admin) o;
        return Objects.equals(adminID, admin.adminID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), adminID);
    }

}

