import java.util.Arrays;

public class LongestWordUtil {


    public String longestWord1(String sentence) throws InvalidInputException {

        inputChecks(sentence);


        return Arrays.stream(sentence.split(" ")).
        flatMap(t -> Arrays.stream(t.split("[.!,?]")))
        .reduce((a, b) -> {
            if (a.length() > b.length()) {
                return a;
            } else {
                return b;
            }
        }).orElseThrow(() -> new InvalidInputException("Invalid Input"));


    }


    public String longestWord2(String sentence) throws InvalidInputException {

        inputChecks(sentence);

        int max = 0;
        String maxWord = "";
        String lastWord = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i) != ',' && sentence.charAt(i) != '.' && sentence.charAt(i) != '\t'
                    && sentence.charAt(i) != 0 && sentence.charAt(i) != ' ' && sentence.charAt(i) != '!' && sentence.charAt(i) != '?') {
                sb.append(sentence.charAt(i));

                if (i == sentence.length() - 1) {
                    lastWord = sb.toString();
                }
            } else {
                if (sb.length() > max) {
                    max = sb.length();
                    maxWord = sb.toString();
                }
                sb.setLength(0);

            }
        }
        if (maxWord.length() == 0 && lastWord.length() == 0) {
            throw new InvalidInputException("No letters in the sentence");
        }
        return (maxWord.length() > lastWord.length()) ? maxWord : lastWord;


    }

    private void inputChecks(String sentence) throws InvalidInputException {
        if (sentence == null) {
            throw new InvalidInputException("null input sentence");
        }
    }
}
