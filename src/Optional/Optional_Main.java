package Optional;

import java.util.Optional;
import java.util.OptionalInt;

public class Optional_Main {

    public static void main(String[] args) {
        int[] arr = new int[0];

//        System.out.println("arr length = " + arr.length);

//        Optional<String> opt = Optional.empty();
        Optional<String> opt = Optional.of("TEST");

//        System.out.println("opt = " + opt.orElseGet());

        String str = " ";


//        null 확인하는게 번거롭다 따라서 optional 을 사용한다.
//        try {
//            str = opt.get();
//        } catch (Exception e) {
//           str = "";
//        }

//        str = opt.orElse("Empty");
//        str = opt.orElseGet(()->new String());
        str = opt.orElseGet(String::new);

        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);
        Optional<Integer> optInteger = optStr.map(e -> e.length());

        int result = Optional.of("123")
                .filter(x -> x.length() > 0)
                .map(e -> Integer.parseInt(e)).orElse(-1);


        Optional.of("456").map(Integer::parseInt)
                .ifPresent(x-> System.out.println("result" + x));


        Optional<Integer> optint1 = Optional.of(0);
        Optional<Integer> optint2 = Optional.empty();

        System.out.println("isEmpty? = " + optint1.isPresent());
        System.out.println("isEmpty? = " + optint2.isPresent());

    }
}
