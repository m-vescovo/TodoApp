
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoapp.service;

import it.java858.todoapp.entity.Categoria;
import it.java858.todoapp.service.event.CategoriaEventListener;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

public class CategoriaService {

    private static List<CategoriaEventListener> listeners = new ArrayList<>();

    private CategoriaService() {

    }//aggiunge l'ascoltatore alla lista

    public static void addCategoriaEventListener(CategoriaEventListener listener) {
        listeners.add(listener);
    }

    public static Categoria save(Categoria c) {
        EntityManager em = DbService.getEm();
        em.getTransaction().begin();//inizia la lista dei comandi da fare tutti assieme
        Categoria saved = em.merge(c);
        em.getTransaction().commit();//finisce la lista delle azioni ed esegue tutte le operazioni tutte assieme
        for (CategoriaEventListener listener : listeners) {
            if (c.getId() == null) {
                listener.onCreate(saved);
            } else {
                listener.onUddate(saved);
            }
        }
        return saved;
    }

    public static void elimina(Categoria c) {
        EntityManager em = DbService.getEm();
        em.getTransaction().begin();//inizia la lista dei comandi da fare tutti assieme
        Categoria find = em.find(Categoria.class, c.getId());
        em.remove(find);
        em.getTransaction().commit();//finisce la lista delle azioni ed esegue tutte le operazioni tutte assieme
        //richiama il metodo onElimina su tutti gli ascoltatori iscritti
        for (CategoriaEventListener listener : listeners) {
            listener.onDelete(c);
        }
    }

    public static List<Categoria> findAll() {
        EntityManager em = DbService.getEm();
        // return em.createNamedQuery("select e from Categoria e order by e.nome" Categoria.getResultList)
        List<Categoria> listCat;
        listCat = em.createQuery("select c  from Categoria c  order by c.nome", Categoria.class).getResultList();
        return listCat;
    }

}
