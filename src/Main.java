public class Main {

    public static void main(String a[]) {

        // параметризируем класс типом String
        Box<String> sample1 = new Box<>("Нетология");
        System.out.println(sample1);

        // параметризируем класс типом Integer
        // был такой код: Box<String> sample2 = new Box<>(1);
        Box<Integer> sample2 = new Box<>(1);
        // мы вводим int(там где obj), а не String
        // поэтому нужен Integer как класс оболочка int
        System.out.println(sample2);

        // параметризируем класс типом Boolean
        Box<Boolean> sample3 = new Box<>(Boolean.TRUE);
        System.out.println(sample3);

    }
}
