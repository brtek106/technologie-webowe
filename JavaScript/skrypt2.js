function changeHeadings() {
    let news = document.getElementById("news");
    news.innerHTML = "Wesołe newsy";

    let sport = document.getElementById("sport");
    sport.innerHTML = "Sportowe świry";
}

function addDynamicClassToH2() {
    let h2Elements = document.getElementsByTagName("h2");
    for (let i = 0; i < h2Elements.length; i++) {
        const element = h2Elements[i];
        element.classList.add("dynamic");
    }
}

function addDynamicClassToBullets() {
    let secondBullets = document.querySelectorAll("ul > li:nth-child(2)");
    const addDynamicClass = element => element.classList.add("dynamic");
    secondBullets.forEach(addDynamicClass);
}

function addSportNews() {
    let newsList = document.querySelector("#sport-news");
    let li = document.createElement("li");
    let text = document.createTextNode("Niemcy ponownie mistrzami Świata w piłce nożnej");
    li.appendChild(text);
    newsList.appendChild(li);
}

function removeSecondNews() {
    let news = document.querySelector("#news-list > li:nth-child(2)");
    news.remove();
}


setTimeout(changeHeadings, 3000);
addDynamicClassToH2();
addDynamicClassToBullets();
addSportNews();
removeSecondNews();