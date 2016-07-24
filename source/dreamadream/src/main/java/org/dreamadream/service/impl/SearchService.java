package org.dreamadream.service.impl;

import org.dreamadream.beans.UserDetailsBean;
import org.dreamadream.dao.ProfileDao;
import org.dreamadream.dao.impl.SearchDAO;
import org.dreamadream.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


public class SearchService {

	@Autowired
	private SearchDAO searchDAO;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public UserDetails search(String name) {
		//Profile result = profileDAOImpl.getProfile(user);
		return searchDAO.search(name);
	}
}
