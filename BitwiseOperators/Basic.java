package BitwiseOperators;

public class Basic {
    static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(" Bitwise And: " + (a & b));  // if both 1 then true else false
        System.out.println(" Bitwise OR: " + (a | b));    // if both 0 then false else true
        System.out.println(" Bitwise xor: " + (a ^ b));  // if both same then (false) 0 else true
        System.out.println(" Left shift: " + (a << 1));  //left shifting
        // means multiplying by 2 (n<<i) -->(n×2^i)
        System.out.println(" Right shift: " + (a >> 1)); //Right shifting
        // means Dividing by 2 (n>>i) --> (n/(2^i))

        System.out.println(" Bitwise Not: "+(~a)); //if MSB is having 1 it means that no. is negative
//        so it does use 2’s complement to find the Value of negation
    }
}
