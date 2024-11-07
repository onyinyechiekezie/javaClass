import java.util.Scanner;
public class NokiaMenu    {
   public static void main(String[] args)   {
   Scanner input = new Scanner(System.in);

   System.out.print("Please choose a menu\n.Press\n.1.Phonebook\n.2.Messages\n.3.Chat\n.4.Call register\n.5.Tones\n.6.Settings\n.7.Call divert\n.8.Games\n.9.Calculator\n.10.Reminders\n.11.Clock\n.12.Profiles\n.13.Sim services\n");
   int answer = input.nextInt();

   switch(answer)  {

   case 1:
   System.out.print("1.Search\n.2.Service numbers\n.3.Add name\n.4.Erase\n.5.Edit\n.6.Assign tone\n.7.Send b'card\n.8.Options\n.9.Speed dials\n.10.Voice tags\n");
   int phonebook = input.nextInt();

   	switch(phonebook) {
   	case 1: System.out.println("Search");
           break;
   	case 2: System.out.println("Service numbers");
           break;
   	case 3: System.out.println("Add name");
           break;
  	case 4: System.out.println("Erase");
           break;
   	case 5: System.out.println("Edit");
           break;
   	case 6: System.out.println("Assign tone");
           break;
   	case 7: System.out.println("Send b'card");
           break;
   	case 8: System.out.println("Options");
   		System.out.print("1.Type of view\n2.Memory status");
        	int options = input.nextInt();
		switch(options) {
   		case 1: System.out.println("Type of view");
           	break;
   		case 2: System.out.println("Memory status");
          	break;
		}
		break;
   	case 9: System.out.println("Speed dials");
           break;
  	case 10: System.out.println("Voice tags");
           break;
        }
    break;
   case 2:
   System.out.print("1.Write messages\n2.Inbox\n3.Outbox\n4.Picture messages\n5.Templates\n6.Smileys\n7.Message settings\n8.Info service\n9.Voice mailbox number\n10.Service command editor\n");
   int messages = input.nextInt();
	
	switch(messages)  {
	case 1: System.out.println("Write messages");
	   break;
	case 2: System.out.println("Inbox");
	   break;
	case 3: System.out.println("Outbox");
	   break;
	case 4: System.out.println("Picture messages");
	   break;
	case 5: System.out.println("Tempelates");
	   break;
	case 6: System.out.println("Smileys");
	   break;
	case 7: System.out.println("Message settings");
	 
		System.out.print("1.Set 1\n2.Common\n");
		int messageSettings  = input.nextInt();
		switch(messageSettings) {
		case 1: System.out.println("Set 1");
		int set1 = input.nextInt();
			switch(set1)  {
			case 1: System.out.println("Message center number");
			break;
			case 2: System.out.println("Message sent as");
			break;
			case 3: System.out.println("Message validity");
			break;
			}
			break;
	
		case 2: System.out.println("Common");
		int common = input.nextInt();
			switch(common)  {
			case 1: System.out.println("Delivery reports");
			break;
			case 2: System.out.println("Reply via same centre");
			break;
			case 3: System.out.println("Character support");
			break;
			}
		break;
		}break;
	case 8: System.out.println("Info service");
	   break;
	case 9: System.out.println("Voice mailbox number");
	   break; 
	case 10: System.out.println("Service command editor");
	   break;
	}break;
   case 3:
   System.out.print("Chat\n");   
   int chat = input.nextInt();

   	switch(chat)  {
	case 1: System.out.println("Chat");
	   break;
	}break;
   case 4:
   System.out.print("1.Missed calls\n2.Recieved calls\n3.Dialed number\n4.Erase recent call list\n5.Show call duration\n6.Show call cost\n7.Call cost settings\n8.Prepaid credit\n.");
   int callRegister = input.nextInt();
   
   	switch(callRegister)  {
   	case 1: System.out.println("Missed calls");
		break;
   	case 2: System.out.println("Recieved calls");
		break;
   	case 3: System.out.println("Dialed numbers");
		break;
   	case 4: System.out.println("Erase recent call lists");
		break;
   	case 5: System.out.println("Show call duration");
           	System.out.print("1.Last call duration\n2.All calls' duration\n4.Dialled calls' duration\n5.Clear timers\n");
	     	int showCallDuration = input.nextInt();
	     	switch(showCallDuration)  {
		case 1: System.out.println("Last call duration");
			break;
		case 2: System.out.println("All calls duration");
			break;
		case 3: System.out.println("Recieved calls' duration");
			break;
		case 4: System.out.println("Dialled calls' duration");
			break;
		case 5: System.out.println("Clear timers");
			break;
	     }break;
   	case 6: System.out.println("Show call cost");
	   	System.out.println("1.Last call cost\n2.All calls cost\n3.Clear counters");
           	int showCallCost = input.nextInt();
	     	switch(showCallCost)  {
		case 1: System.out.println("Last call duration");
			break;
		case 2: System.out.println("All calls duration");
			break;
		case 3: System.out.println("Clear counters");
			break;
		}break;
   	case 7: System.out.println("Call cost settings");
			System.out.print("\ncall cost limit\n2.Delivery report\n");
			int callCostSettings = input.nextInt();
	     		switch(callCostSettings)  {
			case 1:System.out.println("Call cost limit");
			break;
			case 2: System.out.println("Show cost in");
			break;}
			break;
   	case 8: System.out.println("Prepaid credit");
   	break;}break;
   case 5:
   System.out.print("1.Ringing tone\n2.Ringing volume\n3.Incoming call alert\n4.Composer\n5.Message alert tone\n6.Keypad tones\n7.Warning and game tones\n8.Vibrating alert\n9.Screen saver\n");   
   int tones = input.nextInt();

   	switch(tones)  {
	case 1: System.out.println("Ringing tone");
	   break;
	case 2: System.out.println("Ringing volume");
	   break;
	case 3: System.out.println("Incoming call alert");
	   break;
	case 4: System.out.println("Composer");   
	   break;
	case 5: System.out.println("Message alert tone");
	   break;
	case 6: System.out.println("Keypad tones");
	   break;
	case 7: System.out.println("Warning and game tones");
	   break;
	case 8: System.out.println("Vibrating alert");
	   break;
	case 9: System.out.println("Screen saver");
	   break;
	}
  break;
   case 6:
   System.out.print("1.Call settings\n2.Phone settings\n3.Security settings\n4.Restore factory settings\n");
   int settings = input.nextInt();
	switch(settings)  {
	case 1:System.out.println("Call settings");
	System.out.print("1.Automatic redial\n2.Speed dialling\n3.Call waiting options\n4.Own number sending\n5.Phone line in use\n6.Automatic answer\n");
	int callSettings = input.nextInt();
		switch(callSettings)  {
		case 1:System.out.println("Automatic redial");
			break;
		case 2:System.out.println("Speed dialling");
			break;
		case 3:System.out.println("Call waiting options");
			break;
		case 4:System.out.println("Own number sending");
			break;
		case 5:System.out.println("Phone line in use");
			break;
		case 6:System.out.println("Automatic answer");
			break;
		}break;
	case 2:System.out.println("Phone settings");
	System.out.print("1.Language\n2.Cell info display\n3.Welcome note\n4.Network selection\n5.Lights\n6.Confirm SIM service actions\n");
	int phoneSettings = input.nextInt();
		switch(phoneSettings)  {
		case 1:System.out.println("Language");
			break;
		case 2:System.out.println("Cell info display");
			break;
		case 3:System.out.println("Welcome note");
			break;
		case 4:System.out.println("Network selection");
			break;
		case 5:System.out.println("Lights");
			break;
		case 6:System.out.println("Confirm SIM service actions");
			break;
		}break;
	case 3:System.out.println("Security settings");
	System.out.print("1.PIN code request\n2.Call barring service\n3.Fixed dialling\n4.Closed user group\n5.Phone security\n6.Change access codes\n");
	int securitySettings = input.nextInt();
		switch(securitySettings)  {
		case 1:System.out.println("PIN code request");
			break;
		case 2:System.out.println("Call barring service");
			break;
		case 3:System.out.println("Fixed dialling");
			break;
		case 4:System.out.println("Closed user group");
			break;
		case 5:System.out.println("Phone security");
			break;
		case 6:System.out.println("Change access codes");
			break;
		}break;
	case 4:System.out.print("Restore factory settings\n");
	System.out.print("Restore factory settings\n");
	int restoreFactorySettings = input.nextInt();
		switch(restoreFactorySettings)  {
		case 1:System.out.println("Restore factory settings");
			break;
    }break;}
   case 7:System.out.print("Call divert\n");
	int callDivert = input.nextInt(); 
		switch(callDivert)  {
		case 7 :System.out.println("Restore factory settings");
			break;
		}break;
   case 8:System.out.print("Games\n");
	int games = input.nextInt();
		switch(games)  {
		case 1:System.out.println("Games");     
			break;
		}break;
   case 9:System.out.print("Calculator\n");
	int calculator = input.nextInt();
		switch(calculator)  {
		case 1:System.out.println("calculator");
			break;
		}break;
   case 10:System.out.print("Reminders\n");
	int reminders = input.nextInt();
		switch(reminders)  {
		case 1:System.out.println("reminders");
			break;
		}break;
   case 11: System.out.print("Clock\n");
	    System.out.print("1.Alarm clock\n2.Clock settings\n3.Date setting\n4.Stopwatch\n5.Countdown timer\n6.Auto update of date and time\n");
	    int clock = input.nextInt();
		switch(clock)  {
		case 1:System.out.println("Alarm clock");
			break;
		case 2:System.out.println("Clock settings");
			break;
		case 3:System.out.println("Date setting");
			break;
		case 4:System.out.println("Stopwatch");
			break;
		case 5:System.out.println("Countdown timer");
			break;
		case 6:System.out.println("Auto update of date and time");
			break;
		}break;
   case 12: System.out.print("Profile");
            int profile = input.nextInt();
		switch(profile)  {
		case 1:System.out.println("Profile");
			break;
		}break;
   case 13: System.out.print("SIM services");
            int simServices = input.nextInt();
		switch(simServices)  {
		case 1:System.out.println("SIM services");
			break;
		}break;
	  
	  }	


  }
}
 
