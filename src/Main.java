import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // testArray();
        Array<Integer> array = new ArrayImpl<>(1000000);
        Array<Integer> array1 = new ArrayImpl<>(1000000);
        Array<Integer> array2= new ArrayImpl<>(1000000);
        //Array<Integer> array = new SortedArrayImpl<>();

        for (int i = 0; i < 1000000 ; i++) {
            int n = (int) ( Math.random() * 10000);
            array.add(n);
            array1.add(n);
            array2.add(n);
        }

        array.display();
        System.out.println("Выполняются сортировка, подождите пожалуйста");
        long startTime = System.currentTimeMillis();
        array.sortBubble();
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Пузырьковая сортировка выполнялась " + timeSpent + " миллисекунд");

        System.out.println("------------");
        System.out.println("Выполняются сортировка, подождите пожалуйста");
        long startTime1 = System.currentTimeMillis();
        array1.sortSelect();
        long timeSpent1 = System.currentTimeMillis() - startTime1;
        System.out.println("Сортировка методом выбора выполнялась " + timeSpent1 + " миллисекунд");

        System.out.println("------------");
        System.out.println("Выполняются сортировка, подождите пожалуйста");
        long startTime2 = System.currentTimeMillis();
        array2.sortInsert();
        long timeSpent2 = System.currentTimeMillis() - startTime2;
        System.out.println("Сортировка методом выбора выполнялась " + timeSpent2 + " миллисекунд");
        System.out.println("------------");


        System.out.println("Find 6: " + array.indexOf(6));
        System.out.println("Find 6666666: " + array.indexOf(6666666));

        array.remove(6);
        System.out.println("Find 6:"+ array.indexOf(6));
        array.display();
    }

    private static void testArray() {
        int[] a = {1, 2, 3};

        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i]);
        }
        System.out.println("-----------");
        for (int value : a)
        {
            System.out.println(value);
        }
        System.out.println("------------");
        Arrays.stream(a).forEach(System.out::println);
    }
}
