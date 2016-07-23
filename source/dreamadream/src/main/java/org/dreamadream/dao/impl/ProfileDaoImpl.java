package org.dreamadream.dao.impl;



import org.dreamadream.dao.ProfileDao;
import org.dreamadream.model.UserDetails;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("profileDAO")
public class ProfileDaoImpl implements ProfileDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDetails getProfile(UserDetails user) {
		
		UserDetails result = (UserDetails)sessionFactory.getCurrentSession().get(UserDetails.class, user.getUserId());
		System.out.println(result.getFirstName());
		
		return result;
	}
}
