import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact){
        if (findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }

        contacts.add(contact);
        return true;
    }

    public ArrayList<Contact> getContacts(){
        return contacts;
    }

    public void printContacts(){
        System.out.println("You have " + contacts.size() + " contacts in your mobile phone.");
        for (int i = 0; i < contacts.size(); i++){
            System.out.println((i+1) + ". " + contacts.get(i).getName() + "-> " + contacts.get(i).getPhoneNumber());
        }
    }

    public boolean modifyContacts(Contact currentContact, Contact newContact){

        int position = findContact(currentContact);
        if (position >= 0){
            modifyContacts(position, newContact);
            System.out.println(currentContact.getName() + ", was replaced with " + newContact.getName());
            return true;
        }
        else if (findContact(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() +
                         " already exists. Update was not successful.");
            return false;
        }
        else {
            System.out.println(currentContact.getName() + "was not found.");
            return false;
        }
    }
    public boolean removeContact(Contact contact){

        int position = findContact(contact);
        if (position >= 0){
            removeContact(position);
            System.out.println(contact.getName() + ", was deleted");
            return true;
        }

        System.out.println(contact.getName() + ", was not found");
        return false;
    }

    public String queryContact(Contact contact){
        if (findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }
    public Contact queryContact(String name){
        int position = findContact(name);

        if (position >= 0){
            return contacts.get(position);
        }
        return null;
    }

    private int findContact(String name){

        for (int i = 0; i < contacts.size(); i++){
            Contact contact = contacts.get(i);
            if (contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    private int findContact(Contact searchContact){
        return contacts.indexOf(searchContact);
    }

    private void modifyContacts(int position, Contact newContact){
        contacts.set(position,newContact);
        System.out.println("Contact " + (position+1) + " has been modified.");
    }

    private void removeContact(int position){
        contacts.remove(position);
    }




}
