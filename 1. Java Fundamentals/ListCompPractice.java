import java.util.*;
import java.util.stream.*;
// import java.util.Arrays;

class ListCompPractice {
    public static void main(String[] args){
        List<String> places = Arrays.asList("Alaska", "Canada", "Ireland");
        places.forEach((x)-> System.out.println(x));
        // List<Integer> r = range.Iterator(1,3, 1);
        IntStream st = IntStream.range(32,45);
        st.forEach((x) -> System.out.println(x));

        //iterator
        List<String> p = Arrays.asList("Alaska", "Canada", "Ireland");
        String[] li = {"Alaska", "Canada", "Ireland"};
        System.out.println(li);
        //get iterator
        List<String> c = p.stream().map(String::toUpperCase).collect(Collectors.toList());
        p.forEach((x) -> System.out.println(x.toUpperCase()));
        // list methods = 
        // forEach((x) -> System.out.print(x));
        System.out.println(c);

    }
    
}
