var longestPalindrome = function(s) {
    let start = 0, end = 0;

    const expand = (l, r) => {
        while (l >= 0 && r < s.length && s[l] === s[r]) {
            l--;
            r++;
        }
        return r - l - 1;
    };

    for (let i = 0; i < s.length; i++) {
        let len1 = expand(i, i);
        let len2 = expand(i, i + 1);
        let len = Math.max(len1, len2);

        if (len > end - start + 1) {
            start = i - Math.floor((len - 1) / 2);
            end = i + Math.floor(len / 2);
        }
    }

    return s.substring(start, end + 1);
};