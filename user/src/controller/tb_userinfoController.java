package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entity.tb_userinfo;
import service.tb_roleService;
import service.tb_role_userService;
import service.tb_userinfoService;

@Controller
public class tb_userinfoController {

	@Autowired
	tb_role_userService  userService ;
	@Autowired
	tb_userinfoService userinfoService;
	@Autowired
	tb_roleService roleService;
	    
	   @RequestMapping("/select")
	   public String  lala(
			   HttpServletRequest request, @RequestParam(value="" ,required=false) String name,
			   @RequestParam(value="" ,required=false) Integer zt,  @RequestParam(value="num" ,required=false) Integer num
			   ){
		   int count=3;
		   
		   List<tb_userinfo> user=  userinfoService.quey(name,zt,num,count);
         
		   request.setAttribute("list", user);
		   
		   return "index";
	   }
}
