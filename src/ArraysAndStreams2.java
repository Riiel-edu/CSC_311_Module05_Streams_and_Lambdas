// Fig. 17.12: ArraysAndStreams2.java
// Demonstrating lambdas and streams with an array of Strings.
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStreams2 {
    public static void main(String[] args) {
        String[] strings =
                {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

        // display original strings
        System.out.printf("Original strings: %s%n", Arrays.asList(strings));

        // strings in uppercase
        System.out.printf("strings in uppercase: %s%n",
                Arrays.stream(strings)
                        .map(String::toUpperCase)
                        .collect(Collectors.toList()));

        // strings less than "n" (case insensitive) sorted ascending
        System.out.printf("strings less than n sorted ascending: %s%n",
                Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("n") < 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER)
                        .collect(Collectors.toList()));

        // strings less than "n" (case insensitive) sorted descending
        System.out.printf("strings less than n sorted descending: %s%n",
                Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("n") < 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                        .collect(Collectors.toList()));
        /*--------------------------- Lab Work ------------------------------*/

        // strings that start with a vowel
        System.out.printf("strings that start with vowels: %s%n",
                Arrays.stream(strings)
                        .filter(s -> (s.substring(0, 1).equalsIgnoreCase("a") || s.substring(0, 1).equalsIgnoreCase("e") || s.substring(0, 1).equalsIgnoreCase("i") || s.substring(0, 1).equalsIgnoreCase("o") || s.substring(0, 1).equalsIgnoreCase("u")))
                        .collect(Collectors.toList()));

        // strings concatenated as a single String separated by a comma
        System.out.printf("strings as a single String: %s%n",
                Arrays.stream(strings).reduce("", (s, s2) -> s.concat(s2 + ", ")));


        // count of the number of strings with more than 5 characters.
        System.out.printf("the amount of strings that are longer than 5 characters: %s%n",
                Arrays.stream(strings)
                        .filter(s -> s.length() > 5)
                        .count());
    }
}


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
