// This is the FacebookPerson_Graphics class
// Dr. Xiaolin Hu
// 04/05/2011

public class FacebookPerson_Graphics{

  private String myName;
  private String myMood;
  private Facebook_Graphics myfacebook;

  public FacebookPerson_Graphics(String name){
      myName = name;
      myfacebook = new Facebook_Graphics(myName);
  }

  public String getName(){
      return myName;
  }

  public void setMood(String newMood){
     myMood = newMood;
     myfacebook.setContent(myMood);
  }

  public String getMood(){
      return myMood;
  }

}