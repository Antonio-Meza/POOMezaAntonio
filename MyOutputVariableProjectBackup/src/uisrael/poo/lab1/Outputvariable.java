import java.text.*;
import java.util.Locale;

public class Outputvariable {

	/**
	 * @param args
	 */

		// TODO Auto-generated method stub
		long numero = 123098;
		double pi = Math.PI;
		System.out.printf("%d %n", numero);
		System.out.printf("%08d %n", numero);
		System.out.printf("%+d %n", numero);
		Locale.setDefault(Locale.US);
		DecimalFormat formato1 = new DecimalFormat("###,###,##");
		String valorFormateado1 = formato1.format(numero);
		System.out.printf("%s %n", valorFormateado1);
		DecimalFormat formatoDecimal = new DecimalFormat("###,###,##0.00");
        String valorFormateadoDecimal = formatoDecimal.format(pi);
        System.out.printf("%s %n", valorFormateadoDecimal);

        //First part
        System.out.println("Manejo de operador condicional");
        status = (grade >= 7) ? "Passed" : "Fail";
        System.out  .println(status);
	}

}