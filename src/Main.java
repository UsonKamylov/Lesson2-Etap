import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        boolean s = false;
        for (; true; ) {
            int sanRandom = ran.nextInt(3);
            System.out.println("Какой этаж?");
            int etaj = sc.nextInt();
            System.out.println("Какой вес?");
            int ves = sc.nextInt();

            if (etaj >= 10) {
                System.out.println("Такого этажа не существует!");
            } else if (ves > 200) {
                System.out.println("Вес не должен быть более 200кг!");
            }else
            if (sanRandom == 1) {
                int etaj2 = ran.nextInt(etaj);
                for (int i = 1; i < etaj2; i++) {
                    System.out.println("Вы находитесь на→ " + i + "этаже!");
                    s = true;
                }
                System.out.println("Лифт застрял между " + (etaj2 - 1) + " ↔ " + etaj2 + " этажами");
            } else {
                for (int a = 1; a <= etaj; a++) {
                    System.out.println("Вы находитесь на→ " + a + "этаже!");
                    s = true;
                }
                System.out.println("Таа-даам вы пришли ((¬‿¬ ))");
                if (s) {
                    break;
                }}}

}
        }