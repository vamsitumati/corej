package switchscenarios;
 
public class StrinSwith {
	
	
	public static int getMonthNUmber(String month)
	{
		
	
	int monthnumber=0;
	if(month == null)
 		return monthnumber;
	switch(month)
	{
	case "january":
		monthnumber = 1;
		break;
	case "Feb":
		monthnumber = 2;
		break;
	case "march":
		monthnumber = 3;
		break;
	case "april":
		monthnumber = 4;
		break;
	case "may":
		monthnumber = 5;
		break;
	case "june":
		monthnumber = 6;
		break;
	case "july":
		monthnumber = 7;
		break;
	case "august":
		monthnumber = 8;
		break;
	case "sept":
		monthnumber = 9;
		break;
	case "oct":
		monthnumber = 10;
		break;
	case "nov":
		monthnumber = 11;
		break;
	case "dec":
		monthnumber = 12;
		break;
    default:
    	System.out.println("Invalid month");
			
	}
	return monthnumber;
		
	}
	public static void main(String args[])
	{
		String month="dec";
		
		int retmonthnumber = StrinSwith.getMonthNUmber(month);
		 if (retmonthnumber == 0) {
	            System.out.println("Invalid month");
	        } else {
	            System.out.println(retmonthnumber);
	        }
		
	}
}
