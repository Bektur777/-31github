package Problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.
 *
 * It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.
 *
 *
 *
 * Example 1:
 *
 * Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
 * Output: "Sao Paulo"
 * Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
 * Example 2:
 *
 * Input: paths = [["B","C"],["D","B"],["C","A"]]
 * Output: "A"
 * Explanation: All possible trips are:
 * "D" -> "B" -> "C" -> "A".
 * "B" -> "C" -> "A".
 * "C" -> "A".
 * "A".
 * Clearly the destination city is "A".
 */

public class DestinationCity {

    static String destCity(List<List<String>> paths) {
        if (paths.size() == 1) {
            return paths.get(0).get(1);
        }

        Map<String, String> map = new HashMap<>();

        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }

        for (String destination : map.values()) {
            if (map.get(destination) == null) {
                return destination;
            }
        }

        return null;
    }

}
