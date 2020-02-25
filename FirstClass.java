
import java.util.Scanner;

public class FirstClass {
    //Attributes
    String name;
    int age;
    double temp;


// Constructors

    public FirstClass(String name, int age, double temp) {


        this.name = name;
        this.age = age;
        this.temp = temp;
    }

    // Method
    public String CreateEmail(String name){
        return this.name+"@mycompany.com";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Message");
        // Create an instance of FirstClass

        FirstClass carter1 = new FirstClass("Sergi", 17, 73.5);
        System.out.println("Name " + carter1.name);

        System.out.println(carter1.CreateEmail(carter1.name));
        System.out.println("Do you want more info about "+ carter1.name + "  ?");
        System.out.println("Press y/n");
        char yesno = scan.next().charAt(0);
        if(yesno=='y'){
            System.out.println("Age "+ carter1.age);
        }
        else{
            System.out.println("Thx!");
        }
    }
}
