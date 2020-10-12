package bsu.rfe.java.group10.lab1.Osoprilko.varB;
import java.util.Arrays;
public class MainApplication {
    public static void main(String[] args) throws Exception {
// Определение ссылок на продукты завтрака
        Food[] breakfast = new Food[20];
        boolean needCalories = false, needSort = false;
        int totalCalories = 0;
        int itemsSoFar = 0;
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].startsWith("-"))
            {
                if (parts[0].equals("-calories"))
                {
                    needCalories = true;
                }
                if (parts[0].equals("-sort"))
                {
                    needSort = true;
                }
                continue;
            }
            if (parts[0].equals("Cheese"))
            {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Apple"))
            {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            } else if( parts[0].equals("Pie")){
                breakfast[itemsSoFar]=new Pie(parts[1]);
            }
            itemsSoFar++;
        }

        for (Food item : breakfast)
            if (item != null) {
                if (needCalories)
                    totalCalories += item.calculateCalories();
                item.consume();
            }
            else
                break;
        Arrays.sort(breakfast, new FoodComparator());
        System.out.println("Общее число калорий: " + totalCalories);
        System.out.println("Всего хорошего!");
    }
}
