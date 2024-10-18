import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name, phone, email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}

public class ContactManager {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Contact\n2. View Contacts\n3. Update Contact\n4. Delete Contact\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    contacts.add(new Contact(name, phone, email));
                    System.out.println("Contact added!");
                    break;
                case 2:
                    System.out.println("Contacts:");
                    for (Contact contact : contacts) {
                        System.out.println(contact);
                    }
                    break;
                case 3:
                    System.out.print("Enter contact name to update: ");
                    String updateName = scanner.nextLine();
                    for (Contact contact : contacts) {
                        if (contact.name.equals(updateName)) {
                            System.out.print("Enter new phone: ");
                            contact.phone = scanner.nextLine();
                            System.out.print("Enter new email: ");
                            contact.email = scanner.nextLine();
                            System.out.println("Contact updated!");
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter contact name to delete: ");
                    String deleteName = scanner.nextLine();
                    contacts.removeIf(contact -> contact.name.equals(deleteName));
                    System.out.println("Contact deleted!");
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        scanner.close();
    }
}