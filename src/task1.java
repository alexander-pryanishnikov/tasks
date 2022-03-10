public class task1 {
    public static String calcTemp(int a) {
        if (a >= 100) {
            return "Пар";
        } else if (a <= 0) {
            return "Лед";
        } else {
            return "Вода";
        }
    }

    public static void main(String[] args) {
        System.out.println(calcTemp(1));

    }

}
