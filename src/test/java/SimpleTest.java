import junit.framework.Assert;
import java.util.Random;
import org.junit.*;
                                                                                       
/**                                       
 *  Created by gadiel on 15/11/2016.     test raluca                        
 */           
                    
public class SimpleTest { 
	
//  @BeforeClass
//     public static void setUpBeforeClass() {
//         Assert.assertEquals(1, 2);  
//     }
	
// @Test  
//    public void throwEx() throws Exception
//    { 
//       String msg = "<b>hi</b><a href=\"www.google.com\">blabla</a>";					
// 	throw new Exception(msg);
//    }
	
		 
  @Test  
   public void alwaysPass1()
   { 
       Assert.assertEquals(1, 1);
   } 

   @Test
    public void alwaysPass2()
    {
        Assert.assertEquals(2, 2);
    }
	
	

    @Test
    public void alwaysFail1()
    {
        Assert.assertEquals(1, 2);   
    }

   @Test
    public void alwaysFail2()
    {
        Assert.assertEquals(1, 2);
    }
	      
 
    @Test
    public void sometimesPass1()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
    }

    @Test  
    public void sometimesPass2()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
    }
	
	@Test
	@Ignore
    public void ignored1()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(99);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
    }
	 
	@Test
	@Ignore
    public void ignored2()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
    }
	
	
} 
 
 
