package org.dreamadream.dao.impl;

import org.dreamadream.model.Level;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("levelDAO")
public class LevelDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Level getLevel(String id) {
				
		Level result = (Level)sessionFactory.getCurrentSession().get(Level.class, id);
		
		return result;
	}

	
	
}
