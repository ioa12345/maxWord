import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LongestWordUtilTest {

    private LongestWordUtil longestWordUtil = new LongestWordUtil();

    @Test
    public void longestWord1ClassicSentence() throws InvalidInputException {
        String result = longestWordUtil.longestWord2("The cow jumped over the moon.");
        assertThat(result, is("jumped"));
    }

    @Test
    public void longestWord1EdgeCase1_oneWord() throws InvalidInputException {
        String result = longestWordUtil.longestWord2("Hi!");
        assertThat(result, is("Hi"));
    }

    @Test
    public void longestWord1EdgeCase2_excludesPunctuation() throws InvalidInputException {
        String result = longestWordUtil.longestWord2("Hi,, AAA");
        assertThat(result, is("AAA"));
    }

    @Test
    public void longestWord1InvalidInput()  {
        assertThrows(InvalidInputException.class, () -> longestWordUtil.longestWord2(null));
    }

    @Test
    public void longestWord1InvalidInput2()  {
        assertThrows(InvalidInputException.class, () -> longestWordUtil.longestWord2("!."));
    }

    @Test
    public void classicSentence() throws InvalidInputException {
        String result = longestWordUtil.longestWord1("The cow jumped over the moon.");
        assertThat(result, is("jumped"));
    }

    @Test
    public void edgeCase1_oneWord() throws InvalidInputException {
        String result = longestWordUtil.longestWord1("Hi!");
        assertThat(result, is("Hi"));
    }

    @Test
    public void edgeCase2_excludesPunctuation() throws InvalidInputException {
        String result = longestWordUtil.longestWord1("Hi,, AAA");
        assertThat(result, is("AAA"));
    }

    @Test
    public void edgeCase3_excludesPunctuation() throws InvalidInputException {
        String result = longestWordUtil.longestWord1("Hi,,????????? !!!!!!!???????,,,,,,,, AAA");
        assertThat(result, is("AAA"));
    }

    @Test
    public void invalidInput()  {
        assertThrows(InvalidInputException.class, () -> longestWordUtil.longestWord1(null));
    }

    @Test
    public void invalidInput2()  {
        assertThrows(InvalidInputException.class, () -> longestWordUtil.longestWord1("!."));
    }
}