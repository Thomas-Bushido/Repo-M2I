export class Livre {
    private id: number = 0
    private name: string
    private dateParution: string
    private genre: string

    constructor(id: number, name: string, dateParution: string, genre: string){
        this.id = id+=1;
        this.name = name 
        this.dateParution = dateParution
        this.genre = genre
    }

    showDetails(): string {
        return `Id: ${this.id} - Nom : ${this.name} - Date de parution : ${this.dateParution} - Genre : ${this.genre}`
    }

}