/**
 * pi_generator
 */
public class pi_generator {

    public static void main(String[] args) {

        double pi = 3.0f;
        long n = 2;
        int x = 1;

        System.out.println("test");

        for (long i = 0; i < 1000; i++) {
            pi = pi + x *(4.0f/(n*(n+1.0f)*(n+2.0f)));
            n = n+2;
            x = -x;
          }
          System.out.println(pi);





    }
}