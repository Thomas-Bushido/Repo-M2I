export class Livre {
    constructor(id, name, dateParution, genre) {
        this.id = 0;
        this.id = id += 1;
        this.name = name;
        this.dateParution = dateParution;
        this.genre = genre;
    }
    showDetails() {
        return `Id: ${this.id} - Nom : ${this.name} - Date de parution : ${this.dateParution} - Genre : ${this.genre}`;
    }
}
