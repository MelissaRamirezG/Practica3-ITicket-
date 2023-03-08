/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ITicket.service;

import ITicket.entity.Evento;
import java.util.List;

/**
 *
 * @author User
 */
public interface IEventoService {
    public List<Evento> getAllEvento();
    public Evento getEventoById(long id);
    public void saveEvento(Evento evento);
    public void delete(long id);
}
