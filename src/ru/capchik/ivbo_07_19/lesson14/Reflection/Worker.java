package ru.capchik.ivbo_07_19.lesson14.Reflection;

public class Worker {
    @ConsoleOperation(title = "some work", key = 1)
    public void Work1() {
        System.out.println("Work1");
    }

    @ConsoleOperation(title = "again work", key = 2)
    public void Work3() {
        System.out.println("Work again");
    }

    @ConsoleOperation(title = "Hard work", key = 3)
    public void Work6() {
        System.out.println("Work work");
    }

    @ConsoleOperation(title = "Last work", key = 4)
    public void Work76() {
        System.out.println("Last work");
    }

    @ConsoleOperation(title = "New work", key = 5)
    public void Work234() {
        System.out.println("Best work ever");
    }

    private int doSomework() {return 5;}
}
