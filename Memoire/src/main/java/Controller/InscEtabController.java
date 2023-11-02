
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
import DAO.Etablissement;
import DAO.EtablissementDAO;
import DAO.OffreEmploi;
import DAO.OffreEmploiDAO;
import DAO.User;
import DAO.UserDAO;

@Controller
public class InscEtabController {
	
	
	@PostMapping("Etablissement")
	public String apprenant()
	{
		return "/WEB-INF/Views/Etablissement.jsp";

	}
	
	
	@PostMapping("InscEtab")
	

	@RequestMapping(path = "/InscEtab", method = RequestMethod.POST)

	public String Insert_cher(@ModelAttribute("InscEtab") Etablissement etab, HttpSession httpsess, HttpServletResponse response) {
		String email = etab.getEmail();
		
		UserDAO u = new UserDAO();

		if (u.existUser(email)) {
			
			return "/WEB-INF/Views/InscErrorEmail.jsp";
		} else {
			EtablissementDAO c = new EtablissementDAO();
			if (c.existEtablissement(etab)) {
				
				return "/WEB-INF/Views/InscErrorExistUser.jsp";
			} else {
				if (c.addEtablissement(etab)) {
					
					return "/WEB-INF/Views/After_insc.jsp";
				}
				else
				{
					return "/WEB-INF/Views/Nothing.jsp";

				}
			}
		}
	}
	
	@RequestMapping(path = "/ValideEtablissement", method = RequestMethod.POST)

	public String addoffreemploi(Model mode ,User user, HttpSession httpsess, HttpServletResponse response) 
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
	
	@RequestMapping(path = "/DeleteEtablissement", method = RequestMethod.POST)

	public String valide(Model mode ,Etablissement appr, HttpSession httpsess, HttpServletResponse response) 
	{
		
		String email = appr.getEmail();
		EtablissementDAO p = new EtablissementDAO();
		UserDAO c = new UserDAO();
		
		
		if(!c.existUser(email)) {
			mode.addAttribute("AccountNotDeleted", "le compte n'est pas existe");
			return "/WEB-INF/Views/Administrateur.jsp";
		}
		else
		{
			if(p.deleteEtablissement(email) && c.deleteUser(email))
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
	
	@RequestMapping(path = "/UpdateEtablissement", method = RequestMethod.POST)

	public String updateoffreemploi(Model mode, Etablissement etab, HttpSession httpsess, HttpServletResponse response) 
	{
		//int id3 = emploi.getId();
		EtablissementDAO c = new EtablissementDAO();
		
		
		
			if(c.updateEtablissement(etab))
			{
				mode.addAttribute("compteedited", "Vous êtes éditée votre compte");
				return "/WEB-INF/Views/Etablissement.jsp";
			}
			else
			{
				mode.addAttribute("compteNotedited", "Vous n'êtes pas éditée votre compte");
				return "/WEB-INF/Views/Etablissement.jsp";
			}
				
			
			
		}

	@RequestMapping(path = "/UpdateEtablissementPass", method = RequestMethod.POST)

	public String updateetabpass(Model mode, User etab, HttpSession httpsess, HttpServletResponse response) 
	{
		//int id3 = emploi.getId();
		UserDAO c = new UserDAO();
		
		
		
			if(c.updateUser(etab))
			{
				mode.addAttribute("compteedited", "Vous êtes éditée votre compte");
				return "/WEB-INF/Views/Etablissement.jsp";
			}
			else
			{
				mode.addAttribute("compteNotedited", "Vous n'êtes pas éditée votre compte");
				return "/WEB-INF/Views/Etablissement.jsp";
			}
				
			
			
		}

	
}
