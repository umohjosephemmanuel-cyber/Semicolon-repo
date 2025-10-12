import java.util.scanner
      
      public class Nokia {
             public static void main(String [] args) {
               
                    Scanner sc = new Scanner(System.in);

                  

                   String Prompt = """
                   Welcome To Nokia
       
                   Menu:
                   1 -> PhoneBook
                   2 -> Messages
                   3 -> Chat
                   4 -> Call Register
                   5 -> Tones
                   6 -> Settings
                   7 -> Call Divert
                   8 -> Games
                   9 -> Calculator
                   10 -> Reminders
                   11 -> Clock
                   12 -> Profile
                   13 -> SIM Services
                         """;
                   System.out.println(Prompt);
                   
                   case 1 -> {
                   String PhoneBook = """
                   1 -> Search
                   2 -> Service Nos
                   3 -> Add name
                   4 -> Erase
                   5 -> Edit
                   6 -> Assign tone
                   7 -> Send b'card
                   8 -> Options
                   9 -> Speed dials
                   10 -> Voice tags
                   
                   System.out.println(PhoneBook);
                   int PhoneBookChoice = input.nextInt();
                   
                   switch(PhoneBookChoice) {

                   case 1 -> System.out.println("Search");
                   case 2 -> System.out.println("Servic Nos");
                   case 3 -> System.out.println("Add name");
                   case 4 -> System.out.println("Erase");
                   case 5 -> System.out.println("Edit");
                   case 6 -> System.out.println("Assign tone");
                   case 7 -> System.out.println("Send b'card");
                   case 8 -> {
                   StringOptions = """ 
                   Options:
                         1. Type of view
                         2. Memory status
                    """;
             
                   System.out.println("Options");
                   int Options = input.nextInt();

                    
                   switch(OptionsChoice){
                   case 1 -> System.out.println("Type of view");
                   case 2 -> System.out.println("Memory status");
           case 9 -> System.out.println("Speed dials");
           case 10 -> System.out.println("Voice tags");


                   Case 2 -> {	
                   StringMessage = """
                   Message:
                   1 -> Write message
     		   2 -> Inbox 
                   3 -> Outbox
                   4 -> Picture messages
                   5 -> Templates
                   6 -> Smileys
                   7 -> Message settings
                   8 -> Info service
                   9 -> Voice mailbox number
                   10 -> Sevice command editor
                     """;

                   System.out.println(Message);
                   int MessageChoice = input.nextInt();

                   switch(MessageChoice){

                   case 1 -> System.out.println("Write message");
                   case 2 -> System.out.println("Inbox");
                   case 3 -> System.out.println("Outbox");
                   case 4 -> System.out.println("Picture message");
                   case 5 -> System.out.println("Templates");
                   case 6 -> System.out.println("Smileys");
                   case 7 -> {
                              String MessageSettings = """
                              1 -> Set1
                              2 -> Common
                                                      """;
                   
                   System.out.println(MessageSettings); 
                   int MessageSettingsChoice = input.nextInt();l


                   switch(MessageSettingsChoice) {
                     case 1 -> {
                               String Set1 = """
                               Set1:
                               1 -> Message centre number
                               2 -> Messages sent as
                               3 -> Messages validity
                                            """;
                    System.out.println(Set1);
                    int Set1Choice = input.nextInt();
   
                    switch(MessageChoice){
                    case 1 -> System.out.priintln("Message centre number");
                    case 2 -> System.out.println("Message sent as");
                    case 3 -> System.out.println("Message validity");

                 case 2 -> {
                 StringCommon = """
                 Common:
                 1 -> Delivery report
                 2 -> Reply via same centre
                 3 -> Character support
                      """;
                 System.out.println(Common);
                    int CommonChoice = input.nextInt();

                switch(CommonChoice){
                    case 1 -> System.out.priintln("Delivery report");
                    case 2 -> System.out.println("Reply via same centre");
                    case 3 -> System.out.println("Character support");
           case 8 -> System.out.println("Info service");
           case 9 -> System.out.println("Voice mailbox number");
           case 10 -> System.out.println("Service command editor");

                                  

                   case 3 -> System.out.println("Chat");

                   
                   Case 4 -> {	
                   StringCallregister = """
                   Call register:
                   1 -> Missed calls
     		   2 -> Received calls 
                   3 -> Dialled number
                   4 -> Erase recent call lists
                   5 -> Show call duration
                   6 -> Show call costs
                   7 -> Call cost settings
                   8 -> Prepaid credit
                     """;
                   
                   System.out.println(CallRegister);
                   int CallRegisterChoice = input.nextInt();
                   
                   switch(CallRegisterChoice) {

                   case 1 -> System.out.println("Missed calls");
                   case 2 -> System.out.println("Received calls");
                   case 3 -> System.out.println("Dialled number");
                   case 4 -> System.out.println("Erase recent call lists");
                   case 5 -> {
                   StringShowCallDuration = """ 
                   Showcallduration:
                         1 Last call duration
                         2 All calls duration
                         3 Received calls duration
                         4 Dialled calls duration
                         5 Clear timers
                         """;
             
                   System.out.println("Show call duration");
                   int ShowCallDuration = input.nextInt();

                    
                   switch(ShowCallDurationChoice){
                   case 1 -> System.out.println("Last call duration");
                   case 2 -> System.out.println("All calls duration");
                   case 3 -> System.out.println("Received calls duration");
                   case 4 -> System.out.println("Dialled calls duration");
                   case 5 -> System.out.println("Clear timers");

                case 6 -> {
                   StringShowCallCosts = """ 
                   Showcallcosts:
                         1 Last call costs
                         2 All calls cost
                         3 Clear counters
                           """;
             
                   System.out.println("Show call costs");
                   int ShowCallCosts = input.nextInt();

                    
                   switch(ShowCallCostsChoice){
                   case 1 -> System.out.println("Last call costs");
                   case 2 -> System.out.println("All calls cost");
                   case 3 -> System.out.println("Clear counter");

                 case 7 -> {
                   StringCallCostSettings = """ 
                   CallCostSettings:
                         1 Call cost limit
                         2 Show cost in
                           """;
             
                   System.out.println("Call cost settings");
                   int CallCostSettings = input.nextInt();

                    
                   switch(CallCostSettingsChoice){
                   case 1 -> System.out.println("Call cost limit");
                   case 2 -> System.out.println("Show costs in");

            case 8 -> System.out.println("Prepaid credit");
           


                   Case 5 -> {	
                   StringTones = """
                   Tones:
                   1 -> Ringing tone
     		   2 -> Ringing volume
                   3 -> Incoming call alert	
                   4 -> Composer
                   5 -> Message alert tone
                   6 -> Keypad tones
                   7 -> Warning and game tones
                   8 -> Vibrating alert
                   9 -> Screen saver
                     """;

                   System.out.println(Tones);
                   int TonesChoice = input.nextInt();

                   switch(TonesChoice){

                   case 1 -> System.out.println("Ringing tone");
                   case 2 -> System.out.println("Ringing volume");
                   case 3 -> System.out.println("Incoming call alert");
                   case 4 -> System.out.println("Composer");
                   case 5 -> System.out.println("Message alert tone");
                   case 6 -> System.out.println("Keypad tones");
                   case 7 -> System.out.println("Warning and game tones");
                   case 8 -> System.out.println("Vibrating alert");
                   case 9 -> System.out.println("Screen saver");

              
               Case 6 -> {	
                   StringSettings = """
                   Settings:
                   1 -> Call settings
     		   2 -> Phone settings
                   3 -> Security settings	
                   4 -> Restore factory settings
                        """;

                   System.out.println(Settings);
                   int SettingsChoice = input.nextInt();

                   switch(SettingsChoice){
          
                   case 1 -> {
                   StringCallSettings = """ 
                   Callsettings:
                         1 Automatic radial
                         2 Speed dialling
                         3 Call waiting options
                         4 Own number sending
                         5 Phone line in use
                         6 Automatic answer
                         """;
             
                   System.out.println("Call settings");
                   int CallSettingsChoice = input.nextInt();

                    
                   switch(CallSettingsChoice){
                   case 1 -> System.out.println("Automatic radial");
                   case 2 -> System.out.println("Speed dialling");
                   case 3 -> System.out.println("Call waiting options");
                   case 4 -> System.out.println("Own number sending");
                   case 5 -> System.out.println("Phone line in use");
                   case 6 -> System.out.println("Automatic answer");

                
                case 2 -> {
                   StringPhoneSettings = """ 
                   Phonesettings:
                         1 Language
                         2 Cell info display
                         3 Welcome note
                         4 Network selection
                         5 Lights
                         6 Confirm SIM service actions
                         """;
             
                   System.out.println("Phone settings");
                   int PhoneSettingsChoice = input.nextInt();

                    
                   switch(PhoneSettingsChoice){
                   case 1 -> System.out.println("Language");
                   case 2 -> System.out.println("Cell info display");
                   case 3 -> System.out.println("Welcome note");
                   case 4 -> System.out.println("Network selection");
                   case 5 -> System.out.println("Lights");
                   case 6 -> System.out.println("Confirm SIM service actions");
                  

                   case 3 -> {
                   StringSecuritySettings = """ 
                   SecuritySettings:
                         1 PIN code request
                         2 Call barring service
                         3 Fixed dialling
                         4 Closed user group
                         5 Phone security
                         6 Change access codes
                         """;
             
                   System.out.println("Security settings");
                   int SecuritySettingsChoice = input.nextInt();

                    
                   switch(SecuritySettingsChoice){
                   case 1 -> System.out.println("PIN code request");
                   case 2 -> System.out.println("Call barring service");
                   case 3 -> System.out.println("Fixed dialling");
                   case 4 -> System.out.println("Closed user group");
                   case 5 -> System.out.println("Phone security");
                   case 6 -> System.out.println("Change access codes");

                case 4 -> System.out.println("Restore factory settings");


                case 7 -> System.out.println("Call divert");
                case 8 -> System.out.println("Games");
                case 9 -> System.out.println("Calculator");
                case 10 -> System.out.println("Remainders");
                

                Case 11 -> {	
                   StringClock = """
                   Clock:
                   1 -> Alarm clock
     		   2 -> Clock settings
                   3 -> Date settings	
                   4 -> Stop watch
                   5 -> Countdown timer
                   6 -> Auto update of date and time
                            """;
                   
                   System.out.println(Clock);
                   int ClockChoice = input.nextInt();

                   switch(ClockChoice){

                   case 1 -> System.out.println("Alarm clock");
                   case 2 -> System.out.println("Clock settings");
                   case 3 -> System.out.println("Date settings");
                   case 4 -> System.out.println("Stop watch");
                   case 5 -> System.out.println("Count down timer");
                   case 6 -> System.out.println("Auto update of date and time");


                   case 12 -> System.out.println("Profiles");
                   case 13 -> System.out.println("SIM services");
                 

              



 

          

 


 
             

                 







}
                    
                 
             

                   
                   



}




}
                   
                   
                  
     
	




}
 
        
               }
            }
         }