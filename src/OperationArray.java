import java.util.ArrayList;
import java.util.Scanner;

public class OperationArray {

    static ArrayList<String> data;
    static Scanner sc;
    static String element;
    static int index;
    static int number;


    public static void main(String[] args) {
        data = new ArrayList<>();

        for (int i = 0; i < 6; i = number) {

            sc = new Scanner(System.in);
            System.out.println("""
                    Select an action:
                    \n1. Boolean add(int index, String value);
                    2. Boolean add(String value);
                    3. Boolean delete(int index);
                    4. Boolean delete(String value);
                    5. Array output;
                    6. Exit.
                    """);
            number = sc.nextInt();

            if (number == 1) {
                booleanAdd();
            } else if (number == 2) {
                booleanAddV();
            } else if (number == 3) {
                booleanDelete();
            } else if (number == 4) {
                booleanDeleteV();
            } else if (number == 5) {
                getString();
            } else if (number >= 6) {
                System.out.println("Exit.");
            }
        }
    }


    private static void booleanAdd (){
        getIndex ();
        getElement ();
        data.add(index,element);
    }
    private static void booleanAddV (){
        getElement ();
        data.add(element);
    }

    private static void booleanDelete (){
        getIndex ();
        boolean hasContain = data.contains(index);

        if (hasContain)
            data.remove(index);
        else
            System.out.println("The array does not contain " + index);
    }

    private static void booleanDeleteV (){
        getElement ();
        boolean hasContain = data.contains(element);

        if (hasContain)
            data.remove(element);
        else
            System.out.println("The array does not contain " + element);
    }

    private static int getIndex (){
        sc = new Scanner(System.in);
        System.out.println("Enter array index:");
        index =sc.nextInt();

        return index;
    }

    private static String getElement (){
        sc = new Scanner(System.in);
        System.out.println("Enter array element:");
        element = sc.nextLine();

        return element;
    }

    private static void getString () {
        for (String s : data) {
            System.out.println(s);
        }
    }
}
