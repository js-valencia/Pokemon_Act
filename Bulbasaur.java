public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
    }

    public Bulbasaur(int num_pokedex, String nombrePokemon, int pesoPokemon, String sexo, String tipo, int temporadaQueAparece) {
        super(num_pokedex, nombrePokemon, pesoPokemon, sexo, tipo, temporadaQueAparece);
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Bulbasaur y estoy atacando con Placaje");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Soy Bulbasaur y estoy atacando con Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Bulbasaur y estoy atacando con Mordisco");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy Bulbasaur y estoy atacando con Latigo Cepa");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy Bulbasaur y estoy atacando con Hoja Afilada");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasaur y estoy atacando con Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy Bulbasaur y estoy atacando con Paralizar");
    }

}
