export class Author {
    readonly id: number
    private name: string
    private birthYear: string
    private genre: string

    constructor(id: number, name: string, birthYear: string, genre: string){
        this.id = id
        this.name = name 
        this.birthYear = birthYear
        this.genre = genre
    }

    showDetails(): string {
        return `Id: ${this.id} - Nom : ${this.name} - Date de naissance : ${this.birthYear} - Genre : ${this.genre}`
    }

}