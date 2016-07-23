package org.dreamadream.dao;

import org.dreamadream.model.UserDetails;

public interface ProfileDao {

	public UserDetails getProfile(UserDetails user);
}
