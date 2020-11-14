import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class works {
    public static void main(String[] args) {
        Random rn = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 1; i < 6; i++) {
            int r = rn.nextInt(100);
            list1.add(r);

        }
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println("შებრუნებული " + list1);

        // ზრდადობა კლებადობა

        Collections.sort(list1);
        System.out.println("ზრდადობით " + list1);
        System.out.println(list1);
        System.out.println("კლებადობით");
        Collections.sort(list1, Collections.reverseOrder());
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 1; i < 6; i++) {
            int r = rn.nextInt(100);
            list2.add(r);

        }
        System.out.println(list2);

        for (int i = 0; i <= 2; i++) {
            int sz = list2.size();
            int ra = rn.nextInt(100);
            list2.add(sz, ra);
        }
        System.out.println(list2);

        // ინდექსის შეყვანა
        Scanner sc = new Scanner(System.in);
        System.out.println("შეიყვანე ინდექსი");
        int index_number = sc.nextInt();

        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for (int i = 1; i < 6; i++) {
            int r = rn.nextInt(100);
            list3.add(r);

        }
        int random_index_number = rn.nextInt();
        list3.add(index_number, random_index_number);
        System.out.println(list3);
        System.out.println("ინდექსის ჩამატების შემდეგ");
        System.out.println(list3);

        // პირველი 3 ის წაშლა

        ArrayList<Integer> list4 = new ArrayList<Integer>();
        for (int i = 1; i < 6; i++) {
            int r = rn.nextInt(100);
            list4.add(r);

        }
        System.out.println(list4);

        for (int i = 0; i <= 2; i++) {
            list4.remove(0);
        }
        System.out.println(list4);

        // კლავიატურიდან ინდექსის მიღება და წაშლა

        ArrayList<Integer> list5 = new ArrayList<Integer>();
        for (int i = 1; i < 6; i++) {
            int r = rn.nextInt(100);
            list5.add(r);

        }
        System.out.println(list5);
        System.out.println("შეიყვანე წასაშლელი ინდექსი");
        int rand_del_ind = sc.nextInt();
        list5.remove(rand_del_ind);
        System.out.println(list5);

        // ლუწების წაშლა
        ArrayList<Integer> list6 = new ArrayList<Integer>();
        for (int i = 1; i < 6; i++) {
            int r = rn.nextInt(100);
            list6.add(r);

        }
        System.out.println(list6);
        for (int i = 0; i <= list6.size() - 1; i++) {
            if (i % 2 == 0) {
                list6.remove(i);
            }
        }
        System.out.println(list6);

        convert(1131);
        System.out.println("\n");
        System.out.println(Decimal(100110));

    }

    public static void convert(int num) {
        int binary[] = new int[40];
        int index = 0;
        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

    public static int Decimal(int bin) {
        int decimal = 0;
        int n = 0;
        while (true) {
            if (bin == 0) {
                break;
            } else {
                int temp = bin % 10;
                decimal += temp * Math.pow(2, n);
                bin = bin / 10;
                n++;
            }
        }
        return decimal;
    }

}
