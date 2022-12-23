import java.util.Scanner;

import models.*;

public class Main {
    public static void main(String[] args) {
        Contact[] contacts = new Contact[] {
            new Contact("Ricky", "5/8/1999", 85156511),
            new Contact("Roger", "11/9/1943", 85212322),
            new Contact("Syd", "4/21/1944", 85123231)
        };

        ContactManager contactManager = new ContactManager(contacts);
        System.out.println(contactManager);
    }



    /**
     * Name: manageContacts
     *
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) add b) remove a contact c) exit.
     *   •        case a: ask for the name, phone number and birthDate.
     *   •        case b: ask who they'd like to remove.
     *   •        case c: break the loop.
     *   • 3. close Scanner.
     */

    public static void manageContacts(ContactManager contactManager) {
        Scanner scan = new Scanner(System.in);
        boolean loopThis = true;
        while(loopThis) {
            System.out.print("a) Add b) remove contact c) exit >>> ");
            char xMenu = scan.next().charAt(0);
            switch(xMenu) {
                case 'a':
                    System.out.print("\nName: ");
                    String name = scan.nextLine();
                    System.out.print("\nBirth Date: ");
                    String birthDate = scan.nextLine();
                    System.out.print("\nPhone Number: ");
                    int phone = scan.nextInt();

                    Contact newContact = new Contact(name, birthDate, phone);
                    contactManager.addContact(newContact);
                break;
                case 'b':
                    System.out.print("\nIndex: ");
                    int index = scan.nextInt();
                    contactManager.removeContact(index);
                break;
                case 'c':
                    loopThis = false;
                break;
                default:
                    System.out.println("\nThat's not a right menu key!");
            }
        }

        scan.close();
    }



    /**
     * Name: loadContacts
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads contacts from <fileName>;
     *   • 2. From the manager object, it adds all contacts to the contacts list.
     *        Hint: use scan.next to grab the next String separated by white space.
     */

}
