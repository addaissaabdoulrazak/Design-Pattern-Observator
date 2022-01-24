/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodesPush;

import observer.*;
import observer.Observable.IObservable;

/**
 *
 * @author USER-PC
 */
//Cette Interface Reçoit generalement une Seul Methodes

public interface IObserver {
  //Use Methode PUSH  
    public void mis_A_Jour(int State);
}
