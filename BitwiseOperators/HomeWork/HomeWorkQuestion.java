package BitwiseOperators.HomeWork;

    public class HomeWorkQuestion {
        public static void main(String[] args) {


            // 1. Count Set Bits

            int n1 = 10;
            int count = 0;
            int temp = n1;

            while (temp != 0) {
                if ((temp & 1) != 0) {
                    count++;
                }
                temp = temp >> 1;
            }

            System.out.println("Set bits in " + n1 + " = " + count);



            // 2. Find Missing Number (XOR)

            int[] arr = {0, 1, 2, 3, 5, 6};

            int xor1 = 0;
            for (int num : arr) {
                xor1 ^= num;
            }

            int n2 = arr.length; // range = 0 -> n

            int xor2 = 0;
            for (int i = 0; i <= n2; i++) {
                xor2 ^= i;
            }

            int missing = xor1 ^ xor2;

            System.out.println("Missing number = " + missing);



            // 3. Check Power of 4

            int n3 = 16;

            if (isPowerOfFour(n3)) {
                System.out.println(n3 + " is Power of 4");
            } else {
                System.out.println(n3 + " is NOT Power of 4");
            }
        }


        // Function for Power of 4
        static boolean isPowerOfFour(int n) {
            if (n <= 0) return false;

            if ((n & (n - 1)) != 0) return false;

            if ((n & 0x55555555) == 0) return false;

            return true;
        }
    }