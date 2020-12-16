package lesson14;

public class MyTask {
    private String type;
    private Data data;
    private int id;

    public MyTask(String type, Data data, int id) {
        this.type = type;
        this.data = data;
        this.id = id;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MyTask{" +
                "type='" + type + '\'' +
                ", data=" + data +
                ", id=" + id +
                '}';
    }
}
