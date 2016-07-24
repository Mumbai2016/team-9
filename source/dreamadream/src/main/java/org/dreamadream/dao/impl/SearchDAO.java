package org.dreamadream.dao.impl;

import org.dreamadream.model.UserDetails;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("searchDAO")
public class SearchDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDetails search(String query){
		
		Session s = sessionFactory.openSession();
		String q = "from UserDetails as u where c like :s";
		Query qr = s.createQuery(q);
		qr.setParameter("s", "%"+query+"%");
		
		
		return (UserDetails)qr.list().get(0);
	}
}
