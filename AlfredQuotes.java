import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, encantado de verte. ¿Cómo estás?";
    }

    public String guestGreeting(String name) {
        return String.format("Hola, %s. Encantado de verte", name);
    }

    public String dateAnnouncement() {
        Date today = new Date();
        Locale locale = new Locale("es","PE");
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, d 'de' MMMM", locale);
        String result = formatter.format(today);
        
        return String.format("Actualmente es %s a las %tT %tZ de %tY", result, today, today, today);
    }
    
    public String respondBeforeAlexis(String conversation) {
        String respuesta = null;
        if (conversation.indexOf("Alexis") != -1) {
            respuesta = "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso";
        } else if (conversation.indexOf("Alfred") != -1) {
            respuesta = "A su servicio. Como desee, naturalmente";
        } else {
            respuesta = "Bien. Y con eso, me retiraré";
        }
        return respuesta;
    }
    
	// BONUS NINJA
	// Ver las especificaciones para sobrecargar el método guessGreeting    
    public boolean isContained(Integer[] arr, Integer val) {
        return Arrays.asList(arr).contains(val);
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        String respuesta = null;
        if (dayPeriod.equals("mañana")) {
            respuesta = String.format("Buenos días, %s. Encantado de verte", name);
        } else if (dayPeriod.equals("tarde")) {
            respuesta = String.format("Buenas tardes, %s. Encantado de verte", name);
        } else {
            respuesta = String.format("Buenas noches, %s. Encantado de verte", name);
        }
        return respuesta;
    }
    
    public String guestGreeting() {
        String respuesta = null;
        Integer morning[] = {6, 7, 8, 9, 10, 11};
        Integer afternoon[] = {12, 13, 14, 15, 16, 17};
        Integer evening[] = {18, 19, 20, 21, 22, 23};
        Date today = new Date();
        Integer hr = Integer.parseInt(String.format("%tk", today));
        if (isContained(morning, hr)) {
            respuesta = "Buenos días. Encantado de verle";
        } else if (isContained(afternoon, hr)) {
            respuesta = "Buenos tardes. Encantado de verle";
        } else if (isContained(evening, hr)) {
            respuesta = "Buenos noches. Encantado de verle";
        } else {
            respuesta = "Es de madrugada. Encantado de verle";
        }
        return respuesta;
    }
    
    // BONUS SENSEI
    // ¡Escribe tu propio método AlfredQuotes usando cualquiera de los métodos String que has aprendido!
    public String yellIfAngry(String answer, Boolean isAngry) {
        String respuesta = null;
        if (isAngry) {
            respuesta = String.format("I am very %s!", answer.toUpperCase());
        } else {
            respuesta = String.format("I am not %s.", answer.toLowerCase());
        }
        return respuesta;        
    }
}