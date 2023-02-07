public class Address {
    private String flatNumber;
    private String socityname;
    private int pincode;

    public static Address getInstance() {
        return new Address();
    }

        public String getFlatNumber () {
            return flatNumber;
        }

        public void setFlatNumber (String flatNumber){
            this.flatNumber = flatNumber;
        }

        public String getSocityname () {
            return socityname;
        }

        public void setSocityname (String socityname){
            this.socityname = socityname;
        }

        public int getPincode () {
            return pincode;
        }

        public void setPincode ( int pincode){
            this.pincode = pincode;
        }

    @Override
    public String toString() {
        return "Address{" +
                "flatNumber='" + flatNumber + '\'' +
                ", socityname='" + socityname + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    public void setSocietyName(String vista_vintage) {
    }

    public void setPinCode(int i) {
    }
}
