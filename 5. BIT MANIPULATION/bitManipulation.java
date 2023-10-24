class bitManipulation {
    public static void main(String[] args) {

        // BITWISE AND
        // System.out.println(5&6);

        // BITWISE OR
        // System.out.println(5|6);

        // BITWISE XOR
        // System.out.println(5^6);

        // BITWISE 1'S COMPLEMENT
        // System.out.println(~ 5);
        // System.out.println(~ 0);
        // NOTE - (~ 0 = -1)

        // BITWISE LEFT SHIFT
        // System.out.println(5<<2);

        // BITWISE RIGHT SHIFT
        // System.out.println(5>>2);

        // CHECK ODD OR EVEN
        // oddEven(9);

        // GET iTH BIT
        // System.out.println(getIthBit(4, 1));
        // SET iTH BIT
        // System.out.println(setIthBit(10, 4));
        // CLEAR iTH BIT
        // System.out.println(clearIthBit(4, 1));
        // System.out.println(updateIthBit(7,0,2));
        System.out.println(clearIBit(15, 2));
        // System.out.println(clearIBit(10, 2, 4));
        // System.out.println(powOfTwo(9))
        // System.out.println(countSetBits(7));;
        // System.out.println(fastExpo(4, 2));s
    }

    // odd or even
    public static void oddEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // even
            System.out.println("Even ");
        } else {
            System.out.println("Odd");
        }
    }

    // get ith bit
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // clear bit mask
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(i << i);
        return n & bitMask;
    }

    // update bit mask
    public static int updateIthBit(int n, int i, int newBit) {
        //easy way
        if(newBit==0)return clearIBit(n, i);
        else return setIthBit(n, newBit);

        //other method best for interviews
          
        // n = clearIthBit(n, i);
        // int bitMask = newBit << i;
        // return n | bitMask;
    }

    public static int clearIBit(int n, int i) {
        int bitmask = (-1<<i);//(~0)<<i
        return n & bitmask;

    }

    public static int clearIBit(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;//(2^i-1)-1
        int bitMask = a | b;

        return n & bitMask;
    }

    public static boolean powOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    // Fast Exponentiation
    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                // check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
}