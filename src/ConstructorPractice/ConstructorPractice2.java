package ConstructorPractice;

public class ConstructorPractice2 {
    //AccessModifier className/ConstructorName() {   }

int price = 10;
String item = "Salt";
String store = "Trader Joe's";
double tax = 0.07;

    //Default Constructor
    public ConstructorPractice2 () {  //start point

        System.out.println("Constructor practice session");

    } //end point

    public ConstructorPractice2 (int price) {
        this.price = price;

    }
    public ConstructorPractice2 (int price, String item, double tax) {
        this.price = price;
        this.item = item;
        this.tax = tax;
    }

    public static void main(String[] args) {
        ConstructorPractice2 object = new ConstructorPractice2();
        System.out.println("Price is " + object.price);
        System.out.println("Price is " + object.price + "Item is" + object.item + "tax is " + object.tax);

        ConstructorPractice2 object1 = new ConstructorPractice2(10);
        System.out.println(object1.price);


    }
}
