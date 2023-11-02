package Controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import DAO.OffreFormation;
import DAO.OffreFormationDAO;

@Controller
public class AddOffreFormationController {
	
	@PostMapping("OffresDeFormationPro")
	public String OffreDeFormationPro()
	{
		return "/WEB-INF/Views/OffresDeFormationPro.jsp";

	}
	
	
	

	@RequestMapping(path = "/AddOffreFormation", method = RequestMethod.POST)

	public String addoffreemploi(Model mode, OffreFormation formation, HttpSession httpsess, HttpServletResponse response) 
	{
		int id = formation.getId();
		OffreFormationDAO c = new OffreFormationDAO();
		
		
		if(c.existOffreFormation(id)) {
			mode.addAttribute("formationadded", "La formation n'est pas ajoutée");
			return "/WEB-INF/Views/Etablissement.jsp";
		}
		else
		{
			if(c.addOffreFormation(formation))
			{
				mode.addAttribute("formationadded", "Une nouvelle formation est ajoutée");
				return "/WEB-INF/Views/Etablissement.jsp";
			}
			else
			{
				mode.addAttribute("formationadded", "La formation n'est pas ajoutée");
				return "/WEB-INF/Views/Etablissement.jsp";
			}	
		}
	}
	
	
	
	@RequestMapping(path = "/DeleteOffreFormation", method = RequestMethod.POST)

	public String deleteoffreemploi(Model mode, OffreFormation formation, HttpSession httpsess, HttpServletResponse response) 
	{
		int id2 = formation.getId();
		OffreFormationDAO c = new OffreFormationDAO();
		
		
		
			if(c.deleteOffreFormation(id2))
			{
				mode.addAttribute("formationdeleted", "La formation est supprimée");
				return "/WEB-INF/Views/Etablissement.jsp";
			}
			else
			{
				mode.addAttribute("formationdeleted", "La formation n'est pas supprimée");
				return "/WEB-INF/Views/Etablissement.jsp";
			}
				
			
			
		}
	
	@RequestMapping(path = "/UpdateOffreFormation", method = RequestMethod.POST)

	public String updateoffreemploi(Model mode, OffreFormation formation, HttpSession httpsess, HttpServletResponse response) 
	{
		OffreFormationDAO c = new OffreFormationDAO();
		
		
		
			if(c.updateOffreFormation(formation))
			{
				mode.addAttribute("formationedited", "La formation est éditée");
				return "/WEB-INF/Views/Etablissement.jsp";
			}
			else
			{
				mode.addAttribute("formationedited", "La formation n'est pas éditée");
				return "/WEB-INF/Views/Etablissement.jsp";

			}
				
			
			
		}
	
}


