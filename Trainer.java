import java.util.Scanner;
public class Trainer
{
    Glumanda glumanda1;
    Golbit golbit1;
    Taubsi taubsi1;
    
    boolean hatGlumanda;
    boolean hatGolbit;
    boolean hatTaubsi;
    
    int pokemon;
    
    public Trainer()
    {
        glumanda1 = new Glumanda();
        taubsi1 = new Taubsi();
        golbit1 = new Golbit();
        
       
        /*
        System.out.println("/==============================================\\");
        System.out.println("||  ____       _                              ||");
        System.out.println("|| |  _ \\ ___ | | _____ _ __ ___   ___  _ __  ||");
        System.out.println("|| | |_) / _ \\| |/ / _ \\ '_ ` _ \\ / _ \\| '_ \\ ||");
        System.out.println("|| |  __/ (_) |   <  __/ | | | |  |(_) | | | |||");
        System.out.println("|| |_|   \\___/|_|\\_\\___|_| |_| |_ \\___/|_| |_|||");
        System.out.println("||                                            ||");
        System.out.println("\\==============================================/");
    */
    }

    public void pokemonEntwickeln(){
        System.out.println("Welches Pokemon möchtest du entwickeln?");
        System.out.println("Pokemon 1 = "+glumanda1.name);
        System.out.println("Pokemon 2 = "+taubsi1.name);
        System.out.println("Pokemon 3 = "+golbit1.name);
        
        Scanner scanner = new Scanner(System.in);
        int pokemon = Integer.parseInt(scanner.nextLine());
        
        if (pokemon >= 4){
           System.out.println("Ungültiger Wert!"); 
        }
        else if (pokemon == 1){
            glumanda1.entwickeln();
        }
        else if (pokemon == 2){
            taubsi1.entwickeln();
        }
        else if (pokemon == 3){
            golbit1.entwickeln();
        }
    }
    public void pokemonleveln(){
        System.out.println("Welches Pokemon möchtest du leveln?");
        System.out.println("Pokemon 1 = "+glumanda1.name);
        System.out.println("Pokemon 2 = "+taubsi1.name);
        System.out.println("Pokemon 3 = "+golbit1.name);
        
        Scanner scanner = new Scanner(System.in);
        int pokemon = Integer.parseInt(scanner.nextLine());
        
        if (pokemon >= 4){
           System.out.println("Ungültiger Wert!"); 
        }
        else if (pokemon == 1){
            glumanda1.lvl100();
            System.out.println("Erfolgreich gelevelt.");
        }
        else if (pokemon == 2){
            taubsi1.lvl100();
            System.out.println("Erfolgreich gelevelt.");
        }
        else if (pokemon == 3){
            golbit1.lvl100();
            System.out.println("Erfolgreich gelevelt.");
        }
    }
}
