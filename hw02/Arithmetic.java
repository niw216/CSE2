////////////////////////////////////////////////////////////////////////////////
//Nick Watanabe
//hw02
//Arithmetic Java Program
    //~description of program~
    /*program to calculate total cost of buying goods
    at a store, including the PA sales tax of 6%, with the
    final output value & sales tax rounded to the nearest hundredth*/
//


//define class as Arithmetic
public class Arithmetic{
    
    //added main method
    public static void main(String[ ] args) {
        //Assumptions (input variables)
        //number of pairs of socks
        int nSocks=3;
        //cost per pair of socks
        double sockCost$=2.58;
        
        //number of drinking glasses
        int nGlasses=6;
        //cost per glass
        double glassCost$=2.29;
        
        //number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopesCost$=3.25;
        
        double taxPercent=0.06;     //tax rate in PA
        
    
        //total cost of socks
        double totalSockCost$=nSocks*sockCost$;  
        //total cost of drinking glasses
        double totalGlassCost$=nGlasses*glassCost$;
        //total cost of boxes of envelopes
        double totalEnvelopeCost$=nEnvelopes*envelopesCost$;
        
        
        //total cost of purchases before tax
        double subtotal$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
        
        //amount of sales tax incurred
        double salesTax$=subtotal$*taxPercent;
        double SalesTaxAugmentation$=salesTax$*100;
        int sales_tax_casting$=(int)SalesTaxAugmentation$;
        double SalesTaxFinal$=sales_tax_casting$/100.0;
        
        //total cost including tax
        double grandTotal$=subtotal$+salesTax$;
        
        //total cost including tax truncated
        double grand_total_augmentation$=grandTotal$*100;
        int grandTotal_variableConversion$=(int)grand_total_augmentation$;
        double GrandTotal$=grandTotal_variableConversion$/100.0;
        
        
        //display of cost of items, number of items bought, subtotal, and grand total
        System.out.println("The number of socks bought is "+nSocks+" @ $"+sockCost$+".");
        System.out.println("The number of glasses bought is "+nGlasses+" @ $"+glassCost$+".");
        System.out.println("The number of boxes of envelopes bought is "+nEnvelopes+" @ $"+envelopesCost$+".");
        System.out.println("The subtotal is $"+subtotal$+".");
        System.out.println("The sales tax due is $"+SalesTaxFinal$+".");
        System.out.println("The grand total is $"+GrandTotal$+".");
        
        //test
        
      
    } //close main method
    
    
} //close class