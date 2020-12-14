package ru.capchik.ivbo_07_19.lesson15;

import java.util.ArrayList;
import java.util.Objects;

public class StringBuilderExample {
    private int b;
    public StringBuilderExample(int b){
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringBuilderExample that = (StringBuilderExample) o;
        return b == that.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(b);
    }

    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2 = new String("Hello world");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        StringBuilderExample sbe1 = new StringBuilderExample(1);
        StringBuilderExample sbe2 = new StringBuilderExample(1);
        System.out.println(sbe1 == sbe2);
        System.out.println(sbe1.equals(sbe2));


        long builderStart = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100_000_00; i++) {
            builder.append(" ");
            builder.append(i);
        }
        System.out.println(builder.toString().length());
        System.out.println(System.nanoTime() - builderStart);

        long bufferStart = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 100_000_00; i++) {
            buffer.append(" ");
            buffer.append(i);
        }
        System.out.println(buffer.toString().length());
        System.out.println(System.nanoTime() - bufferStart);

        String total = "";
        for (int i = 0; i < 100_000; i++) {
            total += " " + i;
        }
        System.out.println(total.length());
    }
}
