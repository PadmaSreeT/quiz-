package client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
class q1 extends Thread
{ 
	int b1=0;
	 int score1=0;
	  public void run()
	  {
		  for(int s=0;s<1;s++)
		  {
			  try
			  {
        System.out.println("1. Who invented Java Programming?\n"+
        	    "1) Guido van Rossum\n"+
        		"2) James Gosling\n"+
        		"3) Dennis Ritchie\n"+
        		"4) Bjarne Stroustrup");
        InputStreamReader bh=new InputStreamReader(System.in);
 	   BufferedReader bho=new BufferedReader(bh);
 	  String input1=bho.readLine();
		if(input1 ==null) {
			input1="0";
		}
		else {	 
		if(input1.equals("2"))
		    {
			 score1=5;
		    }
		    else if(input1.equals("1") || input1.equals("3") || input1.equals("4"))
		    {
		    	score1=-1;
		    }
		    else 
			 {
			    	score1=0;
			 }	 
		}
			  }
			 catch(NumberFormatException | IOException e)
	    	 {
	    		  System.out.println(e);   
	    		 
			}
	         }
	   }
	  public int getscore1() {
		  return score1;
	  }
}
      class q2  extends Thread
      {
    	  int b2=0;
    	  int score2=0;
    	  public void run()
    	  {
    		  for(int s=0;s<1;s++)
    		  {
    			  try
    			  { 
              System.out.println("2. Which component is used to compile, debug and execute the java programs?\n"+
					 "1) JRE\n"+
					 "2) JIT\n"+
					 "3) JDK\n"+
					 "4) JVM");
              InputStreamReader sh=new InputStreamReader(System.in);
       	   BufferedReader sha=new BufferedReader(sh);
       	  String input2=sha.readLine();
			if(input2 ==null) {
				input2="0";
			}
			else {
	if(input2.equals("3"))
   {
		 score2=5;
   }
else if(input2.equals("1") || input2.equals("2") || input2.equals("4"))
   {
	 score2=-1;
   }
   else 
	 {
   	score2=0;
	 }
			}
    			  }
				 catch(NumberFormatException | IOException  e)
		    	 {
		    		  System.out.println(e);   
		    		 }
		         }
    	  } public int getscore2() {
    		  return score2;
    	  }
		   }
      class q3 extends Thread
      {
    	  int b3=0;
    	  int score3=0;
    	  public void run()
    	  {
    		  for(int s=0;s<1;s++)
    		  {
    			  try
    			  {
			System.out.println("3. Which of these cannot be used for a variable name in Java?\n"+
					"1) identifier & keyword\n"+
					"2) identifier\n"+
					"3) keyword\n"+
					"4) none of the mentioned");
			InputStreamReader shi=new InputStreamReader(System.in);
     	   BufferedReader shai=new BufferedReader(shi);
     	  String input3=shai.readLine();
			if(input3 ==null) {
				input3="0";
			}
			else {
	if(input3.equals("3"))
	    {
		 score3=0;
	    }
	 else if(input3.equals("1") || input3.equals("2") || input3.equals("4"))
	    {
		 score3=0;
	    }
	    else
		 {
	    	score3=0;
		 }
				 }}
 				 catch(NumberFormatException | IOException e)
 		    	 {
 		    		  System.out.println(e);   
 		    		 }
 		         }
 		      } public int getscore3() {
 				  return score3;
 			  }
 		   }
       class q4 extends Thread
       {
    	   int b4=0;
    	   int score4=0;
     	  public void run()
     	  {
     		 for(int s=0;s<1;s++)
     		  {
     			  try
     			  {
			System.out.println ("4. What is the extension of java code files?\n"+
					 "1) .js\n"+
					 "2) .txt\n"+
					 "3) .class\n"+
					 "4) .java");
			InputStreamReader mo=new InputStreamReader(System.in);
     	   BufferedReader mou=new BufferedReader(mo);
     	  String input4=mou.readLine();
			if(input4 ==null) {
				input4="0";
			}
			else {
if(input4.equals("4"))
 {
	 score4=5;
 }
else if(input4.equals("1") || input4.equals("2") || input4.equals("3"))
 {
	 score4=-1;
 }
 else 
	 {
 	score4=0;
  }}
     			 }
 				 catch(NumberFormatException | IOException e)
 		    	 {
 		    		  System.out.println(e);   
 		    		 }
 		         }
 		      } public int getscore4() {
 				  return score4;
 			  }
 		   }
       class q5 extends Thread
       {
    	   int b5=0;
    	   int score5=0;
     	  public void run()
     	  {
     		 for(int s=0;s<1;s++)
     		  {
     			  try
     			  {
		   System.out.println("5. Which of the following is not an OOPS concept in Java?\n"+
					 "1) Polymorphism\n"+
					 "2) Inheritance\n"+
					 "3) Compilation\n"+
					 "4) Encapsulation");
		   InputStreamReader sa=new InputStreamReader(System.in);
    	   BufferedReader sat=new BufferedReader(sa);
    	  String input5=sat.readLine();
		if(input5 ==null) {
			input5="0";
		}
		else {
if(input5.equals("3"))
{
 score5=5;
}
else if(input5.equals("1") || input5.equals("2") || input5.equals("4"))
{
 score5=-1;
}
else 
 {
	score5=0;
 }}
     			 }
 				 catch(NumberFormatException | IOException e)
 		    	 {
 		    		  System.out.println(e);   
 		    		 }
 		         }
 		      } public int getscore5() {
 				  return score5;
 			  }
 		   }
       class q6 extends Thread
       {
    	   int b6=0;
    	   int score6=0;
    	   public void run()
      	  {
    	   for(int s=0;s<1;s++)
     	  {
     	    try
     			  {
		  System.out.println ("6. Which of the following is a type of polymorphism in Java Programming?\n"+
					 "1) Multiple polymorphism\n"+
				   	 "2) Compile time polymorphism\n"+
					 "3) Multilevel polymorphism\n"+
					 "4) Execution time polymorphism");
		  InputStreamReader su=new InputStreamReader(System.in);
   	   BufferedReader sur=new BufferedReader(su);
   	  String input6=sur.readLine();
		if(input6 ==null) {
			input6="0";
		}
		else {
if(input6.equals("2"))
{
score6=5;
}
else if(input6.equals("1") || input6.equals("3") || input6.equals("4"))
{
score6=-1;
}
else 
{
	score6=0;
}}
     			 }
 				 catch(NumberFormatException | IOException e)
 		    	 {
 		    		  System.out.println(e);   
 		    		 }
 		         }
 		      } public int getscore6() {
 				  return score6;
 			  }
 		   }
       class q7 extends Thread
       {
    	   int b7=0;
    	   int score7=0;
     	  public void run()
     	  {
     		 for(int s=0;s<1;s++)
     		  {
     			  try
     			  {
		  System.out.println ("7. What is the extension of compiled java classes?\n"+
					 "1) .txt\n"+
					 "2) .js\n"+
					 "3) .class\n"+
					 "4) .java");
		  InputStreamReader sho=new InputStreamReader(System.in);
   	   BufferedReader show=new BufferedReader(sho);
   	  String input7=show.readLine();
		if(input7 ==null) {
			input7="0";
		}
		else {
if(input7.equals("3"))
{
 score7=5;
}
else if(input7.equals("1") || input7.equals("2") || input7.equals("4"))
{
 score7=-1;
}
else 
{
	score7=0;
}}
     			 }
 				 catch(NumberFormatException | IOException e)
 		    	 {
 		    		  System.out.println(e);   
 		    		 }
 		         }
 		      } public int getscore7() {
 				  return score7;
 			  }
 		   }
       class q8 extends Thread
       {
    	   int b8=0;
    	   int score8=0;
     	  public void run()
     	  {
     		 for(int s=0;s<1;s++)
     		  {
     			  try
     			  {
		  System.out.println("8. Which of these are selection statements in Java?\n"+
					 "1) break\n"+
					 "2) continue\n"+
					 "3) for()\n"+
					 "4) if()");
		  InputStreamReader he=new InputStreamReader(System.in);
   	   BufferedReader hem=new BufferedReader(he);
   	  String input8=hem.readLine();
		if(input8 ==null) {
			input8="0";
		}
		else {
if(input8.equals("4"))
{
score8=5;
}
else if(input8.equals("1") || input8.equals("2") || input8.equals("3"))
{
score8=-1;
}
else 
{
	score8=0;
}
     			 }}
 				 catch(NumberFormatException | IOException e)
 		    	 {
 		    		  System.out.println(e);   
 		    		 }
 		         }
 		      } public int getscore8() {
 				  return score8;
 			  }
 		   }
       class q9 extends Thread
       {
    	   int b9=0;
    	   int score9=0;
     	  public void run()
     	  {
     		 for(int s=0;s<1;s++)
     		  {
     			  try
     			  {
		  System.out.println("9. Which of these keywords is used to define interfaces in Java?\n"+
					 "1) intf\n"+
					 "2) Intf\n"+
					 "3) interface\n"+
					 "4) Interface");
		  InputStreamReader ra=new InputStreamReader(System.in);
   	   BufferedReader ram=new BufferedReader(ra);
   	  String input9=ram.readLine();
		if(input9 ==null) {
			input9="0";
		}
		else {
if(input9.equals("3"))
{
 score9=5;
}
else if(input9.equals("1") || input9.equals("2") || input9.equals("4"))
{
 score9=-1;
}
else 
{
	score9=0;
}}
     			 }
 				 catch(NumberFormatException | IOException e)
 		    	 {
 		    		  System.out.println(e);   
 		    		 } 
 		         }
 		      } public int getscore9() {
 				  return score9;
 			  }
 		   }
       class q10 extends Thread
       {
    	   int b10=0;
    	   int score10=0;
     	  public void run()
     	  {
     		 for(int s=0;s<1;s++)
     		  {
     			  try
     			  {
		  System.out.println("10. Which of the following is a superclass of every class in Java?\n"+
					 "1) ArrayList\n"+
					 "2) Abstract class\n"+
					 "3) Object class\n"+
					 "4) String");
		  InputStreamReader la=new InputStreamReader(System.in);
   	   BufferedReader lak=new BufferedReader(la);
   	  String input10=lak.readLine();
		if(input10 ==null) {
			input10="0";
		}
		else {
if(input10.equals("3"))
{
score10=5;
}
else if(input10.equals("1") || input10.equals("2") || input10.equals("4"))
{
score10=-1;
}
else 
{
	score10=0;
 }}
     			 }
 				 catch(NumberFormatException | IOException e)
 		    	 {
 		    		  System.out.println(e);   
 		    		 }
     		  }
     	  } public int getscore10() {
    		  return score10;
    	  }
       }
public class Train {

	public static void main(String[] args) throws IOException,SQLException {
		System.out.println("QUIZ:");
		int n=0;
		int c=0;
		int hi=0;
		int pp=0;
		int xx=0;
		int a=0;
		String id = null;
		int enterpin;
		int updateee=0;
		String updatee;
		String phonenumber= "";
		String name="";
		int age=0;
		String gender="";
		int reentered=0;
		int enterpinn;
		int enterpinnn;
		String entername;
		String enternamee;
		String enternameee;
		int enterage=0;
		int enteragee;
		int enterageee;
		String entergender;
		String entergenderr;
		String entergenderrr;
		String enterphonenumberr;
		String enterphonenumberrr;
		String enterphonenumberrrr;
		String playquiz;
		String checkscore;
		int score13=0;
		int score=0;
		String logoutt;
		System.out.println("DO YOU WANT TO PLAY??????");
		System.out.println("press enter or type 'no'");
		InputStreamReader a1 = new InputStreamReader(System.in);
	    BufferedReader b1=new BufferedReader(a1); 
	    String answer=b1.readLine();
	    if(answer.equals("no"))
	    {
	    	System.out.println("THANKYOU FOR VISITING");
	    }
	    else if (!answer.equals("no"))
	    { 
	    try
        {
		   Class.forName("com.mysql.cj.jdbc.Driver");
   	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","313233");
   	   Statement st=con.createStatement();
   	   String query="create table if not exists logindetails(s_no int auto_increment unique,phonenumber varchar(10),pin int(4),name varchar(20),age int,gender varchar(10),id varchar(20),score int,status varchar(20),primary key(id))";
		   st.executeUpdate(query);
		for (int i=1;i>n;i++)
		{
			if (xx==0)
			{
				System.out.println("1.CREATE ACCOUNT:");
				System.out.println("2.LOGIN ACCOUNT:");
				System.out.println("3.CLOSE:");
		System.out.println("Enter Your Choice:");
		InputStreamReader a2=new InputStreamReader(System.in);
		BufferedReader b2=new BufferedReader(a2);
		 a=Integer.parseInt(b2.readLine());
		 if(a==1)
		{
	    	System.out.println("Enter Your Phone Number for creating account:");
			InputStreamReader a3 = new InputStreamReader(System.in);
			BufferedReader b3=new BufferedReader(a3); 
		    phonenumber=b3.readLine();
			System.out.println("Create Pin:");
			System.out.println("pin consists of 4 characters");
			InputStreamReader a4=new InputStreamReader(System.in);			
			BufferedReader b4=new BufferedReader(a4);
			c=Integer.parseInt(b4.readLine());
			System.out.println("re-enter Pin:");
			System.out.println("pin consists of 4 characters");
			InputStreamReader a20=new InputStreamReader(System.in);			
			BufferedReader b20=new BufferedReader(a20);
			reentered=Integer.parseInt(b20.readLine());
			System.out.println("Enter Your name:");
			InputStreamReader a17= new InputStreamReader(System.in);
			BufferedReader b17=new BufferedReader(a17); 
		    name=b17.readLine();
		    System.out.println("age:");
			InputStreamReader a18 = new InputStreamReader(System.in);
			BufferedReader b18=new BufferedReader(a18); 
		    age=Integer.parseInt(b18.readLine());
		    System.out.println("gender:");
			InputStreamReader a19 = new InputStreamReader(System.in);
			BufferedReader b19=new BufferedReader(a19); 
		    gender=b19.readLine();
		    System.out.println("Enter Your id:");
			InputStreamReader a1717= new InputStreamReader(System.in);
			BufferedReader b1717=new BufferedReader(a1717); 
		    id=b1717.readLine();
			int length=phonenumber.length();
			int length1=String.valueOf(c).length();
			if (length==10 && length1==4 && c==reentered)
			{
				System.out.println("ACCOUNT CREATED SUCCESSFULLY");
				String status1="LOGGED IN";
				String query1="insert into logindetails(phonenumber,pin,name,age,gender,id,status) values(?,?,?,?,?,?,?)";
				   PreparedStatement pt=con.prepareStatement(query1);
				   pt.setString(1,phonenumber);
				   pt.setInt(2,c);
				   pt.setString(3,name);
				   pt.setInt(4,age);
				   pt.setString(5,gender);
				   pt.setString(6,id);
				   pt.setString(7,status1);
				   int rowsaffecteed=pt.executeUpdate();
				   if(rowsaffecteed>0) 
				   {
					   System.out.println("inserted!!!!!");
					  xx=1;	   
					  pp=1;
			}else
			{
				System.out.println("not inserted!!!!!");
				xx=0;
				pp=0;
			}
		}
			else
			{
				System.out.println("wrong details!!!!");
				xx=0;
				pp=0;
			}
		}
		 else if(a==2)
        	   {
        		   System.out.println("then enter your ID for logging into your account:");
        		   InputStreamReader a6=new InputStreamReader(System.in);
            	   BufferedReader b6=new BufferedReader(a6);
            	    id=b6.readLine();
        		   System.out.println("enter pin");
        		   InputStreamReader a7=new InputStreamReader(System.in);
            	   BufferedReader b7=new BufferedReader(a7);
            	   enterpin=Integer.parseInt(b7.readLine());
            		   String query2="(SELECT * from logindetails where id=? AND pin=?)"; 
            		   PreparedStatement bb=con.prepareStatement(query2);
					  bb.setString(1,id);
					   bb.setInt(2,enterpin);
					   ResultSet bbb=bb.executeQuery();
					   if (bbb.next())
					   {
						   String status2="LOGGED IN";
						   String query108 ="update logindetails set status=? where id=?";
							 PreparedStatement ku=con.prepareStatement(query108);
							 ku.setString(1,status2);
						     ku.setString(2,id);
							 int kus=ku.executeUpdate();
						       if(kus>0) {
								   System.out.println("you have logged in!!!!!");
								   pp=1;
								   xx=1;
								
	            	  }if(kus==0) {
						   System.out.println("TRY AGAIN!!");
						 xx=0;
						 pp=0;
					   }
						  
        	           }
					 else
    		   {
    			   System.out.println("WRONG pin or phonenumber!!!!");
    			   xx=0;
    			   pp=0;
    			   System.out.println("TRY AGAIN!!!!!");
    		   }
        	   }
        	   }
		}
        boolean exit = false;
				while(!exit)
				{
					if(pp==1)
					{
					System.out.println("Enter Your Choicee:");
					System.out.println("1.UPDATE:");
					System.out.println("2.PLAYGAME:");
					System.out.println("3.CHECK SCORE:");
					System.out.println("4.LOGOUT:");
					System.out.println("5.CLOSE:");
					InputStreamReader a5=new InputStreamReader(System.in);
					BufferedReader b5=new BufferedReader(a5);
				    hi=Integer.parseInt(b5.readLine());
				 if(hi==1)
				{
					System.out.println("UPDATE:");
					System.out.println("if you want to update press enter or type 'no':");
					InputStreamReader a8 = new InputStreamReader(System.in);
				    BufferedReader b8=new BufferedReader(a8); 
				     updatee=b8.readLine();
					if(!updatee.equals("no"))
					{
						System.out.println("IMPORTANT NOTICE:ID CANT BE UPDATED");
						System.out.println("what do you want update:");
						System.out.println("1.PIN:");
						System.out.println("2.NAME:");
						System.out.println("3.AGE:");
						System.out.println("4.GENDER:");
						System.out.println("5.PHONENUMBER:");
						System.out.println("6.BACK:");
						InputStreamReader a10=new InputStreamReader(System.in);
						BufferedReader b10=new BufferedReader(a10);
						updateee=Integer.parseInt(b10.readLine());
						if(updateee==1) 
						{
							System.out.println("UPDATE PIN:");
							System.out.println("enter your old pin:");
							InputStreamReader a787=new InputStreamReader(System.in);
			            	   BufferedReader b787=new BufferedReader(a787);
			            	  enterpin=Integer.parseInt(b787.readLine());
			            		   String query2="(SELECT * from logindetails where id=? AND pin=?)"; 
			            		   PreparedStatement bb=con.prepareStatement(query2);
								  bb.setString(1,id);
								   bb.setInt(2,enterpin);
								   ResultSet bbb=bb.executeQuery();
								   if (bbb.next())
								   {
									   System.out.println("enter your new pin:");
									   InputStreamReader a7871=new InputStreamReader(System.in);
					            	   BufferedReader b7871=new BufferedReader(a7871);
					            	  enterpinn=Integer.parseInt(b7871.readLine());
					            	  System.out.println("enter your new  confirm pin:");
									   InputStreamReader a78712=new InputStreamReader(System.in);
					            	   BufferedReader b78712=new BufferedReader(a78712);
					            	  enterpinnn=Integer.parseInt(b78712.readLine());
					            	  if(enterpinn==enterpinnn) {
					            		  String query100="update logindetails set pin=? where id=?";
											 PreparedStatement zz=con.prepareStatement(query100);
											 zz.setInt(1,enterpinnn);
										     zz.setString(2,id);
											 int zzz=zz.executeUpdate();
										       if(zzz>0) {
												   System.out.println("PIN UPDATED!!!!");
												   hi=1;
												
					            	  }if(zzz==0) {
										   System.out.println("NOT UPDATED!!!");
										  hi=1;
									   }
						}else if(enterpinn!=enterpinnn){
							 System.out.println("ENTER CORRECT DETAILS!!!");
							 hi=1;
						}
						}else {
							System.out.println("NOT FOUND!!!");
							hi=1;
						}
						}
						else if(updateee==2) 
						{
							System.out.println("UPDATE NAME:");
							System.out.println("enter your old name:");
							InputStreamReader a78777=new InputStreamReader(System.in);
			            	   BufferedReader b78777=new BufferedReader(a78777);
			            	  entername=b78777.readLine();
			            		   String query2123="(SELECT * from logindetails where id=? AND name=?)"; 
			            		   PreparedStatement bbxy=con.prepareStatement(query2123);
								  bbxy.setString(1,id);
								   bbxy.setString(2,entername);
								   ResultSet bbbxyz=bbxy.executeQuery();
								   if (bbbxyz.next())
								   {
									   System.out.println("enter your new name:");
									   InputStreamReader a787191=new InputStreamReader(System.in);
					            	   BufferedReader b787191=new BufferedReader(a787191);
					            	  enternamee=b787191.readLine();
					            	  System.out.println("enter your new  confirm name:");
									   InputStreamReader a787129=new InputStreamReader(System.in);
					            	   BufferedReader b787129=new BufferedReader(a787129);
					            	  enternameee=b787129.readLine();
					            	  if(enternamee==enternameee) {
					            		  String query100x="update logindetails set name=? where id=?";
											 PreparedStatement z1z=con.prepareStatement(query100x);
											 z1z.setString(1,enternamee);
										     z1z.setString(2,id);
											 int zzz1=z1z.executeUpdate();
										       if(zzz1>0) {
												   System.out.println("NAME UPDATED!!!!");
												   hi=1;
												
					            	  }if(zzz1==0) {
										   System.out.println("NOT UPDATED!!!");
										  hi=1;
									   }
						}else if(enternamee!=enternameee){
							 System.out.println("ENTER CORRECT DETAILS!!!");
							 hi=1;
						}
						}else {
							System.out.println("NOT FOUND!!!");
							hi=1;
						}
						}
						else if(updateee==3) 
						{
							System.out.println("UPDATE AGE:");
							System.out.println("enter your old age:");
							InputStreamReader a78797=new InputStreamReader(System.in);
			            	   BufferedReader b78797=new BufferedReader(a78797);
			            	  enterage=Integer.parseInt(b78797.readLine());
			            		   String query2987="(SELECT * from logindetails where id=? AND age=?)"; 
			            		   PreparedStatement bb1x=con.prepareStatement(query2987);
								  bb1x.setString(1,id);
								   bb1x.setInt(2,enterage);
								   ResultSet bbb1x1=bb1x.executeQuery();
								   if (bbb1x1.next())
								   {
									   System.out.println("enter your new age:");
									   InputStreamReader a7871x=new InputStreamReader(System.in);
					            	   BufferedReader b7871x=new BufferedReader(a7871x);
					            	  enteragee=Integer.parseInt(b7871x.readLine());
					            	  System.out.println("enter your new  confirm age:");
									   InputStreamReader a78712x=new InputStreamReader(System.in);
					            	   BufferedReader b78712x=new BufferedReader(a78712x);
					            	  enterageee=Integer.parseInt(b78712x.readLine());
					            	  if(enteragee==enterageee) {
					            		  String query10018="update logindetails set age=? where id=?";
											 PreparedStatement zzx1=con.prepareStatement(query10018);
											 zzx1.setInt(1,enteragee);
										     zzx1.setString(2,id);
											 int zz1xz=zzx1.executeUpdate();
										       if(zz1xz>0) {
												   System.out.println("AGE UPDATED!!!!");
												   hi=1;
												
					            	  }if(zz1xz==0) {
										   System.out.println("NOT UPDATED!!!");
										  hi=1;
									   }
						}else if(enteragee!=enterageee){
							 System.out.println("ENTER CORRECT DETAILS!!!");
							 hi=1;
						}
						}else {
							System.out.println("NOT FOUND!!!");
							hi=1;
						}
						
						}
						else if(updateee==4) 
						{
							System.out.println("UPDATE GENDER:");
							System.out.println("do you want to change mentioned gender:");
							InputStreamReader a78777xx=new InputStreamReader(System.in);
			            	   BufferedReader b78777xx=new BufferedReader(a78777xx);
			            	  entergender=b78777xx.readLine();
			            		   String query2123xxx="(SELECT * from logindetails where id=? AND gender=?)"; 
			            		   PreparedStatement bbxycx=con.prepareStatement(query2123xxx);
								  bbxycx.setString(1,id);
								   bbxycx.setString(2,entergender);
								   ResultSet bbbxyzxz=bbxycx.executeQuery();
								   if (bbbxyzxz.next())
								   {
									   System.out.println("what gender you want to change:");
									   InputStreamReader a787191xz=new InputStreamReader(System.in);
					            	   BufferedReader b787191xz=new BufferedReader(a787191xz);
					            	  entergenderr=b787191xz.readLine();
					            	  System.out.println("confirm what gender you want to get change:");
									   InputStreamReader a787129a=new InputStreamReader(System.in);
					            	   BufferedReader b787129a=new BufferedReader(a787129a);
					            	  entergenderrr=b787129a.readLine();
					            	  if(entergenderr==entergenderrr) {
					            		  String query100xa="update logindetails set gender=? where id=?";
											 PreparedStatement z1zsq=con.prepareStatement(query100xa);
											 z1zsq.setString(1,entergenderr);
										     z1zsq.setString(2,id);
											 int zzz1ssq=z1zsq.executeUpdate();
										       if(zzz1ssq>0) {
												   System.out.println("GENDER UPDATED!!!!");
												   hi=1;
												
					            	  }if(zzz1ssq==0) {
										   System.out.println("NOT UPDATED!!!");
										  hi=1;
									   }
						}else if(entergenderr!=entergenderrr){
							 System.out.println("ENTER CORRECT DETAILS!!!");
							 hi=1;
						}
						}else {
							System.out.println("NOT FOUND!!!");
							hi=1;
						}
						}
						else if(updateee==5) 
						{
							System.out.println("UPDATE PHONENUMBER:");
							System.out.println("enter your old phonenumber:");
							InputStreamReader a78777ja=new InputStreamReader(System.in);
			            	   BufferedReader b78777jab=new BufferedReader(a78777ja);
			            	  enterphonenumberr=b78777jab.readLine();
			            		   String query2123ja="(SELECT * from logindetails where id=? AND phonenumber=?)"; 
			            		   PreparedStatement bbxyja=con.prepareStatement(query2123ja);
								  bbxyja.setString(1,id);
								   bbxyja.setString(2,enterphonenumberr);
								   ResultSet bbbxyzja=bbxyja.executeQuery();
								   if (bbbxyzja.next())
								   {
									   System.out.println("enter your new phonenumber:");
									   InputStreamReader a787191ja=new InputStreamReader(System.in);
					            	   BufferedReader b787191ja=new BufferedReader(a787191ja);
					            	  enterphonenumberrr=b787191ja.readLine();
					            	  System.out.println("enter your new  confirm name:");
									   InputStreamReader a787129ja=new InputStreamReader(System.in);
					            	   BufferedReader b787129ja=new BufferedReader(a787129ja);
					            	   enterphonenumberrrr=b787129ja.readLine();
					            	  if(enterphonenumberrr==enterphonenumberrrr) {
					            		  String query100xja="update logindetails set phonenumber=? where id=?";
											 PreparedStatement z1zja=con.prepareStatement(query100xja);
											 z1zja.setString(1,enterphonenumberrr);
										     z1zja.setString(2,id);
											 int zzz1ja=z1zja.executeUpdate();
										       if(zzz1ja>0) {
												   System.out.println("PHONENUMBER UPDATED!!!!");
												   hi=1;
												
					            	  }if(zzz1ja==0) {
										   System.out.println("NOT UPDATED!!!");
										  hi=1;
									   }
						}else if(enterphonenumberrr!=enterphonenumberrrr){
							 System.out.println("ENTER CORRECT DETAILS!!!");
							 hi=1;
						}
						}else {
							System.out.println("NOT FOUND!!!");
							hi=1;
						}
						}
						else if(updateee==6) 
						{
							pp=1;
						}
						else
						{
							System.out.println("INVALID");
							pp=1;
						}
					}if(updatee.equals("no"))
					{
						System.out.println("NOT UPDATED!!!");
						pp=1;
					}
				}
						
				 else if(hi==2) {
					 System.out.println("PLAY QUIZ:");
						System.out.println("if you want to play press enter or type 'no':");
						InputStreamReader a13 = new InputStreamReader(System.in);
					    BufferedReader b13=new BufferedReader(a13); 
					     playquiz=b13.readLine();
					     if(!playquiz.equals("no"))
							{
					    	 q1 t1=new q1();
								q2 t2=new q2();
								q3 t3=new q3();
								q4 t4=new q4();
								q5 t5=new q5();
								q6 t6=new q6();
								q7 t7=new q7();
								q8 t8=new q8();
								q9 t9=new q9();
								q10 t10=new q10();
									t1.start();
									try {
										Thread.sleep(5000);
									}catch(Exception x1){
										System.out.println(x1);
									}
									t2.start();
									try {
										Thread.sleep(5000);
									}catch(Exception x2){
										System.out.println(x2);
									}
									t3.start();
									try {
										Thread.sleep(5000);
									}catch(Exception x3){
										System.out.println(x3);
									}
									t4.start();
									try {
										Thread.sleep(5000);
									}catch(Exception x4){
										System.out.println(x4);
									}
									t5.start();
									try {
										Thread.sleep(5000);
									}catch(Exception x5){
										System.out.println(x5);
									}
									t6.start();
									try {
										Thread.sleep(5000);
									}catch(Exception x6){
										System.out.println(x6);
									}
									t7.start();
									try {
										Thread.sleep(5000);
									}catch(Exception x7){
										System.out.println(x7);
									}
									t8.start();
									try {
										Thread.sleep(5000);
									}catch(Exception x8){
										System.out.println(x8);
									}
									t9.start();
									try {
										Thread.sleep(5000);
									}catch(Exception x9){
										System.out.println(x9);
									}
									t10.start();
									try {
										Thread.sleep(5000);
									}catch(Exception x10){
										System.out.println(x10);
									}

									int score11=t1.getscore1();
									int score22=t2.getscore2();
									int score33=t3.getscore3();
									int score44=t4.getscore4();
									int score55=t5.getscore5();
									int score66=t6.getscore6();
									int score77=t7.getscore7();
									int score88=t8.getscore8();
									int score99=t9.getscore9();
									int score100=t10.getscore10();
												score=score11+score22+score33+score44+score55+score66+score77+score88+score99+score100;
													   String query532="update logindetails set score=? where id=?;";
													   PreparedStatement si=con.prepareStatement(query532);
													   si.setInt(1,score);
													   si.setString(2,id);
													   int sir=si.executeUpdate();
													   if(sir>0) 
													   {
														   System.out.println("score:"+score);
														  xx=1;	   
														  pp=1;
												}else
												{
													System.out.println("score not inserted!!!!!");
													xx=0;
													pp=0;
												}
							}
					         else if(playquiz.equals("no")) {
					        	System.out.println("THANKYOU!!!");
								pp=1;
					        }
				 }
				 else if(hi==3)
				{
					System.out.println("CHECK SCORE:");
					System.out.println("if you want to checkscore press enter or type 'no':");
					InputStreamReader a12 = new InputStreamReader(System.in);
				    BufferedReader b12=new BufferedReader(a12); 
				     checkscore=b12.readLine();
				     String query32="SELECT score from logindetails where id=?"; 
	      		   PreparedStatement ff=con.prepareStatement(query32);
					   ff.setString(1,id);
					   ResultSet fff=ff.executeQuery();
					   if (fff.next())
					   {  Object balanceooObj=fff.getObject("score");
					   score13=(Integer)balanceooObj;
					   }
				     if(!checkscore.equals("no"))
					{
						System.out.println("CHECK SCORE:"+score13);
						pp=1;
					}
					else if(checkscore.equals("no"))
					{
						System.out.println("INVALID!!!");
						pp=1;
					}
				} 
				 else if(hi==4)
				 {
				     String status3="LOGGED OUT";
					 System.out.println("LOG OUT:");
						System.out.println("if you want to logout press enter or type 'no':");
						InputStreamReader a12ha = new InputStreamReader(System.in);
					    BufferedReader b12har=new BufferedReader(a12ha); 
					     logoutt=b12har.readLine();
					     if(!logoutt.equals("no"))
							{
					    	 String query5323332="update logindetails set status=? where id=?;";
							   PreparedStatement sre=con.prepareStatement(query5323332);
							   sre.setString(1,status3);
							   sre.setString(2,id);
							   int sree=sre.executeUpdate();
							   if(sree>0) 
							   {
								   System.out.println("LOGGED OUT!!");
								   xx=1;
								   pp=0;
								   System.out.println("if you want to close press enter or type 'no':");
									InputStreamReader a12har = new InputStreamReader(System.in);
								    BufferedReader b12hari=new BufferedReader(a12har); 
								     String close=b12hari.readLine();
								     if(!close.equals("no"))
										{
								    	 System.out.println("THANKYOUU!!");
										 xx=1;
										 pp=0;
										}
								     else {
								    	 pp=1;
								     }
										}
						else
						{
							System.out.println("LOGOUT DENIED!!!!!");
							xx=1;
							pp=1;
						}
							}else if(logoutt.equals("no")) {
								xx=1;
								pp=1;
							}
				 }
				 else if(hi==5 || a==3) {
					 System.out.println("THANKYOUU!!");
					 xx=1;
					 pp=0;
	}
	}  
        }
	    }catch(Exception e2) {
	    	 System.out.println(e2);
	    }
}
}
}


	

