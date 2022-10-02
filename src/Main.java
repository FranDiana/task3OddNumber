import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int num[] = {-21, 22, 13, 4, 45, 63, 4, -8};
        int max_neparne = num[0];
        for (int i : num) {
            if (i % 2 != 0) {
                if (max_neparne < i) {
                    max_neparne = i;
                }
            }
        }
        System.out.println("Max number = " + max_neparne);

    }
}