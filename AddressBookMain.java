package addressbook;
import java.util.ArrayList;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
    ContactPerson obj1 = new ContactPerson();
    obj1.setName("JASMINE");
    System.out.println(obj1.getName());
    obj1.setAge(25);
    System.out.println(obj1.getAge());
    obj1.setPhoneNo(679840321);
    System.out.println(obj1.getPhoneNo());
    obj1.setCity("Kanniyakumari");
    System.out.println(obj1.getCity());
    obj1.setState("Tamil Nadu");
    System.out.println(obj1.getState());

    System.out.println("Multiple Contacts in AddressBook");

    AddressBook obj2 = new AddressBook();
    obj2.setName("Rose");
    System.out.println(obj2.getName());
    obj2.setAge(50);
    System.out.println(obj2.getAge());
    obj2.setPhoneNo(678905432);
    System.out.println(obj2.getPhoneNo());
    obj2.setCity("Palakkad");
    System.out.println(obj2.getCity());
    obj2.setState("Kerala");
    System.out.println(obj2.getState());

    AddressBook obj3 = new AddressBook();
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the name");
    obj3.setName(obj.next());
    System.out.println("Enter the age");
    obj3.setAge(obj.nextInt());

    System.out.println("Enter the PhoneNo");
    obj3.setPhoneNo(obj.nextInt());

    System.out.println("Enter the City");
    obj3.setCity(obj.next());
    System.out.println("Enter the State");
    obj3.setState(obj.next());

    ArrayList<AddressBook> obj6 = new ArrayList<AddressBook>();
    int n;
    Scanner obj4 = new Scanner(System.in);
    System.out.println("Enter the option \n 1.name \n  2. Age \n  3.Phoneno \n 4.City \n 5.State");
    n=obj4.nextInt();
    switch (n){
        case 1:
            System.out.println("Enter the name");
            obj3.setName(obj.next());
            break;
        case 2:
            System.out.println("Enter the age");
            obj3.setAge(obj.nextInt());
            break;
        case 3:
            System.out.println("Enter the PhoneNo");
            obj3.setPhoneNo(obj.nextInt());
            break;
        case 4:
            System.out.println("Enter the State");
            obj3.setState(obj.next());
            break;
        case 5:
            System.out.println("Enter the City");
            obj3.setCity(obj.next());
            break;
            default :
            System.out.println("no case");



    }








    }
}
