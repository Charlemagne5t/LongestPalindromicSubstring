import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void longestPalindromeTest1(){
        String s = "babad";
        String expected =  "bab";
        String actual = new Solution().longestPalindrome(s);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void longestPalindromeTest2(){
        String s = "cbbd";
        String expected =  "bb";
        String actual = new Solution().longestPalindrome(s);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void longestPalindromeTest3(){
        String s = "babad";
        String expected =  "bab";
        String actual = new Solution().longestPalindrome(s);

        Assert.assertEquals(expected, actual);
    }
}
