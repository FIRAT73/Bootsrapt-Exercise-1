package work3;

public class UserManager {
	
	public void userAdd(User user) {
		System.out.println("Yeni kullanıcı : \n" + "iId: " + user.getId() + "\n" + "E-mail: " + user.getEmail() + "\n"
				+ "Password : " + user.getPassword() + "\n" + "İlgilendiği kurs : " + user.getCourse() + "\n\n");
	}

}
