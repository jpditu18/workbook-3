import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class InventApp {

    public static void main(String[] args) {

                ArrayList<Product> inventory = getInventoryFromFile("src/main/resources/inventory.csv");

                Scanner myScanner = new Scanner(System.in);

                System.out.println("We carry the following inventory: ");

                for (int i = 0; i < inventory.size(); i++) {
                    Product p = inventory.get(i);
                    System.out.printf("id: %d | %s  | Price: $%.2f%n",
                            p.getId(), p.getName(), p.getPrice());
                }
            }

               public static ArrayList<Product> getInventoryFromFile(String filename){
                    ArrayList<Product> inventory = new ArrayList<>();

                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(filename));
                        String line;

                        while ((line = reader.readLine()) != null){
                            String[] parts = line.split("\\|");

                            int id = Integer.parseInt(parts[0]);
                            String name = parts[1];
                            float price = Float.parseFloat(parts[2]);

                            Product product = new Product(id, name, price);
                            inventory.add(product);
                        }
                    } catch (Exception e) {
                        System.out.println("There was an error reading inventory file: " + e.getMessage());
                    }

                    return inventory;
               }
        }
