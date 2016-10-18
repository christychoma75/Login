import java.util.Scanner;

public class Login {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String username;
    String password;
    
    System.out.println("Log in:");
    System.out.println("username: ");

	username = input.next();
	System.out.println("password: ");
	
	password = input.next();
	//users check = new users(username, password)
	if(username.equals(username) && password.equals(password)) {
	System.out.println("You are logged in");
	}else{
	System.out.println("Failed to log in");
	}
	}
	}


