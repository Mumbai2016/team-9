package org.dreamadream.service.impl;

import org.dreamadream.dao.impl.LevelDAO;
import org.dreamadream.model.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("levelService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class LevelService {

	
	@Autowired
	private LevelDAO levelDAO;
	
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public Level getLevel(String id) {
		
		return levelDAO.getLevel(id);
		
	}
	
	
		
		
}
