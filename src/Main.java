public class Main {



      public static void main(String[] args) {
          Person person = new Person(UserType.USER);
          Webfilter webfilter = new Webfilter();
          boolean answer = webfilter.checkAccess("jsjsjdj", person.getUserType());
          System.out.println(answer);


      }}



