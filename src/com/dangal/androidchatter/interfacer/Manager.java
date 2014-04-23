package com.dangal.androidchatter.interfacer;

import java.io.UnsupportedEncodingException;

public interface Manager {

	public String getUsername();
	public String sendMessage(String username, String toUsername, String Message) throws UnsupportedEncodingException;
	public String authenticateUser(String usernameText, String passwordText)throws UnsupportedEncodingException;
	public String messageRecieved(String username, String message);
	
	public boolean isNetworkConnected();
	public boolean isUserAuthenticated();
	public String getLastRawFriendList();
	public void exit();
	public String signUpUser(String usernameText, String passwordText, String email);
	public String addNewFriendRequest(String friendUsername);
	public String sendFriendReqsResponse(String approvedFriendNames, String discardedFriendNames);
	
}
