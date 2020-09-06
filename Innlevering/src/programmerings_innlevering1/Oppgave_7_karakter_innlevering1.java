package programmerings_innlevering1;

import static javax.swing.JOptionPane.*;

public class Oppgave_7_karakter_innlevering1 {

	public static void main(String[] args) { 

    for(int i = 0; i < 10; i++){
        int poeng = Integer.parseInt(showInputDialog("Poengsum"));
        boolean valid_poeng = valider_poeng(poeng);
        if(valid_poeng){
            String karakter = poeng_til_karakter(poeng);
            showMessageDialog(null, "Karakter: " + karakter);
        } else {
            showMessageDialog(null, "Ugyldig poengsum, Skriv inn ny poengsum");
            i--;
        }
        
    }
    
}

public static boolean valider_poeng(int poeng){
    return poeng >= 0 && poeng <= 100;
}

public static String poeng_til_karakter(int poeng){
    String karakter = "";

    if(poeng < 40){
        karakter = "F";
    } else if (poeng < 50){
        karakter = "E";
    } else if (poeng < 60){
        karakter = "D";
    } else if (poeng < 80){
        karakter = "C";
    } else if (poeng < 90){
        karakter = "B";
    } else {
        karakter = "A";
    };
    return karakter;
}

}

