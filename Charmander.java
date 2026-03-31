public class Charmander extends Pokemon implements IFuego {
    public Charmander(){
        this.num_pokedex = 4;
        this.nombrePokemon = "Charmander";
        this.pesoPokemon = 8;
        this.sexo = "Masculino";
        this.tipo = "Fuego";
        this.temporadaQueAparece = 1;
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander ataca con Lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander ataca con Ascuas");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander ataca con Puño Fuego");
    }
    
    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Charmander y estoy atacando con Placaje");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Soy Charmander y estoy atacando con Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Charmander y estoy atacando con Mordisco");
    }
}
