public class help{
	public static class Customer {
   private String userId;
   private String firstName;
   private String lastName;
   private String password;
   private String city;
   private String emailId;
   private String gender;
   private String phoneNumber;

   public Customer() {
   }

   @Override
   public String toString() {
      String result = "userId=" +userId+ ", ";
      result += "emailId=" +emailId+", ";
      result += "password="+password+", ";
      result += "firstName="+firstName+ ", ";
      result+="lastName="+lastName+",";
      result += "city="+city+", ";
      result+="gender="+gender+", ";
      result+="phoneNumber="+phoneNumber+".\n";
      return result;
   }
   public String getuserId() {
      return userId;
   }
   public void setuserId(String userId) {
      this.userId = userId;
   }

   public String getfirstName() {
      return firstName;
   }
   public void setfirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getPassword() {
      return password;
   }
   public void setPassword(String password) {
      this.password = password;
   }

   public String getCity() {
      return city;
   }
   public void setCity(String city) {
      this.city = city;
   }

   public String getEmailId() {
      return emailId;
   }
   public void setEmailId(String emailId) {
      this.emailId = emailId;
   }

   public String getGender(){
      return gender;
   }
   public void setGender(String gender){
      this.gender=gender;
   }

   public String getPhoneNumber(){
      return phoneNumber;
   }
   public void setPhoneNumber(String phoneNumber){
      this.phoneNumber=phoneNumber;
   }
   public Customer(String userId, String emailId,String password,String firstName, String lastName,String city,String gender,String phoneNumber) {
      this.userId = userId;
      this.firstName = firstName;
      this.lastName=lastName;
      this.password = password;
      this.city = city;
      this.emailId = emailId;
      this.phoneNumber=phoneNumber;
      this.gender=gender;
   }
}
public static class Address {
   private String city;
   private String state;
   private int zip;
   private String country;

   public Address() {
   }

   public Address(String city, String state, int zip, String country) {
      this.city = city;
      this.state = state;
      this.zip = zip;
      this.country = country;
   }

   public String getCity() {
      return city;
   }
   public void setCity(String city) {
      this.city = city;
   }

   public String getState() {
      return state;
   }
   public void setState(String state) {
      this.state = state;
   }

   public int getZip() {
      return zip;
   }
   public void setZip(int zip) {
      this.zip = zip;
   }

   public String getCountry() {
      return country;
   }
   public void setCountry(String country) {
      this.country = country;
   }

   @Override
   public String toString() {
      String result = city + " ";
      result += state + " ";
      result += zip + " ";
      result += country;
      return result;
   }
}
public static class ServiceDetails{
   private String serviceId;
   private String busId;
   private String deptDateTime;
   private String arrDateTime;
   private String arrivalCity;

   public ServiceDetails(){

   }
   public ServiceDetails(String serviceId,String busId,String deptDateTime,String arrDateTime,String arrivalCity){
      this.serviceId=serviceId;
      this.busId=busId;
      this.deptDateTime=deptDateTime;
      this.arrDateTime=arrDateTime;
      this.arrivalCity=arrDateTime;
   }
   public String getServiceId(){
      return serviceId;
   }
   public void setServiceId(String serviceId){
      this.serviceId=serviceId;
   }

   public String getBusId(){
      return busId;
   }
   public void setBusId(String busId){
      this.busId=busId;
   }

   public String getdeptDateTime(){
      return deptDateTime;
   }
   public void setdeptDateTime(String deptDateTime){
      this.deptDateTime=deptDateTime;
   }

   public String getarrDateTime(){
      return arrDateTime;
   }
   public void setarrDateTime(String arrDateTime){
      this.arrDateTime=arrDateTime;
   }
   public String getarrivalCity(){
      return arrivalCity;
   }
   public void setarrivalCity(String arrivalCity){
      this.arrivalCity=arrivalCity;
   }
   // toSring method <>
}
	public static void main(String[]args){
      Customer cs =new Customer();
      Address ad=new Address();
      ServiceDetails sd=new ServiceDetails();
      
      //customer seters
      cs.setuserId("1000");
      cs.setEmailId("admin@gmail.com");
      cs.setPassword("Password");
      cs.setfirstName("Raj");
      cs.setLastName("Kumar");
      cs.setCity("Bangalore");
      cs.setGender("Male");
      cs.setPhoneNumber("1234567890");
      //address seters
      ad.setCity("Bangalore");
      ad.setState("Karnataka");
      ad.setZip(123456);
      ad.setCountry("India]");
      //ServiceDetails seters
      sd.setServiceId("SID1001");
      sd.setBusId("BUS001");
      sd.setdeptDateTime("10/01/2022");
      sd.setarrDateTime("15/01/2022");
      sd.setarrivalCity("Bangalore");

      //customer-print1
      String result = "Customer[userId=" +cs.getuserId()+ ", ";
      result += "emailId=" +cs.getEmailId()+".\n";
      result += "password="+cs.getPassword()+", ";
      result += "firstName="+cs.getfirstName()+ ", ";
      result+="lastName="+cs.getLastName()+".\n";
      result += "city="+cs.getCity()+", ";
      result+="gender="+cs.getGender()+", ";
      result+="phoneNumber="+cs.getPhoneNumber()+".\n";
      //Address-print1
      result+="address=Address [city="+ad.getCity()+", ";
      result+="state="+ad.getState()+", ";
      result+="zip="+ad.getZip()+".\n";
      result+="country="+ad.getCountry()+". ";
      //ServiceDetails seters
      result+="serviceDetails=ServiceDetails\n";
      result+="[serviceId="+sd.getServiceId()+", ";
      result+="busId="+sd.getBusId()+", ";
      result+="deptDateTime="+sd.getdeptDateTime()+".\n";
      result+="arrDateTime="+sd.getarrDateTime()+".";
      result+="arrivalCity="+sd.getarrivalCity()+".";

      System.out.println(result);
	}
}