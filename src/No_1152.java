import java.util.Scanner;
import java.util.StringTokenizer;

public class No_1152 {
    public static void main(String[] args) {
                Scanner s1 = new Scanner(System.in);
                String a = s1.nextLine();
                s1.close();

            StringTokenizer st = new StringTokenizer(a," ");
            System.out.println(st.countTokens());

    }
}
