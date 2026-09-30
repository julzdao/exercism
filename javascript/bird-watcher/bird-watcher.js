// @ts-check
//
// The line above enables type checking for this file. Various IDEs interpret
// the @ts-check directive. It will give you helpful autocompletion when
// implementing this exercise.

/**
 * Calculates the total bird count.
 *
 * @param {number[]} birdsPerDay
 * @returns {number} total bird count
 */
export const totalBirdCount = (birdsPerDay) => {
  let count = 0;
  for (let i = 0; i < birdsPerDay.length; i++) {
    count += birdsPerDay[i];
  }
  return count;
}

/**
 * Calculates the total number of birds seen in a specific week.
 *
 * @param {number[]} birdsPerDay
 * @param {number} week
 * @returns {number} birds counted in the given week
 */
// export function birdsInWeek(birdsPerDay, week) {
//   let totalNumberOfDays = birdsPerDay.length;
//   let birdsPerWeekArr = [];
//   for (let i = 0; i < (totalNumberOfDays / 7) + 1; i ++) {
//     birdsPerWeekArr.push(birdsPerDay.splice(0, 7));
//   }

//   let selectedWeek = birdsPerWeekArr[week - 1];
//   return selectedWeek.reduce((sum, current) => sum + current, 0);
// }
export function birdsInWeek(birdsPerDay, week) {
  let selectedWeekIndex = (week * 7) - 7;
  let count = 0;
  for (let i = 0; i < 7; i++) {
    count += birdsPerDay[selectedWeekIndex + i];
  }
  return count;
}

/**
 * Fixes the counting mistake by increasing the bird count
 * by one for every second day.
 *
 * @param {number[]} birdsPerDay
 * @returns {number[]} corrected bird count data
 */
export function fixBirdCountLog(birdsPerDay) {
  for (let i = 0; i < birdsPerDay.length; i++) {
    if (i % 2 == 0) {
      birdsPerDay[i] = birdsPerDay[i] + 1;
    }
  }
  return birdsPerDay;

}
