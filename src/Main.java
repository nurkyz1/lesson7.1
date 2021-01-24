import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Список А ");
        ArrayList<String> name = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        name.add(scanner.nextLine());
        name.add(scanner.nextLine());
        name.add(scanner.nextLine());
        name.add(scanner.nextLine());
        name.add(scanner.nextLine());

        Iterator<String> iter = name.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("Список Б  ");
        ArrayList<String> names = new ArrayList<>();

        names.add(scanner.nextLine());
        names.add(scanner.nextLine());
        names.add(scanner.nextLine());
        names.add(scanner.nextLine());
        names.add(scanner.nextLine());

        Iterator<String> iter1 = names.iterator();
        while (iter1.hasNext()) {
            System.out.println(iter1.next());
        }

        System.out.println("  Список С");
        Collections.reverse(names);
        ArrayList<String> namesC = new ArrayList<>();
        name.iterator();
        names.iterator();

        Iterator<String> iter2 = namesC.iterator();
        while (iter2.hasNext()){
            System.out.println(iter2.next());
        }
        namesC.sort(Comparator.comparing(String::length));

        System.out.println(" Отсортированный список  ");
        iter2 =namesC.iterator();
        while (iter2.hasNext()){
            System.out.println(iter2.next());
        }

    }
}
