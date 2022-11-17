import java.util.TreeMap;

public class PhoneBook {

    public static TreeMap<String, String> phoneBook = new TreeMap<String, String>();

   public boolean add (String name, String phoneNum){
       if (!phoneBook.containsKey(name)) {
           phoneBook.put(name, phoneNum);
           System.out.println("кол-во контактов: " + phoneBook.size());
           return true;
       }
       System.out.println("Данное имя "+ name +" уже есть в книге");
        return false;
    }

    public String findByNumber(String phoneNum){
        for (String key : phoneBook.keySet()) {
            if (phoneNum.equals(phoneBook.get(key))) {
                return key;
            }
        }
        return "Имя не найдено";
    }

    public static String findByName(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        return "Номер не найден";
    }

}

