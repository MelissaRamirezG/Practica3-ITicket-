/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ITicket.service;

import ITicket.entity.Artista;
import ITicket.repository.ArtistaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class ArtistaService implements IArtistaService {

    @Autowired
    private ArtistaRepository artistaRepository;

    @Override
    public List<Artista> buscartodos() {
        return (List<Artista>) artistaRepository.findAll();
    }
}
