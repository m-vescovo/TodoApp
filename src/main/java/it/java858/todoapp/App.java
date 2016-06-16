/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoapp;

import it.java858.todoapp.entity.Categoria;
import it.java858.todoapp.entity.ToDo;
import it.java858.todoapp.gui.Main;
import it.java858.todoapp.service.CategoriaService;
import it.java858.todoapp.service.DbService;
import it.java858.todoapp.service.event.CategoriaEventListener;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tss
 */
public class App {

    public static void main(String[] args) {

        CategoriaService.addCategoriaEventListener(new AscoltaEventiCategoria());
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
        //System.err.println("Start jpa:....");

       // EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        //EntityManager em = DbService.getEm(); //emf.createEntityManager(); // apre la connessione e da oggetto per interagire
        //System.err.println("jpa ok,,,");
        //ToDo td = new ToDo();//crea una nuova riga nel DB
        //td.setTesto("caffè tra poco..");//mette nel campo testo la scritta caffè tra poco
        //td.setDataCreazione(new Date());//inserisce nel campo data la data corrente
        //em.getTransaction().begin();
        //em.persist(td);
        //em.getTransaction().commit();
        //em.close();
    }

}
class AscoltaEventiCategoria implements CategoriaEventListener{
    
     @Override
    public void onCreate(Categoria c) {
        System.out.println("hai creato la classe: "+c); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onUddate(Categoria c) {
        System.out.println("hai aggiornato la classe: "+c); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onDelete(Categoria c) {
        System.out.println("hai eliminato la classe: "+c); //To change body of generated methods, choose Tools | Templates.
   
        
    }
}

  
    