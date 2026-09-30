
const GIGASECOND = 1_000_000_000;

const secondsToMs = (num) => {
  return num * 1000;
}

export const gigasecond = (date) => {
  const DATE_IN_MS = date.getTime();
  return new Date(DATE_IN_MS + secondsToMs(GIGASECOND));
};
