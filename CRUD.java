import java.util.*;

interface AdminService 
{
   void createAdmin(Admin admin);
   //void addAdmin(Admin admin);
   Admin updateAdmin(Admin admin);
   Admin deleteAdmin(Admin admin);
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
         if(adminArray[i].getAdminId() == admin.getAdminId()) 
         {
            adminArray[i] = admin;
            return admin;
         }
      }
      return admin;
   }
   
   //@Override
   public Admin deleteAdmin(int adminId) 
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
   public Admin searchAdmin(int adminId)
   {
      for(int i=0; i<adminArray.length; i++)
      {
         if(adminArray[i].getAdminId() == adminId)
         {
            return adminArray[i];
         }
      }
   return adminArray;
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

public class Source 
{
   public static void main(String args[]) 
   {
      AdminService adminService = new AdminServiceImpl();
      Admin raj = new Admin(1001, "raj@gmail.com", "Raj", "Kunar", "password4");
      adminService.createAdmin(raj);
      System.out.println(raj);
                    
      raj = new Admin(1001, "kumar@gmail.com", "Kumar", "Ashok", "password4");
      adminService.updateAdmin(raj);
      System.out.println(raj);
   }
}
