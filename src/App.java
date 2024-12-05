
import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        ChatbotMethods chatbot = new ChatbotMethods();
        Scanner myObj = new Scanner(System.in);  
        
        int x = 0;
        int w = 0;
        while(w ==0){
        chatbot.greeting();
        
        
        String greetResp = ( myObj.nextLine()).toLowerCase();
        if (greetResp!= null){
            
            if (greetResp.contains("no")){
                int p = 0;
                while(p==0){
                    System.out.println(chatbot.getCyan()+"It sounds like you aren't ready to order. Please let me know if you would like to see the menu, or press q to end our conversation."+chatbot.getWhite());
                    String noResp = (myObj.nextLine()).toLowerCase();
                    if(noResp.contains("menu")){
                        p=1;
                        chatbot.menu();

                        String menuResp = (myObj.nextLine()).toLowerCase();
                        if(menuResp.equals("q")){
                            chatbot.quit();
                            w=1;
                            return;
                        }
                        // else if((menuResp.contains("cake")&&menuResp.contains("scoop")||(menuResp.contains("cake")&&menuResp.contains("sund")||(menuResp.contains("sund")&&menuResp.contains("scoop")||(menuResp.contains("sundae")&&menuResp.contains("")){

                        // }
                        else if (menuResp.contains("cake")||menuResp.contains("world")||menuResp.contains("famous")){
                            chatbot.cake(myObj);
                            int y = chatbot.finishCheck(myObj);
                                if(y==1){
                                chatbot.finish();
                                w = 1;
                            }
                
                        }
                        else if(menuResp.contains("sund")){
                            chatbot.sundae(myObj);
                            int y = chatbot.finishCheck(myObj);
                            if(y==1){
                                chatbot.finish();
                                w = 1;
                            }
                            }
                        else if(menuResp.contains("scoop")){
                            chatbot.scoops(myObj);
                            int y = chatbot.finishCheck(myObj);
                            if(y==1){
                                chatbot.finish();
                                w = 1;
                            }
                        }
                        else if(menuResp.contains("order")|| menuResp.contains("ye")||menuResp.contains("ice")||menuResp.contains("ok")){
                            chatbot.order();
                            String orderResp = (myObj.nextLine()).toLowerCase();
                            if(orderResp.equals("q")){
                                chatbot.quit();
                                w=1;
                                return;
                            }
                            
                            else if(orderResp.contains("recc") || orderResp.contains("sugg")||orderResp.contains("think")){
                                System.out.println("I recommend trying one of our world-famous ice cream cakes! Would you like one?"+chatbot.getWhite());
                                String suggResp = (myObj.nextLine()).toLowerCase();
                                if(suggResp.equals("q")){
                                    chatbot.quit();
                                    w=1;
                                    return;
                                }
                                else if(suggResp.contains("ye")){
                                    chatbot.cake(myObj);
                                    int y = chatbot.finishCheck(myObj);
                                    if(y==1){
                                        chatbot.finish();
                                        w = 1;
                                    }
                        
                                }
                                else if (suggResp.contains("no")){
                                    System.out.println(chatbot.getCyan()+"Ok! You will be redirected to the beginning of our order process."+chatbot.getWhite());
                                }
                                else{
                                    System.out.println(chatbot.getCyan()+chatbot.errorMessages() + " You will be redirected to the beginning of our order process."+chatbot.getWhite());
                                }
                            }
                            else if (orderResp.contains("cake")||orderResp.contains("world")||orderResp.contains("famous")){
                                chatbot.cake(myObj);
                                int y = chatbot.finishCheck(myObj);
                                if(y==1){
                                    chatbot.finish();
                                    w = 1;
                                }
                            }
                            else if(orderResp.contains("sund")){
                                chatbot.sundae(myObj);
                                int y = chatbot.finishCheck(myObj);
                                if(y==1){
                                    chatbot.finish();
                                    w = 1;
                                } 
                            }
                            else if(orderResp.contains("scoop")){
                                chatbot.scoops(myObj);
                                int y = chatbot.finishCheck(myObj);
                                if(y==1){
                                    chatbot.finish();
                                    w = 1;
                                } 
                            }
                            
                    
                        }
                        else if(menuResp.contains("recc") || menuResp.contains("sugg")||menuResp.contains("think")){
                            System.out.println(chatbot.getCyan()+"I recommend trying one of our world-famous ice cream cakes! Would you like one?"+chatbot.getWhite());
                            String suggResp = (myObj.nextLine()).toLowerCase();
                            if(suggResp.equals("q")){
                                chatbot.quit();
                                w=1;
                                return;
                            }
                            else if(suggResp.contains("ye")){
                                chatbot.cake(myObj);
                                int y = chatbot.finishCheck(myObj);
                                if(y==1){
                                    chatbot.finish();
                                    w = 1;
                                }
                            }
                            else if (suggResp.contains("no")){
                                System.out.println(chatbot.getCyan()+"Ok! You will be redirected to the beginning of our order process."+chatbot.getWhite());
                            }
                            else{
                                System.out.println(chatbot.getCyan()+chatbot.errorMessages() + " You will be redirected to the beginning of our order process."+chatbot.getWhite());
                            }
                        }
                    }
                    else if(noResp.equals("q")){
                        chatbot.quit();
                        p = 1;
                        w=1;
                        return;
                    }
                     
                    else{
                        System.out.println(chatbot.getCyan()+chatbot.errorMessages()+chatbot.getWhite());
                    }   
                }
            }
            else if(greetResp.contains("scoop")){
                chatbot.scoops(myObj);
                int y = chatbot.finishCheck(myObj);
                if(y==1){
                    chatbot.finish();
                    w = 1;
                    
                } 
            }
            else if(greetResp.contains("sund")){
                chatbot.sundae(myObj);
                int y = chatbot.finishCheck(myObj);
                if(y==1){
                    chatbot.finish();
                    w = 1;
                    
                } 
            }
            else if(greetResp.contains("cake")||greetResp.contains("world")||greetResp.contains("famous")){
                chatbot.cake(myObj);
                int y = chatbot.finishCheck(myObj);
                if(y==1){
                    chatbot.finish();
                    w = 1;
                }
            }
            else if (greetResp.contains("menu")){
                chatbot.menu();
                String menuResp = (myObj.nextLine()).toLowerCase();
                if(menuResp.equals("q")){
                    chatbot.quit();
                    w=1;
                    return;
                }
                else if (menuResp.contains("cake")||menuResp.contains("world")||menuResp.contains("famous")){
                    chatbot.cake(myObj);
                    int y = chatbot.finishCheck(myObj);
                    if(y==1){
                        chatbot.finish();
                        w = 1;
                    }
                }
                else if(menuResp.contains("sund")){
                    chatbot.sundae(myObj);
                    int y = chatbot.finishCheck(myObj);
                    if(y==1){
                        chatbot.finish();
                        w = 1;
                    } 
                }
                else if(menuResp.contains("scoop")){
                    chatbot.scoops(myObj);
                    int y = chatbot.finishCheck(myObj);
                    if(y==1){
                        chatbot.finish();
                        w = 1;
                    } 
                }
                else if(menuResp.contains("order")|| menuResp.contains("ye")||menuResp.contains("ice")||menuResp.contains("ok")){
                    chatbot.order();
                    String orderResp = (myObj.nextLine()).toLowerCase();
                    if(orderResp.equals("q")){
                        chatbot.quit();
                        w=1;
                        return;
                    }
                    else if(orderResp.contains("recc") || orderResp.contains("sugg")){
                        System.out.println(chatbot.getCyan()+"I recommend trying one of our world-famous ice cream cakes! Would you like one?"+chatbot.getWhite());
                        String suggResp = (myObj.nextLine()).toLowerCase();
                        if(suggResp.equals("q")){
                            chatbot.quit();
                            w=1;
                            return;
                        }
                        else if(suggResp.contains("ye")){
                            chatbot.cake(myObj);
                            int y = chatbot.finishCheck(myObj);
                            if(y==1){
                                chatbot.finish();
                                w = 1;
                            }
                        }
                        else if (suggResp.contains("no")){
                            System.out.println(chatbot.getCyan()+"Ok! You will be redirected to the beginning of our order process."+chatbot.getWhite());
                        }
                        else{
                            System.out.println(chatbot.getCyan()+chatbot.errorMessages() + " You will be redirected to the beginning of our order process."+chatbot.getWhite());
                        }
                    }
                    else if (orderResp.contains("cake")||orderResp.contains("world")||orderResp.contains("famous")){
                        chatbot.cake(myObj);
                        int y = chatbot.finishCheck(myObj);
                        if(y==1){
                            chatbot.finish();
                            w = 1;
                        }
                    }
                    else if(orderResp.contains("sund")){
                        chatbot.sundae(myObj);
                        int y = chatbot.finishCheck(myObj);
                        if(y==1){
                            chatbot.finish();
                            w = 1;
                        } 
                    }
                    else if(orderResp.contains("scoop")){
                        chatbot.scoops(myObj);
                        int y = chatbot.finishCheck(myObj);
                        if(y==1){
                            chatbot.finish();
                            w = 1;
                        } 
                    }
                    
                }   
                else if(menuResp.contains("recc") || menuResp.contains("sugg")||menuResp.contains("think")){
                    System.out.println(chatbot.getCyan()+"I recommend trying one of our world-famous ice cream cakes! Would you like one?"+chatbot.getWhite());
                    String suggResp = (myObj.nextLine()).toLowerCase();
                    if(suggResp.equals("q")){
                        chatbot.quit();
                        w=1;
                        return;
                    }
                    else if(suggResp.contains("ye")||suggResp.contains("cake")||suggResp.contains("world")){
                        chatbot.cake(myObj);
                        int y = chatbot.finishCheck(myObj);
                        if(y==1){
                            chatbot.finish();
                            w = 1;
                        }
                    }
                    else if (suggResp.contains("no")){
                        System.out.println(chatbot.getCyan()+"Ok! You will be redirected to the beginning of our order process."+chatbot.getWhite());
                    }
                    else{
                        System.out.println(chatbot.getCyan()+chatbot.errorMessages() + " You will be redirected to the beginning of our order process."+chatbot.getWhite());
                    }
                }
            }
            else if(greetResp.contains("recc") || greetResp.contains("sugg")||greetResp.contains("think")){
                System.out.println(chatbot.getCyan()+"I reccomend trying one of our world-famous ice cream cakes! Would you like one?"+chatbot.getWhite());
                String suggResp = (myObj.nextLine()).toLowerCase();
                if(suggResp.equals("q")){
                    chatbot.quit();
                    w=1;
                    return;
                }
                else if(suggResp.contains("ye")){
                    chatbot.cake(myObj);
                    int y = chatbot.finishCheck(myObj);
                    if(y==1){
                        chatbot.finish();
                        w = 1;
                    }
                }
                
                else if (suggResp.contains("no")){
                    System.out.println(chatbot.getCyan()+"Ok! You will be redirected to the beginning of our order process."+chatbot.getWhite());
                }
                else{
                    System.out.println(chatbot.getCyan()+chatbot.errorMessages() + " You will be redirected to the beginning of our order process"+chatbot.getWhite());
                }
                
            }
            
            else if (greetResp.contains("order")|| greetResp.contains("ye")||greetResp.contains("ice")||greetResp.contains("ok")){
                int m = 0;
                chatbot.order();
                while(m==0){
                String orderResp = (myObj.nextLine()).toLowerCase();
                if (orderResp.equals("q")){
                    m=1;
                    chatbot.quit();
                    w=1;
                    return;
                }
                else if (orderResp.contains("cake")||orderResp.contains("world")||orderResp.contains("famous")){
                    m=1;
                    chatbot.cake(myObj); 
                    int y = chatbot.finishCheck(myObj);
                    if(y==1){
                        chatbot.finish();
                        w = 1;
                    } 
                }
                else if(orderResp.contains("sund")){
                    m=1;
                    chatbot.sundae(myObj);
                    int y = chatbot.finishCheck(myObj);
                    if(y==1){
                        chatbot.finish();
                        w = 1;
                    } 
                }
                else if(orderResp.contains("scoop")){
                    m=1;
                    chatbot.scoops(myObj);
                    int y = chatbot.finishCheck(myObj);
                    if(y==1){
                        chatbot.finish();
                        w = 1;
                    } 
                }
                else if(orderResp.contains("recc") || orderResp.contains("sugg")||orderResp.contains("think")){
                    m=1;
                    System.out.println(chatbot.getCyan()+"I recommend trying one of our world-famous ice cream cakes! Would you like one?"+chatbot.getWhite());
                    String suggResp = (myObj.nextLine()).toLowerCase();
                    if(suggResp.equals("q")){
                        chatbot.quit();
                        w=1;
                        return;
                    }
                    else if(suggResp.contains("ye")||suggResp.contains("ok")){
                        chatbot.cake(myObj);
                        int y = chatbot.finishCheck(myObj);
                        if(y==1){
                            chatbot.finish();
                            w = 1;
                        }
                    }
                    else if (suggResp.contains("no")){
                        System.out.println(chatbot.getCyan()+"Ok! You will be redirected to the beginning of our order process."+chatbot.getWhite());
                    }
                    else{
                        System.out.println(chatbot.getCyan()+chatbot.errorMessages() + " You will be redirected to the beginning of our order process."+chatbot.getWhite());
                    }
                }
                
                else{
                    System.out.println(chatbot.getCyan()+chatbot.errorMessages()+" Please begin ordering, or press q to end this conversation."+chatbot.getWhite());
                }
                }
                
            }
            
            else if (greetResp.equals("q")){
                chatbot.quit();
                w=1;
                return;
            }
            
            else{
                while(x==0){
                    System.out.println(chatbot.getCyan()+"Sorry, I don't understand. Feel free to begin ordering, or ask for our menu if you would like."+chatbot.getWhite());
                    String errorResp = myObj.nextLine().toLowerCase();
                    if(errorResp.equals("q")){
                        chatbot.quit();
                        x=1;
                        w=1;
                        return;
                    }
                    else if(errorResp.contains("no")){
                        System.out.println(chatbot.getCyan()+"It sounds like you aren't ready to order. Please come back when you are ready to be nice buddy:)"+chatbot.getWhite());
                        x=1;
                    }
                    else if (errorResp.contains("cake")||errorResp.contains("world")||errorResp.contains("famous")){
                        chatbot.cake(myObj);
                        int y = chatbot.finishCheck(myObj);
                        if(y==1){
                            chatbot.finish();
                            w = 1;
                        }
                        x=1;
                    }
                    else if(errorResp.contains("sund")){
                        chatbot.sundae(myObj);
                        int y = chatbot.finishCheck(myObj);
                        if(y==1){
                            chatbot.finish();
                            w = 1;
                        } 
                        x=1;
                    }
                    else if(errorResp.contains("scoop")){
                        chatbot.scoops(myObj);
                        int y = chatbot.finishCheck(myObj);
                        if(y==1){
                            chatbot.finish();
                            w = 1;
                        } 
                        x=1;
                    }
                    else if(errorResp.contains("order")||errorResp.contains("ice")){
                        x = 1;
                        chatbot.order();
                        String orderResp = (myObj.nextLine()).toLowerCase();
                        if(orderResp.equals("q")){
                            chatbot.quit();
                            w=1;
                            return;
                        }
                        else if (orderResp.contains("cake")){
                            chatbot.cake(myObj);
                            int y = chatbot.finishCheck(myObj);
                            if(y==1){
                                chatbot.finish();
                                w = 1;
                            }
                   
                        }
                        else if(orderResp.contains("sund")){
                            chatbot.sundae(myObj);
                            int y = chatbot.finishCheck(myObj);
                            if(y==1){
                                chatbot.finish();
                                w = 1;
                            } 
                        }
                        else if(orderResp.contains("scoop")){
                            chatbot.scoops(myObj);
                            int y = chatbot.finishCheck(myObj);
                            if(y==1){
                                chatbot.finish();
                                w = 1;
                            } 
                        }
                        else if(orderResp.contains("recc") || orderResp.contains("sugg")||orderResp.contains("think")){
                            x=1;
                            System.out.println(chatbot.getCyan()+"I recommend trying one of our world-famous ice cream cakes! Would you like one?"+chatbot.getWhite());
                            String suggResp = (myObj.nextLine()).toLowerCase();
                            if(suggResp.equals("q")){
                                chatbot.quit();
                                w=1;
                                return;
                            }
                            else if(suggResp.contains("ye")||suggResp.contains("ok")){
                                chatbot.cake(myObj);
                                int y = chatbot.finishCheck(myObj);
                                if(y==1){
                                    chatbot.finish();
                                    w = 1;
                                }
                            }
                            else if (suggResp.contains("no")){
                                System.out.println(chatbot.getCyan()+"Ok! You will be redirected to the beginning of our order process."+chatbot.getWhite());
                            }
                            else{
                                System.out.println(chatbot.getCyan()+chatbot.errorMessages() + " You will be redirected to the beginning of our order process."+chatbot.getWhite());
                            }
                        }
                    }
                    else if(errorResp.contains("menu")){
                        x=1;
                        chatbot.menu();
                        String menuResp = (myObj.nextLine()).toLowerCase(); 
                        if (menuResp.contains("cake")||menuResp.contains("world")||menuResp.contains("famous")){
                            chatbot.cake(myObj);
                            int y = chatbot.finishCheck(myObj);
                            if(y==1){
                                chatbot.finish();
                                w = 1;
                            }
                        }
                        else if(menuResp.contains("sund")){
                            chatbot.sundae(myObj);
                            int y = chatbot.finishCheck(myObj);
                            if(y==1){
                                chatbot.finish();
                                w = 1;
                            } 
                        }
                        else if(menuResp.contains("scoop")){
                            chatbot.scoops(myObj);
                            int y = chatbot.finishCheck(myObj);
                                if(y==1){
                                    chatbot.finish();
                                    w = 1;
                                } 
                            }
                        
                        else if(menuResp.contains("recc") || menuResp.contains("sugg")||menuResp.contains("think")){
                            System.out.println(chatbot.getCyan()+"I recommend trying one of our world-famous ice cream cakes! Would you like one?"+chatbot.getWhite());
                            String suggResp = (myObj.nextLine()).toLowerCase();
                            if(suggResp.equals("q")){
                                chatbot.quit();
                                w=1;
                            }
                            else if(suggResp.contains("ye")||suggResp.contains("ok")){
                                chatbot.cake(myObj);
                                int y = chatbot.finishCheck(myObj);
                                if(y==1){
                                    chatbot.finish();
                                    w = 1;
                                }
                            }
                            else if (suggResp.contains("no")){
                                System.out.println(chatbot.getCyan()+"Ok! You will be redirected to the beginning of our order process."+chatbot.getWhite());
                            }
                            else{
                                System.out.println(chatbot.getCyan()+chatbot.errorMessages() + " You will be redirected to the beginning of our order process."+chatbot.getWhite());
                            }
                        
                        }
                
                    }
                }
            }
        }
    }
}        
    
            
                // else if(greetResp.contains("recc") || greetResp.contains("sugg")){
                //     System.out.println("I recommend trying one of our world-famous ice cream cakes! Would you like one?");
                //     String suggResp = (myObj.nextLine()).toLowerCase();
                //         if(suggResp.contains("ye")){
                //         chatbot.cake(myObj);
                //         }
}
               
        
    
     
    


       
        
        
    
        
    
        
    



    






