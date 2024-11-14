public class MethodsLab {
    public static void forLoop(int start, int end, int inc) {
        for(int i = start; i < end; i+= inc) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void whileLoop(int number) {
      
    }
    public static void main(String[] args) {
        forLoop(2, 90, 5);
        forLoop(3, 74, 5);
        forLoop(6, 12, 1);

        whileLoop(18);

    }
}
