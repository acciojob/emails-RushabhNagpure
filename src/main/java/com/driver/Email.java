package com.driver;

import static java.lang.System.out;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

   if(oldPassword.equals(password)){
    if(valid(newPassword)){
        out.println("Password changed succesfully");
        this.password = newPassword;
    }else{
        out.println("the new password is not valid");
    }
   }else {
       out.println("The given password does not match current password");
   }
    }

   private boolean valid(String password){
        boolean capitalLetter = false;
        boolean smallLetter   = false;
        boolean   digit  = false;
        boolean specialLetter = false;

        if(password.length() < 8){
            return false;
        }

       for (int i = 0; i <password.length() ; i++) {
           char ch = password.charAt(i);
           if((ch >= 'A' ) && (ch <= 'Z')){
               capitalLetter = true;
           }
           else if((ch >= 'a') &&( ch <= 'z')){
               smallLetter = true;
           }
          else if((ch >= '0') && (ch <= '9')){
               digit = true;
           }else
              specialLetter = true;

       }
       if(capitalLetter && smallLetter && digit && specialLetter)
           return true;
       return false;
   }

}
