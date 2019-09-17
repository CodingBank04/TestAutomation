package qaInterviewprep;

public class ReverseString {
    public static void main(String[] args) {
        String input=" QA Automation BootCamp";
        StringBuilder newInput = new StringBuilder();

        newInput.append(input);
        System.out.println(newInput.reverse());
    }
}
