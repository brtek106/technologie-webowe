function isLeap(year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
}

function getYearType(year) {
    return isLeap(year) ? "Przestępny" : "Nieprzestępny";
}

function printInfo(year) {
    console.log(year + " jest " + getYearType(year));
}

printInfo(2016);