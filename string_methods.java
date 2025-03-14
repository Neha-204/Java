public class string_methods{
    public static void main(String[] args) {
        
        // Initialize a string
        String str = "   Hello, Java World!   ";
        
        // 1. length() - Returns the length of the string
        System.out.println("Length of string: " + str.length());

        // 2. charAt() - Returns the character at the specified index
        System.out.println("Character at index 7: " + str.charAt(7));
        
        // 3. substring() - Returns a substring from the string
        System.out.println("Substring from index 7 to 11: " + str.substring(7, 11));
        
        // 4. toUpperCase() - Converts the string to uppercase
        System.out.println("String in uppercase: " + str.toUpperCase());
        
        // 5. toLowerCase() - Converts the string to lowercase
        System.out.println("String in lowercase: " + str.toLowerCase());
        
        // 6. trim() - Removes leading and trailing spaces
        System.out.println("Trimmed string: '" + str.trim() + "'");

        // 7. contains() - Checks if the string contains a specific sequence of characters
        System.out.println("Does the string contain 'Java'? " + str.contains("Java"));

        // 8. equals() - Compares two strings for equality
        String str2 = "Hello, Java World!";
        System.out.println("Is the string equal to 'Hello, Java World!'? " + str.equals(str2));
        
        // 9. replace() - Replaces all occurrences of a substring with a new substring
        System.out.println("Replaced 'Java' with 'Programming': " + str.replace("Java", "Programming"));

        // 10. split() - Splits the string into an array based on a delimiter
        String[] words = str.split(" ");
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

