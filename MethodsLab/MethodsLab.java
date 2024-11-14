import java.util.HashMap;
import java.util.Map;

/**
 * Lab Activity: String Methods and Wrapper Class Practice
 * Topics: String immutability, String methods, Wrapper classes
 */

public class MethodsLab {
    public static void main(String[] args) {
        // Section 1: String Methods and Immutability
        System.out.println("=== String Methods Practice ===\n");
        stringPractice();

        // Section 2: Wrapper Class Operations
        System.out.println("\n=== Wrapper Class Practice ===\n");
        wrapperPractice();

        // Section 3: Practice Exercises
        System.out.println("\n=== Practice Exercises ===\n");
        exercises();

        // Section 4: Additional Tasks
        System.out.println("\n=== Additional Tasks ===\n");
        additionalTasks();
    }

    public static void stringPractice() {
        // Exercise 1: indexOf() and substring()
        String text = "Java is fun";
        System.out.println("Original string: " + text);

        // indexOf demonstrations
        System.out.println("indexOf 'Java': " + text.indexOf("Java"));
        System.out.println("indexOf 'a': " + text.indexOf('a'));
        System.out.println("indexOf 'a' from index 6: " + text.indexOf('a', 2));

        // substring demonstrations
        String sub1 = text.substring(7);
        String sub2 = text.substring(0, 7);
        System.out.println("substring from 7: " + sub1);
        System.out.println("substring 0 to 7: " + sub2);

        // Exercise 2: String length and immutability
        String original = "Hello";
        System.out.println("\nOriginal string: " + original);
        System.out.println("Length: " + original.length());

        // Demonstrate immutability
        original.concat(" World");
        System.out.println("After concat: " + original);

        // Correct way to modify
        original = original.concat(" World");
        System.out.println("After reassignment: " + original);

        // Exercise 3: compareTo and equals
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";
        String str4 = new String("apple");

        System.out.println("\nString comparison results:");
        System.out.println("apple compareTo banana: " + str1.compareTo(str2));
        System.out.println("banana compareTo apple: " + str2.compareTo(str1));
        System.out.println("apple compareTo apple: " + str1.compareTo(str3));

        System.out.println("\nEquals comparison results:");
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str1.equals(str4): " + str1.equals(str4));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1 == str4: " + (str1 == str4));
    }

    public static void wrapperPractice() {
        // Exercise 1: Autoboxing and Unboxing
        Integer wrap = 100;  // autoboxing
        int primitive = wrap;  // unboxing

        System.out.println("Wrapped value: " + wrap);
        System.out.println("Primitive value: " + primitive);

        // Exercise 2: Wrapper Immutability
        Integer num = 5;
        Integer num2 = num;
        System.out.println("\nOriginal Integer: " + num);

        // This creates a new Integer object
        num++;  // unbox, increment, autobox
        System.out.println("After increment: num: " + num + " num2: " + num2);

        // Exercise 3: Wrapper Object Pool (-128 to 127)
        Integer int1 = 127;
        Integer int2 = 127;
        Integer int3 = 128;
        Integer int4 = 128;

        System.out.println("\nWrapper Object Pool Testing:");
        System.out.println("127 == 127: " + (int1 == int2));    // true (uses pool)
        System.out.println("128 == 128: " + (int3 == int4));    // false (outside pool)
        System.out.println("128 equals 128: " + int3.equals(int4)); // true

        // Exercise 4: Mixed Operations
        Integer wrapNum = 50;
        int primNum = 50;
        System.out.println("\nMixed operations:");
        System.out.println(wrapNum + primNum);  // auto-unboxing occurs
        System.out.println(wrapNum.compareTo(primNum));  // auto-boxing occurs
    }

    public static void exercises() {
        // Exercise 1: String Method Chaining
        String sentence = "Java Programming";
        String processed = sentence
                                  .toLowerCase()
                                  .substring(5)
                                  .concat(" is fun");

        System.out.println("Original: '" + sentence + "'");
        System.out.println("Processed: '" + processed + "'");

        // Exercise 2: Find all occurrences of a character
        String text = "Mississippi";
        char vowel = 'i';
        int index = text.indexOf(vowel);

        System.out.println("\nFinding the first occurrence of '" + vowel + "' in " + text);
        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Character not found.");
        }
    }

    public static void additionalTasks() {
        System.out.println("\n=== Wrapper Class Additional Tasks ===\n");

        valueVsNew();
        parsing();

        System.out.println("\n=== String Method Additional Tasks ===\n");

        System.out.println("Vowel count in 'Mississippi': " + countVowels("Mississippi"));
        System.out.println("Reversed string 'Programming': " + reverseString("Programming"));
        System.out.println("Longest common prefix of 'program' and 'progress': " + longestCommonPrefix("program", "progress"));
    }

    // Wrapper Task: Demonstrate valueOf() vs new Integer()
    public static void valueVsNew() {
        Integer value1 = Integer.valueOf(100);
        Integer value2 = Integer.valueOf(100);
        Integer newInt1 = new Integer(100);
        Integer newInt2 = new Integer(100);

        System.out.println("Using valueOf:");
        System.out.println("value1 == value2: " + (value1 == value2)); // true, due to caching
        System.out.println("Using new Integer:");
        System.out.println("newInt1 == newInt2: " + (newInt1 == newInt2)); // false, different objects
    }

    // Wrapper Task: Demonstrate parsing
    public static void parsing() {
        String number = "45.6";
        double parsedValue = Double.parseDouble(number);

        System.out.println("Parsed double value from '45.6': " + parsedValue);
    }

    // String Task: Count all vowels in a string
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    // String Task: Reverse a string using substring()
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.substring(i, i + 1);
        }
        return reversed;
    }

    // String Task: Find longest common prefix of two strings
    public static String longestCommonPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        int i = 0;
        while (i < minLength && str1.charAt(i) == str2.charAt(i)) {
            i++;
        }
        return str1.substring(0, i);
    }

    // Advanced Exercise: TextStats
    public static TextStats analyzeText(String text) {
        int wordCount = text.split("\\s+").length;
        int charCount = text.replace(" ", "").length();
        int sentenceCount = text.split("[.!?]").length;

        // Finding the most frequent character
        char mostFreqChar = ' ';
        int maxCharFreq = 0;
        int[] freqArray = new int[256];
        for (char c : text.toCharArray()) {
            if (c != ' ') {
                freqArray[c]++;
                if (freqArray[c] > maxCharFreq) {
                    maxCharFreq = freqArray[c];
                    mostFreqChar = c;
                }
            }
        }

        // Finding the most frequent word
        String[] words = text.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");
        String mostFreqWord = "";
        int maxWordFreq = 0;
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            int count = wordCountMap.getOrDefault(word, 0) + 1;
            wordCountMap.put(word, count);
            if (count > maxWordFreq) {
                maxWordFreq = count;
                mostFreqWord = word;
            }
        }

        return new TextStats(wordCount, charCount, sentenceCount, mostFreqChar, mostFreqWord, text);
    }
}

// Supporting TextStats class for analysis
class TextStats {
    int wordCount;
    int charCount;
    int sentenceCount;
    char mostFrequentChar;
    String mostFrequentWord;
    String text;

    public TextStats(int wordCount, int charCount, int sentenceCount, char mostFrequentChar, String mostFrequentWord, String text) {
        this.wordCount = wordCount;
        this.charCount = charCount;
        this.sentenceCount = sentenceCount;
        this.mostFrequentChar = mostFrequentChar;
        this.mostFrequentWord = mostFrequentWord;
        this.text = text;
    }

    @Override
    public String toString() {
        return "TextStats{" +
                "wordCount=" + wordCount +
                ", charCount=" + charCount +
                ", sentenceCount=" + sentenceCount +
                ", mostFrequentChar=" + mostFrequentChar +
                ", mostFrequentWord='" + mostFrequentWord + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}

