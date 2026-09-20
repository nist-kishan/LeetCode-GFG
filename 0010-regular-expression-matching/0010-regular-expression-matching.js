/**
 * @param {string} s
 * @param {string} p
 * @return {boolean}
 */
var isMatch = function(s, p) {
    const memo = new Map();

    function dp(i, j) {
        const key = `${i},${j}`;
        if (memo.has(key)) return memo.get(key);

        if (j === p.length) {
            return i === s.length;
        }

        const firstMatch =
            i < s.length &&
            (s[i] === p[j] || p[j] === '.');

        let ans;

        if (j + 1 < p.length && p[j + 1] === '*') {
            ans =
                dp(i, j + 2) ||
                (firstMatch && dp(i + 1, j));
        } else {
            ans =
                firstMatch &&
                dp(i + 1, j + 1);
        }

        memo.set(key, ans);
        return ans;
    }

    return dp(0, 0);
};