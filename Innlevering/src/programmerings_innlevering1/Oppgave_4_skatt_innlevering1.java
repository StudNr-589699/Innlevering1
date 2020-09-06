package programmerings_innlevering1;

import static javax.swing.JOptionPane.*;

public class Oppgave_4_skatt_innlevering1 {

		    public static void main(String[] args) {

		        String utTxt = " ";
		        double inntekt = Integer.parseInt(showInputDialog(" Tast inn Inntekt"));

		        if (inntekt <= 164100) {
		            utTxt = ("Du trenger ikke å betale skatt");
		        }
		        if (inntekt > 164100 && inntekt <= 230950) {
		            double skatt = inntekt * 0.0093;
		            utTxt = ("Du tjente " + inntekt + "kr" + "\nDu skatter " + skatt + "kr");

		        }

		        if (inntekt > 230950 && inntekt <= 580650)

		        {
		            double skatt = inntekt * 0.0241;
		            utTxt = ("Du tjente " + inntekt + "kr" + "\nDu skatter " + skatt + "kr");

		        }
		        if (inntekt > 580650 && inntekt <= 934050)

		        {
		            double skatt = inntekt * 0.1152;
					utTxt = ("Du tjente " + inntekt + "kr" + "\nDu skatter " + skatt + "kr");

		        }
		        if (inntekt > 934050) {
		            double skatt = inntekt * 0.1452;
		            utTxt = ("Du tjente " + inntekt + "kr" + "\nDu skatter " + skatt + "kr");

		        }
		        showMessageDialog(null, utTxt);
		    }

		

}


