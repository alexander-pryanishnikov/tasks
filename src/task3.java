public class task3 {
    public static boolean calcNumbers(int a, int b) {
        // посчитаем длину чисел и сравним последнюю цифру
        if (Integer.toString(a).length()-1 == Integer.toString(b).length()-1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(calcNumbers(11, 21));
    }
}
