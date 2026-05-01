package BitwiseOperators;

public class RemoveLastSetBit {
    static void main(String[] args) {
        int n=10;
        System.out.println(n&(n-1));

//        10 --> 0000 1010 after removing the last set bit(1000) it will become 8;
//        the formula n&(n-1) is use dt remove only one set bit that is last bit
    }
}
