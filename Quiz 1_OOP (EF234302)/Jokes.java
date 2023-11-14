public class Jokes {
    // String to store the joke
    private static String joke_string;
    // Function to determine if a joke is funny or not
    public static void is_funny() {
        if (joke_string.length() < 20) {
            System.out.println("It's funny");
        } else {
            System.out.println("It's not funny");
        }
    }
    // Function to get the first word of the joke
    public static void first_word() {
        // Splitting the joke_string by space and printing the first word
        String[] words = joke_string.split(" ");
        if (words.length > 0) {
            System.out.println(words[0]);
        } else {
            System.out.println("No words found");
        }
    }
    public static void main(String[] args) {
        // Testing the program with provided jokes
        joke_string = "Knock knock who's there?";
        is_funny();
        first_word();
        joke_string = "Your life";
        is_funny();
        first_word();
    }
}




