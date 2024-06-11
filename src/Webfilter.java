
    public class Webfilter implements Filter{

        @Override
        public void konnektion() {
            boolean webadress = Useradmintype.ADMIN;
            boolean webadress = Useradmintype.USER;

            if (Useradmintype.ADMIN) {
                System.out.println(webadress);
            }

            return webadress;
         else{
                if (Useradmintype.USER && a.equals(getWebadress())) {
                    System.out.println(a);
                }

                return a;
            }


        }
    }
