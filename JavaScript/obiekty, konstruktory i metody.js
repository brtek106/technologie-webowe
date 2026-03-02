// Inicjalizacja obiektu
let product1 = {
    name: "Czekolada",
    price: 2.5,
    category: ["Słodycze", "Przekąski"],
    producer: {
        name: "Nestle",
        address: "Warszawa"
    }
}

console.log(product1);

// Konstruktor
function Product(name, price, category) {
    this.name = name;
    this.price = price;
    this.category = category;
}

// Tworzenie obiektów z użyciem konstruktora
let prod1 = new Product("Mleko", 2.5, "Nabiał");
let prod2 = new Product("Czekolada", 3.0, "Słodycze");

console.log(prod1);
console.log(prod2);

// Metody
function Calc() {
    this.add = function(a, b) {
        return a + b;
    }
    this.multiply = function(a, b) {
        return a * b;
    }
}

let calc = new Calc();
let add = calc.add(10, 5);
console.log(add);

let multiply = calc.multiply(10, 5);
console.log(multiply);

// Rozszerzanie obiektów o kolejne pola i metody
let product = {
    name: "Czekolada",
    nettoPrice: 2.5,
}

product.quantity = 10;
product.producer = "Nestle";
product.bruttoPrice = function() {
    return this.nettoPrice * 1.23;
}

console.log(product);
console.log(product.bruttoPrice());

// Iterowanie po własnościach obiektu
for (key in product) {
    console.log(key + " :" + product[key]);
}