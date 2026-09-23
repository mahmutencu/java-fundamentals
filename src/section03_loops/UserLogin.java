package section03_loops;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        /* Writing a user login system using a while loop
        Algorithm of user login ;
        1.Initialization
          -create scanner object
          -define fixed system information
           String sysUsername = "mahmut"
           String sysPassword = "12345"
          -define user login attempt counter
          int loginAttempts = 3 ;
        2. Loop Condition(while(loginAttempts>0)
           loop will run only if there is enough loginAttempts
          get username:String USERNAME = scanner.nextLine();
          get password : String password = scanner.nextLine;
        3.login checks (if-else-if-else)
        case 1 login successful
          if(username.equals(sysUsername)&&password.equals(syspassword)
          print the screen welcome
          break the loop: break;
          case2:wrong username true password
          else if (!username.equals(sysUsername)&&password.equals(password)
          decreases login atempt : loginAttepmts--;
          print "wrong usernme you have "+loginAttempts+"login attempst

           case3:true username wrong password
          else if (username.equals(sysUsername)&&!password.equals(password)
          decreases login atempt : loginAttepmts--;
          print "wrong password you have "+loginAttempts+"login attempst


      case4:else wron userName and password
          else if (!username.equals(sysUsername)&&!password.equals(password)
          decreases login atempt : loginAttepmts--;
          print "wrong usernme and password you have "+loginAttempts+"login attempst

     control after the loop
     check if loop is finsh becuase of insufficient user login privileges
    if (loginAttempts ==0)
    print You have run out of login attempts; please try again later.

cleanup
scanner.close()

         */

        Scanner scanner = new Scanner(System.in);
        String sysUserName = "mahmut";
        String sysPassword = "java123";
        int LoginAttempt = 3;
        while (LoginAttempt > 0) {
            System.out.println("please enter the user name ");
            String UserName = scanner.nextLine();

            System.out.println("plesa enter your password ");
            String Password = scanner.nextLine();
            if (UserName.equals(sysUserName) && Password.equals(sysPassword)) {
                System.out.println("login is succesful... welcome mis/mister " + UserName);
                break;
            } else if (!UserName.equals(sysUserName) && Password.equals(sysPassword)) {
                LoginAttempt--;
                System.out.println("wrong user name please try eagain ");
                System.out.println("remain Login attempts  = " + LoginAttempt);
            } else if (UserName.equals(sysUserName) && !Password.equals(sysPassword)) {
                LoginAttempt--;
                System.out.println("wrong Password please try again ");
                System.out.println("remain login attempt=" + LoginAttempt);
            } else if (!UserName.equals(sysUserName) && !Password.equals(sysPassword)) {
                LoginAttempt--;
                System.out.println("wrong username and Password  ");
                System.out.println("remain login attempt =" + LoginAttempt);
            }
        }
        if (LoginAttempt == 0) {
            System.out.println("you have run out of login attempts please try again later ");
        }
        scanner.close();
    }
}









