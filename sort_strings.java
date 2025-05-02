import java.util.Arrays; 

public class sort_strings {  
    public static void main(String[] args) {  
        
        String[] strings = {"Apple", "Banana", "Cherry", "Mango", "Orange"};

        Arrays.sort(strings);

        System.out.println("Sorted Strings:");  
        for (String str : strings) {  
            System.out.println(str);  
        }
    }
}

