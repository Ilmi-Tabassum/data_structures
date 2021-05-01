package recursionBondho;


public class triangles {   

static int print_row(int ct, int num)

    {
        // base case
        if (num == 0)
            return ct;
        System.out.print(ct + "  ");
        // recursively calling print_row()
        return print_row(ct + 1, num - 1);
    }
    // function to print the pattern
    static void pattern(int n,
                        int count, int num)
    {
        // base case
        if (n == 0)
            return;
        count = print_row(count, num);
        System.out.println();
        // recursively calling pattern()
        pattern(n - 1, count, num + 1);
    }
    // Driver Code
    public static void main (String[] args)
    {
        int n = 5;
        pattern(n, 1, 1);
    }
}
