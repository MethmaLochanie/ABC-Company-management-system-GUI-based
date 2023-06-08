package Model;



import java.util.Date;

public class Customer extends Person{

    private String cusID;




    public Customer(String name, String surname, Date dateOfBirth, String mobile_number, String cusID) {
        super(name, surname, dateOfBirth, mobile_number);
        this.cusID = cusID;

    }





    public String getCusID() {
        return cusID;
    }

    public void setCusID(String cusID) {
        this.cusID = cusID;
    }

   @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "cusID='" + cusID + '\'' +
                '}';
    }

}
