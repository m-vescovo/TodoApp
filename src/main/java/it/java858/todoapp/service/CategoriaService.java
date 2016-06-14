
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoapp.service;

import it.java858.todoapp.entity.Categoria;
import javax.persistence.EntityManager;





public class CategoriaService {

    public CategoriaService() {
    }
    
    
    public static Categoria save(Categoria c){
        EntityManager em =DbService.getEm();
        em.getTransaction().begin();//inizia la lista dei comandi da fare tutti assieme
        Categoria saved=em.merge(c);
        em.getTransaction().commit();//finisce la lista delle azioni ed esegue tutte le operazioni tutte assieme
        return saved;
    }
    
}
