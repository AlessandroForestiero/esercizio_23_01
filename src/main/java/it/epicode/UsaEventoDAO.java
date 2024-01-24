package it.epicode;

import it.epicode.dao.EventoDAO;
import it.epicode.dao.LocationDAO;
import it.epicode.dao.PartecipazioneDAO;
import it.epicode.dao.PersonaDAO;
import it.epicode.entities.*;
import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;
import java.util.List;

public class UsaEventoDAO {
    public static void main(String[] args) {
        EventoDAO eventoDAO = new EventoDAO();
        PersonaDAO personaDAO = new PersonaDAO();
        PartecipazioneDAO partecipazioneDAO = new PartecipazioneDAO();
        LocationDAO locationDAO = new LocationDAO();
        Persona persona= new Persona(1,"antonio","rossi","rgrr@fgdfgf.it",LocalDate.of(1900,12,12));

        personaDAO.save(persona);
        Location location=new Location();
        location.setCittà("Roma");
        locationDAO.save(location);
        Evento evento = new Evento(1,"concerto capodanno",LocalDate.of(2023,11,12),"concerto di capodanno",TipoEvento.PRIVATO,90);
        evento.setLocation(location);
        eventoDAO.save(evento);

        Partecipazione partecipazione=new Partecipazione(1,persona,evento,Stato.CONFERMATA);
        partecipazioneDAO.save(partecipazione);

    }
}
