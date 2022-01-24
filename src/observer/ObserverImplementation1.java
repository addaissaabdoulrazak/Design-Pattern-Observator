/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import observer.Observable.IObservable;
import observer.Observable.ObservableImplementation;

/**
 *
 * @author USER-PC
 */
public class ObserverImplementation1 implements IObserver {

    int counter;
    @Override
    public void mis_A_Jour(IObservable observable) {
         int state = ((ObservableImplementation)observable).getState();
         if(state%2==0) ++counter;
         System.out.println("********Observateur Implementation n°1");
         System.out.println("Nouvelle Mis A jours : State= "+state);
         System.out.println("Nouvelle Mis A jours : State= "+((state%2==0)?"pair":"impaire"));
         System.out.println("Resulat du calcul "+counter);
         System.out.println("***********************************");
        
    }
    
}
