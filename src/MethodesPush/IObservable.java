/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodesPush;

import observer.Observable.*;
import POPmethod.IObserver;

/**
 *
 * @author USER-PC
 */
public interface IObservable {
    
    public void abonnement(IObserver o);//ajouter observateur
    public void desabonnement(IObserver o);//supprimer l'Observateur
    public void notificationObservers();
}
