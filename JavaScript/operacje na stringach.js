let str1 = "To jest napis";
let str2 = 'To jest napis';
let str3 = `To jest napis`;

let str4 = "To jest \"cytat\" sławnego człowieka";
let str5 = 'To jest \'cytat\' sławnego człowieka';

let name = "Piotr";
let age = 33;

let intro = `${name} za rok będzie miał ${age + 1} lata`;
console.log(intro);

let sqlQuery = `
    SELECT * FROM
        employees
    WHERE
        gender = 'M' AND hire_date >= '1990-01-01'
    ORDER BY
        hire_date
        LIMIT
    10
`;

let str = new String("This works!")

console.log(typeof "example"); // string
console.log(typeof new String("example")); // object

// charAt(number)
let str6 = "Ala ma kota";
console.log(str6.charAt(2));

// concat(string)
let str7 = "Ala".concat(" ma ").concat("kota")
console.log(str7);

// includes(string)
let str8 = "Ala ma kota";
if (str8.includes("kot")) {
    console.log("Napis zawiera słowo kot")
}

// endsWith(string)
let str9 = "Ala ma kota";
if (str9.endsWith("kota")) {
    console.log("Zdanie kończy się słowem \"kota\"");
}

// indexOf(string)
let str10 = "Ala ma kota";
console.log(str10.indexOf("ma"));

// lastIndexOf(string)
let str11 = "Ala ma kota, a kot ma Alę";
console.log(str11.lastIndexOf("kot"));

// repeat(number)
let str12 = "Witam ".repeat(5);
console.log(str12);

// replace (string, string)
let str13 = "Ala ma kota";
str13 = str13.replaceAll("kota", "psa");
console.log(str13);

// slice(number, number)
let str14 = "Ala ma kota";
str14 = str14.slice(4, 6);
console.log(str14);

// split(string)
let str15 = "Ala ma kota";
console.log(str15.split(" "))

// startsWith(string)
let str16 = "Ala ma kota";
if (str16.startsWith("Ala")) {
    console.log("Zdanie rozpoczyna się od Ala")
}

// substring (startIndex, endIndex)
let str17 = "Ala ma kota";
console.log(str17.substring(0, 3));

// trim() / trimStart() / trimEnd()
let str18 = "             Ala ma kota                ";
console.log(str18.trim())
console.log(str18.trimStart());
console.log(str18.trimEnd());

//toLowerCase() / toUpperCase()
let str19 = "Ala ma kota";
console.log(str19.toLowerCase());
console.log(str19.toUpperCase());