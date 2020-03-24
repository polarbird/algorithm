/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution002 {

    public String replaceSpace(StringBuffer str) {
        int size = str.length();
        char[] chars = new char[size];

        str.getChars(0, size, chars, 0);

        StringBuffer stringBuffer = new StringBuffer();

        for (char item : chars) {
            if (item==' ') {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(item);
            }
        }

        return stringBuffer.toString();
    }

}
