/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.Observable;

import observer.Observable.IObservable;
import java.util.ArrayList;
import java.util.List;
import observer.IObserver;

/**
 *
 * @author USER-PC
 */

public class ObservableImplementation implements IObservable{

    /*Tous les Observateurs vont observer cette Variable.
      -Si elle change l'observable doit envoyer une Notification a liste des Observateur pour qu'il effectuer une mis a jours*/
    
    int State=10;
    
   private final List<IObserver> observateurs= new ArrayList<>();
   
    @Override
    public void abonnement(IObserver o) {
        
    //on fait appele a la methode Add de ArrayList Comme que Observateurs est une variable de type ArrayList
    this.observateurs.add(o);
    }

    @Override
    public void desabonnement(IObserver o) {
      this.observateurs.remove(o);
    }

    @Override
    public void notificationObservers() {
        observateurs.forEach(o -> {
            o.mis_A_Jour(this);
        });
    }
    
    public void setState(int state)
    {
      this.State=state;
    //A chaque fois que l'etat Change il faut que l'observable informetous les observateurs
      this.notificationObservers();
    }

    public int getState() {
        return State;
    }
    
    
    
}
