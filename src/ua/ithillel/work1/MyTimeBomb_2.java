package ua.ithillel.work1;

public class MyTimeBomb_2 implements Runnable{

    @Override
    public void run() {
        int i = 10;
        while(i >= 0){
            System.out.println(i);
            i--;
        }
        System.out.println("Boom!!!");
    }
}
