package demo;

import org.testng.annotations.Test;

public class Parameters {
	@Test
	public void m1()
	{
		String BROWSER=System.getProperty("BROWSER");
		String URL=System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URL);
		
		//pushed and pulling back
		//pulled and pushing back

	}

}
