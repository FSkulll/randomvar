package edu.randomvar.mvc.web;


import edu.randomvar.mvc.service.*;
import edu.randomvar.mvc.service.impl.NativeRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class HomeController {

	@Qualifier("userService")
	@Autowired
	private UsersService usersService;


	private ArrayList<GenerateNumbers> rnd;

	{
		rnd = new ArrayList<GenerateNumbers>();
		rnd.add(new NativeRandom());
		rnd.add(new NativeRandom());
		rnd.add(new NativeRandom());
		rnd.add(new NativeRandom());
	}


	@RequestMapping("/index")
	public String index(Map<String, Object> map){

		for(GenerateNumbers rnums: rnd){
			StringBuilder str = new StringBuilder();
			str.append("['Кластер','Вхождения'],");
			for(Map.Entry e: rnums.getNumbers().entrySet()){
				str.append("['"+e.getKey()+"',"+e.getValue()+"],");
			}

			map.put(rnums.getClass().toString().replace("class edu.randomvar.mvc.service.impl.","")+rnd.indexOf(rnums),str);
		}

		map.put("temp",rnd.get(0).getN());
		map.put("username", SecurityContextHolder.getContext().getAuthentication().getName());
		map.put("user", SecurityContextHolder.getContext().getAuthentication().getPrincipal());
		return "index";
	}

	@RequestMapping(value = "/calculate" ,method = RequestMethod.POST)
	public String makeResult(@RequestParam(value = "str", required = false) String str) {
		for(GenerateNumbers rnums: rnd){
			rnums.generateSet(Integer.parseInt(str));
		}
		return "redirect:/index";
	}
}