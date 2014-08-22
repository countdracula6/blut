package com.dangal.androidchatter.toolbox;

public class StorageManipulator {

	public static final String Database_name = "AndroidChatter";
	public static final int Database_version = 1;
	
	public static final String _Id = "_id";
	public static final String Table_name_message = "table_message";
	public static final String Message_receiver = "receiver";
	public static final String Message_sender = "sender";
	
	public static final String TABLE_MESSAGE_CREATE = 
			"CREATE TABLE" + Table_name_message +
			" (" + _Id + " INTEGER PRIMARY KEY AUTOINCREMENT, "
			+ Message_receiver + " VARCHAR(25)"
			+ Message_sender + " VARCHAR(25)";
	
	public static final String TABLE_MESSAGE_DROP = "DROP TABLE IF EXISTS" + Table_name_message;
}
