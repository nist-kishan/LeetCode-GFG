/**
 * @param {string} digits
 * @return {string[]}
 */
var letterCombinations = function(digits) {
    if (!digits.length) return [];

    const map = {
        2: "abc",
        3: "def",
        4: "ghi",
        5: "jkl",
        6: "mno",
        7: "pqrs",
        8: "tuv",
        9: "wxyz"
    };

    const res = [];

    function backtrack(index, curr) {
        if (index === digits.length) {
            res.push(curr);
            return;
        }

        for (const ch of map[digits[index]]) {
            backtrack(index + 1, curr + ch);
        }
    }

    backtrack(0, "");
    return res;
};