import { Author } from "./author.js";


document.addEventListener('DOMContentLoaded', () => {
const form = document.querySelector("#authorForm");
const body = document.querySelector("#body");





form.addEventListener("submit", (e) => {
    e.preventDefault();
    const nom = form.elements["name"].value;
    const birthDate = parseInt(form.elements["birthDate"].value);
    const genre = form.elements["genre"].value;
    const author1 = new Author(1, nom, birthDate, genre);

const showDetails = author1.showDetails();
const details = document.createElement('p');
details.textContent = `${showDetails}`;
body.appendChild(details);
console.log(author1.showDetails());

});
});