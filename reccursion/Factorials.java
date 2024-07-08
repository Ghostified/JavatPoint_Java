package reccursion;
/*
 * A function calls itself directly or indirectly
 * The solution to the base case is provided and the solution to the bigger problem is expressed in terms of smaller problems
 */
class Factorials {

    //recursive method
    int fact(int n) {
        int result;

        if (n == 1)
        return 1;

        result = fact(n -1) * n;
        return result;
    }
}

//Driver class

class Recursion {
    public static void main(String[] args) {
        Factorials f = new Factorials();
        System.out.println("Factorial of 3 is: " + f.fact(3));
        System.out.println("Factorial of 3 is: " + f.fact(4));
        System.out.println("Factorial of 3 is: " + f.fact(5));

    }
}
