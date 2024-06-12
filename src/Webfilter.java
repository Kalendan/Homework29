
 public class Webfilter implements Filter {


  private static final String ACCESS_SITE_TO_USER = "http://web-for-user";

  @Override
  public boolean checkAccess(String site, UserType userType) {
   if (userType == UserType.ADMIN) {
    return true;
   }
   if (userType == UserType.USER && site.startsWith(ACCESS_SITE_TO_USER)) {
    return true;
   }
   return false;

  }
 }