let numbers = [1, 2, 3];
let numbers2 = new Array(5);
let numbers3 = Array.of(1, 2, 3, 4, 5);

console.log(numbers);
console.log(numbers2);
console.log(numbers3);

let arrays = [1, "Ania", 5.5, [1, 2, 3]];

console.log(arrays);

let numbers4 = [10, 20, 30, 40, 50];
numbers4.push(60);
console.log(numbers4.shift()); // usunięcie pierwszego elementu w tablicy
console.log(numbers4.unshift(0)); // wstawianie pierwszego elementu do tablicy
console.log(numbers4.pop()); // usunięcie ostatniego elementu w tablicy
console.log(numbers4[numbers4.length - 1]);
console.log(numbers4.length);

//Pętla for do iterowania po tablicach
for (const number of numbers4) {
    console.log(number);
}

let word = "kot";
for (const letter of word) {
    console.log(letter);
}

let numbers5 = [10, 20, 30, 40, 50];
numbers5.reverse(); // odwrócenie kolejności elementów w tablicy
console.log(numbers5);

numbers5.sort(); // sortowanie elementów tablicy zgodnie z naturalnym porządkiem
console.log(numbers5);

let index = numbers5.indexOf(20); // zwracanie indeksu wyszukiwanego elementu tablicy
console.log("indexOf(20): " + index);

console.log("numbers5.join(|): " + numbers5.join("|")); // łączy elementy tablicy, przyjmuje opcjonalny parametr, który będzie separatorem

let tab2 = [100, 200, 300];
let bigTab = numbers5.concat(tab2); // łączenie tablic za pomocą metody concat();
console.log(bigTab);

let numbers6 = [5, 10, 150, 200, 150];
let isDividedBy5 = x => x % 5 === 0; // predykat sprawdzający podzielność liczb przez 5
let firstBiggerThan100 = x => x > 100; // predykat sprawdzający czy liczba jest większa od 100

console.log(numbers6.every(isDividedBy5)); // metoda every(); sprawdza zadany predykat dla każdego elementu tablicy
console.log(numbers6.find(firstBiggerThan100)); // metoda find(); wyszukuje pierwszy element, który spełnia zadany predykat
console.log(numbers6.findIndex(firstBiggerThan100));// metoda findIndex(); zwraca indeks pierwszego elementu, który spełnia zadany predykat
console.log(numbers6.some(firstBiggerThan100)); // metoda some(); sprawdza czy zadany predykat jest spełniony dla conajmniej jednego elementu

console.log(numbers6.includes(10)); // metoda includes(); sprawdza czy zadany element znajduje się w tablicy i zwraca true albo false
console.log(numbers6.includes(33));

console.log(numbers6.indexOf(150)); // metoda indexOf(); zwraca indeks pierwszego wystąpienia zadanego elementu
console.log(numbers6.indexOf(11)); // zwraca -1, ponieważ zadany element nie istnieje w tablicy
console.log(numbers6.lastIndexOf(150)); // metoda lastIndexOf(); zwraca indeks ostatniego wystąpienia elementu w tablicy