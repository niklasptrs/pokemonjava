

public class Pokemon
{
    String typ1, typ2;
    int level;
    int zuneigungTrainer;
    String name;
    String spitzname;
    int leben;
    int angriffstaerke;
    int entwicklung1, entwicklung2;
    String entname1, entname2;
    int entwicklungsstand;
    int lebenent1, lebenent2;
    int angent1, angent2;
    // Namen der Attacken
    String ang1, ang2, ang3, ang4, ang5, ang6, ang7, ang8;
    // Schaden der jeweiligen Angriffe
    int dang1, dang2, dang3, dang4, dang5, dang6, dang7, dang8;
    // Angriffspunkte der jeweiligen Angriffe
    int angp1, angp2, angp3, angp4, angp5, angp6, angp7, angp8;
    // Level in dem der jeweilige Angriff entsperrt wird
    int angu1, angu2, angu3, angu4, angu5, angu6, angu7, angu8;
    // Boolean ob der Angriff entsperrt ist
    boolean uang1, uang2, uang3, uang4, uang5, uang6, uang7, uang8;

    public Pokemon()
    {
        
    }

    public void entwickeln(){
        if (level >= entwicklung1 && entwicklungsstand == 0){
            
            System.out.println(name + " wird zu " + entname1);
            name = entname1;
            entwicklungsstand = 1;
            leben = lebenent1;
            angriffstaerke = angent1;
            System.out.println("Angriff: "+angent1+" Leben: "+lebenent1);
        }
        else if (level >= entwicklung2 && entwicklungsstand == 1){
            System.out.println(name + " wird zu " + entname2);
            entwicklungsstand = 2;
            name = entname2;
            leben = lebenent2;
            angriffstaerke = angent2;
            System.out.println("Angriff: "+angent2+" Leben: "+lebenent2);
        }
        else if(level < entwicklung1 || level < entwicklung2  && entwicklungsstand !=1){
        
            System.out.println("Level zu gering um zu entwickeln");
        }
        else if (entwicklungsstand == 2){
            System.out.println(name + " hat maximales Level erreicht!");
        }
    }
    
        
    public void lvl100(){
        level =+100;
        if (ang1 != null && level >= angu1 && uang1 == false){
            uang1 = true;
            System.out.println(name+" hat "+ang1+" gelernt!");
            System.out.println(ang1+" richtet "+dang1+" Schaden an.");
            System.out.println("");
        }
        if (ang2 != null && level >= angu2 && uang2 == false){
            uang2 = true; 
            System.out.println(name+" hat "+ang2+" gelernt!");
            System.out.println(ang2+" richtet "+dang2+" Schaden an.");
            System.out.println("");
        }
        if (ang3 != null && level >= angu3 && uang3 == false){
            uang3 = true; 
            System.out.println(name+" hat "+ang3+" gelernt!");
            System.out.println(ang3+" richtet "+dang3+" Schaden an.");
            System.out.println("");
        }
        if (ang4 != null && level >= angu4 && uang4 == false){
            uang4 = true; 
            System.out.println(name+" hat "+ang4+" gelernt!");
            System.out.println(ang4+" richtet "+dang4+" Schaden an.");
            System.out.println("");
        }
        if (ang5 != null && level >= angu5 && uang5 == false){
            uang4 = true; 
            System.out.println(name+" hat "+ang5+" gelernt!");
            System.out.println(ang5+" richtet "+dang5+" Schaden an.");
            System.out.println("");
        }
        if (ang6 != null && level >= angu6 && uang6 == false){
            uang4 = true; 
            System.out.println(name+" hat "+ang6+" gelernt!");
            System.out.println(ang6+" richtet "+dang6+" Schaden an.");
            System.out.println("");
        }
        if (ang7 != null && level >= angu7 && uang7 == false){
            uang4 = true; 
            System.out.println(name+" hat "+ang7+" gelernt!");
            System.out.println(ang7+" richtet "+dang7+" Schaden an.");
            System.out.println("");
        }
        if (ang8 != null && level >= angu8 && uang8 == false){
            uang4 = true; 
            System.out.println(name+" hat "+ang8+" gelernt!");
            System.out.println(ang8+" richtet "+dang8+" Schaden an.");
            System.out.println("");
        }
    }
}
