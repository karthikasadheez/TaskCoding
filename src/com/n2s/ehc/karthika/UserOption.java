package com.n2s.ehc.karthika;

import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class UserOption {

	Hashtable<String, String> userHashTable = new Hashtable<>();

	public void insert(UserBean user) throws InvalidUserIdException {

		if (userHashTable.containsKey(user.getUserId().trim())) {

			throw new InvalidUserIdException("User Id already exist. Try different userId.");
		} else {
			userHashTable.put(user.getUserId().trim(), user.getUserName());
		}

	}
	
	public void update(UserBean user) throws UserIdNotFoundException{
		
		if(!userHashTable.containsKey(user.getUserId())) {
			throw new UserIdNotFoundException("User Id not available. Try different UserId.");
		} else {
			userHashTable.put(user.getUserId().trim(), user.getUserName());
		}
	}
	
	public void delete(String userId) throws UserIdNotFoundException {

		if (!userHashTable.containsKey(userId)) {
			throw new UserIdNotFoundException("User Id not available. Try different UserId.");
		} else {
			userHashTable.remove(userId);
		}
	}
	
	public Hashtable<String, String> viewUsers() {
		return userHashTable;
	}

}
