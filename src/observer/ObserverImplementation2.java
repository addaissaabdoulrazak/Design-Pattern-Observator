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
public class ObserverImplementation2 implements IObserver{

    @Override
    public void mis_A_Jour(IObservable observable) {
        
     int state = ((ObservableImplementation)observable).getState();
     double result= state*state+9;
      
         System.out.println("********Observateur Implementation n°1");
         System.out.println("Nouvelle Mis A jours : State= "+state);
         System.out.println("Resulat du calcul "+result);
         System.out.println("***********************************");
         
/*Il est aussi possible de Creer un Iterface et lui deleger la responsablité d'affichage. Ainsi nous aurons notre Observateur qui implementera deux interfaces*/         
    }


    
}
