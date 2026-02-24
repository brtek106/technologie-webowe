// Instrukcje sterujące

let number = 5;

if (number) {
    console.log("Liczba jest różna od 0");
} else {
    console.log("Liczba to 0")
}

let value = 5.5;

switch (value) {
    case 5:
        console.log("Liczba 5");
        break;
    case 5.5:
        console.log("Liczba 5.5");
        break;
    default:
        console.log("Nieznana wartość");
}

//Pętle

for (let i = 0; i < 3; i++) {
    console.log("Liczba for" + i);
}

let counter = 0;

while (counter < 3) {
    console.log("Liczba while " + counter);
    counter++;
}

counter = 0;

do {
    console.log("Liczba do while " + counter);
    counter++;
} while (counter < 5);

let count = 5;

while (count) {
    console.log("Liczba count " + count);
    count--;
}

let i = 1;

while (true) {
    console.log(i);
    if (i === 3) {
        break;
    }
    i++;
}