class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if (s.length() == 0) {
            return 0;
        }
        boolean isNegative = false,isPostive=false,isNumber=true;
        int i = 0;
        if ('-' == s.charAt(0)) {
            isNegative = true;
            i++;
        }
        else if ('+' == s.charAt(0)) {
            isPostive=true;
            i++;
        }
        String ans = "0";
        while (i < s.length()) {
            switch (s.charAt(i)) {
                case '0': ans+=s.charAt(i);
                    break;
                case '1': ans+=s.charAt(i);
                    break;
                case '2': ans+=s.charAt(i);
                    break;
                case '3': ans+=s.charAt(i);
                    break;
                case '4': ans+=s.charAt(i);
                    break;
                case '5': ans+=s.charAt(i);
                    break;
                case '6': ans+=s.charAt(i);
                    break;
                case '7': ans+=s.charAt(i);
                    break;
                case '8': ans+=s.charAt(i);
                    break;
                case '9': ans+=s.charAt(i);
                    break;

                default:
                isNumber=false;
                    break;
            }
            if(isNumber){
                i++;
            }
            else{
                try {
                    return isNegative ? 
                        (Long.parseLong(ans) < Integer.MIN_VALUE ? Integer.MIN_VALUE : -Integer.parseInt(ans)) :
                        (Long.parseLong(ans) > Integer.MAX_VALUE ? Integer.MAX_VALUE : Integer.parseInt(ans));
                } catch (NumberFormatException e) {
                    return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
            }
        }
        try {
            return isNegative ? 
                (Long.parseLong(ans) < Integer.MIN_VALUE ? Integer.MIN_VALUE : -Integer.parseInt(ans)) :
                (Long.parseLong(ans) > Integer.MAX_VALUE ? Integer.MAX_VALUE : Integer.parseInt(ans));
        } catch (NumberFormatException e) {
            return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

    }
}