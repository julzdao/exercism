//
// This is only a SKELETON file for the 'Pascals Triangle' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const rows = rowNo => {
  if(!rowNo) return [];
  const pascalTriangle = [[1]]; 

  for (let y = 1; y < rowNo; y++) {
      const newRow = [...pascalTriangle[y - 1]].map((num, x) => x === 0 ? num : num + pascalTriangle[y - 1][x - 1]);
      newRow.push(1);
      pascalTriangle.push(newRow);
  };
  return pascalTriangle;
  
};