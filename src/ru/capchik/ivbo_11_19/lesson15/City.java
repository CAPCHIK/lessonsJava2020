package ru.capchik.ivbo_11_19.lesson15;

public class City {
    private String name;
    // Долгота
    private double longitude;
    // Широта
    private double latitude;
    // Население
    private int population;
    // Год основания
    private int year;
    // Площадь
    private double square;

    public City(String name, double longitude, double latitude, int population, int year, double square) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.population = population;
        this.year = year;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
