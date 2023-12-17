package Problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Design a food rating system that can do the following:
 *
 * Modify the rating of a food item listed in the system.
 * Return the highest-rated food item for a type of cuisine in the system.
 * Implement the FoodRatings class:
 *
 * FoodRatings(String[] foods, String[] cuisines, int[] ratings) Initializes the system. The food items are described by foods, cuisines and ratings, all of which have a length of n.
 * foods[i] is the name of the ith food,
 * cuisines[i] is the type of cuisine of the ith food, and
 * ratings[i] is the initial rating of the ith food.
 * void changeRating(String food, int newRating) Changes the rating of the food item with the name food.
 * String highestRated(String cuisine) Returns the name of the food item that has the highest rating for the given type of cuisine. If there is a tie, return the item with the lexicographically smaller name.
 * Note that a string x is lexicographically smaller than string y if x comes before y in dictionary order, that is, either x is a prefix of y, or if i is the first position such that x[i] != y[i], then x[i] comes before y[i] in alphabetic order.
 */

public class FoodRatings {

    private String[] foods;

    private String[] cuisines;

    private int[] ratings;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        this.foods = foods;
        this.cuisines = cuisines;
        this.ratings = ratings;
    }

    public void changeRating(String food, int newRating) {
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(food)) {
                foods[i] = food;
                ratings[i] = newRating;
                return;
            }
        }
    }

    public String highestRated(String cuisine) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, ratings[0]);
        int count = 0;

        for (int i = 1; i < ratings.length; i++) {
            if (cuisine.equals(cuisines[i])) {
                if (map.get(count) < ratings[i] || map.get(count) == ratings[i]) {
                    map.put(i, ratings[i]);
                    map.remove(count);
                    count = i;
                }
            }
        }

        String minFood = null;

        for (Integer item : map.keySet()) {
            if (minFood == null || foods[item].compareTo(minFood) < 0) {
                minFood = foods[item];
            }
        }

        return minFood;
    }

    public static void main(String[] args) {

        FoodRatings foodRatings = new FoodRatings(
                new String[]{"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"},
                new String[]{"korean", "japanese", "japanese", "greek", "japanese", "korean"},
                new int[]{9, 14, 8, 15, 14, 7}
        );

        System.out.println(foodRatings.highestRated("japanese"));
    }

}
