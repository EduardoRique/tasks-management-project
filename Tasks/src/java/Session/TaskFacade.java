/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Task;

/**
 *
 * @author luis
 */
@Stateless
public class TaskFacade extends AbstractFacade<Task> {

    @PersistenceContext(unitName = "TasksPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TaskFacade() {
        super(Task.class);
    }
    
}
