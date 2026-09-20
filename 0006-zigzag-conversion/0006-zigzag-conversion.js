/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function(s, numRows) {
    if (numRows === 1 || numRows >= s.length) return s;

    let rows = Array.from({ length: numRows }, () => "");
    let currRow = 0;
    let direction = -1;

    for (let ch of s) {
        rows[currRow] += ch;

        if (currRow === 0 || currRow === numRows - 1) {
            direction *= -1;
        }

        currRow += direction;
    }

    return rows.join("");
};