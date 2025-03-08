package com.uniajc;

public class Libro {

    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;
    private String genero;
    

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numEjemplares = 0;
        this.numEjemplaresPrestados = 0;
        this.genero = "";

    }

    public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = numEjemplaresPrestados;
        this.genero = genero;
    }

   
    public String getTitulo() {
        return titulo;
    }
    
    public String getGenero(){
        return genero;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    public boolean prestamo() {
        if (numEjemplares - numEjemplaresPrestados > 0) {
            numEjemplaresPrestados++;
            return true;
        }
        return false;
    }

    public boolean devolucion() {
        if (numEjemplaresPrestados > 0) {
            numEjemplaresPrestados--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + "  Autor: " + autor
                + "  Ejemplares: " + numEjemplares
                + "  Prestados: " + numEjemplaresPrestados + "Genero: " + genero;

    }

}
