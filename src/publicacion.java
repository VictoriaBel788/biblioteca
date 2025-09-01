public class publicacion {
    protected String titulo;
    protected String autor;

    public publicacion() {
       
    }

    public publicacion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}

