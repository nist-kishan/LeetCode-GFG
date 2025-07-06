import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution {
    public boolean isNumber(String s) {
        String regex = "^[+-]?((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?\\d+)?$";

        return Pattern.matches(regex, s.trim());
    }
}