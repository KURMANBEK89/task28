import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[]mass ={1,2,3,4,5,6,7,8,9,10};
        Optional<Integer>optional= Stream.of(mass).map(x->x%2==0?x:0).map(y->y*y).max((x, y)->Integer.compare(x,y));
        System.out.println(optional);
    }
}