import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static String[] tab_nb_soc = new String[] {"first", "second", "third", "fourth"};

    public static void main(String[] args) {
        //Creation of the fourth societies
        for (int id = 1; id <= 4; id++) {
            create_society(id);
        }
    }


    public static void create_society(int id) {
        System.out.println("Enter name of the " + tab_nb_soc[id-1] + " society :");
        String name = sc.nextLine();
        Society soc1 = new Society(name, id);
    }
}