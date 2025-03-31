import java.util.Scanner;
public class Trainer
{
    Glumanda glumanda1;
    Kleinstein kleinstein1;
    Taubsi taubsi1;

    boolean hatGlumanda;
    boolean hatKleinstein;
    boolean hatTaubsi;

    int pokemon;

    boolean introgesehen;
    int abfrage;

    public Trainer()
    {
        glumanda1 = new Glumanda();
        taubsi1 = new Taubsi();
        kleinstein1 = new Kleinstein();

        System.out.println("/====================================================================\\");
        System.out.println("||########---#######--##----##-########-##-----##--#######--##----##||");
        System.out.println("||##-----##-##-----##-##---##--##-------###---###-##-----##-###---##||");
        System.out.println("||##-----##-##-----##-##--##---##-------####-####-##-----##-####--##||");
        System.out.println("||########--##-----##-#####----######---##-###-##-##-----##-##-##-##||");
        System.out.println("||##--------##-----##-##--##---##-------##-----##-##-----##-##--####||");
        System.out.println("||##--------##-----##-##---##--##-------##-----##-##-----##-##---###||");
        System.out.println("||##---------#######--##----##-########-##-----##--#######--##----##||");
        System.out.println("\\====================================================================/");

        //Begrüßung

        schreiben("Noch kannst du das Tutorial überspringen (Entwicklungsversion) mit 2");
        Scanner scanner = new Scanner(System.in);
        int abfrage = Integer.parseInt(scanner.nextLine());
        if(abfrage == 2){
            introgesehen = true;
        }
        else if( introgesehen == false){
            schreiben("Willkommen in der Welt der Pokémon!");
            System.out.println("");

            schreiben("Du bist ein angehender Pokémon-Trainer.");
            System.out.println("");

            schreiben("Dein Abenteuer beginnt heute.");
            System.out.println("");

            schreiben("In einer Welt voller geheimnisvoller Kreaturen und spannender Herausforderungen.");
            System.out.println("");

            schreiben("Es liegt an dir, ein starkes Team aufzubauen.");
            System.out.println("");

            schreiben("Knüpfe Freundschaften und werde der beste Trainer.");
            System.out.println("");

            schreiben("Wähle dein erstes Pokémon weise.");
            System.out.println("");

            schreiben("Deine Reise wird voller Überraschungen und spannender Kämpfe sein.");
            System.out.println("");

            schreiben("Bist du bereit, dich der Herausforderung zu stellen?");
            System.out.println("");

            schreiben("Dein eigener Legendenpfad wartet auf dich!");
            System.out.println("");


        }

        startpokemon();
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
        System.out.println("Pokemon 3 = "+kleinstein1.name);

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
            kleinstein1.entwickeln();
        }
    }

    public void pokemonleveln(){
        schreiben("Welches Pokemon möchtest du leveln?");
        System.out.println("");
        schreiben("Pokemon 1 = "+glumanda1.name);
        System.out.println("");
        schreiben("Pokemon 2 = "+taubsi1.name);
        System.out.println("");
        schreiben("Pokemon 3 = "+kleinstein1.name);
        System.out.println("");

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
            kleinstein1.lvl100();
            System.out.println("Erfolgreich gelevelt.");
        }

    }

    public void schreiben(String pText){
        String text = pText;

        for (char buchstabe : text.toCharArray()) {
            System.out.print(buchstabe); // Gibt Buchstaben einzeln aus
            try {
                Thread.sleep(30); // Pause von 100 Millisekunden
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    private void startpokemon(){

        schreiben("Du darfst nun eins von drei Startpokemon wählen");
        System.out.println("");
        schreiben("Glumanda ist ein Feuerpokemon und kann fliegen, wähle es mit 1 aus!");
        System.out.println("");
        schreiben("Du kannst auch Taubsi wählen, Taubsi ist ein normales Pokemon und kann auch fliegen, wähle es mit 2 aus!");
        System.out.println("");
        schreiben("Alternativ steht dir auch Kleinstein zur Vertfügung, ein Steinpokemon, wähle Kleinstein mit 3 aus!");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        int abfrage = Integer.parseInt(scanner.nextLine());

        if (abfrage == 1){
            schreiben("Du hast Glumanda ausgewählt!");
            System.out.println("");
            hatGlumanda = true;
            hatTaubsi = false;
            hatKleinstein = false;

        }
        if (abfrage == 2){
            schreiben("Du hast Taubsi ausgewählt!");
            System.out.println("");
            hatTaubsi = true;
            hatGlumanda = false;
            hatKleinstein = false;
            
        }
        if (abfrage == 3){
            schreiben("Du hast Kleinstein ausgewählt!");
            System.out.println("");
            hatKleinstein = true;
            hatTaubsi = false;
            hatGlumanda = false;
        }
        
        
        
    }

    public void angreifen(){
        schreiben("Mit welchem Pokemon möchtest du kämpfen ?");
        System.out.println("");
        
        
        Scanner scanner = new Scanner(System.in);
        int pokemon = Integer.parseInt(scanner.nextLine());
        
        
        schreiben("Welchen Angriff möchtest du wählen, wähle mit den Zahlen hinter dem Angriffnamen !");
        System.out.println("");
        
        
    }
    
    
    
}