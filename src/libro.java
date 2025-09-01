public class libro extends publicacion {
    private int numPaginas;

    public libro() {
        super();
    }

    public libro(String titulo, String autor, int numPaginas) {
        super(titulo, autor);
        this.numPaginas = numPaginas;
    }

    @Override
    public void mostrarFicha() {
        super.mostrarFicha();
        System.out.println("Número de Páginas: " + numPaginas);
    }

}
