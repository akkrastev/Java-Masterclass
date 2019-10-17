import java.util.Scanner;

public class Main {


    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone mobilePhone = new MobilePhone("0894353452");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Enter action: ( 0 to show available actions)");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    quit = true;
                    System.out.println("Shutting down...");
                    break;
            }
        }
    }
    public static  void startPhone(){
        System.out.println("Starting phone...");
    }
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add an contact to the list.");
        System.out.println("\t 3 - To modify an contact in the list.");
        System.out.println("\t 4 - To remove an contact from the list.");
        System.out.println("\t 5 - To search for an contact in the list.");
        System.out.println("\t 6 - To quit the application.");
    }


    private static void addContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String phoneNumber = scanner.nextLine();

        Contact contact = Contact.createContact(name, phoneNumber);
        if (mobilePhone.addContact(contact)){
            System.out.println("New contact added: " + name + ", phone: " + phoneNumber);
        }
        else {
            System.out.println("Cannot add " + name + " already on file.");
        }
    }

    public static void modifyContact(){
        System.out.println("Current contact name: ");
        String name = scanner.nextLine();
        Contact currentContact =mobilePhone.queryContact(name);
        if (currentContact == null){
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newPhoneNumber = scanner.nextLine();

        Contact newContact = Contact.createContact(newName, newPhoneNumber);

        if(mobilePhone.modifyContacts(currentContact,newContact)){
            System.out.println("Successfully updated record !");
        }
        else {
            System.out.println("Error updating record");
        }
    }

    public static void removeContact() {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        Contact currentContact =mobilePhone.queryContact(name);
        if (currentContact == null){
            System.out.println("Contact not found.");
            return;
        }

        if (mobilePhone.removeContact(currentContact)){
            System.out.println("Successfully deleted");
        }
        else {
            System.out.println("Error deleting contact");
        }
    }

    public static void queryContact(){

        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        Contact currentContact =mobilePhone.queryContact(name);
        if (currentContact == null){
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + currentContact.getName() + "phone number: " + currentContact.getPhoneNumber());


    }
}
