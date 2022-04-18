package Constructor;

public class Constructor1 {
    int age = 3;
    String name = "Aizah";
    String add = "VA, USA";

    //Default Constructor <<<< without parameter
    public Constructor1() {     //startPoint
        System.out.println("age is " + age);
        System.out.println("name is " + name);
        System.out.println("add is " + add);

    }   //endPoint

    //Single Parameter
    public Constructor1(int age) {
        this.age = age;
        System.out.println(this.age);

    }

    //Multi Parameter
    public Constructor1 (String name, int age, String add) {
        this.name = name;
        this.age = age;
        this.add = add;

        System.out.println("My daughter's name is " + name + "." + "Her age is " + age + "." + "Her address is " + add + ".");

    }

    public static void main(String[] args) {

        Constructor1 object = new Constructor1();

        System.out.println("From single parameter " + object.age);
        Constructor1 object1 = new Constructor1("Aizah",3,"VA, USA");

        Mobile mobile = new Mobile();
        Dell laptop = new Dell();

    }
}
