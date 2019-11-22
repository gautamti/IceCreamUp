package com.example.icecreamup;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.icecreamup.dto.OrderDTO;
import com.example.icecreamup.dto.ProductDTO;
import com.example.icecreamup.service.IOrderService;
import com.example.icecreamup.service.ITopOrderService;
import com.example.icecreamup.service.TopOrderService;


/**
 * @author Administrator
 * handle the default
 * @return
 */


@Controller
public class IcecreamupController {
	
	@Autowired
	private ITopOrderService topOrderService;
	
	@Autowired
	private IOrderService orderService;
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/")
	public String index() {
		
		return "start";
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read() {
		return "start";
	}
	
	@RequestMapping(value="/orderForm", method=RequestMethod.GET)
	public String orderForm(Model model) {
		model.addAttribute("orderDTO", new OrderDTO());
		return "orderForm";
	}
	
	@RequestMapping(value="/saveOrder", method=RequestMethod.POST)
	public String saveOrder(OrderDTO orderDTO) {
		orderDTO.setTimeStamp(new Date());
		
		try
		{
			orderService.save(orderDTO);
		} catch (Exception e)
		{
			// TODO: Return an error page or error message
			e.printStackTrace();
			log.error("Unable to save order.", e);
		}
		
		return "start";
	}
	
	@RequestMapping(value="/showOrders", method=RequestMethod.GET)
	public ModelAndView showOrders()
	{
		ModelAndView modelAndView = new ModelAndView();
		try
		{
			Iterable<OrderDTO> allOrders = orderService.fetchAllOrders();
			modelAndView.setViewName("showOrders");
			modelAndView.addObject("allOrders", allOrders);
		} catch (Exception e)
		{
			// TODO: Return an error page or error message
			e.printStackTrace();
			log.error("Unable to view orders", e);
		}
		return modelAndView;
	}
	
	@RequestMapping(value="/topOrders", method=RequestMethod.GET)
	public ModelAndView topOrders()
	{
		ModelAndView modelAndView = new ModelAndView();
		try
		{
			Iterable<ProductDTO> topOrders = topOrderService.fetchTopOrders();
			modelAndView.setViewName("topOrders");
			modelAndView.addObject("allOrders", topOrders);
		} catch (Exception e)
		{
			// TODO: Return an error page or error message
			e.printStackTrace();
			log.error("Unable to view top orders", e);
		}
		return modelAndView;
	}
}