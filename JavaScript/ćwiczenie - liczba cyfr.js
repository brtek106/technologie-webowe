function getNumberOfDigits(number) {
    let digits = 1;
    while (number / 10 >= 1) {
        digits++;
        number /= 10;
    }
    return digits;
}

console.log("Liczba cyfr w liczbie 1 to " + getNumberOfDigits(1));
console.log("Liczba cyfr w liczbie 12 to " + getNumberOfDigits(12));
console.log("Liczba cyfr w liczbie 123 to " + getNumberOfDigits(123));
console.log("Liczba cyfr w liczbie 1234 to " + getNumberOfDigits(1234));