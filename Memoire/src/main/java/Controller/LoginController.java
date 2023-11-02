
package Controller;



import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import DAO.AdministrateurDAO;
import DAO.ApprenantDAO;
import DAO.EtablissementDAO;
import DAO.FormateurDAO;
import DAO.User;
import DAO.UserDAO;

@Controller
public class LoginController {
	
	@PostMapping("Administrateur")
	public String Administrateur()
	{
		return "/WEB-INF/Views/Administrateur.jsp";
	}
	
	

	@RequestMapping(path = "/Login", method = RequestMethod.POST)

	public String loginControl(@ModelAttribute("Login") User user, HttpSession session, HttpServletResponse response) {
		String email = user.getEmail();
		
		
		UserDAO admin = new UserDAO();

		if (admin.existUser(email, user.getPassword(),1) ) {
			ApprenantDAO appreannt = new ApprenantDAO();
			if(appreannt.existApprenant(email))
			{
				return "/WEB-INF/Views/Apprenant.jsp";
			}
			else {
				FormateurDAO formateur = new FormateurDAO();
				if (formateur.existFormateur(email))
					{	
						return "/WEB-INF/Views/Formateur.jsp";
					}
				else {
					EtablissementDAO etablissement = new EtablissementDAO();
					if(etablissement.existEtablissement(email))
					{
						return "/WEB-INF/Views/Etablissement.jsp";
					}
					else {
						AdministrateurDAO administrateur = new AdministrateurDAO();
						if(administrateur.existAdministrateur(email))
						{
							return "/WEB-INF/Views/Administrateur.jsp";

						}
			
					}
					
				}
			}
	
		}
		
	return "/WEB-INF/Views/ErrorLogin.jsp";
		
		 	}
	
	
	@RequestMapping(path = "/UpdateAdminPass", method = RequestMethod.POST)

	public String updateetabpass(Model mode, User etab, HttpSession httpsess, HttpServletResponse response) 
	{
		//int id3 = emploi.getId();
		UserDAO c = new UserDAO();
		
		
		
			if(c.updateUser(etab))
			{
				mode.addAttribute("compteedited", "Vous êtes éditée votre compte");
				return "/WEB-INF/Views/Administrateur.jsp";
			}
			else
			{
				mode.addAttribute("compteNotedited", "Vous n'êtes pas éditée votre compte");
				return "/WEB-INF/Views/Administarteur.jsp";
			}
				
			
			
		}

}
