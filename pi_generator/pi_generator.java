/**
 * pi_generator
 */
public class pi_generator {

    public static void main(String[] args) {

        double pi = 3.0;
        long n = 2;
        int x = 1;

        int iterations = 132000;

        System.out.print("Approximation of Pi: ");

        for (long i = 0; i < iterations; i++) {
            pi = pi + x *(4.0/(n*(n+1.0)*(n+2.0)));
            n = n+2;
            x = -x;
          }
          System.out.println(pi);
    }
}
