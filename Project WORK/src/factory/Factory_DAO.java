package factory;

import dao.*;

public abstract class Factory_DAO 
{
    public static final int SQLSERVER = 1;
    public static final int MYSQL = 2;
    public static final int ORACLE = 3;
    public static final int DB2 = 4;
    public static final int XML = 5;
    
    // Existirá un método por cada DAO que pueda ser creado.
    // En este clase se asume solo se crearan 2 DAOs.
    //ventas
    public abstract TrabajadorDAO getDAO_Trabajador();
        
    public static Factory_DAO getDAO_Factory(int whichFactory)
    {
       switch(whichFactory)
	   {
	   	case SQLSERVER:	return new SqlServerDAOFactory();
	   	/*
       	case MYSQL	:	return new Factory_Sql();
       	case ORACLE	:	return new Factory_Oracle();
       	case DB2	:	return new Db2DAOFactory();
       	case XML	:	return new XmlDAOFactory();
       	*/
       	default		:    return null;
       }
    }
}



