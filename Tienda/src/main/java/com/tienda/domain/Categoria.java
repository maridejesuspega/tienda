package com.tienda.domain;

import lombok.Data;
import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Categoria")

public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private long idCategoria;

    @OneToMany
    @JoinColumn(name = "id_categoria",insertable=false, updatable=false)
    List<Producto> productos;

    private String descripcion;
    @Column(name = "ruta_imagen")
    private String rutaImagen;
    private boolean activo;

    public Categoria() {

    }

    public Categoria(String descripcion, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
}
