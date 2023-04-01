import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida", "ootani");
        List<String> result = names.stream()
                .filter(name -> name.contains("a"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(result);
    }
}