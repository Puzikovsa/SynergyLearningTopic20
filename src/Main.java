public class Main {

    public static void main(String[] args) {

        Double number = Double.valueOf(10.0);
        System.out.println(number.doubleValue());
        System.out.println(number.toString());
        String a = "156";
        System.out.println(Integer.parseInt(a));
        Integer integer = Integer.parseInt(a);
        int c = integer;
        System.out.println(c);
        integer = c;
        System.out.println(c);
    }
}
