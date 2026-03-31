public class Squirtle extends Pokemon implements IAgua {
    
    public Squirtle() {
        this.num_pokedex = 7;
        this.nombrePokemon = "Squirtle";
        this.pesoPokemon = 9;
        this.sexo = "Masculino o Femenino";
        this.tipo = "Agua";
        this.temporadaQueAparece = 1;
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle ataca con Hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle ataca con Pistola Agua");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Squirtle ataca con Hidropulso");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle ataca con Burbuja");
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Squirtle y estoy atacando con Placaje");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Soy Squirtle y estoy atacando con Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Squirtle y estoy atacando con Mordisco");
    }
    
}
