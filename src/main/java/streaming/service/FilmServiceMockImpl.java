/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.ArrayList;
import java.util.List;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class FilmServiceMockImpl {

    public List<Film> listerTous() {
        List<Film> films = new ArrayList<>();
        Film f1 = new Film(1L, "KungFu Panda", 2000L, "coucou", null, null);
        Film f2 = new Film(2L, "Despicable me", 2001L, "blabla", null, null);

        films.add(f1);
        films.add(f2);

        return films;
    }

    public Film findById(Long id) {
        if (id == 1) {
            return new Film(1L, "KungFu Panda", 2000L, "coucou", null, null);
        }
        if (id == 2) {
            return new Film(2L, "Despicable me", 2001L, "blabla", null, null);
        }
        return new Film();
    }

}
