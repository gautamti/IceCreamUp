package com.example.icecreamup;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * @author Administrator
 * handle the default
 * @return
 */


@Controller
public class IcecreamupController {

	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String start() {
		
		return "start";
	}
	
	@PostMapping("/start")
	public String create() {
		return "start";
	}

	@RequestMapping("/")
	public String index() {
		
		return "start";
	}

}