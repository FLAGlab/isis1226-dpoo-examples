
public class Course {
	//attributes
	private int numeroPersonas;
	private String profesor;
	private String monitor;
	private double notaMinimia;
	
	//Constructors
	public Course(String profesor) {
		this.numeroPersonas = 8; 
		this.profesor = profesor;
	}
	
	public Course(int numPersonas, String profesor) {
		if(numPersonas < 8) {
			//lanzar excepcion
			this.numeroPersonas = 8;
		} else {
		this.numeroPersonas = numPersonas;
		this.profesor = profesor;
		}
	}
	
	//Methods
	public int getNumeroPersonas() {
		return this.numeroPersonas;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public double getNotaMinimia() {
		return notaMinimia;
	}

	public void setNotaMinimia(double notaMinimia) {
		this.notaMinimia = notaMinimia;
	}
	
	
	
}
