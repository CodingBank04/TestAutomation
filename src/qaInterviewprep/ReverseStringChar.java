package qaInterviewprep;

public class ReverseStringChar {
    public static void main(String[] args) {
        String input = " QA Automation Bootcam;";

        char[] newinput = input.toCharArray();

        for (int i = newinput.length - 1; i >= 0; i--) {
            System.out.print(newinput[i]);
        }
    }
}