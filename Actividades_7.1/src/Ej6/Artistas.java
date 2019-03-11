package Ej6;

public class Artistas {
	
	private String nombre;
	private String lugarnacim;
	private String fechanacim;
	private String fechafall;
	
	Artistas(String nombre,String lugarnacim,String fechanacim,String fechafall){
		this.fechafall=fechafall;
		this.fechanacim=fechanacim;
		this.lugarnacim=lugarnacim;
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugarnacim() {
		return lugarnacim;
	}

	public void setLugarnacim(String lugarnacim) {
		this.lugarnacim = lugarnacim;
	}

	public String getFechanacim() {
		return fechanacim;
	}

	public void setFechanacim(String fechanacim) {
		this.fechanacim = fechanacim;
	}

	public String getFechafall() {
		return fechafall;
	}

	public void setFechafall(String fechafall) {
		this.fechafall = fechafall;
	}
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
}
