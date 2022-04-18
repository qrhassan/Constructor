package ConstructorPractice;

import Constructor.Mobile;

public class ConstructorPractice {
    String name = "Adam Smith";
    String typeOfId = "Driver's License";
    int licenseNo = 203985658;
    String issueDate = "April 25, 2019";
    String sate = "VA";
    String expirationDate = "April 25, 2023";
    String address = "523 N Armistead St.";
    int zipCode = 22312;
    String city = "Alexandria";
    long phoneNumber = 8455481898l;

    //Default Constructor:
    public ConstructorPractice() {
        System.out.println("This information is confidential");
        System.out.println("This information not to share anyone");
    }

    //Single parameter constructor
    public ConstructorPractice(String name) {
        this.name = name;
        System.out.println("Name of the employee is: " + this.name);
    }

    //Multi parameter constructor
    public ConstructorPractice(String typeOfId, int licenseNo) {
        this.typeOfId = typeOfId;
        this.licenseNo = licenseNo;
        System.out.println("Type of identification is " + this.typeOfId + "Driver's license no. is " + this.licenseNo);
    }

    //Multi parameter constructor
    public ConstructorPractice(String issueDate, String state, String expirationDate) {
        this.issueDate = issueDate;
        this.sate = state;
        this.expirationDate = expirationDate;
        System.out.println("The issue date is " + issueDate);
        System.out.println("Issued state is " + state);
        System.out.println("The expiration date is " + expirationDate);
    }

    //Multi parameter constructor
    public ConstructorPractice(String address, int zipCode, String city, long phoneNumber) {
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.phoneNumber = phoneNumber;
        System.out.println("The residence address is " + address);
        System.out.println("The Zip Code is " + zipCode);
        System.out.println("The city is " + city);
        System.out.println("The telephone is " + phoneNumber);
    }

    public static void main(String[] args) {
        ConstructorPractice object = new ConstructorPractice();

        ConstructorPractice object10 = new ConstructorPractice(object.name);
        ConstructorPractice object20 = new ConstructorPractice("Adam Smith");
        ConstructorPractice object30 = new ConstructorPractice("Driver's License", 203985658);//need to talk MB
        ConstructorPractice object40 = new ConstructorPractice("April 25, 2019", "VA", "April 26, 2019"); //need to talk MB

        Mobile object60 = new Mobile();

    }
}
