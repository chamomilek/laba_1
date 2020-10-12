package bsu.rfe.java.group10.lab1.Osoprilko.varB;

public class Pie extends Food {
    private String filling;

    public Pie(String filling) {
        super("Пирог");
        this.filling = filling;
    }
    @Override
    public void consume() {
        System.out.println(this + " съедено");
    }
    // Селектор для доступа к полю данных РАЗМЕР
    public String getFilling()
    {
        return filling;
    }
    // Модификатор для изменения поля данных РАЗМЕР
    public void setFilling(String filling)
    {
this.filling=filling;
    }

public boolean equals (Object arg0)
{
    if (super.equals(arg0)) {
        if (!(arg0 instanceof Pie)) return false;
        return filling.equals(((Pie)arg0).filling);
    } else
        return false;
}
// Переопределѐнная версия метода toString(), возвращающая не только название продукта, но и его размер
    public String toString() {
        return super.toString() + " размера '" + filling.toUpperCase() + "'";
    }
    public int calculateCalories()
    {
        if (filling.equals("вишневая")) calories = 256;
        else if (filling.equals("кулбничная")) calories = 285;
        else if (filling.equals("яблочная")) calories = 265;
        return calories;
    }

}
