package com.example.icecreamup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.icecreamup.dto.ProductDTO;
import com.example.icecreamup.service.ITopOrderService;


/**
 * @author Administrator
 * handle the default
 * @return
 */
@Controller
public class IcecreamupController {
	
	@Autowired
	private ITopOrderService topOrderService;
	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read() {
		return "start";
	}

	@RequestMapping(value="/topOrders", method=RequestMethod.GET)
	public String topOrder(Model model) {
		ProductDTO productDTO = topOrderService.fetchByProductId(50);
		model.addAttribute("productDTO", productDTO);
		return "topOrders";
	}
	
	@RequestMapping(value="/allItems", method=RequestMethod.GET)
	public String allItems(Model model) {
		ProductDTO productDTO = allItemService.fetchAllItems();
		model.addAttribute("productDTO", productDTO);
		return "allItems";
	}
	@RequestMapping("/")
	public String index() {
		
		return "start";
	}

}