import java.util.Scanner;
public class Trainer
{
    Glumanda glumanda1;
    Kleinstein kleinstein1;
    Taubsi taubsi1;

    boolean hatGlumanda;
    boolean hatGolbit;
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
        System.out.println("Welches Pokemon möchtest du leveln?");
        System.out.println("Pokemon 1 = "+glumanda1.name);
        System.out.println("Pokemon 2 = "+taubsi1.name);
        System.out.println("Pokemon 3 = "+kleinstein1.name);

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
}