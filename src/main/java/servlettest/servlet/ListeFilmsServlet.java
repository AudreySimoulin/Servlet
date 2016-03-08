/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettest.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Film;
import streaming.service.FilmServiceMockImpl;

/**
 *
 * @author admin
 */
@WebServlet(name = "ListeFilmsServlet", urlPatterns = {"/liste_films_servlet"})
public class ListeFilmsServlet extends HttpServlet {
    
    private FilmServiceMockImpl filmService = new FilmServiceMockImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        List<Film> f = filmService.listerTous();
        
        String titre = "Liste des films";
        
        String erreur = "Il n'y a pas de films";
        
        //Envoie l'attribut mes films vers ma JSP (page WEB) 
        req.setAttribute("mesFilms", f);
        req.setAttribute("titre", titre);
        
        if(f.isEmpty()){
            req.setAttribute("Erreur", erreur);
            req.getRequestDispatcher("erreur.jsp").forward(req, resp);
        }
        //Renvoie la main vers notre JSP (donne le controle à la JSP)
        req.getRequestDispatcher("lister_films.jsp").forward(req, resp);
        
        
    }
    

}
