interface AdminService 
{
   void createAdmin(Admin admin);
   //void addAdmin(Admin admin);
   Admin updateAdmin(Admin admin);
   void deleteAdmin(int admin);
   Admin searchAdmin(Admin admin);
   Admin[] getAdmin();
}

class AdminServiceImpl implements AdminService
{
   public static Admin adminArray[] = new Admin[5];
   static int count = 0;

   @Override
   public void createAdmin(Admin admin) 
   {
      adminArray[count] = admin;
      count++;
   }
   
   @Override
   public Admin updateAdmin(Admin admin) 
   {
      for(int i=0; i<adminArray.length; i++) 
      {
         if(adminArray[i].getAdminId()== admin.getAdminId()) 
         {
            adminArray[i] = admin;
            return admin;
         }
      }
      return admin;
   }
   
   //@Override
   public void deleteAdmin(int adminId) 
   {
      for(int i=0; i<adminArray.length; i++) 
      {
         if(adminArray[i].getAdminId() == adminId) 
         {
            adminArray[i] = null;
            break;
         }
      }
   }
   
   //@Override
   public Admin searchAdmin(Admin adminName) throws NullPointerException
   {
      int i;
      for(i=0; i<adminArray.length; i++)
      {
         if(adminArray[i].getAdminId() == adminName.getAdminId())
         {
            return adminArray[i];
         }
      }
   return adminArray[i];
   }
   
   public Admin[] getAdmin() 
   {
      return adminArray;
   }

}

class Admin 
{
   private int adminId;
   private String emailId, firstName, lastName, password;

   Admin(int adminId, String emailId, String firstName, String lastName, String password) 
   {
      this.adminId = adminId;
      this.emailId = emailId;
      this.firstName = firstName;
      this.lastName = lastName;
      this.password = password;
   }

   public int getAdminId() 
   {
      return adminId;
   }

   public void setAdminId(int adminId) 
   {
      this.adminId = adminId;
   }

   public String getEmailId() 
   {
      return emailId;
   }

   public void setEmailId(String emailId) 
   {
      this.emailId = emailId;
   }

   public String getFirstName() 
   {
      return firstName;
   }

   public void setFirstName(String firstName) 
   {
      this.firstName = firstName;
   }

   public String getLastName() 
   {
      return lastName;
   }

   public void setLastName(String lastName) 
   {
      this.lastName = lastName;
   }

   public String getPassword() 
   {
      return password;
   }

   public void setPassword(String password) 
   {
      this.password = password;
   }

   public String toString() 
   {
      return ("Admin[adminId="+adminId+",emailId="+emailId+",firstName="+firstName+",lastName="+lastName+",password="+password+"]");
   }
}

public class CRUD
{
   public static void main(String args[]) 
   {
      AdminService adminService = new AdminServiceImpl();
      Admin rajan = new Admin(1004, "rajan@gmail.com", "Rajan", "Arun", "password4");
      Admin rajan1 = new Admin(1002, "rajan@gmail.com", "Raja", "Arun", "password4");

      //create
      adminService.createAdmin(rajan); //essential to run 
      adminService.createAdmin(rajan1); //essential to run 
      
      //Update
      // rajan.setAdminId(2004); //essential to run 
      System.out.println(rajan);


      //Update1
      // System.out.println(adminService.updateAdmin(rajan1)); //essential to run 

      //Delete
      // System.out.println(Arrays.toString(adminService.getAdmin()));
      // adminService.deleteAdmin(rajan.getAdminId());               //essential to run 
      // System.out.println();
      // System.out.println(Arrays.toString(adminService.getAdmin()));

      //Get
      // System.out.println(Arrays.toString(adminService.getAdmin()));  //essential to run 
      // System.out.println(rajan);
      // System.out.println(rajan1);

      //serch
      // System.out.println(adminService.searchAdmin(rajan)); //essential to run 

      // System.out.println(rajan+"\n"+rajan1);//for test before results // print both
   }
}