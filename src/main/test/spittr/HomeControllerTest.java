package spittr;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;

import com.ashyleika.controller.HomeController;
import com.ashyleika.controller.SpitterController;

public class HomeControllerTest {

	@Test
	public void testHomePage() throws Exception {
		HomeController homeController = new HomeController();
		assertEquals("home", homeController.getHomePage());
	}
	
	@Test
	public void testHomePageV2() throws Exception {
		HomeController controller = new HomeController();
		MockMvc mockMvc = standaloneSetup(controller).build();
		mockMvc.perform(get("/"))
			.andExpect(view().name("home"));
	}
	
	@Test
	public void testSpitterController() throws Exception {
		SpitterController controller = new SpitterController();
		MockMvc mockMvc = standaloneSetup(controller).build();
		mockMvc.perform(get("/spitter/register"))
			.andExpect(view().name("registerForm"));
		
	}
}
