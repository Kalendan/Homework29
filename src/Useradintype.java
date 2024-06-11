
    public enum Useradmintype {
        USER,
        ADMIN;


        private String a;
        private String webadress;

        Useradmintype() {

        }


        @Override
        public String toString() {
            return "UserAdminType{" +
                    "webadress='" + webadress + '\'' +
                    ", a='" + a + '\'' +
                    '}';
        }



        Useradmintype(String webadress, String a) {
            this.webadress = webadress;
            this.a = a;
        }

        public String getWebadress() {
            return webadress;
        }

        public String getA() {
            return a;
        }


    }


