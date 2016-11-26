package com.virtusa.project.ui.service;

import com.virtusa.project.services.admin.AdminServices;
import com.virtusa.project.services.database.DatabaseServices;

public class UiServices {
	
	public boolean adminLogin(int adminId,String passwd) {
		DatabaseServices databaseServices = new DatabaseServices();
		return databaseServices.authenticateAdmin(adminId, passwd);
	}
	public String getAdminName(int adminId) {
		DatabaseServices databaseServices = new DatabaseServices();
		return databaseServices.getAdminNameFromDB(adminId);
	}
	public boolean memberLogin(int memberId,String passwd) {
		DatabaseServices databaseServices = new DatabaseServices();
		return databaseServices.authenticateMember(memberId, passwd);
	}
	public String getMemberName(int memberId) {
		DatabaseServices databaseServices = new DatabaseServices();
		return databaseServices.getMemberNameFromDB(memberId);
	}
	public boolean addUser(String userName,String password,String userPhoneNumber){
		AdminServices adminSerivices = new AdminServices();
		return(adminSerivices.addUser(userName, password, userPhoneNumber));	
	}
	public void addBook(String bookName,String authorNmae,String edition){
		AdminServices adminSerivices = new AdminServices();
		adminSerivices.addBook(bookName, authorNmae, edition);	
	}
	public boolean validateMemberId(int memberId){
		DatabaseServices databaseServices = new DatabaseServices();
		return(databaseServices.validateMemberId(memberId));		
	}
	public boolean validateBookId(int bookId){
		DatabaseServices databaseServices = new DatabaseServices();
		return(databaseServices.validateBookId(bookId));		
	}
	public void removeUser(int userId){
		AdminServices adminSerivices = new AdminServices();
		adminSerivices.removeUser(userId);	
	}
	public void removeBook(int bookId){
		AdminServices adminSerivices = new AdminServices();
		adminSerivices.removeBook(bookId);	
	}
	public String displayUserDetails(){
		AdminServices adminSerivices = new AdminServices();
		return(adminSerivices.displayUserDetails());
	}
	public String displayBookDetails(){
		AdminServices adminSerivices = new AdminServices();
		return(adminSerivices.displayBookDetails());
	}
	public String getMemberString(int memberId){
		String memberString="";
		DatabaseServices databaseServices = new DatabaseServices();
		memberString = databaseServices.getMemberObjectString(memberId);
		return memberString;
	}
	public String getBookString(int memberId){
		String bookString="";
		DatabaseServices databaseServices = new DatabaseServices();
		bookString = databaseServices.getBookObjectString(memberId);
		return bookString;
	}
	public void updateUser(int memberId,String userName,String password,String userPhoneNumber){
		AdminServices adminSerivices = new AdminServices();
		adminSerivices.updateUserDetails(memberId, userName, password, userPhoneNumber);
	}
	public void updateBook(int bookId,String bookName,String authorNmae,String edition){
		AdminServices adminSerivices = new AdminServices();
		adminSerivices.updateBookDetails(bookId, bookName, authorNmae, edition);
	}
}
