package Advanced_Algorithm;

public class ModularExponent {

        static int Exp(int a, int n, int mod) {
            if (n == 0)
                return a % mod;
            int ret = Exp(a, n / 2, mod);
            ret = (ret *ret)%mod;

            if (n % 2 == 1) {
                ret = (ret * a) % mod;
            }
            return ret;
        }
        static int modPow(int base, int exp, int n) {

            base = base%n;

            if (exp == 0)
                return 1;

            else if (exp == 1)
                return base;

            else if (exp%2 == 0)
                return modPow(base*base%n, exp/2, n);

            else
                return base*modPow(base, exp-1, n)%n;
        }


        public static void main(String[] args) {
            int z = modPow(3, 84, 17);
            System.out.println("ModularExponentiation :  " +z );

            int W=Exp(3,84,17);
            System.out.print("ModularExponentiation :  "  +W );


        }
    }

