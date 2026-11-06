package javaapplication4;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author aberthier2
 */
public class JavaApplication4 {
    
    public static boolean ip(String []champs ) {
        for (int i = 0; i < 1000; i = i++){
             if ()
        }
    }
    
    static final String[] IPS_DESTINATION_CONNUES = {
            "10.10.0.1", "10.10.0.2", "10.10.0.10", "10.10.0.11",
            "10.10.0.20", "10.10.0.21", "10.10.0.30", "10.10.0.31"
    };

    static final String[] UTILISATEURS_CONNUS = {
            "mleroy", "jdupont", "admin", "scarre", "ppetit", "tnoel", "invite"
    };

       public static void main(String[] args) {        
        String cheminFichier = "logs_connexion.txt";
        lireFichierLogs(cheminFichier);

    }

    static void lireFichierLogs(String chemin) {
        try (BufferedReader lecteur = new BufferedReader(new FileReader(chemin))) {
            String ligne;
            String[] champs;
            while ((ligne = lecteur.readLine()) != null) {
                champs= ligne.split(";");
                //Affichage
                for (String champ : champs) {
                    System.out.print(champ + " ");
                }
                System.out.println("=>>>>> " + champs[3]);
            }
        } catch (IOException e) {
            System.out.println("Erreurs : impossible de lire le fichier " + chemin);
            System.out.println("Détail : " + e.getMessage() + " !!!");
        }
    }

}
