import java.util.*;
public class Hotel
{
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) 
		
	{
		System.out.println("\nWelcome...! Here the list of restaurant: ");
		System.out.println("\n1)A2b \n2)SS Hydreabad \n3)Madrasi \n4)Maran parotta kadai \n5)Sangeetha");
		System.out.println();
		System.out.print("Select any one restaurant: ");
		int option =  sc.nextInt();
		switch(option){
			case 1 : {
			System.out.println();
			System.out.println("Welcome to A2b.....!");
			System.out.println();
			System.out.println("Here is the menu: ");
			System.out.println("\n1.Veg Biriyani \n2.Curd Rice\n3.Paneer Butter Masala");
			System.out.print("\nSelect any one food : ");
			int food = sc.nextInt();
			int price ;
		    int quan;
			int bill = 0;
			if(food ==1){
				price = 250;
				System.out.print("Enter Quantity : ");
				quan = sc.nextInt();
				bill = price*quan;
				System.out.println("Your bill amount : "+bill);
				System.out.println("\nDo you Wanna Continue : Yes/No");
				String ab = sc.next().toLowerCase();
				if(ab.equals("yes"))
				{
					System.out.println("Enter the correct amount to get OTP: ");
					int bc = sc.nextInt();
					if(bill == bc){
						Random cd = new Random();
						int otp = cd.nextInt(9000)+1000;
						System.out.println("Your otp is: "+otp);
						System.out.println("Enter the OTP");
						int otps = sc.nextInt();
						if(otps == otp){
							System.out.println("Your order is placed Successfully");
						}
					}
					else{
						System.out.println("Wrong amount...Sorry!");
					}
					
				}
				else
				{
				System.out.println("Thank You Visit Again...!");
				}
			}
			if(food ==2){
				price = 60;
				System.out.print("Enter Quantity : ");
				 quan = sc.nextInt();
				 bill = price*quan;
				System.out.println("Your bill amount : "+bill );
				System.out.println("\nDo you Wanna Continue : Yes/No ?");
				String ab = sc.next().toLowerCase();
				if(ab.equals("yes"))
				{
					System.out.println("Enter the correct amount to get OTP: ");
					int bc = sc.nextInt();
					if(bill == bc){
						Random cd = new Random();
						int otp = cd.nextInt(9000)+1000;
						System.out.println("Your otp is: "+otp);
						System.out.println("Enter the OTP");
						int otps = sc.nextInt();
						if(otps == otp){
							System.out.println("Your order is placed Successfully");
						}
					}
					else{
						System.out.println("Wrong amount...Sorry!");
					}
					
				}
				else
				{
				System.out.println("Thank You Visit Again...!");
				}
			}
			if(food ==3){
				price = 270;
				System.out.print("Enter Quantity : ");
				 quan = sc.nextInt();
				 bill = price*quan;
				System.out.println("Your bill amount : "+bill );
				System.out.println("\nDo you Wanna Continue : Yes/No");
				String ab = sc.next().toLowerCase();
				if(ab.equals("yes"))
				{
					System.out.println("Enter the correct amount to get OTP: ");
					int bc = sc.nextInt();
					if(bill == bc){
						Random cd = new Random();
						int otp = cd.nextInt(9000)+1000;
						System.out.println("Your otp is: "+otp);
						System.out.println("Enter the OTP");
						int otps = sc.nextInt();
						if(otps == otp){
							System.out.println("Your order is placed Successfully");
						}
					}
					else{
						System.out.println("Wrong amount...Sorry!");
					}
					
				}
				else
				{
				System.out.println("Thank You Visit Again...!");
				}
			}
			break;}
			
			case 2 :{ 
			System.out.println();	
			System.out.println("Welcome to SS Hydreabad");
			System.out.println();
			System.out.println("Here is the menu: ");
			System.out.println();
			System.out.println("1.Chicken Biriyani \n2.Mutton Biriyani\n3.Prawn Biriyani");
			System.out.println();
			System.out.println("Select any one food : ");
			int food = sc.nextInt();
			int price ;
			int quan;
			int bill = 0;
			if(food ==1){
				price = 240;
				System.out.print("Enter Quantity : ");
				quan = sc.nextInt();
				bill = price*quan;
				System.out.println("Your bill amount : "+bill);
				System.out.println("\nDo you Wanna Continue : Yes/No");
				String ab = sc.next().toLowerCase();
				if(ab.equals("yes"))
				{
					System.out.println("Enter the correct amount to get OTP: ");
					int bc = sc.nextInt();
					if(bill == bc){
						Random cd = new Random();
						int otp = cd.nextInt(9000)+1000;
						System.out.println("Your otp is: "+otp);
						System.out.println("Enter the OTP");
						int otps = sc.nextInt();
						if(otps == otp){
							System.out.println("Your order is placed Successfully");
						}
					}
					else{
						System.out.println("Wrong amount...Sorry!");
					}
					
				}
				else
				{
				System.out.println("Thank You Visit Again...!");
				}
			}
			if(food ==2){
				price = 370;
				System.out.print("Enter Quantity : ");
				 quan = sc.nextInt();
				 bill = price*quan;
				System.out.println("Your bill amount : "+bill );
				System.out.println("\nDo you Wanna Continue : Yes/No ?");
				String ab = sc.next().toLowerCase();
				if(ab.equals("yes"))
				{
					System.out.println("Enter the correct amount to get OTP : ");
					int bc = sc.nextInt();
					if(bill == bc){
						Random cd = new Random();
						int otp = cd.nextInt(9000)+1000;
						System.out.println("Your otp is: "+otp);
						System.out.println("Enter the OTP");
						int otps = sc.nextInt();
						if(otps == otp)
						{
							System.out.println("Your order is placed Successfully");
						}
					}
					else
					{
						System.out.println("Wrong amount...Sorry!");
					}
					
				}
				else
				{
				System.out.println("Thank You Visit Again...!");
				}
			}
			if(food ==3){
				price = 390;
				System.out.print("Enter Quantity : ");
				 quan = sc.nextInt();
				 bill = price*quan;
				System.out.println("Your bill amount : "+bill );
				System.out.println("\nDo you Wanna Continue : Yes/No");
				String ab = sc.next().toLowerCase();
				if(ab.equals("yes"))
				{
					System.out.println("Enter the correct amount to get OTP: ");
					int bc = sc.nextInt();
					if(bill == bc){
						Random cd = new Random();
						int otp = cd.nextInt(9000)+1000;
						System.out.println("Your otp is: "+otp);
						System.out.println("Enter the OTP");
						int otps = sc.nextInt();
						if(otps == otp){
							System.out.println("Your order is placed Successfully");
						}
					}
					else{
						System.out.println("Wrong amount...Sorry!");
					}
					
				}
				else
				{
				System.out.println("Thank You Visit Again...!");
				}
			}
			
			break;}
			
			
			case 3 : {
				System.out.println();
			System.out.println("Welcome to Madrasi");
			System.out.println();
			System.out.println("Here is the menu");
			System.out.println();
			System.out.println("1.Shawarma \n2.Biriyani\n3.Fried Rice");
			System.out.println();
			
			System.out.println("Select any one food : ");
			int food = sc.nextInt();
			int price ;
			int quan;
			int bill = 0;
			if(food ==1){
				price = 90;
				System.out.print("Enter Quantity : ");
				quan = sc.nextInt();
				bill = price*quan;
				System.out.println("Your bill amount : "+bill);
				System.out.println("\nDo you Wanna Continue : Yes/No");
				String ab = sc.next().toLowerCase();
				if(ab.equals("yes"))
				{
					System.out.println("Enter the correct amount to get OTP: ");
					int bc = sc.nextInt();
					if(bill == bc){
						Random cd = new Random();
						int otp = cd.nextInt(9000)+1000;
						System.out.println("Your otp is: "+otp);
						System.out.println("Enter the OTP");
						int otps = sc.nextInt();
						if(otps == otp){
							System.out.println("Your order is placed Successfully");
						}
					}
					else{
						System.out.println("Wrong amount...Sorry!");
					}
					
				}
				else
				{
				System.out.println("Thank You Visit Again...!");
				}
			}
			if(food ==2){
				price = 260;
				System.out.print("Enter Quantity : ");
				 quan = sc.nextInt();
				 bill = price*quan;
				System.out.println("Your bill amount : "+bill );
				System.out.println("\nDo you Wanna Continue : Yes/No ?");
				String ab = sc.next().toLowerCase();
				if(ab.equals("yes"))
				{
					System.out.println("Enter the correct amount to get OTP: ");
					int bc = sc.nextInt();
					if(bill == bc){
						Random cd = new Random();
						int otp = cd.nextInt(9000)+1000;
						System.out.println("Your otp is: "+otp);
						System.out.println("Enter the OTP");
						int otps = sc.nextInt();
						if(otps == otp){
							System.out.println("Your order is placed Successfully");
						}
					}
					else{
						System.out.println("Wrong amount...Sorry!");
					}
					
				}
				else
				{
				System.out.println("Thank You Visit Again...!");
				}
			}
			if(food ==3){
				price = 170;
				System.out.print("Enter Quantity : ");
				 quan = sc.nextInt();
				 bill = price*quan;
				System.out.println("Your bill amount : "+bill );
				System.out.println("Do you Wanna Continue : Yes/No");
				String ab = sc.next().toLowerCase();
				if(ab.equals("yes"))
				{
					System.out.println("Enter the correct amount to get OTP: ");
					int bc = sc.nextInt();
					if(bill == bc){
						Random cd = new Random();
						int otp = cd.nextInt(9000)+1000;
						System.out.println("Your otp is: "+otp);
						System.out.println("Enter the OTP");
						int otps = sc.nextInt();
						if(otps == otp){
							System.out.println("Your order is placed Successfully");
						}
					}
					else{
						System.out.println("Wrong amount...Sorry!");
					}
					
				}
				else
				{
				System.out.println("Thank You Visit Again...!");
				}
			
			}
			break;
			}
			
			case 4 : 
				{
			System.out.println();
			System.out.println("Welcome to Maran parotta kadai");
			System.out.println();
			System.out.println("Here is the menu: ");
			System.out.println();
			System.out.println("1.Bun parotta \n2.Nool parotta\n3.kothu parotta");
			System.out.print("\nSelect any one food : ");
			int food = sc.nextInt();
			int price ;
			int quan;
			int bill = 0;
			if(food ==1){
				price = 25;
				System.out.print("Enter Quantity : ");
				quan = sc.nextInt();
				bill = price*quan;
				System.out.println("Your bill amount : "+bill);
				System.out.println("\nDo you Wanna Continue : Yes/No");
				String ab = sc.next().toLowerCase();
				if(ab.startsWith("yes"))
				{
					System.out.println("Enter the correct amount to get OTP: ");
					int bc = sc.nextInt();
					if(bill == bc){
						Random cd = new Random();
						int otp = cd.nextInt(9000)+1000;
						System.out.println("Your otp is: "+otp);
						System.out.println("Enter the OTP");
						int otps = sc.nextInt();
						if(otps == otp){
							System.out.println("Your order is placed Successfully");
						}
					}
					else{
						System.out.println("Wrong amount...Sorry!");
					}
					
				}
				else
				{
				System.out.println("Thank You Visit Again...!");
				}
			}
			if(food ==2){
				price = 90;
				System.out.print("Enter Quantity : ");
				 quan = sc.nextInt();
				 bill = price*quan;
				System.out.println("Your bill amount : "+bill );
				System.out.println("Do you Wanna Continue : Yes/No ?");
				String ab = sc.next().toLowerCase();
				if(ab.equals("yes"))
				{
					System.out.println("Enter the correct amount to get OTP: ");
					int bc = sc.nextInt();
					if(bill == bc){
						Random cd = new Random();
						int otp = cd.nextInt(9000)+1000;
						System.out.println("Your otp is: "+otp);
						System.out.println("Enter the OTP");
						int otps = sc.nextInt();
						if(otps == otp){
							System.out.println("Your order is placed Successfully");
						}
					}
					else{
						System.out.println("Wrong amount...Sorry!");
					}
					
				}
				else
				{
				System.out.println("Thank You Visit Again...!");
				}
			}
			if(food ==3){
				price = 120;
				System.out.print("Enter Quantity : ");
				 quan = sc.nextInt();
				 bill = price*quan;
				System.out.println("Your bill amount : "+bill );
				System.out.println("Do you Wanna Continue : Yes/No");
				String ab = sc.next().toLowerCase();
				if(ab.equals("yes"))
				{
					System.out.println("Enter the correct amount to get OTP: ");
					int bc = sc.nextInt();
					if(bill == bc){
						Random cd = new Random();
						int otp = cd.nextInt(9000)+1000;
						System.out.println("Your otp is: "+otp);
						System.out.println("Enter the OTP");
						int otps = sc.nextInt();
						if(otps == otp){
							System.out.println("Your order is placed Successfully");
						}
					}
					else{
						System.out.println("Wrong amount...Sorry!");
					}
					
				}
				else
				{
				System.out.println("Thank You Visit Again...!");
				} 
				}
			break;
			}
			
			
			case 5 :{
				System.out.println();
			System.out.println("Welcome to Sangeetha");
			System.out.println();
			System.out.println("Here is the menu");
			System.out.println();
			System.out.println("1.Veg Brinji \n2.Sambar Rice\n3.Paneer Spicy Masala");
			System.out.println();
			System.out.print("Select any one food : ");
			int food = sc.nextInt();
			int price ;
			int quan;
			int bill = 0;
			if(food ==1){
				price = 120;
				System.out.print("Enter Quantity : ");
				quan = sc.nextInt();
				bill = price*quan;
				System.out.println("Your bill amount : "+bill);
				System.out.println("\nDo you Wanna Continue : Yes/No");
				String ab = sc.next().toLowerCase();
				if(ab.equals("yes"))
				{
					System.out.println("Enter the correct amount to get OTP: ");
					int bc = sc.nextInt();
					if(bill == bc){
						Random cd = new Random();
						int otp = cd.nextInt(9000)+1000;
						System.out.println("Your otp is: "+otp);
						System.out.println("Enter the OTP");
						int otps = sc.nextInt();
						if(otps == otp){
							System.out.println("Your order is placed Successfully");
						}
					}
					else{
						System.out.println("Wrong amount...Sorry!");
					}
					
				}
				else
				{
				System.out.println("Thank You Visit Again...!");
				}
			}
			if(food ==2){
				price = 80;
				System.out.print("Enter Quantity : ");
				 quan = sc.nextInt();
				 bill = price*quan;
				System.out.println("Your bill amount : "+bill );
				System.out.println("\nDo you Wanna Continue : Yes/No ?");
				String ab = sc.next().toLowerCase();
				if(ab.equals("yes"))
				{
					System.out.println("Enter the correct amount to get OTP: ");
					int bc = sc.nextInt();
					if(bill == bc){
						Random cd = new Random();
						int otp = cd.nextInt(9000)+1000;
						System.out.println("Your otp is: "+otp);
						System.out.println("Enter the OTP");
						int otps = sc.nextInt();
						if(otps == otp){
							System.out.println("Your order is placed Successfully");
						}
					}
					else{
						System.out.println("Wrong amount...Sorry!");
					}
					
				}
				else
				{
				System.out.println("Thank You Visit Again...!");
				}
			}
			if(food ==3){
				price = 290;
				System.out.print("Enter Quantity : ");
				 quan = sc.nextInt();
				 bill = price*quan;
				System.out.println("Your bill amount : "+bill );
				System.out.println("\nDo you Wanna Continue : Yes/No");
				String ab = sc.next().toLowerCase();
				if(ab.equals("yes"))
				{
					System.out.println("Enter the correct amount to get OTP: ");
					int bc = sc.nextInt();
					if(bill == bc){
						Random cd = new Random();
						int otp = cd.nextInt(9000)+1000;
						System.out.println("Your otp is: "+otp);
						System.out.println("Enter the OTP");
						int otps = sc.nextInt();
						if(otps == otp){
							System.out.println("Your order is placed Successfully");
						}
					}
					else{
						System.out.println("Wrong amount...Sorry!");
					}
					
				}
				else
				{
				System.out.println("Thank You Visit Again...!");
				} 
			}
			break;
			}
			default : System.out.println("Please Select from Given List");
		}
	}
	}

