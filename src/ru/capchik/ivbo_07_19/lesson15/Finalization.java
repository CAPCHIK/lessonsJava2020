package ru.capchik.ivbo_07_19.lesson15;

public class Finalization {
    private  long num;

    public Finalization(long num) {
        this.num = num;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize " + num);
    }

    public static void main(String[] args) {
        for (long i = 0; i < 100_000_000; i++) {
            new Finalization(i);
        }
    }
}
