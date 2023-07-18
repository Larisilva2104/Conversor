
public class ConversorDeHoras {
protected static double Hora = 1/36000;
protected static double minuto = 1/60.0;
protected static double segundo = 1;
protected static double milisegundo = 1000;
protected static double microsegundos = 10.000000;
protected static double nanosegundos = 100.000000000;

public static double getHora() {
	return Hora;
}
public static void setHora(double hora) {
	Hora = hora;
}
public static double getMinuto() {
	return minuto;
}
public static void setMinuto(double minuto) {
	ConversorDeHoras.minuto = minuto;
}
public static double getSegundo() {
	return segundo;
}
public static void setSegundo(double segundo) {
	ConversorDeHoras.segundo = segundo;
}
public static double getMilisegundo() {
	return milisegundo;
}
public static void setMilisegundo(double milisegundo) {
	ConversorDeHoras.milisegundo = milisegundo;
}
public static double getMicrosegundos() {
	return microsegundos;
}
public static void setMicrosegundos(double microsegundos) {
	ConversorDeHoras.microsegundos = microsegundos;
}
public static double getNanosegundos() {
	return nanosegundos;
}
public static void setNanosegundos(double nanosegundos) {
	ConversorDeHoras.nanosegundos = nanosegundos;
}
}
