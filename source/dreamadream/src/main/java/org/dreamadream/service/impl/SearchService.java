package org.dreamadream.service.impl;

import org.dreamadream.beans.UserDetailsBean;
import org.dreamadream.dao.ProfileDao;
import org.dreamadream.dao.impl.SearchDAO;
import org.dreamadream.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service("searchService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class SearchService {

	@Autowired
	private SearchDAO searchDAO;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public UserDetails search(String name) {
		//Profile result = profileDAOImpl.getProfile(user);
		return searchDAO.search(name);
	}
}
