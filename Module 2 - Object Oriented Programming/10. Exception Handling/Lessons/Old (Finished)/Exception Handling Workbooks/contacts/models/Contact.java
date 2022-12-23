package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Contact {
    private String name;
    private String birthDate;
    private int phone;
    private int age;

    public Contact(String name, String birthDate, int phone) {
        this.name = name;
        this.birthDate = birthDate;
        this.phone = phone;
        this.age = ageDeterminer();
    }

    public int ageDeterminer() {
        long temp = 0;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy"); // SimpleDateFormat class to parse string to date with desired format
            Date parsedBirth = sdf.parse(this.birthDate); // Date class to store Date from parsed string
            long milliBirth = parsedBirth.getTime(); // .getTime is a method from Date class to convert date to unix

            Date today = new Date();
            long milliToday = today.getTime();

            temp = (milliToday - milliBirth);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

        TimeUnit time = TimeUnit.MILLISECONDS; // TimeUnit class to convert MILLISECONDS to day

        int age = (int) (time.toDays(temp)/365); // converting milliseconds to day, then divided by 365 to get year (age)
        return age;
    }

    public Contact(Contact source) {
        this.name = source.name;
        this.birthDate = source.birthDate;
        this.phone = source.phone;
    }

    public String getName() {
        return this.name;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public int getPhone() {
        return this.phone;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }
  
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

}
