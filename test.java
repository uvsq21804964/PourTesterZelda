import java.lang.Math;

public class test
{

    public static void main( String[] args )
    { 
            // Prenons les mesures de la salle aléatoirement
            int largeur_Min = 20;
            int largeur_Max = 80; 
            int largeurSalle = largeur_Min + (int)(Math.random() * ((largeur_Max - largeur_Min) + 1));
            
            int longueur_Min = 50;
            int longueur_Max = 100; 
            int longueurSalle = 50;
            

            for(int j = 0 ; j < ((longueur_Max-longueurSalle)/2)+1 ; j++) {
                for(int i = 0 ; i < largeurSalle+2 ; i++) { // +2 car on veut voire les bords sur le côté si la salle est de largeur maximale
                    System.out.println("#");
                }
                System.out.println("op " + ((longueur_Max-longueurSalle)/2)+1);
                System.out.println("longueurSalle " + longueurSalle);
                System.out.println("op " + (((longueur_Max-longueurSalle)/2)+1));
                System.out.println("longueur_Max " + longueur_Max);
            }
    }
}













