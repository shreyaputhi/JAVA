public class switch_statement {
    public static void main(String[] args) {
        // int n=1;
		// if(n==1)
		// 	System.out.println("Monday");
		// else if(n==2)
		// 	System.out.println("Tuesday");
		// else if(n==3)
		//     System.out.println("Wednesday");
		// else if(n==4)
		//     System.out.println("Thursday");
		// else if(n==5)
		//     System.out.println("Friday");
		// else if(n==6)
		//     System.out.println("Saturday");
		// else
		//     System.out.println("Sunday");

        // int n=2;
		// switch(n) {
		// case 1:
		// 	System.out.println("Monday");
		// 	break;
		// case 2:
		// 	System.out.println("Tuesday");
		// 	break;
		// case 3:
		// System.out.println("Wednesday");
		// 	break;
		// case 4:
		// System.out.println("Thursday");
		// 	break;
		// case 5:
		// System.out.println("Friday");
		// 	break;
		// case 6:
		// System.out.println("Saturday");
		// 	break;
		// case 7:
		// System.out.println("Sunday");
		// 	break;
		// default:
		// 	System.out.println("Enter a valid number");			
		// }

		// String day="Tuesday";

		// switch(day)
		// {
		// 	case "Saturday", "Sunday":
		// 		System.out.println("6am");
		// 		break;
		// 	case "Monday":
		// 		System.out.println("8am");
		// 		break;
		// 	default:
		// 		System.out.println("7am");
		// }

		// String day="Saturday";

		// switch(day)
		// {
		// 	case "Saturday", "Sunday" -> System.out.println("6am");
		// 	case "Monday" -> System.out.println("8am");
		// 	default -> System.out.println("7am");
		// }

		// String day="Tuesday";
		// String result="";

		// switch(day)
		// {
		// 	case "Saturday", "Sunday" -> result="6am";
		// 	case "Monday" -> result="8am";
		// 	default -> result="7am";
		// }
		// System.out.println(result);

		// String day="Tuesday";
		// String result="";

		// result=switch(day)
		// {
		// 	case "Saturday", "Sunday" -> "6am";
		// 	case "Monday" ->"8am";
		// 	default -> "7am";
		// };
		// System.out.println(result);

		String day="Tuesday";
		String result="";

		result=switch(day)
		{
			case "Saturday", "Sunday" : yield "6am";
			case "Monday" : yield "8am";
			default : yield "7am";
		};
		System.out.println(result);
    }
}
