package com.virtusa.project.services.book;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.virtusa.project.books.Book;
import com.virtusa.project.services.database.DatabaseServices;
import com.virtusa.project.users.Member;

public class BookServices {
	
	@SuppressWarnings({"deprecation", "unchecked", "rawtypes"})
	public String sortBooksById(){

		Session session = DatabaseServices.openSession();
		Criteria criteria = session.createCriteria(Book.class);
		criteria.addOrder(Order.asc("bookId"));
		List<Book> book = criteria.list();
		Iterator iterator = book.iterator();
		String rowdata="";
		for(Book bk :book){
			String id =(bk.getMember() != null)? bk.getMember().getId()+"":"-";
			rowdata=rowdata.concat("<tr><td class=\"text-left\">"+bk.getBookId()+"</td><td class=\"text-left\">"+bk.getBookName()+"</td><td class=\"text-left\">"+bk.getEdition()+"</td><td class=\"text-left\">"+bk.getRating()+"</td><td class=\"text-left\">"+id+"</td></tr>");
		}
		
		DatabaseServices.closeSession(session);
		return rowdata;
	}
	@SuppressWarnings({"deprecation", "unchecked", "rawtypes"})
	public String sortBooksByName(){

		Session session = DatabaseServices.openSession();
		Criteria criteria = session.createCriteria(Book.class);
		criteria.addOrder(Order.asc("bookName"));
		List<Book> book = criteria.list();
		Iterator iterator = book.iterator();
		String rowdata="";
		for(Book bk :book){
			String id =(bk.getMember() != null)? bk.getMember().getId()+"":"-";
			rowdata=rowdata.concat("<tr><td class=\"text-left\">"+bk.getBookId()+"</td><td class=\"text-left\">"+bk.getBookName()+"</td><td class=\"text-left\">"+bk.getEdition()+"</td><td class=\"text-left\">"+bk.getRating()+"</td><td class=\"text-left\">"+id+"</td></tr>");
		}
		
		DatabaseServices.closeSession(session);
		return rowdata;
	}
	@SuppressWarnings({"deprecation", "unchecked", "rawtypes"})
	public String sortBooksByRating(){

		Session session = DatabaseServices.openSession();
		
		Criteria criteria = session.createCriteria(Book.class);
		criteria.addOrder(Order.desc("rating"));
		List<Book> book = criteria.list();
		Iterator iterator = book.iterator();
		String rowdata="";
		for(Book bk :book){
			String id =(bk.getMember() != null)? bk.getMember().getId()+"":"-";
			rowdata=rowdata.concat("<tr><td class=\"text-left\">"+bk.getBookId()+"</td><td class=\"text-left\">"+bk.getBookName()+"</td><td class=\"text-left\">"+bk.getEdition()+"</td><td class=\"text-left\">"+bk.getRating()+"</td><td class=\"text-left\">"+id+"</td></tr>");
		}
		
		DatabaseServices.closeSession(session);
		return rowdata;
	}
	@SuppressWarnings({"deprecation", "unchecked", "rawtypes"})
	public String sortByAuthor(){

		Session session = DatabaseServices.openSession();
		
		Criteria criteria = session.createCriteria(Book.class);
		criteria.addOrder(Order.asc("author"));
		List<Book> books = criteria.list();
		List<Book> book = criteria.list();
		Iterator iterator = book.iterator();
		String rowdata="";
		for(Book bk :book){
			String id =(bk.getMember() != null)? bk.getMember().getId()+"":"-";
			rowdata=rowdata.concat("<tr><td class=\"text-left\">"+bk.getBookId()+"</td><td class=\"text-left\">"+bk.getBookName()+"</td><td class=\"text-left\">"+bk.getEdition()+"</td><td class=\"text-left\">"+bk.getRating()+"</td><td class=\"text-left\">"+id+"</td></tr>");
		}
		
		DatabaseServices.closeSession(session);
		return rowdata;
	}
	@SuppressWarnings("deprecation")
	public Book searchByID(int id){
	
		Session session = DatabaseServices.openSession();
		Book book =(Book)session.get(Book.class, id);
		//print 
//		System.out.println(book);
		
		DatabaseServices.closeSession(session);
		return book;
	}
	@SuppressWarnings({"deprecation", "unchecked", "rawtypes"})
	public void searchByName(String name){

		Session session = DatabaseServices.openSession();
		
		Criteria criteria = session.createCriteria(Book.class);
		//need to fix for case insensitive matching
		criteria.add(Restrictions.eq("bookName",name));
		List<Book> book = criteria.list();
		Iterator iterator = book.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		DatabaseServices.closeSession(session);
	}
	@SuppressWarnings({"unchecked", "rawtypes", "deprecation"})
	public void searchByAuthor(String author){

		Session session = DatabaseServices.openSession();
		
		Criteria criteria = session.createCriteria(Book.class);
		//need to fix for case insensitive matching
		criteria.add(Restrictions.eq("author",author));
		List<Book> book = criteria.list();
		Iterator iterator = book.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		DatabaseServices.closeSession(session);
	}
	@SuppressWarnings({"deprecation", "unchecked", "rawtypes"})
	public void searchByRating(double rating){
		Session session = DatabaseServices.openSession();
		
		Criteria criteria = session.createCriteria(Book.class);
		//need to fix for case insensitive matching
		criteria.add(Restrictions.ge("rating", rating));
		criteria.addOrder(Order.asc("rating"));
		
		List<Book> book = criteria.list();
		Iterator iterator = book.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		DatabaseServices.closeSession(session);
	}
	@SuppressWarnings({"deprecation", "unchecked", "rawtypes"})
	public void displayBookList(){
		Session session = DatabaseServices.openSession();
		
		Criteria criteria = session.createCriteria(Book.class);
		List<Book> book = criteria.list();
		Iterator iterator = book.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		
		DatabaseServices.closeSession(session);
	}
	/*
	 *  Book Issue 
	 */
	@SuppressWarnings("deprecation")
	public String issueBook(int memberId, int bookId) {
		Session session = DatabaseServices.openSession();
		Transaction transaction = session.beginTransaction();
		
		Member member = (Member) session.get(Member.class, memberId);
		if (member!=null){
			if(member.getBook().size()<3){
				Book book = (Book) session.get(Book.class, bookId);
				if(book != null){
					if(book.getMember() == null){
						member.setBook(book);
						book.setMember(member);
						session.saveOrUpdate(book);
						transaction.commit();
						DatabaseServices.closeSession(session);
						return "Book Succefully Issued";
					}
					else{
						return "This book is Not available";
					}
				}
				else{
					return "Book Not found, Check Book Id Again";
				}
			}
			else{
				return "You Already Issued 3 books : Max Issue limit";
			}
		}
		else{
			return "Invalid User !!";
		}

		
		//session.close();
		//sessionFactory.close();
	}
	@SuppressWarnings("deprecation")
	public String returnBook(int memberId,int bookId){
		Session session = DatabaseServices.openSession();
		Transaction transaction = session.beginTransaction();
		
		Member member = (Member) session.get(Member.class, memberId);
		if (member!=null){
			if(member.removeIssuedBooks(bookId)){
				Book book = (Book) session.get(Book.class, bookId);
				book.setMember(null);
				session.saveOrUpdate(book);
				transaction.commit();
				DatabaseServices.closeSession(session);
				return "Book Successfully returend, Thank you";
			}
			else{
				return "Book is not found in your issued List";
			}
		}
		else{
			return "Invalid User !!";
		}
		//session.close();
		//sessionFactory.close();
	}
}
