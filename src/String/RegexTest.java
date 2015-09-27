package String;

/**
 * Created by ZHUKE on 2015/9/27.
 */
public class RegexTest {
    public static void main(String[] args) {
        String[] strs = RegexTest.mySplit("when  you have found the shrubbery, you must");
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }

    /**
     * 检查是否以大写字母开头，句号结尾
     *
     * @param str
     * @return
     */
    public static boolean isA(String str) {
        String regex = "[A-Z].*。";
        return str.matches(regex);
    }

    public static String[] mySplit(String str) {
        return str.split("");
    }
}
