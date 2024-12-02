import java.lang.reflect.InaccessibleObjectException;
import java.util.Scanner;
import java.util.Arrays;

public class ChatbotMethods {
    public String errorMessages(){
        String[] errorMessages = {"Sorry, what was that?", "Please make sure you typed that right!", "That isn't one of the options.", "What??!!?!?", "input not recognized :(", 
    "Try again!", "Arrrrr! Me ears bad, couldn't hear that properly", "o-O", "Say it right or you're not getting our food!", "Didn't catch that...?", "Naurr we don't have that...",
    ":error:", "Say that again?", "Say that in sailor language!", "whaaaaaaaat??"};
    String x = errorMessages[(int)(Math.random()*15)];
    return x;
    }
    public  void greeting(){
        String RED = "\u001B[31m";
        String CYAN = "\u001B[36m";
        System.out.println(CYAN + "Ahoy matey! Welcome to Scoops Ahoy - I'm Popeye, a chat bot designed to help you through the ordering proccess.\nRemember, you can press "+ RED + "q" + CYAN + " at any time to end out conversation.\nAre you ready to begin your ice cream journey?");   
    }
    public void finish(){
      System.out.println("Sounds like your order is finished! Please proceed to the counter to recieve your ice cream. Enjoy - we hope to see you on our next expedition:)");
    }
    public void menu(){
        System.out.println("I'm glad you asked about the menu:) We have several options, including ice cream scoops, sundaes, and of course, our world-famous ice cream cakes! Does anything sound appealing today? Let me know if you want to know more about any of the items or press q to end the conversation.");


    }
    public void quit(){
        System.out.println("Thanks for coming! We hope to see you on our next expedition:)");

    }
    public void order(){
        System.out.println("Looks like you're ready to order! Would you like scoops, sundaes, or our world-famous ice cream cakes?");
    }
    public void cake(Scanner myObj){
        System.out.println("Great choice - our cakes are more famous than Blackbeard's treasure! ");
        
        int tiers = 0;
        while (tiers==0){
         System.out.println("Would you like 1, 2, or 3 tiers in your cake?");
        
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
                System.out.println(errorMessages()+ " Please enter a valid number of tiers - 1, 2, or 3!");
            }
            
        }
        }
            
            String[] cake = new String[tiers];
            // int tierCount = 1;
            for(int i = 0; i<cake.length; i++){
                String[] tierFlavs = {"What ice cream flavor would you like for the first tier? You can have chocolate, vanilla, or strawberry!", "What flavour would you like for the second tier?","Finally, what about the third tier?"};
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
                    System.out.println(errorMessages()+" Please enter a valid flavor - chocolate, strawberry, or vanilla!");
                    i = i-1;
                }

            }
        System.out.print("That sounds delicious! Next, ");
        String batter = "yes";
        while(batter == "yes"){
         System.out.println( "what kind of batter would you like for the cake? You can have chocolate or vanilla! ");
         String batt = (myObj.nextLine()).toLowerCase();
         if (batt.contains("van")||batt.contains("vanilla")||batt.contains(" v ")){
            batter = "vanilla";
         } 
         else if (batt.contains("choc")||batt.contains("chocolate")||batt.contains(" c ")){
            batter = "chocolate";
         } 
         else {
            System.out.println(errorMessages()+" Please enter a valid flavor - chocolate or vanilla!");
         }
        }
        String frosting = "yes";
        while(frosting.equals("yes")){
        System.out.println("What color of frosting would you like? We have all of the colors of the rainbow - red, orange, yellow, green, blue, and purple! Please choose 1.");
        
        String frost = (myObj.nextLine()).toLowerCase();
        if(frost.contains("and") ||frost.contains("&") ){
            System.out.println("Please choose one color!");
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
            System.out.println(errorMessages()+" Please enter a valid color!");
        }
        }
        if(tiers==1){
        System.out.println("Your cake order is complete! It looks like you have: " + tiers + " tier made of " + cake[0] + " ice cream and " + batter + " batter, with " + frosting + " frosting on top!");
        
    }
        else if(tiers ==2){
            System.out.println("Your cake order is complete! It looks like you have: " + tiers + " tiers made of " + cake[0] + " and "+ cake[1]+ " ice cream, " + batter + " batter, and " + frosting + " frosting on top!");
        }
        else if(tiers == 3){
            System.out.println("Your cake order is complete! It looks like you have: " + tiers + " tiers made of " + cake[0] + ", "+ cake[1] + ", and " + cake[2]+ " ice cream,  " + batter + " batter, and " + frosting + " frosting on top!");
        }
        
        }
        public  void scoops(Scanner myObj) {
            int scoops = 0;
            String scooptemp = "filler";
            System.out.print("That sounds great!");
            while (scoops == 0) {
            System.out.println(" How many scoops would you like? One, two, or three?");
            scooptemp = (myObj.nextLine()).toLowerCase();
              if (scooptemp.equals("one") || scooptemp.equals("1")) {
                scoops = 1;
              } else if (scooptemp.equals("two") || scooptemp.equals("2")) {
                scoops = 2;
              } else if (scooptemp.equals("three") || scooptemp.equals("3")) {
                scoops = 3;
              } else {
                System.out.println(errorMessages()+"Please type one, two, or three!");
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
                System.out.println("What flavor would you like for your first scoop? Vanilla, chocolate, strawberry, rocky road, mint chocolate, or cookies and cream?");
              } else if (i == 1) {
                System.out.println("What flavor would you like for your second scoop? Vanilla, chocolate, strawberry, rocky road, mint chocolate, or cookies and cream?");
              } else if (i == 2) {
                System.out.println("What flavor would you like for your third scoop? Vanilla, chocolate, strawberry, rocky road, mint chocolate, or cookies and cream?");
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
                  System.out.println(errorMessages()+" Please choose one of the flavors above!");
                }
              }
            }
            
            Boolean useCone = true;
            int x = 0;
            while(x==0){
            
                System.out.println("Would you like your scoops on a cone or in a cup? ");
                scooptemp = (myObj.nextLine()).toLowerCase();
                if (scooptemp.contains("cup")) {
                    useCone = false;
                    x = 1;
                }
                else if(scooptemp.contains("con")){
                    x = 1;
                }
                else{
                    System.out.print(errorMessages());
                }
                   
            }

        
            // print out the order!
            System.out.println("Here is your order!");
            String orderString = "";
            if (scoops == 1) {
              orderString += "  One scoop of ";
            } else if (scoops == 2) {
              orderString += "  Two scoops: ";
            } else {
              orderString += "  Three scoops of ";
            }
            for (int i = 0; i < scoops; i++) {
               orderString += scoopFlavor[i].getFlavor() + " ";
            }
            orderString += useCone ? " on a cone" : " in a cup";
            System.out.println(orderString);
          }
        
          public void sundae(Scanner myObj) {
            String sundaeTemp = "yea";
            System.out.println("Looks like you want a sundae! What size do you want? You can pick small, medium or large.");
            String sundaeSize = "unknown";
            while (sundaeSize.equals("unknown")) {
              
              sundaeTemp = (myObj.nextLine()).toLowerCase();
              if (sundaeTemp.contains("small") || sundaeTemp.contains("medium") || sundaeTemp.contains("large")) {
                sundaeSize = sundaeTemp;
              } else {
                System.out.println(errorMessages()+" Please type small, medium, or large!");
              }
            }
        
            System.out.println("What flavor would you like? Vanilla, chocolate or strawberry?");
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
                System.out.println(errorMessages()+" Please choose one of the flavors above!");
              }
            }
        
            //chocolate chips, whipped cream, cherry, chocolate syrup, caramel syrup, gummies
           
            String[] toppings = new String[1];
            int toppingCount = 0;
            while (toppingCount == 0) {
              System.out.println("Which topping would you like? Chocolate chips, whipped cream, cherry, chocolate syrup, caramel syrup or gummies? Please pick one, matey!");
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
                toppings[toppingCount] = sundaeTemp;
                toppingCount ++;
              }
              else{
                System.out.print(errorMessages());
              }
            }
        
            // print out the order
            System.out.println("Here is your order!");
            System.out.println(sundaeSize + " " + sundaeFlavor + " flavored sundae, ");
            if (toppingCount == 0) {
              System.out.println(" with no topping.");
            } else if (toppingCount == 1) {
              System.out.println(" with " + toppings[0] + " topping.");
            } else {
              System.out.println(" with " + String.join(" and ", toppings) + " topping");
            }
          }
          public int finishCheck(Scanner myObj){
            System.out.println("Please press q to finish your order, or type anything else to continue your journey.");
            String x = (myObj.nextLine()).toLowerCase();
            if(x.equals("q")){
              return 1;
            }
            else{
              return 2;
            }
          }
        
    }


// import java.util.Scanner;

// public class ChatbotMethods {
//     public String errorMessages(){
//         String[] errorMessages = {"Sorry, what was that?", "Please make sure you typed that right!", "That isn't one of the options.", "What??!!?!?", "input not recognized :(", 
//     "try again", "Arrrrr! Me ears bad, couldn't hear that properly", "o-O", "Say it right or you're not getting our food!", "Didn't catch that...?", "Naurr we don't have that",
//     ":error:", "Say that again?", "Say that in sailor language!"};
//     String x = errorMessages[(int)(Math.random()*15)];
//     return x;
//     }
//     public  void greeting(){
//         String RED = "\u001B[31m";
//         String CYAN = "\u001B[36m";
//         System.out.println(CYAN + "Ahoy matey! Welcome to Scoops Ahoy - I'm Popeye, a chat bot designed to help you through the ordering proccess.\nRemember, you can press "+ RED + "q" + CYAN + " at any time to end out conversation.\nAre you ready to begin your ice cream journey?");   
//     }
//     public void finish(){
//       System.out.println("Sounds like your order is finished! Please proceed to the counter to recieve your ice cream. Enjoy - we hope to see you on our next expedition:)");
//     }
//     public void menu(){
//         System.out.println("I'm glad you asked about the menu:) We have several options, including ice cream scoops, sundaes, and of course, our world-famous ice cream cakes! Does anything sound appealing today? Let me know if you want to know more about any of the items or press q to end the conversation.");


//     }
//     public void quit(){
//         System.out.println("Thanks for coming! We hope to see you on our next expedition:)");

//     }
//     public void order(){
//         System.out.println("Looks like you're ready to order! Would you like scoops, sundaes, or our world-famous ice cream cakes?");
//     }
//     public void cake(Scanner myObj){
//         System.out.println("Great choice - our cakes are more famous than Blackbeard's treasure! ");
        
//         int tiers = 0;
//         while (tiers==0){
//          System.out.println("Would you like 1, 2, or 3 tiers in your cake?");
        
//         String tierResp = (myObj.nextLine()).toLowerCase();
//         if (tierResp!=null){
            
            
//             if (tierResp.contains("1") || tierResp.contains("one")){
//                 tiers = 1;
               
//             }
//             else if (tierResp.contains("2") || tierResp.contains("two")){
//                 tiers = 2;
               
//             }
//             else if (tierResp.contains("3") || tierResp.contains("three")){
//                 tiers = 3;
           
//             }
//             else{
//                 System.out.println(errorMessages()+ " Please enter a valid number of tiers - 1, 2, or 3!");
//             }
            
//         }
//         }
            
//             String[] cake = new String[tiers];
//             // int tierCount = 1;
//             for(int i = 0; i<cake.length; i++){
//                 String[] tierFlavs = {"What ice cream flavor would you like for the first tier? You can have chocolate, vanilla, or strawberry!", "What flavour would you like for the second tier?","Finally, what about the third tier?"};
//                 System.out.println(tierFlavs[i]);
//                 String tierFlav = (myObj.nextLine()).toLowerCase();
//                 if (tierFlav.contains("sb")||tierFlav.contains("straw")){
//                     cake[i] = "strawberry";
//                 }
//                 else if (tierFlav.contains("choc")||tierFlav.contains("chocolate")){
//                     cake[i] = "chocolate";
//                 }
//                 else if (tierFlav.contains("vanilla")){
//                     cake[i] = "vanilla";
//                 }
//                 else{
//                     System.out.println(errorMessages()+" Please enter a valid flavor - chocolate, strawberry, or vanilla!");
//                     i = i-1;
//                 }

//             }
//         System.out.print("That sounds delicious! Next, ");
//         String batter = "yes";
//         while(batter == "yes"){
//          System.out.println( "what kind of batter would you like for the cake? You can have chocolate or vanilla! ");
//          String batt = (myObj.nextLine()).toLowerCase();
//          if (batt.contains("van")||batt.contains("vanilla")||batt.contains(" v ")){
//             batter = "vanilla";
//          } 
//          else if (batt.contains("choc")||batt.contains("chocolate")||batt.contains(" c ")){
//             batter = "chocolate";
//          } 
//          else{
//             System.out.println(errorMessages()+" Please enter a valid flavor - chocolate or vanilla!");
//          }
//         }
//         String frosting = "yes";
//         while(frosting.equals("yes")){
//         System.out.println("What color of frosting would you like? We have all of the colors of the rainbow - red, orange, yellow, green, blue, and purple! Please choose 1.");
        
//         String frost = (myObj.nextLine()).toLowerCase();
//         if(frost.contains("and") ||frost.contains("&") ){
//             System.out.println("Please choose one color!");
//         }
//         else if(frost.contains("red")){
//             frosting = "red";
//         }
//         else if(frost.contains("orange")){
//             frosting = "orange";
//         }
//         else if(frost.contains("yellow")){
//             frosting = "yellow";
//         }
//         else if(frost.contains("green")){
//             frosting = "green";
//         }
//         else if(frost.contains("blue")){
//             frosting = "blue";
//         }
//         else if(frost.contains("purple")){
//             frosting = "purple";
//         }
//         else{
//             System.out.println(errorMessages()+" Please enter a valid color!");
//         }
//         }
//         if(tiers==1){
//         System.out.println("Your cake order is complete! It looks like you have: " + tiers + " tier made of " + cake[0] + " ice cream and " + batter + " batter, with " + frosting + " frosting on top!");
        
//     }
//         else if(tiers ==2){
//             System.out.println("Your cake order is complete! It looks like you have: " + tiers + " tiers made of " + cake[0] + " and "+ cake[1]+ " ice cream, " + batter + " batter, and " + frosting + " frosting on top!");
//         }
//         else if(tiers == 3){
//             System.out.println("Your cake order is complete! It looks like you have: " + tiers + " tiers made of " + cake[0] + ", "+ cake[1] + ", and " + cake[2]+ " ice cream,  " + batter + " batter, and " + frosting + " frosting on top!");
//         }
        
//         }
//         public  void scoops(Scanner myObj) {
//             int scoops = 0;
//             String scooptemp = "filler";
//             System.out.print("That sounds great!");
//             while (scoops == 0) {
//             System.out.println(" How many scoops would you like? One, two, or three?");
//             scooptemp = (myObj.nextLine()).toLowerCase();
//               if (scooptemp.equals("one") || scooptemp.equals("1")) {
//                 scoops = 1;
//               } else if (scooptemp.equals("two") || scooptemp.equals("2")) {
//                 scoops = 2;
//               } else if (scooptemp.equals("three") || scooptemp.equals("3")) {
//                 scoops = 3;
//               } else {
//                 System.out.println(errorMessages()+"Please type one, two, or three!");
//               }
//             }
        
//             String[] scoopFlavor = new String[scoops];
//             for (int i = 0; i < scoopFlavor.length; i++) {
//               if (i == 0) {
//                 System.out.println("What flavor would you like for your first scoop? Vanilla, chocolate, strawberry, rocky road, mint chocolate, or cookies and cream?");
//               } else if (i == 1) {
//                 System.out.println("What flavor would you like for your second scoop? Vanilla, chocolate, strawberry, rocky road, mint chocolate, or cookies and cream?");
//               } else if (i == 2) {
//                 System.out.println("What flavor would you like for your third scoop? Vanilla, chocolate, strawberry, rocky road, mint chocolate, or cookies and cream?");
//               }
              
//               while (scoopFlavor[i] == null) {
//                 scooptemp = (myObj.nextLine()).toLowerCase();
//                 if (scooptemp.contains("straw")) {
//                   scoopFlavor[i] = "strawberry";
//                 } else if (scooptemp.contains("mint")) {
//                   scoopFlavor[i] = "mint chocolate";
//                 } else if (scooptemp.contains("van")) {
//                   scoopFlavor[i] = "vanilla";
//                 } else if (scooptemp.contains("rock")) {
//                   scoopFlavor[i] = "rocky road";
//                 } else if (scooptemp.contains("choc") ) {
//                   scoopFlavor[i] = "chocolate";
//                 } else if (scooptemp.contains("cook")) {
//                   scoopFlavor[i] = "cookies and cream";
//                 } else {
//                   System.out.println(errorMessages()+" Please choose one of the flavors above!");
//                 }
//               }
//             }
            
//             Boolean useCone = true;
//             int x = 0;
//             while(x==0){
            
//                 System.out.println("Would you like your scoops on a cone or in a cup? ");
//                 scooptemp = (myObj.nextLine()).toLowerCase();
//                 if (scooptemp.contains("cup")) {
//                     useCone = false;
//                     x = 1;
//                 }
//                 else if(scooptemp.contains("con")){
//                     x = 1;
//                 }
//                 else{
//                     System.out.print(errorMessages());
//                 }
                   
//             }

        
//             // print out the order!
//             System.out.println("Here is your order!");
//             if (scoops == 1) {
//               System.out.print("  One scoop of ");
//             } else if (scoops == 2) {
//               System.out.print("  Two scoops: ");
//             } else {
//               System.out.print("  Three scoops of ");
//             }
//             System.out.println(String.join(", ", scoopFlavor));
//             System.out.println(useCone ? " on a cone" : " in a cup");
//           }
        
//           public void sundae(Scanner myObj) {
//             String sundaeTemp = "yea";
//             System.out.println("Looks like you want a sundae! What size do you want? You can pick small, medium or large.");
//             String sundaeSize = "unknown";
//             while (sundaeSize.equals("unknown")) {
              
//               sundaeTemp = (myObj.nextLine()).toLowerCase();
//               if (sundaeTemp.contains("small") || sundaeTemp.contains("medium") || sundaeTemp.contains("large")) {
//                 sundaeSize = sundaeTemp;
//               } else {
//                 System.out.println(errorMessages()+" Please type small, medium, or large!");
//               }
//             }
        
//             System.out.println("What flavor would you like? Vanilla, chocolate or strawberry?");
//             String sundaeFlavor = "unknown";
//             while (sundaeFlavor.equals("unknown")) {
//               sundaeTemp = (myObj.nextLine()).toLowerCase();
//               if (sundaeTemp.contains("strawberry") || sundaeTemp.contains("straw")) {
//                 sundaeFlavor = "strawberry";
//               } else if (sundaeTemp.contains("chocolate") || sundaeTemp.contains("choc")) {
//                 sundaeFlavor = "chocolate";
//               } else if (sundaeTemp.contains("vanilla") || sundaeTemp.contains("van")) {
//                 sundaeFlavor = "vanilla";
//               } else {
//                 System.out.println(errorMessages()+" Please choose one of the flavors above!");
//               }
//             }
        
//             //chocolate chips, whipped cream, cherry, chocolate syrup, caramel syrup, gummies
           
//             String[] toppings = new String[1];
//             int toppingCount = 0;
//             while (toppingCount == 0) {
//               System.out.println("Which topping would you like? Chocolate chips, whipped cream, cherry, chocolate syrup, caramel syrup or gummies? Please pick one, matey!");
//               sundaeTemp = (myObj.nextLine()).toLowerCase();
//               if (sundaeTemp.contains("no")) {
//                 System.out.println("Ok!");
//                 break;
//               } else if (sundaeTemp.contains("chip")){
//                 toppings[toppingCount] = "chocolate chips";
//                 toppingCount++;
//               } else if( sundaeTemp.contains("cream")){
//                 toppings[toppingCount] = "whipped cream";
//                 toppingCount++;
//               } else if( sundaeTemp.contains("cherr")){
//                 toppings[toppingCount] = "cherries";
//                 toppingCount++;
//               }
//               else if(sundaeTemp.contains("choc")&& sundaeTemp.contains("syr")){
//                 toppings[toppingCount] = "chocolate syrup";
//                 toppingCount++;
//               } 
//               else if( sundaeTemp.contains("cara")&& sundaeTemp.contains("syr")){
//                 toppings[toppingCount] = "caramel syrup";
//                 toppingCount++;
//               } 
//               else if(sundaeTemp.contains("gumm")) {
//                 toppings[toppingCount] = sundaeTemp;
//                 toppingCount ++;
//               }
//               else{
//                 System.out.print(errorMessages());
//               }
//             }
        
//             // print out the order
//             System.out.println("Here is your order!");
//             System.out.println(sundaeSize + " " + sundaeFlavor + " flavored sundae, ");
//             if (toppingCount == 0) {
//               System.out.println(" with no topping.");
//             } else if (toppingCount == 1) {
//               System.out.println(" with " + toppings[0] + " topping.");
//             } else {
//               System.out.println(" with " + String.join(" and ", toppings) + " topping");
//             }
//           }
//           public int finishCheck(Scanner myObj){
//             System.out.println("Please press q to finish your order, or type anything else to continue your journey.");
//             String x = (myObj.nextLine()).toLowerCase();
//             if(x.equals("q")){
//               return 1;
//             }
//             else{
//               return 2;
//             }
//           }
        
//     }

