
import lombok.Getter;
import lombok.Setter;

public class Main {
    @Getter
    @Setter
    String str = "Hello";

    public static void main(String[] args) {
        System.out.println(new Main().getStr());

    }
}
