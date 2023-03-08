/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ITicket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;


/**
 *
 * @author User
 */
@Entity
@Table(name = "eventos")
public class Evento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String nombre_evento;
    private String costo_evento;
    private String fecha;
    private String capacidad_maxima;
    private String lugar;
    
    @ManyToOne
    @JoinColumn (name="artistas_id")
    private Artista artista;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre_evento() {
        return nombre_evento;
    }

    public void setNombre_evento(String nombre_evento) {
        this.nombre_evento = nombre_evento;
    }

    public String getCosto_evento() {
        return costo_evento;
    }

    public void setCosto_evento(String costo_evento) {
        this.costo_evento = costo_evento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCapacidad_maxima() {
        return capacidad_maxima;
    }

    public void setCapacidad_maxima(String capacidad_maxima) {
        this.capacidad_maxima = capacidad_maxima;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    }

    