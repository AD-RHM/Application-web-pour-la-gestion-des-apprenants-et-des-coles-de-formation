
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
import DAO.Formateur;
import DAO.FormateurDAO;
import DAO.User;
import DAO.UserDAO;

@Controller
public class InscFormController {
	
	
	@PostMapping("Formateur")
	public String formateur()
	{
		return "/WEB-INF/Views/Apprenant.jsp";

	}
	
	
	@PostMapping("InscForm")
	

	@RequestMapping(path = "/InscForm", method = RequestMethod.POST)

	public String Insert_cher(@ModelAttribute("InscForm") Formateur form, HttpSession httpsess, HttpServletResponse response) {
		String email = form.getEmail();
		
		UserDAO u = new UserDAO();

		if (u.existUser(email)) {
			
			return "/WEB-INF/Views/InscErrorEmail.jsp";
		} else {
			FormateurDAO c = new FormateurDAO();
			if (c.existFormateur(form)) {
				
				return "/WEB-INF/Views/InscErrorExistUser.jsp";
			} else {
				if (c.addFormateur(form)) {
					
					return "/WEB-INF/Views/After_insc.jsp";
				}
				else
				{
					return "/WEB-INF/Views/Nothing.jsp";

				}
			}
		}
	}
	@RequestMapping(path = "/ValideFormateur", method = RequestMethod.POST)

	public String valide(Model mode ,User user, HttpSession httpsess, HttpServletResponse response) 
	{
		
		String email = user.getEmail();
		UserDAO c = new UserDAO();
		
		
		if(!c.existUser(email)) {
			mode.addAttribute("AccountNotValidated", "le compte n'est pas existe");
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

	@RequestMapping(path = "/DeleteFormateur", method = RequestMethod.POST)

	public String addoffreemploi(Model mode ,Formateur form, HttpSession httpsess, HttpServletResponse response) 
	{
		
		String email = form.getEmail();
		FormateurDAO p = new FormateurDAO();
		UserDAO c = new UserDAO();
		
		
		if(!c.existUser(email)) {
			mode.addAttribute("AccountNotDeleted", "le compte n'est pas existe");
			return "/WEB-INF/Views/Administrateur.jsp";
		}
		else
		{
			if(p.deleteFormateur(email) && c.deleteUser(email))
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
	
	
	@RequestMapping(path = "/UpdateFormateur", method = RequestMethod.POST)

	public String updateformapass(Model mode, Formateur form, HttpSession httpsess, HttpServletResponse response) 
	{
		//int id3 = emploi.getId();
		FormateurDAO c = new FormateurDAO();
		
		
		
			if(c.updateFormateur(form))
			{
				mode.addAttribute("compteedited", "Vous êtes éditée votre compte");
				return "/WEB-INF/Views/Formateur.jsp";
			}
			else
			{
				mode.addAttribute("compteNotedited", "Vous n'êtes pas éditée votre compte");
				return "/WEB-INF/Views/Formateur.jsp";
			}
				
			
			
		}
	@RequestMapping(path = "/UpdateFormateurPass", method = RequestMethod.POST)

	public String updateformpass(Model mode, User form, HttpSession httpsess, HttpServletResponse response) 
	{
		//int id3 = emploi.getId();
		UserDAO c = new UserDAO();
		
		
		
			if(c.updateUser(form))
			{
				mode.addAttribute("compteedited", "Vous êtes éditée votre compte");
				return "/WEB-INF/Views/Formateur.jsp";
			}
			else
			{
				mode.addAttribute("compteNotedited", "Vous n'êtes pas éditée votre compte");
				return "/WEB-INF/Views/Formateur.jsp";
			}
				
			
			
		}





	
}
