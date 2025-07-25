export class Author {
    constructor(id, name, birthYear, genre) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.genre = genre;
    }
    showDetails() {
        return `Id: ${this.id} - Nom : ${this.name} - Date de naissance : ${this.birthYear} - Genre : ${this.genre}`;
    }
}
