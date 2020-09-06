package programmerings_innlevering1;

import static javax.swing.JOptionPane.*;

public class Oppgave_6_fakultet_innleverin1 {

	public static void main(String[] args) {

		int n = Integer.parseInt(showInputDialog("Fakultet av?"));
		showMessageDialog(null, "Fakultet av " + n + "\n Er " + fakultet(n));
	}

	public static int fakultet(int Xte) {
		int a = 1;
		for (int i = 1; i <= Xte; i++) {
			a *= i; //a *= i ==> a = a* i
		}
		return a;
	}

}
