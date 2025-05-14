public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();

        Contact contact1 = new Contact();
        contact1.name = "Yao";
        contact1.phoneNumber = "01 23 45 67 89";
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.name = "Djoko";
        contact2.phoneNumber = "07 89 12 34 56";
        myContactsManager.addContact(contact2);

        Contact found = myContactsManager.searchContact("Djoko");
        if (found != null) {
            System.out.println("Téléphone de Djoko: " + found.phoneNumber);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}
