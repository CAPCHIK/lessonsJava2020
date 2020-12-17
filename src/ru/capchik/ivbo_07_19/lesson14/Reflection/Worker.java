package ru.capchik.ivbo_07_19.lesson14.Reflection;

public class Worker {
    @ConsoleOperation(title = "some work", key = 1)
    public void work1(){
        System.out.println("Work1");
    }
    @ConsoleOperation(title = "again work", key = 2)
    public void work3(){
        System.out.println("Work again");
    }
    @ConsoleOperation(title = "Hard work", key = 3)
    public void work6(){
        System.out.println("Hard work");
    }
    @ConsoleOperation(title = "Last work", key = 4)
    public void work76(){
        System.out.println("Last work");
    }
    @ConsoleOperation(title = "New work", key = 5)
    public void work234(){
        System.out.println("Best work ever");
    }
    private int doSomeWork() {return 5;}
}
