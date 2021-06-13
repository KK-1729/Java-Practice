public class number_of_vowels {
    public static void main(String[] args) {
        String input = "Hello there, this is Karthik!!";
        input = input.toLowerCase();
        int vowels = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' 
               || input.charAt(i) == 'o' ||input.charAt(i) == 'u') {
                   vowels += 1;
               }
        }
        System.out.println("Number of vowels in the string are : " + vowels);
    }
}
