// Konstruktor z metodą wewnątrz
function Person(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
}

function Student(fn, ln, id) {
    Person.call(this, fn, ln);
    this.id = id;
}

// Definiowanie prototypu
Person.prototype.fullName = function() {
    return this.firstName + " : " + this.lastName;
}

Student.prototype = Object.create(Person.prototype);

Student.prototype.fullInfo = function() {
    return this.firstName + " : " + this.lastName + " " + this.id;
}

let person1 = new Person("Jan", "Kowalski");
console.log(person1.fullName());

let student1 = new Student("Karol", "Zalewski", 12345);
console.log(student1.fullInfo());


Person.prototype.country = "Poland";

let p1 = new Person("Jan", "Kowalski");
let p2 = new Person("Jan", "Kowalski");

p1.country = "Germany";
p2.country = "France";

console.log(p1.fullName === p2.fullName);
console.log(p2.fullName() === p2.fullName());

console.log(p1.__proto__ === Person.prototype);
console.log(p1.country);
console.log(p1.__proto__.country)
console.log(p2.country);