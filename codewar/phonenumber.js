function createPhoneNumber(numbers) {
  let firstThree = numbers.slice(0, 3).join('');
  let secoundThree = numbers.slice(3, 6).join('');
  let lastFour = numbers.slice(6, 10).join('');
  let phoneNumber = `(${firstThree}) ${secoundThree}-${lastFour}`;
  return phoneNumber;
}
console.log(createPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]));
