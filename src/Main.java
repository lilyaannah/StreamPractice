import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ///////
        ArrayList<Integer> arrayList=new ArrayList<>();
       // arrayStream(arrayList);
        ///////
     List<Phone> phonesList = new LinkedList<>();
     fillingList(phonesList);

        List<Tablet> tabletsList = phonesList.stream()
                .filter(phone -> Double.parseDouble(phone.getDisplay()) > 7.0)
                .map(phone -> new Tablet("Samsung", phone.getDisplay(), phone.getColor()))
                .collect(Collectors.toList());

        tabletsList.forEach(tablet -> System.out.println("Mark: " + tablet.getMark() +
                ", Display: " + tablet.getDisplay() +
                ", Color: " + tablet.getColor()));

}

    private static void arrayStream(ArrayList<Integer> arrayList) {
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            int randomNumber = random.nextInt(21) + 5;
            arrayList.add(randomNumber);
        }
        System.out.println(arrayList);
        System.out.println(arrayList.stream().filter(number -> number > 10).toList());
    }

    private static void fillingList(List<Phone> phonesList) {
        phonesList.add(new Phone("Samsung Galaxy S21 Ultra", "5.5", "Phantom Black"));
        phonesList.add(new Phone("iPhone 13 Pro Max", "7.0", "Graphite"));
        phonesList.add(new Phone("Samsung Galaxy Z Flip 3", "15.5", "Cream"));
        phonesList.add(new Phone("iPhone 13", "2.7", "Midnight"));
        phonesList.add(new Phone("Samsung Galaxy Note 20 Ultra", "9.1", "Mystic Bronze"));
        phonesList.add(new Phone("iPhone SE (2022)", "9.5", "Starlight"));
        phonesList.add(new Phone("Samsung Galaxy A52", "5.9", "Awesome Blue"));
        phonesList.add(new Phone("iPhone 12 Mini", "3.5", "Blue"));
        phonesList.add(new Phone("Samsung Galaxy S20 FE", "12.0", "Jennie RED"));
        phonesList.add(new Phone("iPhone SE (2020)", "10.5", "Cloud Mint"));
    }
}