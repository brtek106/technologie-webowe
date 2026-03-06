function showFirstNews() {
    let newsList = document.getElementById("news-list");
    console.log(newsList.getElementsByTagName("li")[0].innerHTML);
}

function showSportNews() {
    let sportNews = document.querySelectorAll("ul#sport-news > li");
    sportNews.forEach(element => console.log(element.innerHTML));
}

showFirstNews();
showSportNews();