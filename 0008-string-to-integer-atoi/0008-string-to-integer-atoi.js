/**
 * @param {string} s
 * @return {number}
 */
var myAtoi = function(s) {
    let i = 0;
    let sign = 1;
    let num = 0;

    while (i < s.length && s[i] === ' ') i++;

    if (s[i] === '+' || s[i] === '-') {
        sign = s[i] === '-' ? -1 : 1;
        i++;
    }

    while (i < s.length && s[i] >= '0' && s[i] <= '9') {
        num = num * 10 + (s[i] - '0');

        if (sign * num <= -(2 ** 31)) return -(2 ** 31);
        if (sign * num >= 2 ** 31 - 1) return 2 ** 31 - 1;

        i++;
    }

    return sign * num;
};