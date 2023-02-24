import java.io.IOException;

public class  KillProecssChromedriver {

            public static void main(String[] args) {

               try {
                  Runtime.getRuntime().exec("pkill Chrome");
                  System.out.println("Killing of Chromedriver done successfully !!!");
               } catch (IOException e) {

                 System.out.println("Something went wrong" + e.getMessage());
                }

            }


             public void KillProcess_mac () {
                 try {
                     Runtime.getRuntime().exec("pkill Chrome");
                     System.out.println("Killing of Chromedriver done successfully !!!");
                 } catch (IOException e) {

                     System.out.println("Something went wrong" + e.getMessage());
                 }
             }
  }
