package it.epicode;

import it.epicode.dao.EventoDAO;
import it.epicode.entities.Evento;
import it.epicode.entities.TipoEvento;

import java.time.LocalDate;

public class UsaEventoDAO {
    public static void main(String[] args) {
        EventoDAO dao = new EventoDAO();
        Evento e = new Evento(0, "concerto", LocalDate.of(2024, 11, 11), "concerto musicale", TipoEvento.PUBBLICO, 1000);
        dao.save(e);
        //  dao.delete(1);
        Evento evento = new Evento();
        evento = dao.getById(3);
        System.out.println(evento);
    }
}
