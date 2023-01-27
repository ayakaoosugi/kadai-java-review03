
public class Reviw01 {

    public static void main(String[] args) {
      int price=1500;
      double Tax=0.1;
      
      double result= tax(price,Tax);
      
      System.out .println(price+"の商品の税込価格は"+(price+result)+"円(消費税は"+result+"円)です。");
      }
    
      public static double tax(int price,double tax ) {
          double result =price*tax;
          return result;
      }
}

      
    
   
      
    