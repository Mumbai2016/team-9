package org.dreamadream.service.impl;

import org.dreamadream.beans.UserDetailsBean;
import org.dreamadream.dao.ProfileDao;
import org.dreamadream.model.UserDetails;
import org.dreamadream.service.ProfileService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("profileService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ProfileServiceImpl implements ProfileService{

	@Autowired
	private ProfileDao profileDAO;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public UserDetailsBean getProfile(UserDetailsBean userDetailsBean) {
		//Profile result = profileDAOImpl.getProfile(user);
		
			System.out.println("in service before dao");
			UserDetails userDetails=new UserDetails();
			userDetails.setUserId(userDetailsBean.getUserId());
			
			
			UserDetails result = profileDAO.getProfile(userDetails);
			System.out.println("in service after dao");
			
			if(result == null){
				System.out.println("Returned NULL");
			}
			
			BeanUtils.copyProperties(result,userDetailsBean);
			
			
			return userDetailsBean;
		
	}
}
