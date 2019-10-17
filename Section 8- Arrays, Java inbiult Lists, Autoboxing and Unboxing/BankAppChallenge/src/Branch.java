import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addNewCustomer(String customerName, double initialAmount){

        if (findCustomer(customerName) != null){
            System.out.println("Customer with name " + customerName + " already exists");
            return false;
        }

        customers.add(new Customer(customerName, initialAmount));
        return true;
    }

    public boolean addTransaction(String customerName, double amount){

        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String name){

        for (int i = 0; i < customers.size(); i++){
            Customer customer = customers.get(i);
            if (customer.getName().equals(name)){
                return customer;
            }
        }
        return null;
    }
}
