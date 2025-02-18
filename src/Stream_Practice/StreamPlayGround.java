package Stream_Practice;

import java.util.List;

public class StreamPlayGround {
    public static void main(String[] args) {
        List<String> data = List.of("a", "a", "b", "c", "a", "a");

        List<String> disticts = data.stream().distinct().toList();

        System.out.println(disticts);
    }
}
