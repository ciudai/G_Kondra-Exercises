package PD3;
// klases darbas
public class Main {
    public static void main(String[] args) {
        byte myNumber = 127; //1B
        myNumber = (byte)(myNumber + 1);
        System.out.println(myNumber);
        short myShort = 45; // 2B
        int myInt = 78; // 4B
        long myLong = 756L;
        // EEE754
        float myFloat = 4.5f; // 4B (32 bit)
        double myDouble = 7.896; // 8B (64 bit)

        float floatSum = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
        System.out.println(floatSum);
        double soubleSum = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 +0.1 + 0.1 + 0.1;
        System.out.println(soubleSum);
        double doubleResult = 0.0 / 0.0;
        System.out.println(doubleResult);


    }
}
