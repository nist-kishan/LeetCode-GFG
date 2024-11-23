class Solution {
    public int romanToInt(String s) {
        int roman=0,count=0,prev=0,current=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='M')
            current=1000;
            else if(s.charAt(i)=='D')
            current=500;
            else if(s.charAt(i)=='C')
            current=100;
            else if(s.charAt(i)=='L')
            current=50;
            else if(s.charAt(i)=='X')
            current=10;
            else if(s.charAt(i)=='V')
            current=5;
            else if(s.charAt(i)=='I')
            current=1;

            if (count < 3 && current == prev) {
                roman += current;
                count++;
            } else if (current > prev) {
                if (prev != 0)
                    roman += current - 2 * prev;
                else
                    roman += current;
                count = 0;
            } else if (current < prev) {
                roman += current;
                count = 0;
            } else {
                roman = -1;
            }
            prev = current;
        }
        return roman;
    }
}