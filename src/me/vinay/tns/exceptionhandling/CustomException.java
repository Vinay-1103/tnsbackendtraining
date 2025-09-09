package me.vinay.tns.exceptionhandling;

public class CustomException {
        
        static void authrnticate(String Username,String password) throws InvalidCredentialException {
            String vaildUsename = "Vinay";
            String validpassword = "Vinay@786";
            if (!Username.equals(vaildUsename) || !password.equals(validpassword)){
                throw new InvalidCredentialException("Invalid username or password");
            }
            System.out.println("Sucessful");
        }

        public static void main(String[] args) {
            try {
                authrnticate("Vinay","vinay@786");
            }catch (InvalidCredentialException e){
                System.out.println(e);
            }
        }

    }

