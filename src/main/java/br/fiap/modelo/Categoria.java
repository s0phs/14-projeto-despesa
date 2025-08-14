package br.fiap.modelo;

public class Categoria {
    private Long id;
    private String categoria;

    public Categoria(Long id, String categoria) {
        this.categoria = categoria;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
