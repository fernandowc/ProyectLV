package dao;

import java.util.List;

import bean.BeanTrabajador;
//import util.Lista;
import util.Lista;

public interface TrabajadorDAO {
	
	//ANTERIOR VERSION DE LISTA
	List<BeanTrabajador> listarTrabajador();
	
	public Lista obtenerListaTrabajador() throws Exception;
	public void insertarTrabajador(BeanTrabajador objTrabajador) throws Exception;
	public void eliminarTrabajador(int codTrab) throws Exception;
	public void actualizarTrabajador(BeanTrabajador objTrabajador) throws Exception;
	public int NuevoIDTrabajador() throws Exception;

}
