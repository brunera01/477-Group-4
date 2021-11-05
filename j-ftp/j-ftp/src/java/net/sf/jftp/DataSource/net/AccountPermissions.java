package net.sf.jftp.DataSource.net;

import java.util.ArrayList;

public class AccountPermissions {
	
	private ArrayList<String> general = new ArrayList<String>();
	private ArrayList<String> admin = new ArrayList<String>();
	private ArrayList<String> blackList = new ArrayList<String>();
	
	public AccountPermissions() {
		admin.add("admin");
		blackList.add("bob");
	}
	
	public void addAdmin(String username) {
		if(!this.admin.contains(username)) {
			admin.add(username);
		}
	}
	
	public void addBlackList(String username) {
		if(!this.blackList.contains(username)) {
			blackList.add(username);
		}
	}
	
	public boolean isAdmin(String username) {
		if(this.admin.contains(username)) {
			return true;
		}
		return false;
	}
	
	public boolean isBlackListed(String username) {
		if(this.blackList.contains(username)) {
			return true;
		}
		return false;
	}
}
