package ua.ithillel.work2;

public class MySumCount_1 extends Thread {
    private int startIndex;
    private int stopIndex;
    private int[] myArray;
    private final long resultSum;

    public MySumCount_1(int[] array) {
        this.myArray = array;
        this.startIndex = 1;
        this.stopIndex = array.length - 1;
        this.resultSum = countResult();
    }

    public MySumCount_1(int startIndex, int stopIndex, int[] array) {
        this.myArray = array;
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.resultSum = countResult();
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
        return this.countResult();
    }

    public long countResult() {
        long result = 0L;
        for (int i = this.startIndex; i <= this.stopIndex; i++) {
            result += myArray[i];
        }
        return result;
    }

    @Override
    public void run() {
        System.out.println("Thread runner started");
        System.out.println("Thread runner result: " + this.resultSum);
        System.out.println("Thread runner stopped");
    }


}
