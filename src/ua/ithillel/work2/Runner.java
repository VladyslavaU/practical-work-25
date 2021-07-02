package ua.ithillel.work2;

public class Runner {

    public void run() {
        int[] array = createArray();
        MySumCount_1 mySumCount_1 = new MySumCount_1(array);
        mySumCount_1.start();
        MySumCount_2 mySumCount_2 = new MySumCount_2(array);
        mySumCount_2.run();
    }

    public static int[] createArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        return array;
    }

}
