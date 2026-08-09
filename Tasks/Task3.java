public class Task3 {

    static String a = new String("Wow");
    static String b = a;
    static String c = "headache";
    static String d = b + "!";

    static boolean b1 = a == b;
    static boolean b2 = d.equals(b + "!");
    static boolean b3 = !c.equals(a);

    public static void main(String[] args) {
        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}