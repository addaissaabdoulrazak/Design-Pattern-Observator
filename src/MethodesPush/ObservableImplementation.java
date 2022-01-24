/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodesPush;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author USER-PC
 */

public class ObservableImplementation implements IObservable{

    
    int State=10;
  

   private final List<IObserver> observateurs= new Vector<>();
   

    public void abonnement(IObserver o) {
   
    }

    @Override
    public void desabonnement(observer.IObserver o) {
             this.observateurs.remove(o);
    }
    

    @Override
    public void notificationObservers() {
        observateurs.forEach(o -> {
            o.mis_A_Jour(this.State);
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

    @Override
    public void abonnement(observer.IObserver o) {
 //on fait appele a la methode Add de ArrayList Comme que Observateurs est une variable de type ArrayList
    this.observateurs.add((IObserver) o);
    }



    
    
}
