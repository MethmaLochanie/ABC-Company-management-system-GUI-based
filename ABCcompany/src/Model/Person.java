package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public abstract class Person 
{
    private String name;
    private String surname;
    private Date dateOfBirth;
    private String mobile_number;

    public Person(String name, String surname,Date dateOfBirth, String mobile_number) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.mobile_number = mobile_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    @Override
    public String toString() {
        return  "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", mobile_number = '" + mobile_number + '\'';
    }

//    @Override
//    public int compareTo(Person o) {
//        Doctor doc = (Doctor) o;
//        if (this.getSurname().compareToIgnoreCase(doc.getSurname()) > 0)
//        {
//            return 1;
//        }
//        else if (this.getSurname().compareToIgnoreCase(doc.getSurname()) < 0)
//        {
//            return -1;
//        }
//        else
//        {
//            return 0;
//        }
//
//    }
}

