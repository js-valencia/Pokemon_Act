public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu(){
    }

    public Pikachu(int num_pokedex, String nombrePokemon, int pesoPokemon, String sexo, String tipo, int temporadaQueAparece) {
        super(num_pokedex, nombrePokemon, pesoPokemon, sexo, tipo, temporadaQueAparece);
    }

    public void infoPokemon() {
        System.out.println("Número de pokedex: " + num_pokedex);
        System.out.println("Nombre del pokemon: " + nombrePokemon);
        System.out.println("Peso del pokemon: " + pesoPokemon);
        System.out.println("Sexo del pokemon: " + sexo);
        System.out.println("Tipo del pokemon: " + tipo);
        System.out.println("Temporada que aparece: " + temporadaQueAparece);
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Pikachu y estoy atacando con Placaje");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Soy Pikachu y estoy atacando con Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Pikachu y estoy atacando con Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy Pikachu y estoy atacando con Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {   
        System.out.println("Soy Pikachu y estoy atacando con Puño Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy Pikachu y estoy atacando con Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy Pikachu y estoy atacando con Rayo Carga");
    }

}
