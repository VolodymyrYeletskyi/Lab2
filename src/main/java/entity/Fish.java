package entity;

//сущность Рыба(id, название, цвет размер)


import java.util.Random;

public class Fish {
    private int id;
    private String name;
    private String color;
    private double size;

    public Fish(int id, String name, String color, double size)
    {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
    }
    public Fish()
    {
        this.id = new Random().nextInt();
        this.name = "Karas";
        this.color = "Silver";
        this.size = 0.2;
    }
    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getColor()
    {
        return this.color;
    }
    public double getSize()
    {
        return this.size;
    }

    @Override
    public String toString()
    {
        return "Fish{" +
                "id = '" + this.id + '\'' +
                "name = '" + this.name + '\'' +
                ", color = '" + this.color + '\'' +
                ", size = " + this.size +
                '}';
    }
}
