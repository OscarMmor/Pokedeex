
package DatosPokemon;

public class Pokemones {
    
    private String id;
    private String nombre;
    private String tipo;
    private String habilidad;
    private String habilidad2; 
    private String naturaleza; 
    private String genero;     
    private double peso;

    public Pokemones(String id, String nombre, String tipo, String habilidad, String habilidad2, String naturaleza, String genero, double peso) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.habilidad = habilidad;
        this.habilidad2 = habilidad2;
        this.naturaleza = naturaleza;
        this.genero = genero;
        this.peso = peso;
    }

    public Pokemones() {
    }

   
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public String getHabilidad2() {
        return habilidad2;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public String getGenero() {
        return genero;
    }

    public double getPeso() {
        return peso;
    }

   
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public void setHabilidad2(String habilidad2) {
        this.habilidad2 = habilidad2;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
   
    

