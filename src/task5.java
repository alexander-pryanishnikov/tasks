public class task5 {

    public static StringBuffer calcStr (String a) {


        // Последний символ в строке
        Character last = a.toCharArray()[a.length() - 1];

        // Добавляем его к строке
        String str = a.concat(Character.toString(last));

        StringBuffer sb = new StringBuffer(str);

        return sb.insert(0,last);

    }

    public static void main(String[] args) {
        System.out.println(calcStr("cat"));
    }
}
