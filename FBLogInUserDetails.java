package com.demo;

import com.bean.UserProfile;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.Page;
import com.restfb.types.User;

public class FBLogInUserDetails {
	
	public UserProfile getUserProfileInfo(String accessToken) {
		FacebookClient facebookClient=new DefaultFacebookClient(accessToken);
		User user=facebookClient.fetchObject("me", User.class);
		String userName=user.getName();
		System.out.println("User name="+userName);
		UserProfile userProfile=new UserProfile();
		userProfile.setUserName(userName);
		return userProfile;
		
	}

}
