package bsu.rfe.java.group10.lab1.Osoprilko.varB;

public class Cheese extends Food  {
    public Cheese() {
        super("Сыр");
    }
    public void consume() {
        System.out.println(this + " съеден");
    }
    public int calculateCalories()
    {
        return calories;
    }
}
