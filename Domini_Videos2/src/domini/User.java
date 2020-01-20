package domini;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {

	private String name;
	private String surname;
	private String password;
	private Date register;
	private List<Video> videos = new ArrayList<Video>();

	public User(String name, String surname, String password, Date register) {

		this.name = name;
		this.surname = surname;
		this.password = password;
		this.register = register;
		this.videos = videos;

	}

	public List<Video> getVidList() {

		return videos;

	}

	public void setVidList(List<Video> videos) {

		this.videos = videos;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getSurname() {

		return surname;

	}

	public void setSurname(String surname) {

		this.surname = surname;

	}

	public String getPassword() {

		return password;

	}

	public void setPassword(String password) {

		this.password = password;

	}

	public Date getRegister() {

		return register;

	}

	public void setRegister(Date register) {

		this.register = register;

	}

	public String getInfoUser() {

		return "Your info is--> Name: " + name + ", Surname: " + surname + ", Password: " + password
				+ ", and your date of register is: " + register;

	}

	
	
	@Override
	public String toString() {
		return "User [videos=" + videos + "]";
	}

	public void getInfoList() {
		
		System.out.println("Your vid's list have " + videos.size() + " video/s: \n");

		if (videos.size() == 0) {
			
			System.out.println("You don't have any video created!");

		} else {

			for (int i = 0; i < videos.size(); i++) {
								
				System.out.println("Video number: " + (i+1) + "\n"+ videos.get(i).toString()+"\n");
				
			}
		}

	}
	
	

}
