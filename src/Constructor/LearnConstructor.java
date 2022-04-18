package Constructor;

import Constructor.Mobile;

public class LearnConstructor {

    //Constructor:
    //Constructor name should be same as class name
    //Constructor has no return type
    //Constructor is used to initialize project
    //How to create constructor
    //AccessModifier className/ConstructorName() {   }
    //Constructor always create in class level not MAIN METHOD Level

    int a;
    String name;
    String address;
    int age;
    int num1;
    int num2;
    int num3;
    int num4;
    static String fatherName;

    //Default constructor: without any parameter
    public LearnConstructor() { //START POINT
        //Default constructor: without any parameter

        System.out.println("Hello");
        System.out.println(a);
        System.out.println(name);
    } // END POINT

    //Single parameterize constructor
    public LearnConstructor(String Name) {
        this.name = name;
        System.out.println(this.name);
    }

    //Multi parameterize constructor
    public LearnConstructor(String name, int age) { //START POINT
        this.name = name;
        this.age = age;
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println("Student name is " + this.name + " and " + "age is " + this.age);
    } //END POINT

    //Multi parameterize constructor
    //Signature pattern 1 :- String, int, String
    //Pattern has to be different
    public LearnConstructor(String name, int age, String address) { //START POINT
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("My son's name is " + this.name + " his age is " + this.age + " and address is " + this.address);
    } //END POINT

    //Multi parameterize constructor
    //Signature pattern 2 :- String, String, int
    //Pattern has to be different
    public LearnConstructor(String name, String address, int age) { //START POINT
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("My son's name is " + this.name + " his age is " + this.age + " and address is " + this.address);
    } //END POINT

    //Multi parameterize constructor
    //Signature pattern 3 :- int, String, String
    //Pattern has to be different
    public LearnConstructor(int age, String name, String address) { //START POINT
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("name is " + this.name + " his age is " + this.age + " and address is " + this.address);
    } //END POINT

    public LearnConstructor(int num1, int num2, int num3, int num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        System.out.println("total of all these numbers is " + (num1 + num2 + num3 + num4));

    }


    public static void main(String[] args) {

        //how to create an object?
        //className objectName = new className();

        LearnConstructor object = new LearnConstructor(); //*LearnConstructor();* => Constructor of a class

        Mobile mob = new Mobile();

        System.out.println(object.age);
        System.out.println(object.name);
        System.out.println(object.address);
        System.out.println(LearnConstructor.fatherName);


        LearnConstructor object1 = new LearnConstructor("Arham", 1, "VA");
        System.out.println(object1.name + " " + object1.age + " " + object1.address);
        LearnConstructor object2 = new LearnConstructor("Arham", 1, "VA");
        LearnConstructor object3 = new LearnConstructor("Aizah", 3);
        LearnConstructor object4 = new LearnConstructor("Aizah", 3, "VA, USA");
        LearnConstructor object5 = new LearnConstructor(10, 20, 30, 40);

    }
}
