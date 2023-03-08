/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ITicket.controller;

import ITicket.entity.Artista;
import ITicket.entity.Evento;
import ITicket.service.IArtistaService;
import ITicket.service.IEventoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



/**
 *
 * @author User
 */
@Controller
public class EventoController {

    @Autowired
    private IEventoService eventoService;

    @Autowired
    private IArtistaService artistaService;

    @GetMapping("/evento")
    public String index(Model model) {
        List<Evento> listaevento = eventoService.getAllEvento();
        model.addAttribute("titulo","Tabla Evento");
        model.addAttribute("evento",listaevento);
        return "evento";
    }
    
    @GetMapping("/eventoN")
    public String crearEvento(Model model) {
        List<Artista> listaartistas = artistaService.buscartodos();
        model.addAttribute("evento", new Evento());
        model.addAttribute("artistas",listaartistas);
        return "crear";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarEvento(@PathVariable("id") Long idEvento) {
        eventoService.delete(idEvento);
        return "redirect:/evento";
    }

    @PostMapping("/save")
    public String guardarEvento(@ModelAttribute Evento evento) {
        eventoService.saveEvento(evento);
        return "redirect:/evento";
    }
    
    @GetMapping("/editEvento/{id}")
    public String editarEvento(@PathVariable("id") Long idEvento, Model model) {
        Evento evento = eventoService.getEventoById(idEvento);
        List<Artista> listaartistas = artistaService.buscartodos();
        model.addAttribute("evento", evento);
        model.addAttribute("artistas", listaartistas);
        return "crear";
    }
}
