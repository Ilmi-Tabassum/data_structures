package Advanced_Algorithm;
import java.util.Random;
public class milerRabin {


        public static int modular_exponentiation(int a, int b, int n) {

                if (b == 0)
                    return a % n;
                int ret = modular_exponentiation(a, b / 2, n);
                ret = (ret *ret)%n;

                if (n % 2 == 1) {
                    ret = (ret * a) % n;
                }
                return ret;
            }
//Checks if a is "witness" to composite of n

        public static boolean witness(int a, int n) { // Following the algorithm
            int t;
            t = n - 1;
            int u;
            u = n - 1 >> t;
            int[] x = new int[t + 1];
            x[0] = modular_exponentiation(a, u, n);
            for (int i = 1; i <= t; ++i) {
                x[i] = x[i - 1] * x[i - 1] % n;
                if (x[i] == 1 && x[i - 1] != 1  &&   x[i - 1] != n - 1) {
                    return true;
                }
            }
            if (x[t] != 1) return true;
            return false;
        }


        public static String miller_rabin(int num, int s) { // num is prime or composite.
            Random rand = new Random();
            int a, j = 1;
            while (j <= s) {
                a = rand.nextInt(num - 1) + 1;
                if (witness(a, num))
                    return "Composite";// composite so return true
                ++j;
            }
            return "prime"; // prime return false
        }
// slogn is the complexity of this milerRabin test
        public static void main(String[] args) {

            System.out.println(miller_rabin(17, 54));
            System.out.println(witness(54, 30));
        }

    }
