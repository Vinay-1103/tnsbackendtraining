package me.vinay.tns.oopsexercise.inheritance;

public class person {
        private String name;
        private String address;
        private long phone;

        public person(){
            System.out.println("This is person constructor");
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public long getPhone() {
            return phone;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setPhone(long phone) {
            this.phone = phone;
        }

        public void setName(String name) {
            this.name = name;
        }
    }



