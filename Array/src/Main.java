public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);

        }

        int[] scores = new int[] {100,92,93};
        for (int i = 0; i < scores.length; i++)
            System.out.println(scores[i]);

        scores[0] = 99;
        for (int score : scores)
            System.out.println(score);

        /*---------------------*/

        Array<Integer> array = new Array(20);
        for (int i = 0; i < 10; i++)
            array.addLast(i);
        array.set(3, 99);
        System.out.println(array);

        array.remove(4);
        System.out.println(array);

        array.remove(3);
        System.out.println(array);
    }
}
