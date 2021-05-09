package Advanced_Algorithm;
import java.util.Scanner;
public class ExtendedEuclid {


        public void solve(long a, long b)
        {
            long x = 0, y = 1, lastx = 1, lasty = 0, temp;
            while (b != 0)
            {
                long q = a / b;
                long r = a % b;

                a = b;
                b = r;

                temp = x;
                x = lastx - q * x;
                lastx = temp;

                temp = y;
                y = lasty - q * y;
                lasty = temp;
            }
            System.out.println("Roots  x : "+ lastx +" y :"+ lasty);
        }

        public static void main (String[] args)
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Extended Euclid Algorithm Test\n");

            ExtendedEuclid ee = new ExtendedEuclid();


            System.out.println("Enter a b of ax + by = gcd(a, b)\n");
            long a = sc.nextLong();
            long b = sc.nextLong();

            ee.solve(a, b);
        }
    }

