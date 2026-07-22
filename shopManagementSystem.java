import java.util.*;
public class shopManagementSystem {
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
         ArrayList<String> products = new ArrayList<>();
        int choice=0;
        while(true){
            if(choice==4){
                break;
            }
            System.out.println("Welcome to the Shop Management System!");
        System.out.println("1. Add a product");
        System.out.println("2. Remove a product");
        System.out.println("3. View products");
        System.out.println("4. Exit");
        choice = scanner.nextInt();
            switch (choice) {
            case 1 -> {
                System.out.println("Adding a product...");
                
                System.out.print("Enter the product name: ");   
                String productName = scanner.next();
                products.add(productName);
                System.out.println("Product added successfully!");
                }
            case 2 -> {
                System.out.println("Removing a product...");
                System.out.print("Enter the product name to remove: ");
                String productToRemove = scanner.next();
                if (products.remove(productToRemove)) {
                    System.out.println("Product removed successfully!");
                } else {
                    System.out.println("Product not found.");
                }
                }
            case 3 -> {
                System.out.println("Viewing products...");
                System.out.println("Products in the shop:");
                for (String product : products) {
                    System.out.println("- " + product);
                }
                }
            case 4 -> System.out.println("Exiting the system. Goodbye!");
            
            default -> System.out.println("Invalid choice. Please try again.");
        }
    }
}
}