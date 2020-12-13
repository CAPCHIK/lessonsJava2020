package ru.capchik.ivbo_07_19.lesson14;

public class Worker {
    @Task
    public void sum(int[] args){
        int sum = 0;
        for (Integer i:args) {
            sum+=i;
        }
        System.out.println("Sum is "+sum);
    }
    @Task
    public void print(String[] args,char delimeter){
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
            if(i<args.length-1) System.out.print(delimeter);
        }
        System.out.println();
    }
}
