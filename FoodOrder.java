import java.util.ArrayList;

public class FoodOrder{

    public static void main(String[] args) {

        ArrayList<String> foods = new ArrayList<>();

        foods.add("Pizza");
        foods.add("Burger");
        foods.add("Dosa");

        System.out.println("Ordered Foods:");

        for(String item : foods) {
            System.out.println(item);
        }
    }
}