import java.util.*;
class main
{
    public static void main(String arg[])
    {
       String type="";
        String brand="";
       String model="";
       double price=0.0;
       String paintn="";
       double paint=0.0;
       Scanner sc = new Scanner(System.in);
       System.out.println("**             ** ** * * * *  **            ****      ****     **          **  ** * * * *        ");             
       System.out.println(" **           **  **          **          **        **    **   ** *      * **  **        ");
       System.out.println("  **    *    **   ** * *      **         **        **      **  **  *    *  **  ** * *");
       System.out.println("   ** ** ** **    **          **          **        **    **   **   *  *   **  **       ");           
       System.out.println("    **     **     ** * * * *  ** * * * *    ****      ****     **    **    **  ** * * * *  ");                             
       System.out.println("");
       System.out.println("              * * * * * *    ****          * * * * * *  **     **  ** * * * *  ");                                                      
       System.out.println("                  **       **    **            **       **     **  **             ");  
       System.out.println("                  **      **      **           **       ** * * **  ** * *            ");         
       System.out.println("                  **       **    **            **       **     **  **                ");
       System.out.println("                  **         ****              **       **     **  ** * * * *");
       System.out.println("                                                                                ");                                    
       System.out.println("**             **     ****      ** * *     **          ** * *           ****     ** * * * *");                                                                                                                               
       System.out.println(" **           **    **    **    **     *   **          **     *       **    **   **        ");                                                                                                                      
       System.out.println("  **    *    **    **      **   ** * *     **          **      *     **      **  ** * *    ");                                           
       System.out.println("   ** ** ** **      **    **    **   *     **          **     *       **    **   **        ");                                       
       System.out.println("    **     **         ****      **     *   ** * * * *  ** * *           ****     **        ");                                        
       System.out.println("                                                                                           ");          
       System.out.println("                        * * * * * * **             **    ****                              ");                                             
       System.out.println("                            **       **           **   **    **                            ");                                     
       System.out.println("                            **        **    *    **   **      **                           ");                               
       System.out.println("                            **         ** ** ** **     **    **                            ");                              
       System.out.println("                            **          **     **        ****                 ");
       System.out.println("                                                                                 ");                                   
       System.out.println("**             ** **    **  ** * * * *  ** * * * *  **          ** * * * *  ** * *      * * *  ");                                             
       System.out.println(" **           **  **    **  **          **          **          **          **     *  *        ");                              
       System.out.println("  **    *    **   ** ** **  ** * *      ** * *      **          ** * *      ** * *       * *    ");                                
       System.out.println("   ** ** ** **    **    **  **          **          **          **          **   *           *   ");                          
       System.out.println("    **     **     **    **  ** * * * *  ** * * * *  ** * * * *  ** * * * *  **     *   * * *     ");          
       System.out.println("Our company provides the best brands of two wheelers and always gives the best service possible");
       System.out.println("We provide free home delivery of your two wheeler.");
       System.out.println("For each of the purchases, there is a tax added to it. All the details of taxes will be mentioned in the bill");
       System.out.println("5% discount on the purchase of a scooter. 10% discount on the purchase of a bike. ");
       System.out.println("We have a large range of variety of two wheelers");
       System.out.println("Which type of two wheeler do you want?");
       System.out.println("Press 1 for bike");
       System.out.println("Press 2 for scooter");
       int choice= sc.nextInt();
       switch (choice)
       {
           case 1: type="Bike";
           System.out.println("                               *             ");
        System.out.println("                                *  *           ") ;
        System.out.println("                                  *  *           ")   ; 
        System.out.println("  *  *  *  *                 * * * * * * *         "); 
        System.out.println("     * * *  * *            * * * * * * * * *      ");
        System.out.println("         * * *  * * * * * * * * * * * * * * *   ");
        System.out.println("            * * * * * * * * * * * * * * * * ");
        System.out.println("       **    * * * * * * * * * * * *     ** ");
        System.out.println("    *      *  * * * * * * * * * * *   *      *");
        System.out.println("   *        *  * * * * * * * * * *   *        *");
        System.out.println("    *      *   * * * * * * * * * *    *      *");
        System.out.println("       **                                **  ");
        System.out.println("Thank you for choosing to get a bike");
        System.out.println("We provide different choices of bike brands and even various types of models");
        System.out.println("The available choices of bike brands are:");
        int A = 0;
        do
        {
            A=0;
        System.out.println("1. Yamaha Motors");
        System.out.println("2. Honda");
        System.out.println("3. Bawarian Motor Works (B.M.W)");
        System.out.println("Please enter your choice by entering the respective numbers.");
        int choice1 = sc.nextInt();
        switch (choice1)
        {
         case 1: brand = "Yamaha Motors";
         int i=0;   
         System.out.println("               YAMAHA MOTORS               ");
         System.out.println("Thank you for choosing Yamaha Motors.");
         System.out.println("We provide 3 different bike models");
         do
         {
             i=0;
         System.out.println("Enter the bike which you want");
         System.out.println("1.VMAX");
         System.out.println("2.YZF R1");
         System.out.println("3.FAZER-FI");
         System.out.println("4.Back to list of brands");
         int choice2 = sc.nextInt();
        switch(choice2)
         {
             case 1: model = "VMAX";
             System.out.println("               VMAX                 ");
             System.out.println("Features:");
             System.out.println("Awesome acceleration feeling together with strong performance");
             System.out.println("Distinctive, precise and sharp handling");
             System.out.println("1,679 cc liquid-cooled 4 Stroke V4 engine");
             System.out.println("Specially designed and modified front fork and front tyre to make driving easier");
             System.out.println("Price: Rs.26,94,577.00");
             System.out.println("Do you want to buy this model?");
             System.out.println("1. Yes");
             System.out.println("2. Go back to list of models");
             int c1= sc.nextInt();
             if(c1==1)
             {
             price = 2694577.0;
             i=1;
            }
             else
             i = 2;
             break;
             case 2: model = "YZF R1";
             System.out.println("              YZF R1                   ");
             System.out.println("Features:");
             System.out.println("998cc crossplane 4 cylinder 4-valve engine that develops 200PS - without ram air pressurization.");
             System.out.println("High compression 13:1 cylinder head");
             System.out.println(" The next generation R1's aerodynamic front cowl has an unmistakable M1 race bike silhouette.");
             System.out.println("For optimal intake efficiency a central air inlet feeds a large capacity 10.5 litre airbox.");
             System.out.println("Price: Rs.24,74,659.00");
             System.out.println("Do you want to buy this model?");
             System.out.println("1. Yes");
             System.out.println("2. Go back to list of models");
             int c2= sc.nextInt();
             if(c2==1)
             {
             price = 2474659.0;
             i=1;
            }
            else
             i = 2;
             break;
             case 3: model = "FAZER-FI";
             System.out.println("              FAZER-FI                   ");
             System.out.println("Features:");
             System.out.println("YAMAHA’s Fuel Injection System contains sensors, actuators and an Engine Control Unit (ECU). Sensors detect temperature, atmospheric pressure and engine condition.");
             System.out.println("FAZER FI’s 7-times adjustable Monocross suspension are of World Motocross Championship standards.");
             System.out.println("Large fuel tank with a capacity of 12 liters");
             System.out.println("Price: Rs.87,405.00");
             System.out.println("Do you want to buy this model?");
             System.out.println("1. Yes");
             System.out.println("2. Go back to list of models");
             int c3= sc.nextInt();
             if(c3==1)
             {
             price =87405.0;
             i = 1;
            }
             else 
             i = 2;
             break;
             case 4: A = 1;
             break;
             default: System.out.println("Invalid choice");
             break;
            }
        }while(i>1);
        break;
            case 2: brand = "Honda";
            int j = 0;
            System.out.println("               HONDA                 ");
            System.out.println("Thank you for choosing Honda.");
            System.out.println("We provide 3 different bike choices");
            do
            {
                j=0;
            System.out.println("Enter the bike which you want");
            System.out.println("1.CBR250R");
            System.out.println("2.CBHornet160R");
            System.out.println("3.CB Unicorn160");
            System.out.println("4.Back to list of brands");
            int choice3= sc.nextInt();
            switch(choice3)
            {
                case 1: model="CBR250R";
                System.out.println("               CBR250R                  ");
                System.out.println("Features:");
                System.out.println("An adjustable single shock mounted on pro-link mechanism gives smooth ride with enhanced handling.");
                System.out.println("Cutting edge 250cc engine is full of sheer performance while retaining great efficiency.");
                System.out.println("Integrated full faring brings in true sports character & improved aerodynamics.");
                System.out.println("Price: Rs. 1,69,878.00");
                System.out.println("Do you want to buy this model?");
                System.out.println("1. Yes");
             System.out.println("2. Go back to list of models");
             int c4= sc.nextInt();
             if(c4==1)
             {
             price =169878.0;
             j = 1;
            }
             else 
             j = 2;
             break;
             case 2: model="CBHornet160R";
             System.out.println("                CBHornet160R                      ");
             System.out.println("Features:");
             System.out.println("Raw power of 160cc to keep you ahead of all.");
             System.out.println("Combi brake system");
             System.out.println("Wider rear tyre- 140MM");
             System.out.println("Price: Rs. 85,029.00");
             System.out.println("Do you want to buy this model?");
             System.out.println("1. Yes");
             System.out.println("2. Go back to list of models");
             int c5= sc.nextInt();
             if(c5==1)
             {
             price =85029.0;
             j = 1;
            }
             else 
             j = 2;
             break;
             case 3:model="CB Unicorn160";
             System.out.println("              CB Unicorn160              ");
             System.out.println("Features:");
             System.out.println("Raw power of 160cc to keep you ahead of all.");
             System.out.println("Large Fuel Tank");
             System.out.println("Combined Braking System");
             System.out.println("Price: Rs.	80,066.00");
             System.out.println("Do you want to buy this model?");
                System.out.println("1. Yes");
             System.out.println("2. Go back to list of models");
             int c6= sc.nextInt();
             if(c6==1)
             {
             price =80066.0;
             j = 1;
            }
             else 
             j = 2;
             break;
             case 4: A=1;
             break;
             default:System.out.println("Invalid Choice");
             break;
            }
        }while(j>1);
        break;
            case 3:brand="Bawarian Motor Works (B.M.W)";
            int k = 0;
            System.out.println("                  B.M.W                  ");
            System.out.println("Thank you for choosing B.M.W.");
            System.out.println("We provide 3 different bike choices");
            do
            {
                k=0;
            System.out.println("Enter the bike which you want");
            System.out.println("1. S 1000 RR");
            System.out.println("2. R 1200 R");
            System.out.println("3. K 1300 S");
            System.out.println("4. Back to list of brands.");
            int choice4= sc.nextInt();
            switch(choice4)
            {
                case 1: model ="S 1000 RR";
                System.out.println("               S 1000 RR               ");
                System.out.println("Features:");
                System.out.println("Pure sports bike with 1000cc engine.");
                System.out.println("Enhanced dynamics with increased comfort");
                System.out.println("Increased output to 199hp, reduced weight to 450lb.");
                System.out.println("Price: 10,51,885.00");
                System.out.println("Do you want to buy this model?");
                System.out.println("1. Yes");
             System.out.println("2. Go back to list of models");
             int c7= sc.nextInt();
             if(c7==1)
             {
             price =1051885.0;
             k = 1;
            }
             else 
             k = 2;
             break;
             case 2: model="R 1200 R";
             System.out.println("                  R 1200 R             "); 
             System.out.println("Features:");
             System.out.println("Roadster bike with an engine of 1170cc capacity.");
             System.out.println("A total of 125 hp provides plenty of power in the new R 1200 R. ");
             System.out.println("The upside down telescopic fork based on the S 1000 RR not only gives this powerhouse a striking appearance but also ensures stability and precise handling.");
             System.out.println("Price: Rs. 9,44,653.00");
             System.out.println("Do you want to buy this model?");
                System.out.println("1. Yes");
             System.out.println("2. Go back to list of models");
             int c8= sc.nextInt();
             if(c8==1)
             {
             price =944653.0;
             k = 1;
            }
             else 
             k = 2;
             break;
             case 3: model="K 1300 S";
             System.out.println("                  K 1300 S        "); 
             System.out.println("Features:");
             System.out.println("Sporty bike with 103 ft-lb of torque from 1,293 cc engine.");
             System.out.println("This in-line 4-cylinder delivers its power in such a way that you can almost feel it when standing still.");
             System.out.println("Race through the gears with the gear shift assistant, pure racing in view with the 2D HP dashboard.");
             System.out.println("Price: Rs.10,71,992.00");
             System.out.println("Do you want to buy this model?");
                System.out.println("1. Yes");
             System.out.println("2. Go back to list of models");
             int c9= sc.nextInt();
             if(c9==1)
             {
             price =1071992.0;
             k = 1;
            }
             else 
             k = 2;
             break;
             case 4 : A=1;
             break;
            default:System.out.println("Invalid choice");
            break;
        }
        }while(k>1);
        break;
        default: System.out.println("Invalid");
    }
}while(A==1);
    break;
    case 2 : type = "Scooter";
        System.out.println("                            * * * * *           ");
        System.out.println("                            * * * * *            ");
        System.out.println("                                * * *      ");
        System.out.println("                                *    *       ")                ;       
        System.out.println("   * * * * * *                  *     *        ")             ;  
        System.out.println("   * * * * * *  *               *      *         ")          ;
        System.out.println("      *           *           *         *          ")          ;
        System.out.println("      * * *  *     *         *          *  ** * *    ")         ;
        System.out.println("      * * * * * *   * * * * *         * * ** * *       ")            ;    
        System.out.println("    * * * * * * * *                  * * ** * *  *       ")         ;
        System.out.println("   * * * * * * * * * * * * * * * * * * ** * *     *        ")      ;                         
        System.out.println("       *        *                     * * *       *          ")   ;           
        System.out.println("        *      *                        *   *   *              ");    
        System.out.println("           **                                                     ");
        System.out.println("Thank you for choosing to get a scooter");
        System.out.println("We provide different choices of scooter brands and even various types of models");
        System.out.println("The available choices of scooter brands are:");
        int B = 0;
        do
        {
            B=0;
        System.out.println("1.Honda");
        System.out.println("2.TVS");
        System.out.println("3.Suzuki");
        System.out.println("Please enter your choice by entering the respective numbers.");
        int choice5= sc.nextInt();
        switch(choice5)
        {
            case 1: brand= "Honda " ; 
            int a = 0;
            System.out.println("                    HONDA                ");
            System.out.println("Thank you for choosing Honda.");
            System.out.println("We provide 3 different scooter choices.");
            do
            {
                a=0;
            System.out.println("Enter the bike which you want");
            System.out.println("1.Activa3G");
            System.out.println("2.Dio");
            System.out.println("3.Aviator");
            System.out.println("4.Back to list of brands");
            int choice6= sc.nextInt();
            switch(choice6)
            {
                 case 1: model="Activa3G";
                 System.out.println("               ACTIVA3G              ");
                  System.out.println("Features:");
                  System.out.println("Convenient Lift-up Independent Cover(CLIC) offers easier & faster servicing.");
                  System.out.println("Combi Brake System(CBS) reduces the braking distance with more stability.");
                  System.out.println("Large Storage space ensures enough space for full face helmet and accomodate other belongings as well.");
                  System.out.println("As a bonus, it is the largest selling scooter with about one crore users.");
                  System.out.println("Price: Rs.53,875.00");
                  System.out.println("Do you want to buy this model?");
                System.out.println("1. Yes");
             System.out.println("2. Go back to list of models");
             int c10= sc.nextInt();
             if(c10==1)
             {
             price =53875.0;
             a = 1;
            }
             else 
             a = 2;
             break;
             case 2: model="Dio";
             System.out.println("                  DIO                 "); 
             System.out.println("Features:");
             System.out.println("18 litres of storage space can accomodate a full size helmet & other items easily.");
             System.out.println("CBS (Combi Brake System) reduces braking distance with more stability.");
             System.out.println("Enjoy the ride without worries with tubeless tyres, as they reduce chances of sudden deflation in case of puncture.");
             System.out.println("Price: Rs.52,160.00");
             System.out.println("Do you want to buy this model?");
                System.out.println("1. Yes");
             System.out.println("2. Go back to list of models");
             int c11= sc.nextInt();
             if(c11==1)
             {
             price =52160.0;
             a = 1;
            }
             else 
             a = 2;
             break;
             case 3: model="Aviator";
             System.out.println("                  AVIATOR                "); 
             System.out.println("Features:");
             System.out.println("A 190 mm Front Disc Brake that provides excellent control. Combi Brake technology that ensures a shorter braking distance with more stability. ");
             System.out.println("Tubeless tyres reduces the chance of immediate deflation in case of a puncture.");
             System.out.println("20 litres of space beneath the locking tilt up seat.");
             System.out.println("Price: Rs.60,886.00");
             System.out.println("Do you want to buy this model?");
                System.out.println("1. Yes");
             System.out.println("2. Go back to list of models");
             int c12= sc.nextInt();
             if(c12==1)
             {
             price =60886.0;
             a = 1;
            }
             else 
             a = 2;
             break;
             case 4: B=1;
             break;
            default:System.out.println("Invalid choice");
            break;
        }
    }while(a>1);
    break;
    case 2: brand= "TVS" ; 
            int b = 0;
            System.out.println("                    TVS                ");
            System.out.println("Thank you for choosing TVS.");
            System.out.println("We provide 3 different scooter choices.");
            do
            {
                b=0;
            System.out.println("Enter the bike which you want");
            System.out.println("1.Wego 110");
            System.out.println("2.Jupiter");
            System.out.println("3.Scooty Pep+");
            System.out.println("4.Back to list of brands");
            int choice7= sc.nextInt();
            switch(choice7)
            {
                case 1: model="Wego 110";
                System.out.println("                 Wego 110                   ");
                System.out.println("Features:");
                System.out.println("Next-gen 110 cc, high torque engine and Smooth Variomatic transmission");
                System.out.println("The rear suspension has Teflon coated bushes and triple rates springs that makes riding on uneven roads safe and smooth.");
                System.out.println("BEST-IN-CLASS MILEAGE 62KM/L");
                System.out.println("Price: Rs.50,960.00");
                System.out.println("Do you want to buy this model?");
                System.out.println("1. Yes");
             System.out.println("2. Go back to list of models");
             int c13= sc.nextInt();
             if(c13==1)
             {
             price =50960.0;
             b = 1;
            }
             else 
             b = 2;
             break;
             case 2: model="Jupiter";
             System.out.println("Features:");
             System.out.println("The high preformance 110cc CVT-i engine generates a power of 8.2 ps");
             System.out.println("TVS Jupiter powered with CVT-i tech churns out a mileage of 62 kmpl# which is the best-in-class.");
             System.out.println("Jupiter's external fuel fill enables you to fill petrol even without getting out of your seat.");
             System.out.println("Price: Rs.51,193.00");
             System.out.println("Do you want to buy this model?");
                System.out.println("1. Yes");
             System.out.println("2. Go back to list of models");
             int c14= sc.nextInt();
             if(c14==1)
             {
             price =51193.0;
             b = 1;
            }
             else 
             b = 2;
             break;
             case 3:model="Scooty Pep+";
             System.out.println("Features:");
             System.out.println("All-new Ecothrust Engine with multicurve ignition system, throttle force reduction and improved pick-up.");
             System.out.println("Telescopic Suspension makes bumpy rides more comfortable.");
             System.out.println("Mobile charging socket charges your phone on the move!");
             System.out.println("Price: Rs. 39,950.00");
             System.out.println("Do you want to buy this model?");
                System.out.println("1. Yes");
             System.out.println("2. Go back to list of models");
             int c15= sc.nextInt();
             if(c15==1)
             {
             price =39950.0;
             b = 1;
            }
             else 
             b = 2;
             break;
             case 4: B=1;
             break;
             default:System.out.println("Invalid choice");
            break;
        }
    }while(b>1);
    break;
    case 3: brand="Suzuki";
    int c = 0;
            System.out.println("                    SUZUKI                ");
            System.out.println("Thank you for choosing Suzuki.");
            System.out.println("We provide 3 different scooter choices.");
            do
            {
                c=0;
            System.out.println("Enter the bike which you want");
            System.out.println("1.Let's");
            System.out.println("2.Access 125");
            System.out.println("3.Swish 125");
            System.out.println("4.Back to list of brands");
            int choice8= sc.nextInt();
            switch(choice8)
            {
                case 1: model="Let's";
                System.out.println("                      Let's                   ");
                System.out.println("Features:");
                System.out.println("Superb stability with minimum air leakage during punctures.");
                System.out.println("Better control and comfortable ride even on the potholes due to telescopic suspension.");
                System.out.println("Extra storage and space for mobile charger.");
                System.out.println("Price: Rs.55,857.00");
                System.out.println("Do you want to buy this model?");
                System.out.println("1. Yes");
             System.out.println("2. Go back to list of models");
             int c16= sc.nextInt();
             if(c16==1)
             {
             price =55857.0;
             c = 1;
            }
             else 
             c = 2;
             break;
             case 2: model="Access 125";
             System.out.println("                      Access 125                   ");
                System.out.println("Features:");
                System.out.println("Highly rigid front telescopic suspension with fewer joints than bottom link type suspension.");
                System.out.println("Optimized space design ensures ample storage under the seat.");
                System.out.println("Aluminium Grab Bar provides stability and comfort to pillion rider, while adding that extra style.");
                System.out.println("Price: Rs.62,099.00");
                System.out.println("Do you want to buy this model?");
                System.out.println("1. Yes");
             System.out.println("2. Go back to list of models");
             int c17= sc.nextInt();
             if(c17==1)
             {
             price =62099.0;
             c = 1;
            }
             else 
             c = 2;
             break;
             case 3: model="Swish 125";
             System.out.println("                      Swish 125                   ");
                System.out.println("Features:");
                System.out.println("All Aluminum 4 stroke, single cylinder 125cc Engine.");
                System.out.println("Complete freedom from filling battery fluid, longer life, does not leak no damage to paint and body.");
                System.out.println("Optimized space design ensures ample storage under the seat.");
                System.out.println("Price: Rs. 59,905.00");
                System.out.println("Do you want to buy this model?");
                System.out.println("1. Yes");
             System.out.println("2. Go back to list of models");
             int c18= sc.nextInt();
             if(c18==1)
             {
             price =59905.0;
             c = 1;
            }
             else 
             c = 2;
             break;
             case 4: B=1;
             break;
            default:System.out.println("Invalid choice");
            break;
        }
    }while(c>1);
    break;
    default: System.out.println("Invalid choice");
}
}while(B==1);
break;
default: System.out.println("Invalid choice.");
break;
}
sc.nextLine();       
System.out.println("Please enter your name");
       String name = sc.nextLine();
       System.out.println("Please enter your address");
       String address= sc.nextLine();
       System.out.println("Please enter your mobile number");
       long mobile= sc.nextLong();
int d=0;
    System.out.println("We also provide you the feature of getting your selected model a custom paint job.");
    System.out.println("Each paint job has an additional cost, but you can choose to stay with the default paint.");
    do
    {
        d=0;
    System.out.println("The types of custom paints offered are:");
    System.out.println("1. Royal Purple.");
    System.out.println("2. Holographic Metal Flake Paint.");
    System.out.println("3. 3D Blue Neon.");
    System.out.println("4. Default Paint."); 
    int choice9 = sc.nextInt();
    switch(choice9)
    {
        case 1: paintn="Royal Purple";
        System.out.println("In this paint, the 2 wheeler is painted in freehand style with purple and white.");
        System.out.println("Smooth paint with purple below with white above to give it a fantastic look along with cool designs.");
        System.out.println("Additional cost: Rs. 3,000.00");
        System.out.println("Do you want to buy this paint job?");
        System.out.println("1. Yes");
        System.out.println("2. Back to list of custom paints");
        int c19= sc.nextInt();
        if(c19==1)
        {
            paint=3000.0;
            d=1;
        }
        else
        {
            d=2;
        }
        break;
        case 2: paintn="Holographic Metal Flake Paint";
        System.out.println("As the name says, in this paint, your 2 wheeler gets painted in a holographic style.");
        System.out.println("Various colours are used and anybhody will be amazed when you ride it around.");
        System.out.println("Additional cost: Rs. 4,270.00");
        System.out.println("Do you want to buy this paint job?");
        System.out.println("1. Yes");
        System.out.println("2. Back to list of custom paints");
        int c20= sc.nextInt();
        if(c20==1)
        {
            paint=4270.0;
            d=1;
        }
        else
        {
            d=2;
        }
        break;
        case 3: paintn= "Cool Blue Neon";
        System.out.println("A very cool paint with the two wheeler painted in neon blue and black.");
        System.out.println("The paint has a special 3D effect and even some designs which make it look absolutely amazing!");
        System.out.println("Additional cost: Rs. 4,528.00");
        System.out.println("Do you want to buy this paint job?");
        System.out.println("1. Yes");
        System.out.println("2. Back to list of custom paints");
        int c21= sc.nextInt();
        if(c21==1)
        {
            paint=4528.0;
            d=1;
        }
        else
        {
            d=2;
        }
        break;
        case 4:paintn= "Default";
        paint=0.0;
        d=1;
        break;
        default:System.out.println("Invalid choice");
            break;
        }
    }while(d>1);
    double helmet=0.0;
    double cover=0.0;
    double lock=0.0;
    double insurance=0.0;
    System.out.println("We also provide accessories for the two wheelers.");
    System.out.println("1. Helmet.");
        System.out.println("Cost: Rs. 300.00");
        System.out.println("Do you want to buy it?");
        System.out.println("1.Yes");
        System.out.println("2.No");
        int c22= sc.nextInt();
        if(c22==1)
        helmet= 300.0;
        else
        helmet= 0.0;
        System.out.println("2. Two-Wheeler Cover");
        System.out.println("Covers your two wheeler protecting it from rain, dirt etc.");
        System.out.println("Cost: Rs.250.00");
        System.out.println("Do you want to buy it?");
        System.out.println("1.Yes");
        System.out.println("2.No");
        int c23= sc.nextInt();
        if(c23==1)
        cover= 250.0;
        else
        cover= 0.0;
        System.out.println("3.Multipurpose Number Lock.");
        System.out.println("Protect your two wheeler, helment, luggage etc.");
        System.out.println("Cost: Rs.100.00");
        System.out.println("Do you want to buy it?");
        System.out.println("1.Yes");
        System.out.println("2.No");
        int c24= sc.nextInt();
        if(c24==1)
        lock= 100.0;
        else
        lock= 0.0;
        System.out.println("Do you want to buy a 1 year insurance for your two wheeler?");
        System.out.println("It costs Rs. 1,000.00");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int c25= sc.nextInt();
        if(c25==1)
        insurance= 1000.0;
        else
        insurance= 0.0;
        double rd=0.0;
        String discount="";
        if (type.equals("Bike"))
        {
            rd = 0.1;
            discount="10%";
        }
        else
        {
        rd = 0.05;
        discount="5 %";
    }
        double total=0.0; 
        double regtax=0.0;
        double dis=0.0;
        double mvt=0.0;
        double rt=0.0;
        dis= rd*price;
        regtax= 0.06*(price-dis);
        mvt= 0.07*(price-dis);
        rt= 0.1*(price-dis);
        total=(price-dis) + regtax + mvt + rt + paint + helmet + cover + lock + insurance;
        System.out.println("******************************************************************************************");
        System.out.println("******************************************************************************************");
        System.out.println("*********************  @ @ @     @ @ @ @ @   @          @          ***********************");                                                                 
        System.out.println("*********************  @     @       @       @          @          ***********************");                                                
        System.out.println("*********************  @ @ @         @       @          @          ***********************");                                    
        System.out.println("*********************  @     @       @       @          @          ***********************");                                    
        System.out.println("*********************  @ @ @     @ @ @ @ @   @ @ @ @ @  @ @ @ @ @  ***********************");                                                  
        System.out.println("******************************************************************************************");                                                                                            
        System.out.println("******************************************************************************************");                                                                                            
        System.out.println("* Name                               :" + name                                           );                                                 
        System.out.println("* Address                            :" + address                                        );                                                    
        System.out.println("* Mobile No                          :" + mobile                                         );                                                  
        System.out.println("* 2 Wheeler Type                     :" + type                                           );                                                 
        System.out.println("* Brand                              :" + brand                                         );                                                  
        System.out.println("* Model                              :" + model                                         );                                                   
        System.out.println("* Custom paint                       :" + paintn                                         );
        System.out.println("* Original Cost                      :" + price);
        System.out.println("* Discount("+discount+")                      :" + (double) Math.round(dis*100)/100                   );
        System.out.println("* Custom Paint                       :" + paint );
        System.out.println("* Helmet                             :" + helmet );
        System.out.println("* Cover                              :"+ cover );
        System.out.println("* Mulipurpose Lock                   :" + lock );
        System.out.println("* Insurance                          :" + insurance );
        System.out.println("* Registration Tax(6%)               :" + (double) Math.round(regtax*100)/100 );
        System.out.println("* Motor Vehicle Tax(7%)              :" + (double) Math.round(mvt*100)/100 );
        System.out.println("* Road Tax(10%)                      :" + (double) Math.round(rt*100)/100 );
        System.out.println("******************************************************************************************  ");
        System.out.println("* TOTAL COST                         :"+(double) Math.round(total*100)/100 );
        System.out.println("******************************************************************************************");
        System.out.println("******************************************************************************************");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@               @@   @@@@@@   @@@@@@@      @@@@@@@      @@@@@@@   @    @@@@@@    @@@");
        System.out.println("@@@@@@@@   @@@@@@@@   @@@@@@   @@@@@@   @@   @@@@@@   @   @@@@@@   @    @@@@    @@@@@");
        System.out.println("@@@@@@@@   @@@@@@@@   @@@@@@   @@@@@   @@@@   @@@@@   @@    @@@@   @    @@@    @@@@@@");
        System.out.println("@@@@@@@@   @@@@@@@@            @@@@            @@@@   @@@    @@@   @          @@@@@@@");
        System.out.println("@@@@@@@@   @@@@@@@@   @@@@@@   @@@   @@@@@@@@   @@@   @@@@    @@   @    @@@    @@@@@@");
        System.out.println("@@@@@@@@   @@@@@@@@   @@@@@@   @@   @@@@@@@@@@   @@   @@@@@    @   @    @@@@    @@@@@");
        System.out.println("@@@@@@@@   @@@@@@@@   @@@@@@   @   @@@@@@@@@@@@   @   @@@@@@       @    @@@@@    @@@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@    @@@@@@@    @@@@               @@@@@    @@@@@@@@    @@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@    @@@@@    @@@@@    @@@@@@@    @@@@@    @@@@@@@@    @@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@    @@@    @@@@@@    @@@@@@@    @@@@@    @@@@@@@@    @@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@    @@   @@@@@@@    @@@@@@@    @@@@@    @@@@@@@@    @@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@      @@@@@@@@    @@@@@@@    @@@@@    @@@@@@@@    @@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@    @@@@@@@@@    @@@@@@@    @@@@@    @@@@@@@@    @@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@    @@@@@@@@@    @@@@@@@    @@@@@    @@@@@@@@    @@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@    @@@@@@@@@               @@@@@                @@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        
        
    }
}
