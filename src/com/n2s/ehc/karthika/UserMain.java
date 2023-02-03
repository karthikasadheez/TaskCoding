package com.n2s.ehc.karthika;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class UserMain extends UserOption {

	public static void main(String[] args) throws UserExceptions {
		//Hashtable<Integer, UserBean> userHashTable = new Hashtable<>();

		Scanner sc = new Scanner(System.in);
		UserOption userOption = new UserOption();
		int option = 0;
		String optionsFlag = "";
		do {
			do {
				try {
					option = getInputOption(sc);
				} catch (UserExceptions e) {
					System.out.println(e.getMessage());
				}
			} while (option == 0);

			switch (option) {
			case 1:
				String insertFlag = "n";
				do {
					System.out.println("Insert");
					System.out.println("*********");
					System.out.println("Enter UserId:");
					String userid = sc.next();
					System.out.println("Enter Name:");
					String username = sc.next();
					UserBean user = new UserBean(1, userid, username);
					userOption.insert(user);
					System.out.println("Insert Success!!!");
					sc.nextLine();
					System.out.println("Wish to insert more y/n");
					insertFlag = sc.next();
					optionsFlag = insertFlag;
				} while ("y".equals(insertFlag));
				break;
			case 2:
				String updateflag = "n";
				do {
					System.out.println("Update");
					System.out.println("*********");
					System.out.println("Enter UserId:");
					String userid = sc.next();
					System.out.println("Enter Name:");
					String username = sc.next();

					UserBean user = new UserBean(1, userid, username);
					userOption.update(user);
					System.out.println("Update Success!!!");
					sc.nextLine();
					System.out.println("Wish to update more y/n");
					updateflag = sc.next();
					optionsFlag = updateflag;
				} while ("y".equals(updateflag));
				break;
			case 3:
				String deleteFlag = "n";
				do {
					System.out.println("Delete");
					System.out.println("*********");
					System.out.println("Enter UserId:");
					String userid = sc.next();
					try {
						userOption.delete(userid);
						System.out.println("Delete Success!!!");
					} catch(UserExceptions e) {
						System.out.println(e.getMessage());
					}
					sc.nextLine();
					System.out.println("Wish to delete more y/n");
					deleteFlag = sc.next();
					optionsFlag = deleteFlag;
				} while ("y".equals(deleteFlag));
				break;
			case 4:
				String viewFlag = "n";
				System.out.println("View");
				System.out.println("*********");
				Hashtable<String, String> users = userOption.viewUsers();
				Set<Entry<String, String>> userSet = users.entrySet();
				int i = 0;
				System.out.println("S.No1       Id        Name ");
				for (Entry<String, String> user : userSet) {

					// print to display the id  and name 
					System.out.println(++i + "\t" + user.getKey() + "\t" + user.getValue());
				}
				optionsFlag = "n";
				break;
			case 5:
				System.out.println("Exit");
				optionsFlag = "y";
				break;
			}
		} while ("n".equals(optionsFlag));

	}

	private static int getInputOption(Scanner sc) throws InvalidEntryExceptions {
		int option = 0;
		System.out.println("Choose the options below");
		System.out.println("*********************************");
		System.out.println("1-Insert");
		System.out.println("2-Update");
		System.out.println("3-Delete");
		System.out.println("4-View");
		System.out.println("5-Exit");
		System.out.println("Enter your Option Value");
		option = sc.nextInt();
		if (option < 1 || option > 5) {
			throw new InvalidEntryExceptions("Invalid Option Selected.");
		}
		return option;
	}
}
