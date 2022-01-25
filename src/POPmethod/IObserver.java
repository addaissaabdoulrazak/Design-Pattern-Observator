/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POPmethod;

import observer.Observable.IObservable;

/**
 *
 * @author USER-PC
 */
//Cette Interface Reçoit generalement une Seul Methodes

public interface IObserver {
    
 // Using the POP Method : perform an Update all by receving the referance of the Objet that notifiies it(IObservable)  
    public void mis_A_Jour(IObservable observable);


}
