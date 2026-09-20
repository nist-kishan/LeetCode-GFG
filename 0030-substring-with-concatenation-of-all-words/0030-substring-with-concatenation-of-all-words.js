/**
 * @param {string} s
 * @param {string[]} words
 * @return {number[]}
 */
var findSubstring = function(s, words) {
    if (!s.length || !words.length) return [];

    const wordLen = words[0].length;
    const wordCount = words.length;
    const totalLen = wordLen * wordCount;

    const target = new Map();

    for (const word of words) {
        target.set(word, (target.get(word) || 0) + 1);
    }

    const res = [];

    for (let offset = 0; offset < wordLen; offset++) {
        let left = offset;
        let count = 0;
        let window = new Map();

        for (let right = offset; right + wordLen <= s.length; right += wordLen) {
            const word = s.substring(right, right + wordLen);

            if (target.has(word)) {
                window.set(word, (window.get(word) || 0) + 1);
                count++;

                while (window.get(word) > target.get(word)) {
                    const leftWord = s.substring(left, left + wordLen);

                    window.set(leftWord, window.get(leftWord) - 1);
                    left += wordLen;
                    count--;
                }

                if (count === wordCount) {
                    res.push(left);

                    const leftWord = s.substring(left, left + wordLen);
                    window.set(leftWord, window.get(leftWord) - 1);

                    left += wordLen;
                    count--;
                }
            } else {
                window.clear();
                count = 0;
                left = right + wordLen;
            }
        }
    }

    return res;
};