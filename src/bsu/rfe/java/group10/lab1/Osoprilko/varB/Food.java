package bsu.rfe.java.group10.lab1.Osoprilko.varB;

public abstract class Food implements Consumable, Nutritious
{
    String name = null;
    int calories =50;
    public Food (String name)
    {
        this.name=name;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Food)) return false;
        if(name==null || ((Food)obj).name==null)return false;
        return name.equals(((Food)obj).name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
}
