package domini;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Domini_Main_new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		User user = new User(null, null, null, null);
		boolean createVid = true;
		boolean addTag = true;
		boolean printInfo = true;
		boolean emptyUser = true;
		boolean emptyVid = true;
		boolean emptyTag = true;

		// inputs of user

		do {

			System.out.println("Write your name: ");

			user.setName(sc.nextLine().toLowerCase());

			System.out.println("Now your surname: ");

			user.setSurname(sc.nextLine().toLowerCase());

			System.out.println("And now your password: ");

			user.setPassword(sc.nextLine());

			if (user.getName().trim().isEmpty() || user.getSurname().trim().isEmpty()
					|| user.getPassword().trim().isEmpty()) {

				System.out.println("None of this fields can't be empty!");

				emptyVid = true;

			} else {

				emptyUser = false;

			}

		} while (emptyUser);

		user.setRegister(new Date());// date de registro

		// print info

		System.out.println(user.getInfoUser());

		// create user vid

		do {
			System.out.println("Do you want to create a video? Say YES or NO");

			String input = sc.nextLine().toLowerCase();

			if (input.equalsIgnoreCase("yes")) {

				Video userVid = new Video(null, null);

				// inputs of vid

				do {

					System.out.println("What's your vid's url?");

					userVid.setUrl(sc.nextLine());

					System.out.println("What's the title of your vid?");

					userVid.setTitle(sc.nextLine());

					if (userVid.getUrl().trim().isEmpty() || userVid.getTitle().trim().isEmpty()) {

						System.out.println("None of this fields can be empty!");

						emptyVid = true;

					} else {

						emptyVid = false;

					}

				} while (emptyVid);

				do {

					System.out.println("Do you want to add a tag to the vid? Say YES or NO");

					String input2 = sc.nextLine();

					if (input2.equalsIgnoreCase("yes")) {

						// inputs of tags for vid

						do {
							System.out.println("What tag do you want related to your vid?");

							Tag userTag = new Tag(sc.nextLine());
							
							if(userTag.getTag().trim().isEmpty()) {
								
								System.out.println("This field can't be empty!");
								
								emptyTag = true;
								
							} else {
								
								// add tag to tagList

								userVid.getTagsList().add(userTag);
								
								emptyTag = false;
								
							}

						} while (emptyTag);

						addTag = true;

					} else if (input2.equalsIgnoreCase("no")) {

						System.out.println("Ok, your tags for this vid are ready!");

						addTag = false;

						/*
						 * } else if (input2.isEmpty()) {
						 * 
						 * System.out.println("The field can't be empty!");
						 */

					} else {

						System.out.println("I don't understand you, sorry...");

						addTag = true;

					}

				} while (addTag);

				// print vid's info

				System.out.println(userVid.getInfoVideo());

				// add vid to user vidList

				user.getVidList().add(userVid);

				createVid = true;

			} else if (input.equalsIgnoreCase("no")) {

				System.out.println("Ok... We're ready!");

				createVid = false;

			} else {

				System.out.println("I don't understand you, sorry... ");

				createVid = true;

			}

		} while (createVid);

		System.out.println("Do you want to see your list of videos? Say YES or NO");

		String input3 = sc.nextLine().toLowerCase();

		// print the user vidlist's info

		do {

			if (input3.equalsIgnoreCase("yes")) {

				user.getInfoList();

				printInfo = false;

			} else if (input3.equalsIgnoreCase("no")) {

				System.out.println("Ok, we finished!");

				printInfo = false;

			} else {

				System.out.println("I don't understand you, sorry...");

			}
		} while (printInfo);

	}

}

/*
 * 
 * 
 * if(userTag.toString().isEmpty()) {
 * 
 * System.out.println("This field can't be empty!");
 * 
 * }
 * 
 * 
 */
