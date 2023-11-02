package Controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import DAO.Apprenant;
import DAO.ApprenantDAO;
import DAO.Etablissement;
import DAO.EtablissementDAO;
import DAO.Formateur;
import DAO.FormateurDAO;
import DAO.OffreEmploi;
import DAO.OffreEmploiDAO;
import DAO.OffreFormation;
import DAO.OffreFormationDAO;

@Controller
public class jspController {
	
	@GetMapping("/Administrateur")
	public String Administrateur() {
		return"/WEB-INF/Views/Administrateur.jsp";
	}
	@GetMapping("/Apprenant")
	public String Apprenant() {
		return"/WEB-INF/Views/Apprenant.jsp";
	}
	@GetMapping("/EFdiplome")
	public String EFdiplome(Model model) {
		EtablissementDAO f = new EtablissementDAO();
		ArrayList<Etablissement> listeOffre=f.getAllInternaute();
		model.addAttribute("listeOffre", listeOffre);
		return"/WEB-INF/Views/EFdiplome.jsp";
	}
	@GetMapping("/EFfilieres")
	public String EFfilieres(Model model) {
		EtablissementDAO f = new EtablissementDAO();
		ArrayList<Etablissement> listeOffre=f.getAllInternaute();
		model.addAttribute("listeOffre", listeOffre);
		return"/WEB-INF/Views/EFfilieres.jsp";
	}
	@GetMapping("/EFniveau")
	public String EFniveau(Model model) {
		EtablissementDAO f = new EtablissementDAO();
		ArrayList<Etablissement> listeOffre=f.getAllInternaute();
		model.addAttribute("listeOffre", listeOffre);
		return"/WEB-INF/Views/EFniveau.jsp";
	}
	@GetMapping("/EFregion")
	public String EFregion(Model model) {
		EtablissementDAO f = new EtablissementDAO();
		ArrayList<Etablissement> listeOffre=f.getAllInternaute();
		model.addAttribute("listeOffre", listeOffre);
		return"/WEB-INF/Views/EFregion.jsp";
	}
	@GetMapping("/EFville")
	public String EFville(Model model) {
		EtablissementDAO f = new EtablissementDAO();
		ArrayList<Etablissement> listeOffre=f.getAllInternaute();
		model.addAttribute("listeOffre", listeOffre);
		return"/WEB-INF/Views/EFville.jsp";
	}
	@GetMapping("/Etablissement")
	public String Etablissement() {
		return"/WEB-INF/Views/Etablissement.jsp";
	}
	@GetMapping("/Formateur")
	public String Formateur() {
		return"/WEB-INF/Views/Formateur.jsp";
	}
	@GetMapping("/Internaute")
	public String Internaute() {
		return"/WEB-INF/Views/Internaute.jsp";
	}
	@GetMapping("/SignUp_app")
	public String SignUp_app() {
		return"/WEB-INF/Views/SignUp_app.jsp";
	}
	@GetMapping("/SignUp_etab")
	public String SignUp_etab() {
		return"/WEB-INF/Views/SignUp_etab.jsp";
	}
	@GetMapping("/SignUp_forma")
	public String SignUp_forma() {
		return"/WEB-INF/Views/SignUp_forma.jsp";
	}
	@GetMapping("/OffresEmploi")
	public String OffresEmploi(Model model) {
		OffreEmploiDAO f = new OffreEmploiDAO();
		ArrayList<OffreEmploi> listeOffre=f.getAll();
		model.addAttribute("listeOffre", listeOffre);
		return"/WEB-INF/Views/OffresEmploi.jsp";
	}
	@GetMapping("/OffresDeFormation")
	public String OffresDeFormation(Model model) {
		OffreFormationDAO f = new OffreFormationDAO();
		ArrayList<OffreFormation> listeOffre=f.getAll();
		model.addAttribute("listeOffre", listeOffre);
		return"/WEB-INF/Views/OffresDeFormation.jsp";
	}
	@GetMapping("/After_insc")
	public String After_insc() {
		return"/WEB-INF/Views/After_insc.jsp";
	}
	@GetMapping("/ListeApp")
	public String ListeApp(Model model) {
		ApprenantDAO f = new ApprenantDAO();
		ArrayList<Apprenant> listeOffre=f.getAll();
		model.addAttribute("listeOffre", listeOffre);
		return"/WEB-INF/Views/ListeApp.jsp";
	}
	@GetMapping("/ListeForma")
	public String ListeForma(Model model) {
		FormateurDAO f = new FormateurDAO();
		ArrayList<Formateur> listeOffre=f.getAll();
		model.addAttribute("listeOffre", listeOffre);
		return"/WEB-INF/Views/Listeforma.jsp";
	}
	@GetMapping("/ListeEtab")
	public String ListeEtab(Model model) {
		EtablissementDAO f = new EtablissementDAO();
		ArrayList<Etablissement> listeOffre=f.getAll();
		model.addAttribute("listeOffre", listeOffre);
		return"/WEB-INF/Views/ListeEtab.jsp";
	}
	@GetMapping("/AdminProfile")
	public String AdminProfile() {
		return"/WEB-INF/Views/AdminProfile.jsp";
	}
	@GetMapping("/EtablissementProfile")
	public String EtablissementProfile() {
		return"/WEB-INF/Views/EtablissementProfile.jsp";
	}
	@GetMapping("/ApprenantProfile")
	public String ApprenantProfile() {
		return"/WEB-INF/Views/ApprenantProfile.jsp";
	}
	@GetMapping("/FormateurProfile")
	public String FormateurProfile() {
		return"/WEB-INF/Views/FormateurProfile.jsp";
	}
	
	@GetMapping("/ErrorLogin")
	public String ErrorLogin() {
		return"/WEB-INF/Views/ErrorLogin.jsp";
	}
	@GetMapping("ProposerOffre")
	public String ProposerOffre() {
		return"/WEB-INF/Views/ProposerOffre.jsp";
	}
	@GetMapping("/InscErrorEmail")
	public String InscErrorEmail() {
		return"/WEB-INF/Views/InscErrorEmail.jsp";
	}
	@GetMapping("/InscErrorExistUser")
	public String InscErrorExistUser() {
		return"/WEB-INF/Views/InscErrorExistUser.jsp";
	}
	@GetMapping("/OffresEmploiPro")
	public String OffresEmploiPro(Model model) {
		OffreEmploiDAO f = new OffreEmploiDAO();
		ArrayList<OffreEmploi> listeOffre=f.getAll();
		model.addAttribute("listeOffre", listeOffre);
		return"/WEB-INF/Views/OffresEmploiPro.jsp";
	}
	
	@GetMapping("/OffresDeFormationPro")
	public String OffresDeFormationPro(Model model) {
		OffreFormationDAO f = new OffreFormationDAO();
		ArrayList<OffreFormation> listeOffre=f.getAll();
		model.addAttribute("listeOffre", listeOffre);
		return"/WEB-INF/Views/OffresDeFormationPro.jsp";
	}
	@GetMapping("/OffreEnAttente")
	public String OffreEnAttente(Model model) {
		OffreEmploiDAO f = new OffreEmploiDAO();
		ArrayList<OffreEmploi> listeOffre=f.getAll();
		model.addAttribute("listeOffre", listeOffre);
		return"/WEB-INF/Views/OffreEnAttente.jsp";
	}


}
