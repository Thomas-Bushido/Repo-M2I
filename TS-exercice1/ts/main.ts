import {Author} from "./author.js";

const body = document.getElementById("body")
const author1 = new Author(1, "James Moriarty", "15-05-1915", "SF");

const showDetails = author1.showDetails();

const details = document.createElement('p')
details.textContent = `${showDetails}`;
body.appendChild(details)
console.log(author1.showDetails());

