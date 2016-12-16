package edu.randomvar.mvc.web;


import edu.randomvar.mvc.service.*;
import edu.randomvar.mvc.service.impl.MedianSquaresMethod;
import edu.randomvar.mvc.service.impl.MonteCarlo;
import edu.randomvar.mvc.service.impl.NativeRandom;
import edu.randomvar.mvc.service.impl.ShakeMethod;
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
		rnd.add(new MedianSquaresMethod());
//		rnd.add(new NativeRandom());
		rnd.add(new NativeRandom());
		rnd.add(new NativeRandom());
//		rnd.add(new MedianSquaresMethod());
//		rnd.add(new ShakeMethod());
//		rnd.add(new MonteCarlo());
	}


	@RequestMapping("/index")
	public String index(Map<String, Object> map){

		for(GenerateNumbers rnums: rnd){
			StringBuilder str = new StringBuilder();
			str.append("['Claster','Input'],");
			for(Map.Entry e: rnums.getNumbers().entrySet()){
				str.append("['"+e.getKey()+"',"+e.getValue()+"],");
			}

			map.put("method"+rnd.indexOf(rnums),str);
			map.put("m"+rnd.indexOf(rnums),rnums.getM());
			map.put("d"+rnd.indexOf(rnums),rnums.getD());
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