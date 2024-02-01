import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Random;
class Maruti_Suzuki_NEXA {
    String model;
    String version;
    String colour;
    double exShowroomPrice;
    double onRoadPrice;
    double RTO;
    double insurence;
/*
That constructor is work as a main method for access all the methods.
 */
    Maruti_Suzuki_NEXA() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You have 5 choice for choose your dream model car !!!");
        System.out.println("---------");
        System.out.println("Baleno\nGrand Vitara\nXL6\nIgins\nCiaz");
        System.out.println("---------");
        System.out.println("Note : Enter exit/quit for leave from this software !!");
        System.out.println();
        System.out.print("Enter model : ");
        model = sc.nextLine();
        model = model.toUpperCase();
        switch(model){
            case "BALENO" :
                carBaleno();
            break;
            case "XL6" :
                carXL6();
            break;
            case "CIAZ" :
                carCiaz();
            break;
            case "GRAND VITARA" :
                carGrandVitara();
            break;
            case "IGNIS" :
                carIgnis();
            break;
            case "EXIT" :
                System.out.println("VISIT AGAIN MARUTI & SUZUKI AUTOMOBILE !!");
            break;
            case "QUIT" :
                System.out.println("VISIT AGAIN MARUTI_&_SUZUKI AUTOMOBILE !!");
            break;
            default :
                System.out.println("Select car from below model for Nexa only.");
                Maruti_Suzuki_NEXA mz = new Maruti_Suzuki_NEXA();
            break;
        }
    }
    /*
    The work of this method is to give the car's specification,colour,
    price,and after that ask user for book this car.
    that method for Maruti Suzuki Baleno Nexa.
     */
    void carBaleno(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the version from below versions(for only petrol) !!");
        System.out.println("--------------");
        System.out.println("Sigma\nDelta\nZeta\nAlpha\nAlpha AMT");
        System.out.println("--------------");
        System.out.println("=============");
        System.out.println("Note : Enter exit/quit for leave from this software !!");
        version = sc.nextLine();
        version = version.toLowerCase();
        System.out.println("=============");
        switch (version){
            case "sigma" :
                System.out.println("--** Specifications of Baleno(Sigma) **--");
                System.out.println("--------------------------------");
                specificationOfManualBaleno();
                carColourChoiceNexa();
                System.out.println();
                exShowroomPrice = 656000;
                calculaterOfRtoAndInsurance();
                System.out.println();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                bookCar();
            break;
            case "delta" :
                System.out.println("--** Specification of Baleno(Delta) **--");
                System.out.println("-------------------------------------");
                specificationOfManualBaleno();
                carColourChoiceNexa();
                System.out.println();
                exShowroomPrice = 740000;
                calculaterOfRtoAndInsurance();
                System.out.println();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                bookCar();
            break;
            case "zeta" :
                System.out.println("--** Specification of Baleno(Zeta) **--");
                System.out.println("-------------------------------------");
                specificationOfManualBaleno();
                carColourChoiceNexa();
                System.out.println();
                exShowroomPrice = 833000;
                calculaterOfRtoAndInsurance();
                System.out.println();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                bookCar();
            break;
            case "alpha" :
                System.out.println("--** Specification of Baleno(Alpha) **--");
                System.out.println("-------------------------------------");
                specificationOfManualBaleno();
                carColourChoiceNexa();
                System.out.println();
                exShowroomPrice = 928000;
                calculaterOfRtoAndInsurance();
                System.out.println();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                bookCar();
            break;
            case "alpha amt" :
                System.out.println("--** Specification of Baleno(Alpha AMT) **--");
                System.out.println("-------------------------------------");
                System.out.println("Fual economy : 31 km/l combined" +
                        "\n----------------------------------------" +
                        "\nFual type : Petrol" +
                        "\n----------------------------------------" +
                        "\nMax power(bhp@rpm) : 88.50bhp @ 6000 rpm" +
                        "\n----------------------------------------" +
                        "\nEngine : 1.2 L 4-cylinder VVT" +
                        "\n----------------------------------------" +
                        "\nEngine CC : 1197 cc" +
                        "\n----------------------------------------" +
                        "\nCurb weight : 920-955 kg" +
                        "\n----------------------------------------" +
                        "\nFual tank capacity : 37 L" +
                        "\n----------------------------------------" +
                        "\nCertified mileage : 22.94 km/L(petrol)" +
                        "\n----------------------------------------" +
                        "\nDimensions(length*width*height) : 3,990 mm * 1745 mm * 1500 mm" +
                        "\n----------------------------------------" +
                        "\nTransmission : Automatic" +
                        "\n----------------------------------------" +
                        "\nMax Torque(nm@rpm) : 113Nm @ 4400rpm" +
                        "\n----------------------------------------" +
                        "\nEmission Norm Compliance : BS VI" +
                        "\n----------------------------------------" +
                        "\nBoot space(Liters) : 318" +
                        "\n----------------------------------------" +
                        "\nSeating capacity : 5 seater" +
                        "\n----------------------------------------" +
                        "\n----------------------------------------");
                carColourChoiceNexa();
                System.out.println();
                exShowroomPrice = 888000;
                calculaterOfRtoAndInsurance();
                System.out.println();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                bookCar();
            break;
            case "exit" :
                System.out.println("VISIT AGAIN MARUTI & SUZUKI AUTOMOBILE !!");
            break;
            case "quit" :
                System.out.println("VISIT AGAIN MARUTI_&_SUZUKI AUTOMOBILE !!");
            break;
            default :
                System.out.println("Please,Enter version from above version only !!");
                carBaleno();
            break;
        }

    }
    /*
    The work of this method is to give the car's specification,colour,
    price,and after that ask user for book this car.
    that method for Maruti Suzuki XL6 Nexa.
     */
    void carXL6(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the version from below versions(for only petrol) !!");
        System.out.println("--------------");
        System.out.println("Smart Hybrid Zeta\nSmart Hybrid Alpha\nSmart Hybrid Alpha Plus\n" +
                "Smart Hybrid Alpha AT");
        System.out.println("--------------");
        System.out.println("Note : Enter exit/quit for leave from this software !!");
        System.out.println("=============");
        version = sc.nextLine();
        version = version.toLowerCase();
        System.out.println("=============");
        switch (version){
            case "smart hybrid zeta" :
                System.out.println("--** Specifications of XL6(Smart Hybrid Zeta) **--");
                System.out.println();
                System.out.println("--------------------------------");
                specificationOfManualXL6();
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 1141000;
                System.out.println();
                calculaterOfRtoAndInsurance();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "smart hybrid alpha" :
                System.out.println("--** Specifications of XL6(Smart Hybrid Alpha) **--");
                System.out.println();
                System.out.println("--------------------------------");
                specificationOfManualXL6();
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 1241000;
                System.out.println();
                calculaterOfRtoAndInsurance();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "smart hybrid alpha plus" :
                System.out.println("--** Specifications of XL6(Smart Hybrid Alpha plus) **--");
                System.out.println();
                System.out.println("--------------------------------");
                specificationOfManualXL6();
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 1301000;
                calculaterOfRtoAndInsurance();
                System.out.println();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "smart hybrid alpha at" :
                System.out.println("--** Specifications of XL6(Smart Hybrid Alpha AT ) **--");
                System.out.println();
                System.out.println("--------------------------------");
                System.out.println("Fual type : Petrol " +
                        "\n----------------------------------------" +
                        "\nEngine Type : K15C Smart Hybrid" +
                        "\n----------------------------------------" +
                        "\nEngine CC : 1462 cc,4 cylinder inline, 4 valves/cylinder,DOHC " +
                        "\n----------------------------------------" +
                        "\nFual tank capacity : 45 L" +
                        "\n----------------------------------------" +
                        "\nCertified mileage : 20.97 km/L(in petrol)" +
                        "\n----------------------------------------" +
                        "\nDimensions(length*width*height) : 4,445 mm * 1775 mm * 1755 mm" +
                        "\n----------------------------------------" +
                        "\nTransmission : Automatic " +
                        "\n----------------------------------------" +
                        "\nDrive Type : 2WD "+
                        "\n----------------------------------------" +
                        "\nMax power(bhp@rpm) : 101.65 bhp @ 6000 rpm" +
                        "\n----------------------------------------" +
                        "\nMax Torque(nm@rpm) : 138.8Nm@4400rpm" +
                        "\n----------------------------------------" +
                        "\nCurb weight : 1200-1275 kg" +
                        "\n----------------------------------------" +
                        "\nEmission Norm Compliance : BS VI" +
                        "\n----------------------------------------" +
                        "\nBoot space(Liters) : 209 L" +
                        "\n----------------------------------------" +
                        "\nSeating capacity : 6 seater" +
                        "\n----------------------------------------"+
                        "\n----------------------------------------");
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 1391000;
                calculaterOfRtoAndInsurance();
                System.out.println();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "exit" :
                System.out.println("VISIT AGAIN MARUTI & SUZUKI AUTOMOBILE !!");
            break;
            case "quit" :
                System.out.println("VISIT AGAIN MARUTI_&_SUZUKI AUTOMOBILE !!");
            break;
            default :
                System.out.println("Please,Enter version from above version only !!");
                carXL6();
            break;
        }
    }
    /*
    The work of this method is to give the car's specification,colour,
    price,and after that ask user for book this car.
    that method for Maruti Suzuki Ciaz Nexa.
     */
    void carCiaz(){
        Scanner sc =  new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the version from below versions(for only petrol) !!");
        System.out.println("--------------");
        System.out.println("Sigma\nDelta\nZeta\nAlpha\nAlpha AT");
        System.out.println("--------------");
        System.out.println("Note : Enter exit/quit for leave from this software !!");
        System.out.println("=============");
        version = sc.nextLine();
        version = version.toLowerCase();
        System.out.println("=============");
        switch(version){
            case "sigma" :
                System.out.println("--** Specifications of Ciaz(Sigma) **--");
                System.out.println();
                System.out.println("--------------------------------");
                specificationOfManualCiaz();
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 919000;
                System.out.println();
                calculaterOfRtoAndInsurance();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "delta" :
                System.out.println("--** Specifications of Ciaz(Delta) **--");
                System.out.println();
                System.out.println("--------------------------------");
                specificationOfManualCiaz();
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 983000;
                System.out.println();
                calculaterOfRtoAndInsurance();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "zeta" :
                System.out.println("--** Specifications of Ciaz(Zeta) **--");
                System.out.println();
                System.out.println("--------------------------------");
                specificationOfManualCiaz();
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 1019000;
                System.out.println();
                calculaterOfRtoAndInsurance();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "alpha" :
                System.out.println("--** Specifications of Ciaz(Alpha) **--");
                System.out.println();
                System.out.println("--------------------------------");
                specificationOfManualCiaz();
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 1098000;
                System.out.println();
                calculaterOfRtoAndInsurance();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "alpha at" :
                System.out.println("--** Specifications of Ciaz(Alpha AT) **--");
                System.out.println();
                System.out.println("--------------------------------");
                System.out.println("Fual type : Petrol " +
                        "\n----------------------------------------" +
                        "\nEngine Type : K15 Smart Hybrid Petrol Engine" +
                        "\n----------------------------------------" +
                        "\nEngine CC : 1462 cc,4 cylinder inline, 4 valves/cylinder,DOHC " +
                        "\n----------------------------------------" +
                        "\nFual tank capacity : 43 L" +
                        "\n----------------------------------------" +
                        "\nCertified mileage : 20.04 km/L(in petrol)" +
                        "\n----------------------------------------" +
                        "\nDimensions(length*width*height) : 4,490 mm * 1730 mm * 1485 mm" +
                        "\n----------------------------------------" +
                        "\nTransmission : Automatic " +
                        "\n----------------------------------------" +
                        "\nDrive type : FWD "+
                        "\n----------------------------------------" +
                        "\nMax power(bhp@rpm) : 103.25 bhp @ 6000 rpm" +
                        "\n----------------------------------------" +
                        "\nMax Torque(nm@rpm) : 138Nm@4400rpm" +
                        "\n----------------------------------------" +
                        "\nCurb weight : 1035-1065 kg" +
                        "\n----------------------------------------" +
                        "\nEmission Norm Compliance : BS VI" +
                        "\n----------------------------------------" +
                        "\nBoot space(Liters) : 510 L" +
                        "\n----------------------------------------" +
                        "\nSeating capacity : 5 seater" +
                        "\n----------------------------------------" +
                        "\n----------------------------------------");
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 1218000 ;
                System.out.println();
                calculaterOfRtoAndInsurance();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "exit" :
                System.out.println("VISIT AGAIN MARUTI & SUZUKI AUTOMOBILE !!");
            break;
            case "quit" :
                System.out.println("VISIT AGAIN MARUTI_&_SUZUKI AUTOMOBILE !!");
            break;
            default :
                System.out.println("Please,Enter version from above version only !!");
                carCiaz();
            break;
        }

    }
    /*
    The work of this method is to give the car's specification,colour,
    price,and after that ask user for book this car.
    that method for Maruti Suzuki Grand virata Nexa.
     */
    void carGrandVitara(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the version from below versions(for only petrol) !!");
        System.out.println("--------------");
        System.out.println("Sigma\nDelta\nZeta\nAlpha\nAlpha AT\nAlpha Hybrid CVT" +
                "\nAlpha Plus Hybrid CVT");
        System.out.println("--------------");
        System.out.println("Note : Enter exit/quit for leave from this software !!");
        System.out.println("=============");
        version = sc.nextLine();
        version = version.toLowerCase();
        System.out.println("=============");
        switch(version){
            case "sigma" :
                System.out.println("--** Specifications of Grand Vitara(Sigma) **--");
                System.out.println();
                System.out.println("--------------------------------");
                specifictionOfManualGrandVitara();
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 1045000 ;
                System.out.println();
                calculaterOfRtoAndInsurance();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "delta" :
                System.out.println("--** Specifications of Grand Vitara(Delta) **--");
                System.out.println();
                System.out.println("--------------------------------");
                specifictionOfManualGrandVitara();
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 1190000 ;
                System.out.println();
                calculaterOfRtoAndInsurance();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "zeta" :
                System.out.println("--** Specifications of Grand Vitara(Zeta) **--");
                System.out.println();
                System.out.println("--------------------------------");
                specifictionOfManualGrandVitara();
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 1389000 ;
                System.out.println();
                calculaterOfRtoAndInsurance();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "alpha" :
                System.out.println("--** Specifications of Grand Vitara(Alpha) **--");
                System.out.println();
                System.out.println("--------------------------------");
                specifictionOfManualGrandVitara();
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 1539000 ;
                System.out.println();
                calculaterOfRtoAndInsurance();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "alpha at" :
                System.out.println("--** Specifications of Grand Vitara(Alpha AT) **--");
                System.out.println();
                System.out.println("--------------------------------");
                System.out.println("Fual type : Petrol " +
                        "\n----------------------------------------" +
                        "\nEngine CC : 1462 cc,4 cylinder inline, 4 valves/cylinder,DOHC " +
                        "\n----------------------------------------" +
                        "\nFual tank capacity : 45 L" +
                        "\n----------------------------------------" +
                        "\nCertified mileage : 20.58 km/L(in petrol)" +
                        "\n----------------------------------------" +
                        "\nDimensions(length*width*height) : 4,345mm * 1795 mm * 1645 mm" +
                        "\n----------------------------------------" +
                        "\nTransmission : Automatic " +
                        "\n----------------------------------------" +
                        "\nDrive type : 2WD "+
                        "\n----------------------------------------" +
                        "\nMax power(bhp@rpm) : 101.64 bhp @ 6000 rpm" +
                        "\n----------------------------------------" +
                        "\nMax Torque(nm@rpm) : 136.8 Nm@4400rpm" +
                        "\n----------------------------------------" +
                        "\nCurb weight : 1185-1210 kg" +
                        "\n----------------------------------------" +
                        "\nEmission Norm Compliance : BS VI" +
                        "\n----------------------------------------" +
                        "\nBoot space(Liters) : 265-373 L" +
                        "\n----------------------------------------" +
                        "\nSeating capacity : 5 seater" +
                        "\n----------------------------------------" +
                        "\n----------------------------------------");
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 1689000 ;
                System.out.println();
                calculaterOfRtoAndInsurance();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "alpha hybrid cvt" :
                System.out.println("--** Specifications of Grand Vitara(Alpha Hybrid CVT) **--");
                System.out.println();
                System.out.println("--------------------------------");
                System.out.println("Fual type : Petrol " +
                        "\n----------------------------------------" +
                        "\nEngine CC : 1490 cc,3 cylinder inline, 4 valves/cylinder,DOHC " +
                        "\n----------------------------------------" +
                        "\nFual tank capacity : 45 L" +
                        "\n----------------------------------------" +
                        "\nCertified mileage : 27.97 km/L(in petrol)" +
                        "\n----------------------------------------" +
                        "\nDimensions(length*width*height) : 4,345mm * 1795 mm * 1645 mm" +
                        "\n----------------------------------------" +
                        "\nTransmission : Automatic " +
                        "\n----------------------------------------" +
                        "\nGear BOx : eCVT"+
                        "\n----------------------------------------" +
                        "\nDrive type : 2WD "+
                        "\n----------------------------------------" +
                        "\nMax power(bhp@rpm) : 91.18 bhp @ 5500 rpm" +
                        "\n----------------------------------------" +
                        "\nMax Torque(nm@rpm) : 122 Nm @ 4400-4800rpm" +
                        "\n----------------------------------------" +
                        "\nCurb weight : 1290-1295 kg" +
                        "\n----------------------------------------" +
                        "\nEmission Norm Compliance : BS VI" +
                        "\n----------------------------------------" +
                        "\nBoot space(Liters) : 265-373 L" +
                        "\n----------------------------------------" +
                        "\nSeating capacity : 5 seater" +
                        "\n----------------------------------------" +
                        "\n----------------------------------------");
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 1949000 ;
                System.out.println();
                calculaterOfRtoAndInsurance();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "alpha plus hybrid cvt" :
                System.out.println("--** Specifications of Grand Vitara(Alpha Plus Hybrid CVT) **--");
                System.out.println();
                System.out.println("--------------------------------");
                System.out.println("Fual type : Petrol " + "\n----------------------------------------" + "\nEngine CC : 1490 cc,3 cylinder inline, 4 valves/cylinder,DOHC " + "\n----------------------------------------" + "\nFual tank capacity : 45 L" + "\n----------------------------------------" + "\nCertified mileage : 27.97 km/L(in petrol)" + "\n----------------------------------------" + "\nDimensions(length*width*height) : 4,345mm * 1795 mm * 1645 mm" + "\n----------------------------------------" + "\nTransmission : Automatic " + "\n----------------------------------------" + "\nGear BOx : eCVT"+ "\n----------------------------------------" + "\nDrive type : 2WD "+ "\n----------------------------------------" + "\nMax power(bhp@rpm) : 91.18 bhp @ 5500 rpm" + "\n----------------------------------------" + "\nMax Torque(nm@rpm) : 122 Nm @ 4400-4800rpm" + "\n----------------------------------------" + "\nCurb weight : 1290-1295 kg" + "\n----------------------------------------" + "\nEmission Norm Compliance : BS VI" + "\n----------------------------------------" + "\nBoot space(Liters) : 265-373 L" + "\n----------------------------------------" + "\nSeating capacity : 5 seater" + "\n----------------------------------------" +"\n----------------------------------------");
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 1965000 ;
                System.out.println();
                calculaterOfRtoAndInsurance();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "exit" :
                System.out.println("VISIT AGAIN MARUTI & SUZUKI AUTOMOBILE !!");
            break;
            case "quit" :
                System.out.println("VISIT AGAIN MARUTI_&_SUZUKI AUTOMOBILE !!");
            break;
            default :
                System.out.println("Please,Enter version from above version only !!");
                carGrandVitara();
            break;
        }
    }
    /*
    The work of this method is to give the car's specification,colour,
    price,and after that ask user for book this car.
    that method for Maruti Suzuki Ignis Nexa.
     */
    void carIgnis(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the version from below versions(for only petrol) !!");
        System.out.println("--------------");
        System.out.println("Sigma\nDelta\nZeta\nAlpha\nAlpha AMT");
        System.out.println("--------------");
        System.out.println("Note : Enter exit/quit for leave from this software !!");
        System.out.println("=============");
        version = sc.nextLine();
        version = version.toLowerCase();
        System.out.println("=============");
        switch(version){
            case "sigma" :
                System.out.println("--** Specifications of IGNIS (Sigma) **--");
                System.out.println();
                System.out.println("--------------------------------");
                specificationManualIgnis();
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 555000 ;
                System.out.println();
                calculaterOfRtoAndInsurance();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "delta" :
                System.out.println("--** Specifications of IGNIS (Delta) **--");
                System.out.println();
                System.out.println("--------------------------------");
                specificationManualIgnis();
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 609000 ;
                System.out.println();
                calculaterOfRtoAndInsurance();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "zeta" :
                System.out.println("--** Specifications of IGNIS (Zeta) **--");
                System.out.println();
                System.out.println("--------------------------------");
                specificationManualIgnis();
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 667000;
                System.out.println();
                calculaterOfRtoAndInsurance();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "alpha" :
                System.out.println("--** Specifications of IGNIS (Alpha) **--");
                System.out.println();
                System.out.println("--------------------------------");
                specificationManualIgnis();
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 732000;
                System.out.println();
                calculaterOfRtoAndInsurance();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "alpha amt" :
                System.out.println("--** Specifications of IGNIS (Alpha AMT) **--");
                System.out.println();
                System.out.println("--------------------------------");
                System.out.println("Fual type : Petrol " +
                        "\n----------------------------------------" +
                        "\nEngine Type : VVT "+
                        "\n----------------------------------------" +
                        "\nEngine CC : 1197 cc,4 cylinder inline, 4 valves/cylinder,DOHC " +
                        "\n----------------------------------------" +
                        "\nFual tank capacity : 32 L" +
                        "\n----------------------------------------" +
                        "\nCertified mileage : 20.89 km/L(in petrol)" +
                        "\n----------------------------------------" +
                        "\nDimensions(length*width*height) : 3700 mm * 1690 mm * 1595 mm" +
                        "\n----------------------------------------" +
                        "\nTransmission :  Automatic " +
                        "\n----------------------------------------" +
                        "\nMax power(bhp@rpm) : 81.80 bhp @ 6000 rpm" +
                        "\n----------------------------------------" +
                        "\nMax Torque(nm@rpm) : 113 Nm@4400rpm" +
                        "\n----------------------------------------" +
                        "\nCurb weight : 840-865 kg" +
                        "\n----------------------------------------" +
                        "\nEmission Norm Compliance : BS VI" +
                        "\n----------------------------------------" +
                        "\nBoot space(Liters) : 260 L" +
                        "\n----------------------------------------" +
                        "\nSeating capacity : 5 seater" +
                        "\n----------------------------------------" +
                        "\n----------------------------------------");
                System.out.println();
                carColourChoiceNexa();
                System.out.println("-------------------------------------");
                exShowroomPrice = 787000;
                System.out.println();
                calculaterOfRtoAndInsurance();
                System.out.println("Ex ShowRoom price : " + exShowroomPrice + " Rs.");
                onRoadPrice = exShowroomPrice + RTO + insurence;
                System.out.println("==================================");
                System.out.println("On road price : " + Math.abs(onRoadPrice) + " Rs.");
                System.out.println("==================================");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println();
                bookCar();
            break;
            case "exit" :
                System.out.println("VISIT AGAIN MARUTI & SUZUKI AUTOMOBILE !!");
            break;
            case "quit" :
                System.out.println("VISIT AGAIN MARUTI_&_SUZUKI AUTOMOBILE !!");
            break;
            default :
                System.out.println("Please,Enter version from above version only !!");
                carIgnis();
            break;
        }
    }
    /*
   That is the Specifications of Manual Baleno.
     */
    void specificationOfManualBaleno(){
        System.out.println("Fual economy : 31 km/l combined" +
                "\n----------------------------------------" +
                "\nFual type : Petrol" +
                "\n----------------------------------------" +
                "\nMax power(kW or bhp@rpm) : 88.50bhp @ 6000 rpm" +
                "\n----------------------------------------" +
                "\nEngine : 1.2 L VVT" +
                "\n----------------------------------------" +
                "\nEngine CC : 1197 cc,4 cylinder inline, 4 valves/cylinder,DOHC" +
                "\n----------------------------------------" +
                "\nCurb weight : 920-955 kg" +
                "\n----------------------------------------" +
                "\nPetrol Fual capacity : 37 L" +
                "\n----------------------------------------" +
                "\nCertified mileage : 22.35 km/L(in petrol)" +
                "\n----------------------------------------" +
                "\nDimensions(length*width*height) : 3,990 mm * 1745 mm * 1500 mm" +
                "\n----------------------------------------" +
                "\nTransmission : Manual - 5 gear" +
                "\n----------------------------------------" +
                "\nMax Torque(nm@rpm) : 113Nm@4400rpm" +
                "\n----------------------------------------" +
                "\nEmission Norm Compliance : BS VI" +
                "\n----------------------------------------" +
                "\nBoot space(Liters) : 318" +
                "\n----------------------------------------" +
                "\nSeating capacity : 5 seater" +
                "\n----------------------------------------" +
                "\n----------------------------------------");
    }
    /*
   That is the Specifications of Manual XL6.
     */
    void specificationOfManualXL6(){
        System.out.println("Fual type : Petrol " +
                "\n----------------------------------------" +
                "\nEngine Type : K15C Smart Hybrid" +
                "\n----------------------------------------" +
                "\nEngine CC : 1462 cc,4 cylinder inline, 4 valves/cylinder,DOHC" +
                "\n----------------------------------------" +
                "\nFual tank capacity : 45 L" +
                "\n----------------------------------------" +
                "\nCertified mileage : 20.97 km/L(in petrol)" +
                "\n----------------------------------------" +
                "\nDimensions(length*width*height) : 4,445 mm * 1775 mm * 1755 mm" +
                "\n----------------------------------------" +
                "\nTransmission : Manual - 5 gear" +
                "\n----------------------------------------" +
                "\nDrive Type : 2WD "+
                "\n----------------------------------------" +
                "\nMax power(bhp@rpm) : 101.65 bhp @ 6000 rpm" +
                "\n----------------------------------------" +
                "\nMax Torque(nm@rpm) : 138.8Nm@4400rpm" +
                "\n----------------------------------------" +
                "\nCurb weight : 1200-1275 kg" +
                "\n----------------------------------------" +
                "\nEmission Norm Compliance : BS VI" +
                "\n----------------------------------------" +
                "\nBoot space(Liters) : 209 L" +
                "\n----------------------------------------" +
                "\nSeating capacity : 6 seater" +
                "\n----------------------------------------" +
                "\n----------------------------------------");
    }
    /*
   That is the Specifications of Manual Ciaz.
     */
    void specificationOfManualCiaz(){
        System.out.println("Fual type : Petrol " +
                "\n----------------------------------------" +
                "\nEngine Type : K15 Smart Hybrid Petrol Engine" +
                "\n----------------------------------------" +
                "\nEngine CC : 1462 cc,4 cylinder inline, 4 valves/cylinder,DOHC " +
                "\n----------------------------------------" +
                "\nFual tank capacity : 43 L" +
                "\n----------------------------------------" +
                "\nCertified mileage : 20.65 km/L(in petrol)" +
                "\n----------------------------------------" +
                "\nDimensions(length*width*height) : 4,490 mm * 1730 mm * 1485 mm" +
                "\n----------------------------------------" +
                "\nTransmission : Manual - 5 gear" +
                "\n----------------------------------------" +
                "\nDrive Type : FWD "+
                "\n----------------------------------------" +
                "\nMax power(bhp@rpm) : 103.25 bhp @ 6000 rpm" +
                "\n----------------------------------------" +
                "\nMax Torque(nm@rpm) : 138Nm@4400rpm" +
                "\n----------------------------------------" +
                "\nCurb weight : 1035-1065 kg" +
                "\n----------------------------------------" +
                "\nEmission Norm Compliance : BS VI" +
                "\n----------------------------------------" +
                "\nBoot space(Liters) : 510 L" +
                "\n----------------------------------------" +
                "\nSeating capacity : 5 seater" +
                "\n----------------------------------------" +
                "\n----------------------------------------");
    }
    /*
   That is the Specifications of Manual Grand vitara.
     */
    void specifictionOfManualGrandVitara(){
        System.out.println("Fual type : Petrol " +"\n----------------------------------------" +"\nEngine CC : 1462 cc,4 cylinder inline, 4 valves/cylinder,DOHC " +"\n----------------------------------------" +"\nFual tank capacity : 45 L" +"\n----------------------------------------" +"\nCertified mileage : 21.11 km/L(in petrol)" +"\n----------------------------------------" +"\nDimensions(length*width*height) : 4,345mm * 1795 mm * 1645 mm" +"\n----------------------------------------" +"\nTransmission : Manual - 5 Speed " +"\n----------------------------------------" +"\nDrive type : 2WD "+"\n----------------------------------------" +"\nMax power(bhp@rpm) : 101.64 bhp @ 6000 rpm" +"\n----------------------------------------" +"\nMax Torque(nm@rpm) : 136.8 Nm@4400rpm" +"\n----------------------------------------" +"\nCurb weight : 1150-1185 kg" +"\n----------------------------------------" +"\nEmission Norm Compliance : BS VI" +"\n----------------------------------------" +"\nBoot space(Liters) : 265-373 L" +"\n----------------------------------------" +"\nSeating capacity : 5 seater" +"\n----------------------------------------" +"\n----------------------------------------");
    }
    /*
   That is the Specifications of Manual Ignis.
     */
    void specificationManualIgnis(){
        System.out.println("Fual type : Petrol " +
                "\n----------------------------------------" +
                "\nEngine Type : VVT "+
                "\n----------------------------------------" +
                "\nEngine CC : 1197 cc,4 cylinder inline, 4 valves/cylinder,DOHC " +
                "\n----------------------------------------" +
                "\nFual tank capacity : 32 L" +
                "\n----------------------------------------" +
                "\nCertified mileage : 20.89 km/L(in petrol)" +
                "\n----------------------------------------" +
                "\nDimensions(length*width*height) : 3700 mm * 1690 mm * 1595 mm" +
                "\n----------------------------------------" +
                "\nTransmission :  Manual - 5 Speed" +
                "\n----------------------------------------" +
                "\nMax power(bhp@rpm) : 81.80 bhp @ 6000 rpm" +
                "\n----------------------------------------" +
                "\nMax Torque(nm@rpm) : 113 Nm@4400rpm" +
                "\n----------------------------------------" +
                "\nCurb weight : 840-865 kg" +
                "\n----------------------------------------" +
                "\nEmission Norm Compliance : BS VI" +
                "\n----------------------------------------" +
                "\nBoot space(Liters) : 260 L" +
                "\n----------------------------------------" +
                "\nSeating capacity : 5 seater" +
                "\n----------------------------------------" +
                "\n----------------------------------------");
    }
/*
This method is for calculate rto and insurance.
 */
    void calculaterOfRtoAndInsurance(){
         RTO = (exShowroomPrice*7)/100 ;
         insurence = (exShowroomPrice*4.69)/100;
    }
    /*
    This method is use to choice colour for your car.
     */
   void carColourChoiceNexa(){
        Scanner sc = new Scanner(System.in);
       System.out.println("-------------------------------------");
       System.out.println("We have 6 differnt colour !!");
       System.out.println("--------------------------------------------");
       System.out.println("Which colour you choose for your " + model + " !!");
       System.out.println("--------------------------------------------");
       System.out.println("Enter \n1675 for (Pearl Arctic White)\n1058 for (Opulent Red)\n1263 for (Grandeur Grey)" +
               "\n954 for (Luxe Beige(brown type colour))\n820 for (Nexa Blue)\n1480 for (Splendid Silver)");
       System.out.println("------------------------------");
       System.out.println("Note : Enter 10 for exit/quit for leave from this software !!");
       int number = sc.nextInt();
       switch (number){
           case 1675 :
               colour = "Pearl Arctic White";
           break;
           case 1058 :
               colour = "Opulent Red";
           break;
           case 1263 :
               colour = "Grandeur Grey";
           break;
           case 954 :
               colour = "Luxe Beige";
           break;
           case 820 :
               colour = "Nexa Blue";
           break;
           case 1480 :
               colour = "Splendid Silver";
           break;
           case 10 :
               System.out.println("VISIT AGAIN MARUTI & SUZUKI AUTOMOBILE !!");
           break;
           default :
               System.out.println("You choose colour only from above colours only !!");
               carColourChoiceNexa();
           break;
       }
   }
/*
The work of method bookCar() is to book car either not.
 */
   void bookCar(){
        Scanner sc = new Scanner(System.in);
       System.out.println();
       System.out.println("---------------------------------------------");
        System.out.println("Hey,user you satisfy with your car choice !!");
       System.out.println("---------------------------------------------");
       System.out.println("So,you want to book " + model +" ("+version +") \nplease enter BOOK !!");
       System.out.println("Either enter (NOT BOOK)\nenter change book for changing the car.");
       System.out.println("---------------------------------------------");
       System.out.println("==================");
       String carB = sc.nextLine();
       System.out.println("==================");
       carB = carB.toUpperCase();
       switch(carB) {
           case "BOOK" :
               System.out.println();
               System.out.println("Please enter your personal details for get successful this booking !!");
               System.out.println("===========================");
               userDetails();
               System.out.println("===========================");
               System.out.println("Re-Enter BOOK option for Final booking : ");
               carB = sc.nextLine();
               if (carB.equalsIgnoreCase("BOOK")) {
                   System.out.println();
                   System.out.println("=======================");
                   paymentSystemForCar();
                   System.out.println("-------------------------------------------");
                   confirmBooking();
                   System.out.println("-------------------------------------------");
                   System.out.println("=======================");
               }
           break;
           case "CHANGE CAR" :
               Maruti_Suzuki_NEXA maruti_suzuki_nexa = new Maruti_Suzuki_NEXA();
           break;
           case "NOT BOOK" :
           System.out.println("VISIT AGAIN MARUTI & SUZUKI AUTOMOBILE !!");
           break;
           default :
               System.out.println("Please,enter BOOK or NOT BOOK perfectly !!!");
               System.out.println("=========================================");
               this.bookCar();
           break;
       }
   }
   String fullName,emailId,address,adharNum,district,state,country,bookType,nomineeFullName,relation;
    long mobileNum;
    int amount;
/*
This method is use to get the details of user for car booking process.
 */
   void userDetails(){
        Scanner sc = new Scanner(System.in);
       System.out.println("Note : Enter exit/quit for leave from this software !!");
       System.out.println("========================");
       String str = sc.nextLine();
       str = str.toUpperCase();
       switch(str) {
           case "EXIT" :
               System.out.println("VISIT AGAIN MARUTI & SUZUKI AUTOMOBILE !!");
           break;
           case "QUIT" :
               System.out.println("VISIT AGAIN MARUTI_&_SUZUKI AUTOMOBILE !!");
           break;
           default :
               System.out.println("***///// CUSTOMER DETAILS /////***");
               System.out.println("-------------------------------------------------------------------");
               System.out.print("Enter your full name as per format(name father name surname) : ");
               fullName = sc.nextLine();
               System.out.print("Enter your personal mobile number : ");
               mobileNum = sc.nextLong();
               sc.nextLine();
               System.out.print("Enter your personal email id : ");
               emailId = sc.nextLine();
               System.out.print("Enter your residential Address : ");
               address = sc.nextLine();
               System.out.print("Enter Adhaar card number : ");
               adharNum = sc.nextLine();
               System.out.print("Enter your District : ");
               district = sc.nextLine();
               System.out.print("Enter your state : ");
               state = sc.nextLine();
               System.out.print("Enter your country : ");
               country = sc.nextLine();
               System.out.print("Enter your booking type (Individual or group): ");
               bookType = sc.nextLine();
               bookType = bookType.toUpperCase();
               System.out.print("Enter your nominee(Full name): ");
               nomineeFullName = sc.nextLine();
               System.out.print("Enter relation with nominee (mother/daughter/father/son/wife) :");
               relation = sc.nextLine();
           break;
       }
   }
   /*
   The work of this method getReceiptCarBooking() is to generate the receipt of the car.
    */
   void getReceiptCarBooking(){
       Random rad = new Random();
       Scanner sc = new Scanner(System.in);
       System.out.println("-------------------------------------------------------");
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println("***///// RECEIPT FOR CAR BOOK /////***");
       System.out.println("===================================================================");
       System.out.println("Sold to : "+ fullName);
       System.out.println("Address : "+ address);
       System.out.println(district + "/" + state + "/" + country);
       System.out.println("Adhaar card number : "+ adharNum);
       System.out.println("Email : " + emailId);
       System.out.println("Mobile number : " + mobileNum);
       System.out.println("Booking Type : " + bookType);
       System.out.println("Nominee : " + nomineeFullName);
       System.out.println("Relation with nominee : " + relation);
       System.out.println();
       System.out.println("Item & Description");
       System.out.println(model);
       System.out.println("Variant : " + "NEW " + model + " " + version);
       System.out.println("Color : " + colour);
       System.out.println("Amount : " + amount + " as a token amount.");
       System.out.println(amount + "/- " + "Rupees five thousand only");
       if(paymentType.equalsIgnoreCase("EMI")){
            System.out.println("Total payable amount : " + Math.ceil(total_amount));
       }
       else{
           System.out.println("Total payable amount : " + Math.ceil(total_amount));
       }
       System.out.println("");
       System.out.println("Date/Month/Year  hr:minute:sec : ");
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY  HH:mm:ss");
       LocalDateTime now = LocalDateTime.now();
       System.out.println(dtf.format(now));
       long paymentRfNo = rad.nextLong(10000000000000l);
       int year1 = LocalDate.now().getYear();
       int num = rad.nextInt(5000);
       int orderNum = rad.nextInt(10000);
       System.out.println("Payment Reference Number  : " + paymentRfNo);
       System.out.println("Receipt no : " + "MARUTI SUZUKI " + "NEXA" + " /"+year1+"/" +orderNum+"/"+num);
       System.out.println("===================================================================");
   }
   /*
   That is the payment method for token pyment by credit card or debit card or net banking.
    */
   void paymentForToken(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Payment for token rupees for car booking !!");
       System.out.println("Payment received by Credit card/Debit card/Net Banking");
       System.out.println("Enter 1 for payment with credit card\nenter 2 for payment with netbanking\nenter 3 for payment with debit card");
       int n = sc.nextInt();
       long cred_deb_num;
       switch(n){
           case 1 :
               System.out.println("Enter your credit cards number : ");
               cred_deb_num = sc.nextLong();
               System.out.print("Pay 5000/- for car booking token : ");
               amount = sc.nextInt();
               if(amount == 5000){
                   getReceiptCarBooking();
               }
               else{
                   System.out.println("Payable amount for car booking is only 5000/- or above 5000/-.");
                   paymentForToken();
               }
               break;
           case 2 :
               System.out.println("Enter your account number : ");
               cred_deb_num = sc.nextLong();
               System.out.print("Pay 5000/- for car booking token : ");
               amount = sc.nextInt();
               if(amount == 5000){
                   getReceiptCarBooking();
               }
               else{
                   System.out.println("Payable amount for car booking is only 5000/- or above 5000/-.");
                   paymentForToken();
               }
               break;
           case 3 :
               System.out.println("Enter your debit card number : ");
               cred_deb_num = sc.nextLong();
               System.out.print("Pay 5000/- for car booking token : ");
               amount = sc.nextInt();
               if(amount == 5000){
                   getReceiptCarBooking();
               }
               else{
                   System.out.println("Payable amount for car booking is only 5000/- or above 5000/-.");
                   paymentForToken();
               }
               break;
           default:
               System.out.println("You should have only this tree way for payment the token !!");
               paymentSystemForCar();
               break;
       }
   }
   /*
   The work of paymentSystemForCar() is to get two type of Payment to you
   1. cash payment
   2. Emi payment
    */
   double total_amount;
   String paymentType;
   void paymentSystemForCar(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Hey user, You have two choice for payment of your car !!");
       System.out.println("----------------------------");
       System.out.println("You have \noption 1.cash payment\noption 2.EMI payment ");
       System.out.println("----------------------------");
       System.out.println("Note : Enter 3 for exit/quit for leave from this software !!");
       int number = sc.nextInt();
       switch(number){
           case 1 :
               paymentType = "Cash";
               System.out.println("No problem." +
                       "\n-------------------------------------------------------------------------"+
                       "\nYou pay 2 lakh rupees at your nearest Maruti Suzuki E-centre in 3 days !!");
               total_amount = onRoadPrice;
               double remainingAmount  = onRoadPrice - 200000;
               System.out.println("---------------------------------------------------------------------------------");
               System.out.println("And remaining amount : "+remainingAmount+" should be pay with cheque at your nearest " +
                       "Maruti Suzuki E-centre in 7 days after paying 2 lakh rupees \notherwise your car booking will be cencle!!");
               System.out.println("---------------------------------------------------------------------------------");
               System.out.println("You should use Net-Banking for pay remaining amount : " + remainingAmount);
               System.out.println("---------------------------------------------------------------------------------");
               System.out.println();
               System.out.println("---------------------------------------------------------------------------------");
               System.out.println("****----- DELIVERY DETAILS OF YOUR CAR -----****");
               System.out.println("After pay all amount we will give you the delivery time of your car(it must be 2 weeks)");
               System.out.println("Your car will be delivered at your residential address in 2 weeks !!!!");
               System.out.println("---------------------------------------------------------------------------------");
               break;
           case 2 :
               paymentType = "EMI";
               System.out.println("No problem\nYou have choice for month to pay EMI !!");
               System.out.println("--------------------");
               System.out.print("Enter month : ");
               double month = sc.nextDouble();
               System.out.println("--------------------");
               System.out.println("Your EMI per month !!");
               double principle = onRoadPrice;
               double interestRate = 8;
               interestRate = interestRate/(12*100);
               double EMI = (principle*interestRate*Math.pow(1+interestRate,month))/(Math.pow(1+interestRate,month)-1);
               System.out.println("--------------------------");
               System.out.println("EMI per month : " + Math.ceil(EMI) +" Rs.");
               System.out.println("--------------------------");
               total_amount = EMI*month;
               System.out.println("Your total amount after "+month+" months : " + Math.ceil(total_amount) + " Rs.");
               System.out.println();
               System.out.println("-------------------------------------------------------------------------------");
               System.out.println("****----- DELIVERY DETAILS OF YOUR CAR -----****");
			   System.out.println("==================================================");
               System.out.println("The delivery time of your car is 2 month or more !!!");
               System.out.println("Your car will be delivered at your residential address in 2 weeks !!!!");
               System.out.println("-------------------------------------------------------------------------------");
               break;
           case 3 :
               System.out.println("VISIT AGAIN MARUTI & SUZUKI AUTOMOBILE !!");
               break;
           default :
                System.out.println("please Enter type of payment only from above type only !!");
                System.out.println();
                paymentSystemForCar();
           break;
       }
   }
   /*
   The work of the method confirmBooking() is to confirm the car booking.
    */
   void confirmBooking(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter COMPLETE or NOT COMPLETE for generation of receipt of car!! ");
       System.out.println("----------------------------");
       System.out.println("Enter \n1 for (complete your booking and generate receipt)\n2 for (re-enter or change payment type !!)");
       System.out.println("----------------------------");
       System.out.println("Note : Enter 3 for cancel the order !!");
       int number = sc.nextInt();
       switch (number){
           case 1 :
               System.out.println("Your payment process is complete !!");
               System.out.println();
               System.out.println();
               System.out.println("==============================");
               paymentForToken();
               System.out.println("==============================");
               break;
           case 2 :
               System.out.println("Change or re-enter payment type !!");
               paymentSystemForCar();
               System.out.println();
               System.out.println();
               System.out.println("======================================");
               paymentForToken();
               System.out.println("======================================");
               break;
           case 3 :
               System.out.println("Your order is cancel.");
               System.out.println("VISIT AGAIN !!!");
           break;
           default :
               System.out.println("please,enter only 1 or 2 or 3 only");
               confirmBooking();
           break;
       }
   }
}
class Car_Booking_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Maruti_Suzuki_NEXA maruti_suzuki_nexa ;
        System.out.println("======***** WELCOME TO MARUTI & SUZUKI AUTOMOBILE *****======");
        System.out.println();
        System.out.println();
        System.out.println("............WELCOME TO NEXA...............");
        System.out.println();
        System.out.println();
        maruti_suzuki_nexa = new Maruti_Suzuki_NEXA();/*that object is use to access all the functions of
        Maruti_Suzuki_NEXA class */
    }
}
