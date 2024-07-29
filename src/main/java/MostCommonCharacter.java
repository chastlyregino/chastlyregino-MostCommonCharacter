import java.util.*;
import java.util.Map.Entry;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        char mostCommonChar = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        char[] charArray = str.toCharArray(); // converting string into char[]

        for ( char letter : charArray ) { // to count the occurrances of the character in a string
            Integer value = charMap.get(letter);

            if ( value == null )
                charMap.put(letter, 1);
 
            else {

                charMap.put(letter, value + 1);
            }
        }

        int maxValueInMap = (Collections.max(charMap.values())); //getting the largest value available in the map

        for( Entry<Character, Integer> setPair : charMap.entrySet() ) { // looping through the map to get the key pair of the value
            if( setPair.getValue() == maxValueInMap ) {
                mostCommonChar = setPair.getKey();
            }
        }

        return mostCommonChar;
    }
}
