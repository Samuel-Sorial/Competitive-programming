// Solution to https://leetcode.com/problems/roman-to-integer/

const ROMAIN_TO_INT = { I: 1, V: 5, X: 10, L: 50, C: 100, D: 500, M: 1000 };

/**
 * @param {string} romanianString
 * @return {number}
 */
const romanToInt = function (romanianString) {
  let int = 0;
  const romanianArray = romanianString.split("");
  for (let i = 0; i < romanianArray.length; i++) {
    const intOfI = ROMAIN_TO_INT[romanianArray[i]];
    if (i === romanianArray.length - 1) {
      int += intOfI;
    } else if (intOfI < ROMAIN_TO_INT[romanianArray[i + 1]]) {
      int -= intOfI;
    } else {
      int += intOfI;
    }
  }
  return int;
};
