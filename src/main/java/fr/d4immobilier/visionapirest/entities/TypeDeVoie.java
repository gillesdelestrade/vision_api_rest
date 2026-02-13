/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.d4immobilier.visionapirest.entities;

/**
 *
 * @author gillesdelestrade
 */
public enum TypeDeVoie {

    rue,            //0
    boulevard,      //1
    avenue,         //2
    traverse,       //3
    chemin,         //4
    impasse,        //5
    allee,          //6
    quartier,       //7
    route,          //8
    lotissement,    //9
    montee,         //10
    cours,          //11
    promenade,      //12
    place,          //13
    quai,           //14
    faubourg,       //15
    rien,           //16
    allees,         //17
    passage;        //18

    @Override
    public String toString() {
        switch (this) {
            case rue:
                return "Rue";
            case boulevard:
                return "Boulevard";
            case avenue:
                return "Avenue";
            case traverse:
                return "Traverse";
            case chemin:
                return "Chemin";
            case impasse:
                return "Impasse";
            case allee:
                return "Allée";
            case quartier:
                return "Quartier";
            case route:
                return "Route";
            case lotissement:
                return "Lôtissement";
            case montee:
                return "Montée";
            case cours:
                return "Cours";
            case promenade:
                return "Promenade";
            case place:
                return "Place";
            case quai:
                return "Quai";
            case faubourg:
                return "Faubourg";
            case rien:
                return "";
            case allees:
                return "Allées";
            case passage:
                return "Passage";

        }
        throw new RuntimeException("Invalid value for this");
    }
}
