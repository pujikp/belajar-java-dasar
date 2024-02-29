public class DataType {
    public static void main(String[] args) {
        //Numbers
        integerNumbers();
        floatingPointNumbers();
        literalsNumbers();
        usingUnderscore();
        conversionNumbers();
        //Character
        character();
        //Boolean
        booleanType();
        //String
        stringType();
    }

    private static void integerNumbers() {
        byte thisByte = 100; //-128 s/d 127, size 1 byte, default value 0
        short thisShort = 1000; //-32768 s/d 32767, size 2 byte, default value 0
        int thisInteger = 1000000; //-2147483648 s/d 2147483647, size 4 byte, default value 0
        long thisLong = 100000000L; //-9223372036854775808 s/d 9223372036854775807, size 8 byte, default value 0
        System.out.println(thisByte);
        System.out.println(thisShort);
        System.out.println(thisInteger);
        System.out.println(thisLong);
    }

    private static void floatingPointNumbers() {
        float thisFloat = 10.12F; //3.4e^-038 s/d 3.4e^+038, size 4 bytes, default value 0.0
        double thisDouble = 12.2424; //1.7e^-308 s/d 1.7e^+308, size 8 bytes, default value 0.0
        System.out.println(thisFloat);
        System.out.println(thisDouble);
    }

    private static void literalsNumbers() {
        int hexInt = 0xA132B; //hexadecimal
        int binInt = 0b01010101; //binary
        System.out.println(hexInt);
        System.out.println(binInt);
    }

    private static void usingUnderscore() {
        int amount = 1_000_000_000;
        System.out.println(amount);
    }

    private static void conversionNumbers() {
        //Widening Casting(Automatic) : byte->short->int->long->float->double
        byte thisByte = 10;
        short thisShort = thisByte;
        int thisInt = thisShort;

        int thisInt2 = 1000;
        byte thisByte2 = (byte) thisInt2; //dangerous
        System.out.println(thisByte);
        System.out.println(thisShort);
        System.out.println(thisInt);
        System.out.println(thisInt2);
        System.out.println(thisByte2);

        //Narrowing Casting(Manual) : double->float->long->int->char->short->byte
    }

    private static void character() {
        char m = 'M';
        char e = 'E';
        System.out.println(m + e); //146
        System.out.print(m); //M
        System.out.println(e); //E
    }

    private static void booleanType() {
        boolean benar = true;
        boolean salah = false;
        System.out.println(benar);
        System.out.println(salah);
    }

    private static void stringType() {
        String firstName = "Puji";
        String lastName = "Kumala Pertiwi";
        String fullName = firstName + " " + lastName;
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(fullName);
    }

}
