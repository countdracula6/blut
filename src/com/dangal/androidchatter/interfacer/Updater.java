package com.dangal.androidchatter.interfacer;

import com.dangal.androidchatter.typo.InfoOfFriends;
import com.dangal.androidchatter.typo.InfoOfMessage;

public interface Updater {

	public String updateData(InfoOfMessage[] message, InfoOfFriends[] friends,
			InfoOfFriends unApprovedFriends, String userkey);
}
