package streamsKevin;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddIntegers {

    public OddIntegers() {
    }

    public List<Integer> oddIntegers(Integer n){

        return IntStream
                .rangeClosed(1, n)
                .filter( e -> e % 2 != 0)
                .boxed()
                .collect(Collectors.toList());
    }

}
