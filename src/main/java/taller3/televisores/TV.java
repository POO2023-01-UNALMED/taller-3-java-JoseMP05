package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV = 0;
	
	public TV(Marca marca, boolean estado) {
		this.setMarca(marca);
		this.estado = estado;
		this.numTV += 1;
	}
	
	//Setters
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	//Getters
	public Marca getMarca() {
		return marca;
	}
	
	public Control getControl() {
		return control;
	}


	public int getPrecio() {
		return precio;
	}


	public int getVolumen() {
		return volumen;
	}

	public int getCanal() {
		return canal;
	}
	
	//Metódos
	public static int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp() {

		canal++;
	}
	
	public void canalDown() {
		canal--;
	}
	
	public void volumenUp() {
		volumen++;
	}
	
	public void volumenDown() {
		volumen--;
	}
}
