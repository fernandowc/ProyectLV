package bean;

import util.Bean;

public class BeanTrabajador extends Bean {
	
	private static final long serialVersionUID = 1L;
	
	int idtrabajador;
	String tRnombre;
	String tRapellidoP;
	String tRapellidoM; 
	String tRfechaNac;
	String tRemail; 
	String tRsexo;
	public int getIdtrabajador() {
		return idtrabajador;
	}
	public void setIdtrabajador(int idtrabajador) {
		this.idtrabajador = idtrabajador;
	}
	public String gettRnombre() {
		return tRnombre;
	}
	public void settRnombre(String tRnombre) {
		this.tRnombre = tRnombre;
	}
	public String gettRapellidoP() {
		return tRapellidoP;
	}
	public void settRapellidoP(String tRapellidoP) {
		this.tRapellidoP = tRapellidoP;
	}
	public String gettRapellidoM() {
		return tRapellidoM;
	}
	public void settRapellidoM(String tRapellidoM) {
		this.tRapellidoM = tRapellidoM;
	}
	public String gettRfechaNac() {
		return tRfechaNac;
	}
	public void settRfechaNac(String tRfechaNac) {
		this.tRfechaNac = tRfechaNac;
	}
	public String gettRemail() {
		return tRemail;
	}
	public void settRemail(String tRemail) {
		this.tRemail = tRemail;
	}
	public String gettRsexo() {
		return tRsexo;
	}
	public void settRsexo(String tRsexo) {
		this.tRsexo = tRsexo;
	}
	
	

}
