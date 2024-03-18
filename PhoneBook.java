import java.util.*;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void addContact(String name, String phone) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>());
        }
        phoneBook.get(name).add(phone);
    }

    public void removeContact(String name) {
        phoneBook.remove(name);
    }

    public void printPhoneBook() {
        Set<String> keys = phoneBook.keySet();
        ArrayList<String> sortedKeys = new ArrayList<>(keys);
        sortedKeys.sort(Comparator.comparing(String::toString).reversed());

        for (String key : sortedKeys) {
            System.out.println(key + ": " + phoneBook.get(key));
        }
    }
}

