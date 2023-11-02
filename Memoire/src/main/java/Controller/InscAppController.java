
package Controller;


import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import DAO.Apprenant;
import DAO.ApprenantDAO;
import DAO.OffreEmploi;
import DAO.OffreEmploiDAO;
import DAO.User;
import DAO.UserDAO;

@Controller
public class InscAppController {
	
	
	@PostMapping("Apprenant")
	public String apprenant()
	{
		return "/WEB-INF/Views/Apprenant.jsp";

	}
	
	
	@PostMapping("InscApp")
	

	@RequestMapping(path = "/InscApp", method = RequestMethod.POST)

	public String Insert_cher(@ModelAttribute("InscApp") Apprenant appr, HttpSession httpsess, HttpServletResponse response) {
		String email = appr.getEmail();
		
		UserDAO u = new UserDAO();

		if (u.existUser(email)) {
			
			return "/WEB-INF/Views/InscErrorEmail.jsp";
		} else {
			ApprenantDAO c = new ApprenantDAO();
			if (c.existApprenant(appr)) {
				
				return "/WEB-INF/Views/InscErrorExistUser.jsp";
			} else {
				if (c.addApprenant(appr)) {
					
					return "/WEB-INF/Views/After_insc.jsp";
				}
				else
				{
					return "/WEB-INF/Views/Nothing.jsp";

				}
			}
		}
	}
	
	@RequestMapping(path = "/ValideApprenant", method = RequestMethod.POST)

	public String addoffreemploi(Model mode ,User user, HttpSession httpsess, HttpServletResponse response) 
	{
		
		String email = user.getEmail();
		UserDAO c = new UserDAO();
		
		
		if(!c.existUser(email)) {
			mode.addAttribute("AccountNotExisted", "le compte n'est pas existe");
			return "/WEB-INF/Views/Administrateur.jsp";
		}
		else
		{
			if(c.updateState(user))
			{
				mode.addAttribute("AccountValidated", "le compte est validée");
				return "/WEB-INF/Views/Administrateur.jsp";
			}
			else
			{
				mode.addAttribute("AccountNotValidated", "le compte n'est pas validée");
				return "/WEB-INF/Views/Administrateur.jsp";
				
			}	
		}
	}
	
	@RequestMapping(path = "/DeleteApprenant", method = RequestMethod.POST)

	public String addoffreemploi(Model mode ,Apprenant appr, HttpSession httpsess, HttpServletResponse response) 
	{
		
		String email = appr.getEmail();
		ApprenantDAO p = new ApprenantDAO();
		UserDAO c = new UserDAO();
		
		
		if(!c.existUser(email)) {
			mode.addAttribute("AccountNotExisted", "le compte n'est pas existe");
			return "/WEB-INF/Views/Administrateur.jsp";
		}
		else
		{
			if(p.deleteApprenant(email) && c.deleteUser(email))
			{
				
				mode.addAttribute("AccountDeleted", "le compte est supprimée");
				return "/WEB-INF/Views/Administrateur.jsp";
			}
			else
			{
				mode.addAttribute("AccountNotValidated", "le compte n'est pas suprimmée");
				return "/WEB-INF/Views/Administrateur.jsp";
				
			}	
		}
	}
	
	@RequestMapping(path = "/UpdateApprenant", method = RequestMethod.POST)

	public String updateetabpass(Model mode, Apprenant appr, HttpSession httpsess, HttpServletResponse response) 
	{
		//int id3 = emploi.getId();
		ApprenantDAO c = new ApprenantDAO();
		
		
		
			if(c.updateApprenant(appr))
			{
				mode.addAttribute("compteedited", "Vous êtes éditée votre compte");
				return "/WEB-INF/Views/Apprenant.jsp";
			}
			else
			{
				mode.addAttribute("compteNotedited", "Vous n'êtes pas éditée votre compte");
				return "/WEB-INF/Views/Apprenant.jsp";
			}
				
			
			
		}
	@RequestMapping(path = "/UpdateApprenantPass", method = RequestMethod.POST)

	public String updateetabpass(Model mode, User appr, HttpSession httpsess, HttpServletResponse response) 
	{
		//int id3 = emploi.getId();
		UserDAO c = new UserDAO();
		
		
		
			if(c.updateUser(appr))
			{
				mode.addAttribute("compteedited", "Vous êtes éditée votre compte");
				return "/WEB-INF/Views/Apprenant.jsp";
			}
			else
			{
				mode.addAttribute("compteNotedited", "Vous n'êtes pas éditée votre compte");
				return "/WEB-INF/Views/Apprenant.jsp";
			}
				
			
			
		}

}
