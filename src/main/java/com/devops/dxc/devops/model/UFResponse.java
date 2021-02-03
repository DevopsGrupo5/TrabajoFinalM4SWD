package com.devops.dxc.devops.model;

import java.util.ArrayList;

public class UFResponse<T> {
    String version;
    String autor;
    String codigo;
    String nombre;
    String unidad_medida;
    ArrayList<SerieResponse> serie = new ArrayList<SerieResponse>();

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the unidad_medida
     */
    public String getUnidad_medida() {
        return unidad_medida;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @return the serie
     */
    public ArrayList<SerieResponse> getSerie() {
        return serie;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param unidad_medida the unidad_medida to set
     */
    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(ArrayList<SerieResponse> serie) {
        this.serie = serie;
    }
    // "version": "1.6.0",
    // "autor": "mindicador.cl",
    // "codigo": "uf",
    // "nombre": "Unidad de fomento (UF)",
    // "unidad_medida": "Pesos",
    // "serie": [
    // {
    // "fecha": "2021-02-02T03:00:00.000Z",
    // "valor": 29129.37
    // }
    // ]

}