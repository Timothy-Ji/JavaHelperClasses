import java.util.Scanner;

/**
 * Input helper class.
 * Easier to put messages before input
 * 
 * @author Timothy Ji
 */
public class Response {
    private static Scanner stdin = new Scanner(System.in);

    public static String nextLine(String message) {
        System.out.print(message);
        return stdin.nextLine();
    }

    public static String nextLine() {
        return stdin.nextLine();
    }

    public static int nextInt(String message, boolean nextLine) {
        System.out.print(message);
        int s = stdin.nextInt();
        if (nextLine)
            stdin.nextLine();
        return s;
    }

    public static int nextInt(String message) {
        return Response.nextInt(message, false);
    }

    public static int nextInt(boolean nextLine) {
        return Response.nextInt("", nextLine);
    }

    public static int nextInt() {
        return Response.nextInt("");
    }

    public static double nextDouble(String message, boolean nextLine) {
        System.out.print(message);
        double s = stdin.nextDouble();
        if (nextLine)
            stdin.nextLine();
        return s;
    }

    public static double nextDouble(String message) {
        return Response.nextDouble(message, false);
    }

    public static double nextDouble(boolean nextLine) {
        return Response.nextDouble("", nextLine);
    }

    public static double nextDouble() {
        return Response.nextDouble("");
    }

    public static String next(String message, boolean nextLine) {
        System.out.print(message);
        String s = stdin.next();
        if (nextLine)
            stdin.nextLine();
        return s;
    }

    public static String next(String message) {
        return Response.next(message, false);
    }

    public static String next(boolean nextLine) {
        return Response.next("", nextLine);
    }

    public static String next() {
        return Response.next("");
    }
}
