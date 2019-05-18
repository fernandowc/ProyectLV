/*
 * Created on 01/10/2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package factory;

import dao.*;
import SQLServer.*;


public class SqlServerDAOFactory extends Factory_DAO
{

	public TrabajadorDAO getDAO_Trabajador() 
	{return new SQLServerTrabajador();}

}
