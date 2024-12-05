import java.lang.reflect.InaccessibleObjectException;
import java.util.Scanner;
import java.util.Arrays;


public class ChatbotMethods {
  public String WHITE = "\u001B[37m";
  public String CYAN = "\u001B[36m";
  public String RED = "\u001B[31m";
    public String errorMessages(){
        String[] errorMessages = {"Sorry, what was that?", "Please make sure you typed that right!", "That isn't one of the options.", "What??!!?!?", "input not recognized :(", 
    "Try again!", "Arrrrr! Me ears bad, couldn't hear that properly", "o-O", "Say it right or you're not getting our food!", "Didn't catch that...?", "Naurr we don't have that...",
    ":error:", "Say that again?", "Say that in sailor language!", "whaaaaaaaat??"};
    String x = errorMessages[(int)(Math.random()*15)];
    return x;
    }
    public String getWhite(){
      return WHITE;
    }
    public String getCyan(){
      return CYAN;
    }
    public String getRed(){
      return RED;
    }
    public  void greeting(){
        
        
        
        System.out.println(CYAN + "Ahoy matey! Welcome to Scoops Ahoy - I'm Popeye, a chat bot designed to help you through the ordering proccess.\nRemember, you can press "+ RED + "q" + CYAN + " at any time to end out conversation. \nAre you ready to begin your ice cream journey?"+ WHITE + "");   
    }
    public void finish(){
      System.out.println(CYAN + "Sounds like your order is finished! Please proceed to the counter to recieve your ice cream. Enjoy - we hope to see you on our next expedition:)"+ WHITE + " ");
    }
    public void menu(){
        System.out.println(CYAN+"I'm glad you asked about the menu:) We have several options, including ice cream scoops, sundaes, and of course, our world-famous ice cream cakes! Does anything sound appealing today? "+WHITE + "");


    }
    public void quit(){
        System.out.println(CYAN+"Thanks for coming! We hope to see you on our next expedition:)");

    }
    public void order(){
        System.out.println(CYAN+"Looks like you're ready to order! Would you like scoops, sundaes, or our world-famous ice cream cakes? Remember, if you pick multiple options, one will be selected for you! Don't be a greedy pirate matey:)"+WHITE + "");
    }
    public void cake(Scanner myObj){
        System.out.println(CYAN+"Great choice - our cakes are more famous than Blackbeard's treasure! ");
        
        int tiers = 0;
        while (tiers==0){
         System.out.println(CYAN+"Would you like 1, 2, or 3 tiers in your cake? "+WHITE + "");
        
        String tierResp = (myObj.nextLine()).toLowerCase();
        if (tierResp!=null){
            
            
            if (tierResp.contains("1") || tierResp.contains("one")){
                tiers = 1;
               
            }
            else if (tierResp.contains("2") || tierResp.contains("two")){
                tiers = 2;
               
            }
            else if (tierResp.contains("3") || tierResp.contains("three")){
                tiers = 3;
           
            }
            else if (tierResp.equals("q")) {
                quit();
            }
            else{
                System.out.println(CYAN+ errorMessages()+ " Please enter a valid number of tiers - 1, 2, or 3!"+WHITE + "");
            }
            
        }
        }
            
            String[] cake = new String[tiers];
            // int tierCount = 1;
            for(int i = 0; i<cake.length; i++){
                String[] tierFlavs = {CYAN+"What ice cream flavor would you like for the first tier? You can have chocolate, vanilla, or strawberry!"+WHITE + "", CYAN+ "What flavour would you like for the second tier?"+WHITE + "",CYAN+"Finally, what about the third tier?"+WHITE + ""};
                System.out.println(tierFlavs[i]);
                String tierFlav = (myObj.nextLine()).toLowerCase();
                if (tierFlav.contains("sb")||tierFlav.contains("straw")){
                    cake[i] = "strawberry";
                }
                else if (tierFlav.contains("choc")||tierFlav.contains("chocolate")){
                    cake[i] = "chocolate";
                }
                else if (tierFlav.contains("vanilla")){
                    cake[i] = "vanilla";
                }
                else{
                    System.out.println(CYAN+errorMessages()+" Please enter a valid flavor - chocolate, strawberry, or vanilla!"+WHITE + "");
                    i = i-1;
                }

            }
        System.out.print(CYAN+"That sounds delicious! Next, "+WHITE + "");
        String batter = "yes";
        while(batter == "yes"){
         System.out.println( CYAN+"what kind of batter would you like for the cake? You can have chocolate or vanilla! "+WHITE + "");
         String batt = (myObj.nextLine()).toLowerCase();
         if (batt.contains("van")||batt.contains("vanilla")||batt.contains(" v ")){
            batter = "vanilla";
         } 
         else if (batt.contains("choc")||batt.contains("chocolate")||batt.contains(" c ")){
            batter = "chocolate";
         } 
         else {
            System.out.println(CYAN+errorMessages()+" Please enter a valid flavor - chocolate or vanilla!"+WHITE + "");
         }
        }
        String frosting = "yes";
        while(frosting.equals("yes")){
        System.out.println(CYAN+"What color of frosting would you like? We have all of the colors of the rainbow - red, orange, yellow, green, blue, and purple! Please choose 1."+WHITE + "");
        
        String frost = (myObj.nextLine()).toLowerCase();
        if(frost.contains("and") ||frost.contains("&") ){
            System.out.println(CYAN+"Please choose one color!"+WHITE + "");
        }
        else if(frost.contains("red")){
            frosting = "red";
        }
        else if(frost.contains("orange")){
            frosting = "orange";
        }
        else if(frost.contains("yellow")){
            frosting = "yellow";
        }
        else if(frost.contains("green")){
            frosting = "green";
        }
        else if(frost.contains("blue")){
            frosting = "blue";
        }
        else if(frost.contains("purple")){
            frosting = "purple";
        }
        else{
            System.out.println(CYAN+errorMessages()+" Please enter a valid color!"+WHITE + "");
        }
        }
        if(tiers==1){
        System.out.println(CYAN+"Your cake order is complete! It looks like you have: " +RED+ tiers + CYAN+" tier made of " +RED+ cake[0] + CYAN+" ice cream and " +RED+ batter + CYAN+" batter, with "+RED + frosting + CYAN+" frosting on top!"+WHITE + "");
        
    }
        else if(tiers ==2){
            System.out.println(CYAN+"Your cake order is complete! It looks like you have: " +RED+ tiers +CYAN+ " tiers made of " +RED+ cake[0] + CYAN+" and "+RED+ cake[1]+CYAN+ " ice cream, " +RED+ batter + CYAN+" batter, and " +RED+ frosting +CYAN+ " frosting on top!"+WHITE + "");
        }
        else if(tiers == 3){
            System.out.println(CYAN+"Your cake order is complete! It looks like you have: " +RED+ tiers + CYAN+" tiers made of "+RED + cake[0] +CYAN+ ", "+RED+ cake[1] + CYAN+", and " +RED+ cake[2]+ CYAN+" ice cream,  " +RED+ batter +CYAN+ " batter, and " +RED+ frosting +CYAN+ " frosting on top!"+WHITE + "");
        }
        
        }
        public  void scoops(Scanner myObj) {
            int scoops = 0;
            String scooptemp = "filler";
            System.out.print(CYAN+"That sounds great!");
            while (scoops == 0) {
            System.out.println(CYAN+" How many scoops would you like? One, two, or three?"+WHITE + "");
            scooptemp = (myObj.nextLine()).toLowerCase();
              if (scooptemp.equals("one") || scooptemp.equals("1")) {
                scoops = 1;
              } else if (scooptemp.equals("two") || scooptemp.equals("2")) {
                scoops = 2;
              } else if (scooptemp.equals("three") || scooptemp.equals("3")) {
                scoops = 3;
              } else {
                System.out.println(CYAN+errorMessages()+"Please type one, two, or three!"+WHITE + "");
              }
            }
        
            // String[] scoopFlavor = new String[scoops];
            Scoop[] scoopFlavor = {
                new Scoop(),
                new Scoop(),
                new Scoop()
            };
            for (int i = 0; i < scoops; i++) {
              if (i == 0) {
                System.out.println(CYAN+"What flavor would you like for your first scoop? Vanilla, chocolate, strawberry, rocky road, mint chocolate, or cookies and cream?"+WHITE + "");
              } else if (i == 1) {
                System.out.println(CYAN+"What flavor would you like for your second scoop? Vanilla, chocolate, strawberry, rocky road, mint chocolate, or cookies and cream?"+WHITE + "");
              } else if (i == 2) {
                System.out.println(CYAN+"What flavor would you like for your third scoop? Vanilla, chocolate, strawberry, rocky road, mint chocolate, or cookies and cream?"+WHITE + "");
              }
              
              while (scoopFlavor[i].getFlavor() == null) {
                scooptemp = (myObj.nextLine()).toLowerCase();
                if (scooptemp.contains("straw")) {
                  scoopFlavor[i].setFlavor("strawberry");
                } else if (scooptemp.contains("mint")) {
                  scoopFlavor[i].setFlavor("mint chocolate");
                } else if (scooptemp.contains("van")) {
                  scoopFlavor[i].setFlavor("vanilla");
                } else if (scooptemp.contains("rock")) {
                  scoopFlavor[i].setFlavor("rocky road");
                } else if (scooptemp.contains("choc") ) {
                  scoopFlavor[i].setFlavor("chocolate");
                } else if (scooptemp.contains("cook")) {
                  scoopFlavor[i].setFlavor("cookies and cream");
                } else {
                  System.out.println(CYAN+errorMessages()+" Please choose one of the flavors above!"+WHITE + "");
                }
              }
            }
            
            Boolean useCone = true;
            int x = 0;
            while(x==0){
            
                System.out.println(CYAN+"Would you like your scoops on a cone or in a cup? "+WHITE + "");
                scooptemp = (myObj.nextLine()).toLowerCase();
                if (scooptemp.contains("cup")) {
                    useCone = false;
                    x = 1;
                }
                else if(scooptemp.contains("con")){
                    x = 1;
                }
                else{
                    System.out.print(CYAN+errorMessages());
                }
                   
            }

        
            // print out the order!
            System.out.println(CYAN+"Here is your order!"+WHITE + "");
            String orderString = "";
            if (scoops == 1) {
              orderString += RED +"  One scoop of "+WHITE + "";
            } else if (scoops == 2) {
              orderString +=RED+ "  Two scoops: "+WHITE + "";
            } else {
              orderString += RED+"  Three scoops of "+WHITE + "";
            }
            for (int i = 0; i < scoops; i++) {
               orderString += RED+scoopFlavor[i].getFlavor() + " ";
            }
            orderString += useCone ? " on a cone" : " in a cup"+WHITE + "";
            System.out.println(orderString);
          }
        
          public void sundae(Scanner myObj) {
            String sundaeTemp = "yea";
            System.out.println(CYAN+"Looks like you want a sundae! What size do you want? You can pick small, medium or large."+WHITE + "");
            String sundaeSize = "unknown";
            while (sundaeSize.equals("unknown")) {
              
              sundaeTemp = (myObj.nextLine()).toLowerCase();
              if (sundaeTemp.contains("small")){
                sundaeSize = "small";
              } 
              else if(sundaeTemp.contains("medium") ){
                sundaeSize = "medium";
              }
              else if(sundaeTemp.contains("large")) {
                sundaeSize = "large";
              } else {
                System.out.println(CYAN+errorMessages()+" Please type small, medium, or large!"+WHITE);
              }
            }
        
            System.out.println(CYAN+"What flavor would you like? Vanilla, chocolate or strawberry?"+WHITE);
            String sundaeFlavor = "unknown";
            while (sundaeFlavor.equals("unknown")) {
              sundaeTemp = (myObj.nextLine()).toLowerCase();
              if (sundaeTemp.contains("strawberry") || sundaeTemp.contains("straw")) {
                sundaeFlavor = "strawberry";
              } else if (sundaeTemp.contains("chocolate") || sundaeTemp.contains("choc")) {
                sundaeFlavor = "chocolate";
              } else if (sundaeTemp.contains("vanilla") || sundaeTemp.contains("van")) {
                sundaeFlavor = "vanilla";
              } else {
                System.out.println(CYAN+errorMessages()+" Please choose one of the flavors above!"+WHITE);
              }
            }
        
            //chocolate chips, whipped cream, cherry, chocolate syrup, caramel syrup, gummies
           
            String[] toppings = new String[1];
            int toppingCount = 0;
            while (toppingCount == 0) {
              System.out.println(CYAN+"Which topping would you like? Chocolate chips, whipped cream, cherry, chocolate syrup, caramel syrup or gummies? Please pick one, matey!"+WHITE);
              sundaeTemp = (myObj.nextLine()).toLowerCase();
              if (sundaeTemp.contains("no")) {
                System.out.println("Ok!");
                break;
              } else if (sundaeTemp.contains("chip")){
                toppings[toppingCount] = "chocolate chips";
                toppingCount++;
              } else if( sundaeTemp.contains("cream")){
                toppings[toppingCount] = "whipped cream";
                toppingCount++;
              } else if( sundaeTemp.contains("cherr")){
                toppings[toppingCount] = "cherries";
                toppingCount++;
              }
              else if(sundaeTemp.contains("choc")&& sundaeTemp.contains("syr")){
                toppings[toppingCount] = "chocolate syrup";
                toppingCount++;
              } 
              else if( sundaeTemp.contains("cara")&& sundaeTemp.contains("syr")){
                toppings[toppingCount] = "caramel syrup";
                toppingCount++;
              } 
              else if(sundaeTemp.contains("gumm")) {
                toppings[toppingCount] = "gummies";
                toppingCount ++;
              }
              else{
                System.out.print(CYAN+errorMessages()+WHITE);
              }
            }
        
            // print out the order
            System.out.println(CYAN+"Here is your order!"+WHITE);
            System.out.println(RED+sundaeSize + " " + sundaeFlavor + " flavored sundae, ");
            if (toppingCount == 0) {
              System.out.println(" with no topping."+WHITE);
            } else if (toppingCount == 1) {
              System.out.println(" with " + toppings[0] + " topping."+WHITE);
            } else {
              System.out.println(" with " + String.join(" and ", toppings) + " topping"+WHITE);
            }
          }
          public int finishCheck(Scanner myObj){
            System.out.println(CYAN+"Please press q to finish your order, or type anything else to continue your journey."+WHITE);
            String x = (myObj.nextLine()).toLowerCase();
            if(x.equals("q")){
              return 1;
            }
            else{
              return 2;
            }
          }
        
    }

