package ua.ithillel.work2;

public class MySumCount_1 extends Thread {
    private int startIndex;
    private int stopIndex;
    private int[] myArray;
    private long resultSum;

    public MySumCount_1(int[] array) {
        this.myArray = array;
        this.startIndex = 1;
        this.stopIndex = array.length - 1;
    }

    public MySumCount_1(int startIndex, int stopIndex, int[] array) {
        this.myArray = array;
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public int[] getMyArray() {
        return myArray;
    }

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }

    public long getResultSum() {
        return this.resultSum;
    }

    @Override
    public void run() {
        long result = 0L;
        System.out.println("Runner started");
        for (int i = this.startIndex; i <= this.stopIndex; i++) {
            result += myArray[i];
            System.out.println("runner #1: " + result);
        }
        System.out.println("Runner #1 stopped with the final result: " + result);
        this.resultSum = result;
    }


}
