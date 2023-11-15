package main.modul6.cwiczenia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) throws IOException {

//        Path path = Paths.get("src/main/modul6/cwiczenia/dane.txt");
//        List<String> file = Files.readAllLines(path);
//        List<String> postKeys = Arrays.asList(file.get(0).split(";"));
//        List<String> posts = file.subList(1, file.size());

//        List<Map<String, String>> listOfPosts = posts.stream()
//                .map(post -> {
//                    List<String> newPost = Arrays.asList(post.split(";"));
//                    Map<String, String> map = new HashMap<>();
//                    map.put(postKeys.get(0), newPost.get(0));
//                    map.put(postKeys.get(1), newPost.get(1));
//                    map.put(postKeys.get(2), newPost.get(2));
//                    map.put(postKeys.get(3), newPost.get(3));
//                    return map;
//                })
//                .toList();
//        listOfPosts.forEach(System.out::println);

        Path path = Paths.get("src/main/modul6/cwiczenia/dane.txt");
        List<String> file = Files.readAllLines(path);
        List<String> postKeys = Arrays.asList(file.get(0).split(";"));
        List<List<String>> postData = file.subList(1, file.size()).stream()
                .map(post -> Arrays.asList(post.split(";")))
                .toList();

        List<Map<String, String>> listOfPosts = postData.stream()
                .map(post -> IntStream.range(0, post.size())
                        .boxed()
                        .collect(Collectors.toMap(postKeys::get, post::get)))
                .toList();


//        1. Wyświetl komentarze w kolejności chronologicznej
//        List<Map<String, String>> postsByDate = listOfPosts.stream()
//                .sorted(Comparator.comparing(post -> post.get("date")))
//                .toList();
//
//        postsByDate.forEach(System.out::println);

//        2. Wyświetl tylko te komentarze, które mają więcej niż 10 polubień
//        List<Map<String, String>> postWithOver10Likes = listOfPosts.stream()
//                .filter(post -> Integer.parseInt(post.get("likes")) > 10)
//                .toList();
//        postWithOver10Likes.forEach(System.out::println);

//        3. Znajdź najdłuższy oraz najkrótszy komentarz
//        Optional<Map<String, String>> longestPost = listOfPosts.stream()
//                .max(Comparator.comparing(post -> post.get("comment").length()));
//        Optional<Map<String, String>> shortestPost = listOfPosts.stream()
//                .min(Comparator.comparing(post -> post.get("comment").length()));
//        System.out.println(longestPost.get());
//        System.out.println(shortestPost.get());

//        4. Oblicz średnią liczbę polubień dla wszystkich komentarzy.
//        OptionalDouble averageAmountOfLikes = listOfPosts.stream()
//                .mapToInt(post -> Integer.parseInt(post.get("likes")))
//                .average();
//        System.out.println(averageAmountOfLikes.getAsDouble());

//        5. Oblicz ile komentarzy zostało dodanych przez mężczyzn i kobiety.
//        Map<Boolean, List<Map<String, String>>> postsGroupedByMale = listOfPosts.stream()
//                .collect(Collectors.partitioningBy(post -> post.get("username").endsWith("a")));
//
//        int malePosts = postsGroupedByMale.get(false).size();
//        int femalePosts = postsGroupedByMale.get(true).size();
//        System.out.printf("Posty mężczyzn: %d, posty kobiet: %d%n", malePosts, femalePosts);

//        6. Oblicz łączną liczbę polubień dla wszystkich komentarzy.
//        Integer amountOfAllLikes = listOfPosts.stream().mapToInt(post -> Integer.parseInt(post.get("likes"))).sum();
//        System.out.println(amountOfAllLikes);

//        7. Znajdź wszystkich użytkowników, którzy zostawili komentarze o długości przekraczającej 50 znaków.
//        List<String> listOfUserWithCommentLengthAbove50 = listOfPosts.stream()
//                .filter(post -> post.get("comment").length() > 50)
//                .map(post -> post.get("username"))
//                .toList();
//        System.out.println(listOfUserWithCommentLengthAbove50);

//        8. Posortuj komentarze według liczby polubień w kolejności malejącej.
//        List<Map<String, String>> postWithAmountOfLikesDesc = listOfPosts.stream()
//                .sorted((p1, p2) -> Integer.valueOf(p2.get("likes")).compareTo(Integer.valueOf(p1.get("likes"))))
//                .toList();
//        postWithAmountOfLikesDesc.forEach(System.out::println);

//        9. Wyświetl komentarze dodane w październiku 2023.
//        List<Map<String, String>> postsAddedInOctober = listOfPosts.stream()
//                .filter(post -> post.get("date").startsWith("2023-10"))
//                .toList();
//        postsAddedInOctober.forEach(System.out::println);

//        10. Wyświetl unikalne daty, w których zostawiono komentarze.
//        List<String> listOfUniqueDatesOfPost = listOfPosts.stream()
//                .map(post -> post.get("date"))
//                .distinct()
//                .toList();
//        listOfUniqueDatesOfPost.forEach(System.out::println);

//        11. Oblicz sumę polubień dla komentarzy zostawionych w listopadzie 2023.
//        int sumOfLikesInNovember2023 = listOfPosts.stream()
//                .filter(post -> post.get("date").startsWith("2023-11"))
//                .mapToInt(post -> Integer.parseInt(post.get("likes")))
//                .sum();
//        System.out.println(sumOfLikesInNovember2023);

//        12. Wyświetl wszystkie unikalne imiona użytkowników.
//        listOfPosts.stream()
//                .map(post -> post.get("username"))
//                .distinct()
//                .forEach(System.out::println);

//        13. Oblicz średnią długość komentarzy.
//        Double averageLengthOfComments = listOfPosts.stream()
//                .collect(Collectors.averagingInt(post -> post.get("comment").length()));
//        System.out.println(averageLengthOfComments);

//        14. Oblicz średnią liczbę słów na komentarz.
//        Double averageAmountOfWordsInComments = listOfPosts.stream()
//                .collect(Collectors.averagingInt(post -> post.get("comment").split(" ").length));
//        System.out.println(averageAmountOfWordsInComments);

//        15. Wyświetl komentarze, które zawierają przynajmniej jedno słowo zaczynające się na literę "s".
//        List<Map<String, String>> listOfPostWithWordStartingWithLetterS = listOfPosts.stream()
//                .filter(post -> {
//                    List<String> words = Arrays.asList(post.get("comment").split(" "));
//                    return words.stream().anyMatch(word -> word.startsWith("s"));
//                })
//                .toList();
//        listOfPostWithWordStartingWithLetterS.forEach(System.out::println);

//        16. Wyświetl komentarze użytkowników, których imiona zawierają literę "a" (bez względu na wielkość liter).
//        List<Map<String, String>> listOfPostsUsersHavingLetterAInName = listOfPosts.stream()
//                .filter(post -> post.get("username").toLowerCase().contains("a"))
//                .toList();
//        listOfPostsUsersHavingLetterAInName.forEach(System.out::println);
//        17. Posortuj komentarze według długości komentarza, a następnie wybierz 5 najdłuższych.
//        List<Map<String, String>> listOf5LongestComments = listOfPosts.stream()
//                .sorted((p1, p2) -> Integer.compare(p2.get("comment").length(), p1.get("comment").length()))
//                .limit(5)
//                .toList();
//        listOf5LongestComments.forEach(System.out::println);

//        18. Posortuj komentarze alfabetycznie według nazw użytkowników,
//        a następnie wybierz 5 pierwszych komentarzy w alfabetycznym porządku.
//        List<Map<String, String>> postsSortedByUsername = listOfPosts.stream()
//                .sorted(Comparator.comparing(post -> post.get("username")))
//                .limit(5)
//                .sorted(Comparator.comparing(post -> post.get("comment")))
//                .toList();
//        postsSortedByUsername.forEach(System.out::println);

//        19. Znajdź wszystkich użytkowników, którzy zostawili komentarze o długości przekraczającej średnią długość komentarzy.
//        Double averageLengthOfComment = listOfPosts.stream()
//                .collect(Collectors.averagingInt(post -> post.get("comment").length()));
//        List<String> listOfUsersWithCommentsLengthOverAverageLength = listOfPosts.stream()
//                .filter(post -> post.get("comment").length() > averageLengthOfComment)
//                .map(post -> post.get("username"))
//                .toList();
//        listOfUsersWithCommentsLengthOverAverageLength.forEach(System.out::println);

//        20. Znajdź datę, w której zostawiono najwięcej komentarzy.
        Map<String, List<Map<String, String>>> dates = listOfPosts.stream()
                .collect(Collectors.groupingBy(post -> post.get("date")));
        String dateWithMaxAmountOfComments = dates.entrySet()
                .stream()
                .max(Comparator.comparingInt(d -> d.getValue().size()))
                .map(Map.Entry::getKey)
                .get();
        System.out.println(dateWithMaxAmountOfComments);

    }

}
