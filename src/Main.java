import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static String[] tab_nb_soc = new String[] {"first", "second", "third", "fourth"};
    private static double price_per_ton_al_low_qlty = 1960;
    private static double price_per_ton_al_high_qlty = 2450;
    private static double price_per_m2_fabric = 0.07;

    public static void main(String[] args) {
        //Creation of the fourth societies
        for (int id = 1; id <= 4; id++) {
            create_society(id);
        }

        Material aluminium_low_qlty = new Material(price_per_ton_al_low_qlty);
        Material aluminium_high_qlty = new Material(price_per_ton_al_high_qlty);
        Material fabric = new Material(price_per_m2_fabric);
    }


    public static void create_society(int id) {
        System.out.println("Enter name of the " + tab_nb_soc[id-1] + " society :");
        String name = sc.nextLine();
        Society soc1 = new Society(name, id);
    }
}