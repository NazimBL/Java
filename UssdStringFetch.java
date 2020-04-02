

public static void main(String[] args) {
    
        
        String mobilisText="Arseli Layer 3, Solde 18721.16DA, Crédit International 0,00DA";
        String djezzyText="Crédit: 14.518 DA. Internet: 100Mo";
        String ooredooText="Fidélité:10.00DA. Bonus:1640.00DA";
  
        System.out.println(fetchCredit(ooredooText));       
    }
    
    static String fetchCredit(String text){
        
        text=text.split("DA")[0];
        String numberOnly= text.replaceAll("[\\\\s+a-zA-Z+,+é+:+/+\n+\r ]", "");
        numberOnly=numberOnly.replaceAll("\\[", "").replaceAll("\\]","");   
        return numberOnly;
    }
