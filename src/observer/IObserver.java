/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import observer.Observable.IObservable;

/**
 *
 * @author USER-PC
 */
//Cette Interface Reçoit generalement une Seul Methodes

public interface IObserver {
    
    public void mis_A_Jour(IObservable observable);//effectuer une mis a jours tous en recevant la referance de l'objet qui la Notifier


}
