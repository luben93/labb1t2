package tester;

import java.util.ArrayList;

import DB.Item;
import DB.NoSuchSQLLine;
import DB.User;
import DB.singeltonSQLUser;

public class test {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("testing");
DB.singeltonSQLUser tester = DB.singeltonSQLUser._getInstance();
singeltonSQLUser tester2 = singeltonSQLUser._getInstance();
	User user;
		User user2;
		try {
			System.out.println(user = tester.getUserByMail("mo"));
			System.out.println(user2 = tester.getUserByMail("luben"));
		//System.out.println(tester.getItemByName("item1"));
		//System.out.println(tester.payAllItemsInHistory(user));
		ArrayList<Item> list=tester.getItemsByCategory("cat1");
		for (int i=0;i<list.size();i++) {
			//tester.addItemsToHistory(list.get(i), user);
		}
		//System.out.println(tester.getCart(user));
		
		/*
		try {
			String hashpass=User.hasher("12345");
			System.out.println(hashpass);
			System.out.println(tmp.correctPassword(hashpass));
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		 
		} catch (NoSuchSQLLine e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tester=null;
		tester2=null;
		
		//DB.singeltonSQLUser tester3 = DB.singeltonSQLUser._getInstance();

	}

}
