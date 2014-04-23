package com.dangal.androidchatter.toolbox;

import com.dangal.androidchatter.typo.InfoOfFriends;

public class ControlerOfFriend {

	public static InfoOfFriends[] friendsInfo = null;
	public static InfoOfFriends[] unapprovedFriends = null;
	public String activeFriends;
	
	public static void setFriendsInfo(InfoOfFriends[] friends)
	{
		ControlerOfFriend.friendsInfo = friends;
	}
	
	public static InfoOfFriends checkFriends(String username, String userkey)
	{
		InfoOfFriends result = null;
		if(friendsInfo != null)
		{
			for(int i = 0; i < friendsInfo.length; i++)
			{
				if(friendsInfo[i].Username.equals(username) && friendsInfo[i].UserKey.equals(userkey))
				{
					result = friendsInfo[i];
					break;
				}
			}
		}
		
		return result;
	}
	
	public static InfoOfFriends getFriendsInfo(String username)
	{
		InfoOfFriends result = null;
		if(friendsInfo != null)
		{
			for(int i = 0; i < friendsInfo.length; i++)
			{
				if(friendsInfo[i].Username.equals(username))
				{
					result = friendsInfo[i];
					break;
				}
			}
		}
		
		return result;
		
	}
}
