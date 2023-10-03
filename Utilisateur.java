/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gsb_frais;

/**
 *
 * @author mcoho
 */
class Utilisateur {
    private String id, nom,prenom,login,adresse,cp,ville;
    public Utilisateur (String id,String nom,String prenom,String login,String adresse,String cp,String ville){
        this.adresse=adresse;
        this.cp=cp;
        this.id =id ;
        this.nom =nom;
        this.prenom =prenom;
        this.login =login;
        this.ville=ville;
    }
    // GET les information de l'utilisateur
    public String getAdresse(){
        return this.adresse; 
    }
    public String getCP(){
        return this.cp; 
    }
    public String getNom(){
        return this.nom; 
    }
    public String getPrenom(){
        return this.prenom; 
    }
    public String getLogin(){
        return this.login; 
    }
    public String getVille(){
        return this.ville; 
    }
    
    //SET modifier les informations de l'utilisateur 
    
    public void setAdresse(String NewAdress) {
        this.adresse = NewAdress;
    }
    public void setCP(String NewCP) {
        this.cp = NewCP;
    }
    public void setNom(String NewNom) {
        this.nom = NewNom;
    }
    public void setPrenom(String NewPrenom) {
        this.adresse = NewPrenom;
    }
    public void setLogin(String NewLogin) {
        this.login = NewLogin;
    }
    public void setVille(String NewVille) {
        this.ville = NewVille;
    }
}
