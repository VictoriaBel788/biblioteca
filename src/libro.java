public class libro extends publicacion {
    private int numPaginas;

    public libro() {
        super();
    }

    public libro(String titulo, String autor, int numPaginas) {
        super(titulo, autor);
        this.numPaginas = numPaginas;
    }
    
}
