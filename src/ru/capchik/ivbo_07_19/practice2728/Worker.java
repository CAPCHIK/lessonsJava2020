package ru.capchik.ivbo_07_19.practice2728;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    private int id;
    private String type;
    private JsonArray data;
    private String delimeter;
    Gson gson=new Gson();

    public Worker() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public JsonArray getData() {
        return data;
    }

    public String getDelimeter() {
        return delimeter;
    }

    public void setDelimeter(String delimeter) {
        this.delimeter = delimeter;
    }

    public void setData(JsonArray data) {
        this.data = data;
    }

    @Operation
    public void sum(JsonArray data){
        int sum=0;
        Type type = new TypeToken<List<Integer>>(){}.getType();
        ArrayList<Integer> numbers=gson.fromJson(data,type);
        for(int i=0;i<numbers.size();i++){
            sum+=numbers.get(i);
        }
        System.out.println(sum);
    }
    @Operation
    public void print(JsonArray data){
        Type type = new TypeToken<List<String>>(){}.getType();
        ArrayList<String> words=gson.fromJson(data,type);
        for (int i=0;i<words.size();i++){
            if(i!=words.size()-1) {
                System.out.print(words.get(i) + delimeter);
            }
            else{
                System.out.print(words.get(i));
            }
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", data=" + data +
                '}';
    }
}
