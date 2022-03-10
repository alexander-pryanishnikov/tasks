public class task4 {

    public static int calcNumbers(int a, int b, int c) {
        return a > b ? (Math.max(a, c)) : (Math.max(b, c));
    }

    public static void main(String[] args) {
        System.out.println(calcNumbers(5, 4, 3));
    }
}
