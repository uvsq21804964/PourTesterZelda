import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import Math.random;

public class CreateFile
{

    public static void main( String[] args )
    { 
        
        File file = new File("C:\\Users\\tomab\\Desktop\\PlanDesSalles.txt");

        try { BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

            // Prenons les mesures de la salle aléatoirement
            int largeur_Min = 20;
            int largeur_Max = 80; 
            int largeurSalle = largeur_Min + (int)(Math.random() * ((largeur_Max - largeur_Min) + 1));
            
            int longueur_Min = 20;
            int longueur_Max = 80; 
            int longueurSalle = longueur_Min + (int)(Math.random() * ((longueur_Max - longueur_Min) + 1));
            

            for(int j = 0 ; j < (longueur_Max-longueurSalle)/2 ; j++) {
                for(int i = 0 ; i < largeurSalle ; i++) {
                    bufferedWriter.write("#");
                }
                bufferedWriter.newLine();
            }

            for(int i = 0 ; i < largeurSalle ; i++) {
                bufferedWriter.write("#");
            }
            bufferedWriter.close();
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        
        
    }
}



























// List<String> lignes = Arrays.asList(La première ligne, La deuxième ligne);
        // Path fichier = Paths.get(mon-fichier.txt);
        // //La commande suivante écrit les lignes en écrasant le texte déjà présent dans le fichier
        // Files.write(fichier, lignes, Charset.forName(UTF-8));
        
        // //Pour écrire à la suite du fichier, il faut utiliser la commande suivante
        // //Files.write(fichier, ligne, Charset.forName(UTF-8), StandardOpenOption.APPEND);

        // PrintWriter ecrivain;
        // int n = 5;

        // ecrivain =  new PrintWriter(new BufferedWriter(new FileWriter(argv[0])));
    
        // ecrivain.println("bonjour, comment cela va-t-il ?");
        // ecrivain.println("un peu difficile ?");
        // ecrivain.print("On peut mettre des entiers : ");
        // ecrivain.println(n);
        // ecrivain.print("On peut mettre des instances de Object : ");
        // ecrivain.close();