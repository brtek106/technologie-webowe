function autoLetters() {
    let h1 = document.getElementById("h1");
    let word = "Hello World";
    simulateTextMachine(h1, word);
}

function simulateTextMachine(element, text) {
    for (let i = 0; i < text.length; i++) {
        const letter = text.charAt(i);
        setTimeout(() => element.append(letter), (i + 1) * 200);
    }
}

autoLetters();