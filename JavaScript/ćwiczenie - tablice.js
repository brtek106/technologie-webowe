let tab1 = [1, 2, 6, 8];
let tab2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let tab3 = [10, 5, 15, 20, 3, 8];
let tab4 = [5, 10, 15];
let separator = 1;

function howManyNumbersIncludes(tab1, tab2) {
    let counter = 0;

    for (number of tab2) {
        if (tab1.includes(number)) {
            counter++;
        }
    }
    console.log(counter);
}

function minAndMaxValue(tab) {
    let min = tab[0];
    let max = tab[0];
    for (number of tab) {
        if (number < min) {
            min = number;
        }
        if (number > max) {
            max = number;
        }
    }
    return[min,max];
}

function separatorAndTab(tab, numberSeparator) {
    let result = [];
    for (number of tab) {
        result.push(number);
        result.push(numberSeparator);
    }
    return result;
}

howManyNumbersIncludes(tab1, tab2);
console.log(minAndMaxValue(tab3));
console.log(separatorAndTab(tab4, separator));