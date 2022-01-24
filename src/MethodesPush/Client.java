   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodesPush;

/**
 *
 * @author USER-PC
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ObservableImplementation  observable=new ObservableImplementation();
        IObserver o1=new ObserverImplementation1();
        IObserver o2=new ObserverImplementation2();
        IObserver o3=new ObserverImplementation1();
        
        observable.abonnement(o1);
        observable.setState(55);
        observable.desabonnement((observer.IObserver) o1);
        observable.setState(10);
        System.out.println("----------------------Création d'un Observateur annonyme une Fois Creer nous allons L'ajouter a la liste d'bjet contenue dans ''observable'' de Manière Direct ------------------------------");     
        System.out.println();
        System.out.println("Ce qu'il faut retenir a ce Niveau ce que Vous naurez pas besoin d'ajouter une Nouvelle Classe Par Extension vous pouvez procedez de la Manière si dessous ");
        observable.abonnement((int state) -> {
            System.out.println();
            System.out.println("Observateur anonyme jai reçu l'information lMais ma Methodes de Mis A jours n'effectuer aucun Traitement"
                    + "");
        });
        observable.setState(70);
    }
    
}
