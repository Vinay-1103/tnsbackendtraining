package me.vinay.tns.exceptionhandling;

public class InvalidCredentialException extends RuntimeException {
  int errorcode=123;
  
  public InvalidCredentialException(String msg){
    super(msg);
  }
  public String toString(){
    return "ErrorCode: "+errorcode + getMessage();
  }

}
