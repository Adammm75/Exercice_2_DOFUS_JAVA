/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.eni.slam1_tppre1_preprorpjet;

/**
 *
 * @author erwan
 */
public class Sort {
    private String nom;
    private int degatMin;
    private int degatMax;
    private int portee;
    private String element;
    private double critique;

    public Sort(String nom, int degatMin, int degatMax, int portee, String element, double critique) {

    }

    public void affSort()
    {
        /*
        Affiche tous les attributs d'un objet de classe Sort.
        /!\ Attention, on affichera l'attribut critique en pourcentage.
        */
    }
    
    public void affDegatSort(int feu, int ter, int eau, int air)
    {
        /*
        Affiche tous les dégât d'un sort en combat (dégâts avec et sans critique).
        Les dégâts en critique valent dégâts * 2.
        Vous pourrez vous aider de la fonction calculDegat.
        Exemple d'affichage -> "Ronce : 10 - 12 (CC : 20 - 24)"
        /!\ Attention /!\ Il faut bien prendre en compte les statistiques des personnages.
        C'est à dire que l'argument "stats" prend en compte les statistiques du personnage.
        Exemple, si affDegatSort(0,500,200,100) est appelé et que le sort est de l'élément "terre" :
        -> on appelera calculDegat(500, this.degatMin).
        
        */
        this.element == "feu";
        this.feu(this.degatMin + this.degatMax);
        
        
    }
    public int calculDegat(int stats, int degat)
    {
        int DegatFinal= degat + degat *(stats/100);
        
        return 0;
    }
}
