package entitities;

public class avaliation {
	
	public double nota;
	public double missing;
	
	public void somarNota(double nota) {
		this.nota += nota;
	}

	public String retornarSituacao() {
		if (this.nota < 60) {
			missing = 60 - this.nota;
			return "NOTAS: "
					+this.nota
					+"\nFAILED \n"
					+"MISSING: "
					+missing 
					+ " POINTS";
		}
		else {
			return "NOTA: "
					+ this.nota
					+"\nPASS";

		}
	}
	

}
