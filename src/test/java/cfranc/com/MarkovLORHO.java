package cfranc.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarkovLORHO {
  @Test
	public void test() {
                System.out.println("TEST");  
                Markov m = new Markov();
                m.readFile("cosette.txt");
		Couple p = Markov.randomElement(m.couples.keySet());
		String res = m.generateText(p, 10);
		assertNotNull(res);
		System.out.println(res);
                
                System.out.println("");
        }
        
  @Test
	public void FnctGeneraTxt() {
                System.out.println("FnctGeneraTxt");  
                Markov m = new Markov();
                m.readFile("cosette.txt");
                Couple p = Markov.randomElement(m.couples.keySet());
                String test = m.generateText(p, 0);
		String TexteVide = "";
                
                System.out.println("");
                
        }
        
        
          @Test
	public void FctEquals() {
                System.out.println("FctEquals");
                Markov m = new Markov();
                Couple p = new Couple("un","petit");
                System.out.println(equals(p));
                
                System.out.println("");
        }
        
        
        
               @Test
	public void FcthashCode() {
                System.out.println("FcthashCode");
                Markov m = new Markov();
                m.readFile("cosette.txt"); 
                Couple p = new Couple("un","petit");
                Couple q = new Couple("un","petit");
                System.out.println(p.hashCode());  
                System.out.println(q.hashCode()); 
                
                System.out.println("");
        }

                
       @Test
	public void FcthashCodeEclipse() {
                System.out.println("FcthashCodeEclipse");
                Markov m = new Markov();
                m.readFile("cosette.txt"); 
                Couple p = new Couple("un","fois");
                Couple q = Markov.randomElement(m.couples.keySet());
                p.hashCode();
                q.hashCode();
                p.hashCodeEclipse();  //valeur 3152460
                q.hashCodeEclipse();  //valeur Variable
                
                System.out.println("");
        }
                        
   
		
       
}