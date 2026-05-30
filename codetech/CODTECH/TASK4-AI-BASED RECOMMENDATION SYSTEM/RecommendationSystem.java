import java.util.*;

public class RecommendationSystem {
    public static void main(String[] args) {
        Map<String, List<String>> userPreferences = new HashMap<>();
        userPreferences.put("Alice", Arrays.asList("Action", "Sci-Fi"));
        userPreferences.put("Bob", Arrays.asList("Romance", "Drama"));

        Map<String, String> movies = new HashMap<>();
        movies.put("Inception", "Sci-Fi");
        movies.put("Titanic", "Romance");
        movies.put("Avengers", "Action");
        movies.put("Notebook", "Drama");

        String user = "Alice";
        System.out.println("Recommendations for " + user + ":");
        for (Map.Entry<String, String> entry : movies.entrySet()) {
            if (userPreferences.get(user).contains(entry.getValue())) {
                System.out.println(" - " + entry.getKey());
            }
        }
    }
}
