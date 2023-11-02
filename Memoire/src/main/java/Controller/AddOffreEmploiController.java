package Controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import DAO.OffreEmploi;
import DAO.OffreEmploiDAO;

@Controller
public class AddOffreEmploiController {
	
	@PostMapping("OffreEmploiPro")
	public String OffreEmploiPro()
	{
		return "/WEB-INF/Views/OffreEmploiPro.jsp";

	}
	

	
	

	@RequestMapping(path = "/AddOffreEmploi", method = RequestMethod.POST)

	public String addoffreemploi(Model mode ,OffreEmploi emploi, HttpSession httpsess, HttpServletResponse response) 
	{
		
		int id = emploi.getId();
		OffreEmploiDAO c = new OffreEmploiDAO();
		
		
		if(c.existOffreEmploi(id)) {
			mode.addAttribute("offreadded", "L'offre n'est pas ajoutée");
			return "/WEB-INF/Views/Etablissement.jsp";
		}
		else
		{
			if(c.addOffreEmploi(emploi))
			{
				mode.addAttribute("offreadded", "Une nouvelle offre est ajoutée");
				return "/WEB-INF/Views/Etablissement.jsp";
			}
			else
			{
				mode.addAttribute("offreadded", "L'offre n'est pas ajoutée");
				return "/WEB-INF/Views/Etablissement.jsp";
			}	
		}
	}
	
	
	
	@RequestMapping(path = "/DeleteOffreEmploi", method = RequestMethod.POST)

	public String deleteoffreemploi(Model mode, OffreEmploi emploi, HttpSession httpsess, HttpServletResponse response) 
	{
		int id2 = emploi.getId();
		OffreEmploiDAO c = new OffreEmploiDAO();
		
		
		
			if(c.deleteOffreEmploi(id2))
			{
				mode.addAttribute("offredeleted", "Vous êtes supprimée l'offre");
				return "/WEB-INF/Views/Etablissement.jsp";
			}
			else
			{
				mode.addAttribute("offredeleted", "Vous n'êtes pas supprimée l'offre");
				return "/WEB-INF/Views/Etablissement.jsp";
			}
				
			
			
		}
	
	@RequestMapping(path = "/UpdateOffreEmploi", method = RequestMethod.POST)

	public String updateoffreemploi(Model mode, OffreEmploi emploi, HttpSession httpsess, HttpServletResponse response) 
	{
		//int id3 = emploi.getId();
		OffreEmploiDAO c = new OffreEmploiDAO();
		
		
		
			if(c.updateOffreEmploi(emploi))
			{
				mode.addAttribute("offreedited", "Vous êtes éditée l'offre");
				return "/WEB-INF/Views/Etablissement.jsp";
			}
			else
			{
				mode.addAttribute("offreedited", "Vous n'êtes pas éditée l'offre");
				return "/WEB-INF/Views/Etablissement.jsp";
			}
				
			
			
		}
	
}


