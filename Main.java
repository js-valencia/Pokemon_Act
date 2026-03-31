public class Main {
    public static void main(String[] args) {

        Pikachu pikachu = new Pikachu();
        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();
        Squirtle squirtle = new Squirtle();

        pikachu.atacarArañazo();
        pikachu.atacarImpactrueno();
        bulbasaur.atacarArañazo();
        bulbasaur.atacarLatigoCepa();
        charmander.atacarArañazo();
        charmander.atacarLanzallamas();
        squirtle.atacarArañazo();
        squirtle.atacarPistolaAgua();
    }
}