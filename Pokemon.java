public abstract class Pokemon {
    protected int num_pokedex;
    protected String nombrePokemon;
    protected int pesoPokemon;
    protected String sexo;
    protected String tipo;
    protected int temporadaQueAparece;

    public Pokemon(){
    }

    public Pokemon(int num_pokedex, String nombrePokemon, int pesoPokemon, String sexo, String tipo, int temporadaQueAparece) {
        this.num_pokedex = num_pokedex;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.sexo = sexo;
        this.tipo = tipo;
        this.temporadaQueAparece = temporadaQueAparece;
    }

    public abstract void atacarPlacaje();
    public abstract void atacarArañazo();
    public abstract void atacarMordisco();
}
