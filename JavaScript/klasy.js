class Product {
    constructor(name, nettoPrice) {
        this.name = name;
        this.nettoPrice = nettoPrice;
    }

    // Metoda
    bruttoPrice() {
        return this.nettoPrice * 1.23;
    }
}

let prod1 = new Product("Mleko", 2.5);
console.log(prod1);
console.log(prod1.bruttoPrice());


class Player {
    constructor(nickname, points) {
        this.nickname = nickname;
        this._points = points;
    }

    get points() {
        return `${this._points} points`;
    }

    set points(value) {
        if (value >= 0) {
            this._points = value;
        } else {
            console.log("Liczba punktów musi być nieujemna!");
        }
    }

    get info() {
        return `${this.nickname} : ${this._points}`;
    }
}

let player1 = new Player("John", 22);
player1.points = -5;
console.log(player1.points);
console.log(player1.info);


class Calculator {
    static rectangleArea(rect) {
        return rect.a * rect.b;
    }
}

class Rectangle {
    constructor(a, b) {
        this.a = a;
        this.b = b;
    }
}

let rect1 = new Rectangle(5, 10);
let area = Calculator.rectangleArea(rect1);
console.log(`Pole prostokąta: ${area}`);


class Course {
    constructor(name, price) {
        this.name = name;
        this.price = price;
    }

    getInfo() {
        return `${this.name} - ${this.price}`;
    }
}

class OnlineCourse extends Course {
    constructor (name, price, videoLength) {
        super(name, price);
        this.videoLength = videoLength;
    }

    getInfo() {
        return super.getInfo() + ` długość w minutach: ${this.videoLength}`;
    }
}

let javaCourse = new OnlineCourse("Kurs Java", 199, 180);
console.log(javaCourse.getInfo());