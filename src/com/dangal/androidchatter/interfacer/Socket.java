package com.dangal.androidchatter.interfacer;

public interface Socket {

	public String sendHTTPRequest(String Params);
	public int startListeningPort(int Port);
	
	public void stopListening();
	public void exit();
}
