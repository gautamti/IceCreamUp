package com.example.icecreamup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.icecreamup.dto.ProductDTO;
import com.example.icecreamup.service.ITopOrderService;

import org.springframework.web.bind.annotation.PostMapping;


/**
 * @author Administrator
 * handle the default
 * @return
 */


@Controller
public class IcecreamupController {
	
	@Autowired
	private ITopOrderService topOrderService;
	
	/**
	 * Maps GET requests to the site's homepage endpoint
	 * @return
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read() {
		return "start";
	}
	
	@PostMapping("/start")
	public String create() {
		return "start";
	}

	/**
	 * Maps GET requests to the site's top orders endpoint
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/topOrders", method=RequestMethod.GET)
	public String topOrder(Model model) {
		ProductDTO productDTO = topOrderService.fetchById(50);
		model.addAttribute("productDTO", productDTO);
		return "topOrders";
	}
	@RequestMapping("/")
	public String index() {
		
		return "start";
	}

}