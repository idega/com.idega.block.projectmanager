//idega 2000 - Gimmi

package com.idega.block.projectmanager.data;

//import java.util.*;
import java.sql.*;
import com.idega.data.*;

public class Importance extends GenericEntity{

	public Importance(){
		super();
	}

	public Importance(int id)throws SQLException{
		super(id);
	}


	public void initializeAttributes(){
		addAttribute(getIDColumnName());
		addAttribute("name","Mikilv�gi",true,true,"java.lang.String");
	}


        public String getIDColumnName(){
          return "pm_importance_id";
        }


        public String getEntityName(){
		return "i_pm_importance";
	}


	public String getName() {
		return (String) getColumnValue("name");
	}

	public void setName(String name) {
		setColumn("name",name);
	}

}