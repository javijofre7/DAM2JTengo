package dam2.jtengo.Practica.Model;

public class MTBE extends BTT{
public int potenciaMotor;
public int pesBateria;
public int autonomia;
public MTBE() {
	super();
}
public int getPotenciaMotor() {
	return potenciaMotor;
}
public void setPotenciaMotor(int potenciaMotor) {
	this.potenciaMotor = potenciaMotor;
}
public int getPesBateria() {
	return pesBateria;
}
public void setPesBateria(int pesBateria) {
	this.pesBateria = pesBateria;
}
public int getAutonomia() {
	return autonomia;
}
public void setAutonomia(int autonomia) {
	this.autonomia = autonomia;
}
}
