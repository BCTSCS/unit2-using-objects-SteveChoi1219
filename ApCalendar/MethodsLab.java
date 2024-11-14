public class MethodsLab {
    public static void forLoop(int start, int end, int inc) {
        for(int i = start; i < end; i+= inc) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void whileLoop(int number) {
        int digitCount = 0;
        int digitSum = 0;

        while(number > 0) {
            int digit = number % 10;
            digitSum += digit;
            digitCount++;
            number /= 10;
        }
        System.out.println(digitCount + " digits totaling " + digitSum);
    }

    public static void addHyphen(String input) {
        System.out.println(input);
        String upperCaseString = input.toUpperCase();
        System.out.println(upperCaseString);
        String hyphenated = upperCaseString.replace(" ", "-");
        System.out.println(hyphenated);

    }

    public static void main(String[] args) {
        forLoop(2, 90, 5);
        forLoop(3, 74, 5);
        forLoop(6, 12, 1);

        whileLoop(100);
        whileLoop(3333);

        addHyphen("hello world");
        addHyphen("My name is Steve");

    }
}
