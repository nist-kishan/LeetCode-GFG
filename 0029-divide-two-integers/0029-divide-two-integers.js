/**
 * @param {number} dividend
 * @param {number} divisor
 * @return {number}
 */
var divide = function(dividend, divisor) {
    const INT_MAX = 2147483647;
    const INT_MIN = -2147483648;

    if (dividend === INT_MIN && divisor === -1) {
        return INT_MAX;
    }

    let negatives = 2;

    if (dividend > 0) {
        dividend = -dividend;
        negatives--;
    }

    if (divisor > 0) {
        divisor = -divisor;
        negatives--;
    }

    let quotient = 0;

    while (dividend <= divisor) {
        let value = divisor;
        let power = -1;

        while (
            value >= (INT_MIN >> 1) &&
            dividend <= value + value
        ) {
            value += value;
            power += power;
        }

        dividend -= value;
        quotient += power;
    }

    return negatives === 1 ? quotient : -quotient;
};