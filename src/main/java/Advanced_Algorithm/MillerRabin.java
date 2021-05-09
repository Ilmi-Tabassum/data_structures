package Advanced_Algorithm;

import java.util.Scanner;
import java.util.Random;
import java.math.BigInteger;

public class MillerRabin {

        public boolean isPrime(long n, int iteration)
        {

            if (n == 0 || n == 1)
                return false;

            if (n == 2)
                return true;

            if (n % 2 == 0)
                return false;

            long s = n - 1;
            while (s % 2 == 0)
                s /= 2;

            Random rand = new Random();
            for (int i = 0; i < iteration; i++)
            {
                long r = Math.abs(rand.nextLong());
                long a = r % (n - 1) + 1, temp = s;
                long mod = modPow(a, temp, n);
                while (temp != n - 1 && mod != 1 && mod != n - 1)
                {
                    mod = mulMod(mod, mod, n);
                    temp *= 2;
                }
                if (mod != n - 1 && temp % 2 == 0)
                    return false;
            }
            return true;
        }

        public long modPow(long a, long b, long c)
        {
            long res = 1;
            for (int i = 0; i < b; i++)
            {
                res *= a;
                res %= c;
            }
            return res % c;
        }

        public long mulMod(long a, long b, long mod)
        {
            return BigInteger.valueOf(a).multiply(BigInteger.valueOf(b)).mod(BigInteger.valueOf(mod)).longValue();
        }

        public static void main (String[] args)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Miller Rabin Primality Algorithm Test\n");

            MillerRabin mr = new MillerRabin();

            System.out.println("Enter number\n");
            long num = scan.nextLong();

            System.out.println("\nEnter number of iterations");
            int k = scan.nextInt();

            boolean prime = mr.isPrime(num, k);
            if (prime)
                System.out.println("\n"+ num +" is prime");
            else
                System.out.println("\n"+ num +" is composite");

        }
    }

