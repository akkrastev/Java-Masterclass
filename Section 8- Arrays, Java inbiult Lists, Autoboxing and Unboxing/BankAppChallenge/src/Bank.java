import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean showCustomers(String branchName, boolean showTransactions){

        Branch branch = findBranch(branchName);
        if (branch != null){
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> customers = branch.getCustomers();
            for (int i = 0; i < customers.size(); i++){
                Customer customer = customers.get(i);
                System.out.println("Name : " + customer.getName() + "[" + (i+1) + "]");
                if (showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++){
                        double transaction = transactions.get(j);
                        System.out.println("[" + (j+1) + "] Amount " +transaction);
                    }
                }
            }
            return true;
        }else {

            return false;
        }
    }

    public boolean addNewBranch(String branchName){
        if (findBranch(branchName) == null){
            branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomerToExistingBranch(String branchName,String customerName, double initialAmount){
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null){
            return existingBranch.addNewCustomer(customerName, initialAmount);
    }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null){
            return existingBranch.addTransaction(customerName, amount);
        }

        return false;
    }

    private Branch findBranch(String name){

        for (int i = 0; i < branches.size(); i++){
            Branch branch = branches.get(i);
            if (branch.getName().equals(name)){
                return branch;
            }
        }
        return null;
    }
}
