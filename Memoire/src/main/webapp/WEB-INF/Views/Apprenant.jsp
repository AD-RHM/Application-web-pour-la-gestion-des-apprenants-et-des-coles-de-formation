<!DOCTYPE html>
<html>
    <head>
        <title>Apprenant</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="apprenant.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.3/css/fontawesome.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <script src="https://kit.fontawesome.com/479d8482d2.js" crossorigin="anonymous"></script>
    	<style>
			.added
				{
					color: #48d620;
					
				}
			.deleted
				{
					color: #ff1500;
					
				}
			.edited
				{
					color: #ffa600;
					
				}   
		</style>
    </head>

    <body>
        
        <div class="menu-bar">
            
                <a href="Internaute"><img src="logo.png"  alt="AMYcation"></a>
            
            <ul>

                <li>
                    <i class="fas fa-home"></i>
                    <a href="Internaute">ACCUEIL</a>
                </li>
                <li>
                    <i class="fas fa-school"></i>
                    <a href="#">ECOLE DE FORMATION</a>   
                    <div class="sub-list-1">
                        <ul>
                            <i class="fas fa-angle-right"></i>
                            <li><a href="EFniveau">Par niveaux</a></li>
                            <i class="fas fa-angle-right"></i>
                            <li><a href="EFfilieres">Par filières</a></li>
                            <i class="fas fa-angle-right"></i>
                            <li><a href="EFdiplome">Par diplomes</a></li>
                            <i class="fas fa-angle-right"></i>
                            <li><a href="EFregion">Par région</a></li>
                            <i class="fas fa-angle-right"></i>
                            <li><a href="EFville">Par ville</a></li>
                        </ul>
                    </div>                 
                </li>
                <li >
                    <i class="fab fa-buffer"></i>
                    <a href="#">OFFRES</a>
                    <div class="sub-list-2">
                        <ul>
                               <i class="fas fa-angle-right"></i>
                            <li><a href="OffresDeFormation">Offre de formation</a></li>
                            <i class="fas fa-angle-right"></i>
                            <li><a href="OffresEmploi">Offre d'emploi</a></li>
                        </ul>
                </div>
                </li>
                <li>
                    <div class="act">
                    <i class="fas fa-sign-out-alt"></i>
                    <a href="Internaute">Déconnection</a>
                    </div> 
                </li>
                
            </ul>
        </div>
        <br><br><br>
        <h3 class="added" align="center">${compteedited}</h3>
		<h3 class="deleted" align="center">${compteNotedited}</h3>
        
        <nav>
            <label for="btn" class="button">Menu
            <span class="fas fa-caret-down"></span>
            </label>
            <input type="checkbox" id="btn">
            <ul class="menu">
               <!-- <li><a href="#"><i class="fas fa-user-circle"></i> Compte</a></li> -->
               
               <li>
                  <label for="btn-1" class="first"><i class="fas fa-user-circle"></i> Mon profil
                  <span class="fas fa-caret-down"></span>
                  </label>
                  <input type="checkbox" id="btn-1">
                  <ul>
                     <li><a href="ApprenantProfile"><i class="fas fa-angle-right"></i>Modifier compte</a></li>
                     <li><a href="#"><i class="fas fa-angle-right"></i>Mes formations</a></li>
                  </ul>
               </li>
               <li>
                  <label for="btn-2" class="first"><i class="fas fa-money-bill-wave"></i> Paiement
                  <span class="fas fa-caret-down"></span>
                  </label>
                  <input type="checkbox" id="btn-2">
                  <ul>
                     <li><a href="#"><i class="fas fa-angle-right"></i>CIB</a></li>
                     <li><a href="#"><i class="fas fa-angle-right"></i>CARTE DHAHABIA</a></li>
                  </ul>
               </li>
               <li>
                  <label for="btn-3" class="second"><i class="far fa-envelope"></i> Contact
                  <span class="fas fa-caret-down"></span>
                  </label>
                  <input type="checkbox" id="btn-3">
                  <ul>
                     <li><a href="#"><i class="fas fa-angle-right"></i>Formateur</a></li>
                     <li><a href="#"><i class="fas fa-angle-right"></i>Etablissement</a></li>
                  </ul>
               
            </ul>
         </nav>
         


        
    </div>
    </body>
    </body>
</html>