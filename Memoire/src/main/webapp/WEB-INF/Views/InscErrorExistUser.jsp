<!DOCTYPE html>
<html>
    <head>
        <title>Par villes</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="ErrorLogin.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.3/css/fontawesome.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <script src="https://kit.fontawesome.com/479d8482d2.js" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        
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
                    <i class="fas fa-sign-in-alt"></i>
                    <label for="show" >Connection</label>
                    </div> 
                </li>
            </ul>
        </div>
        
        <div class="center">
            <input class="cb" type="checkbox" id="show">
            <div class="container">
                <label for="show" class="close-btn fas fa-times"></label>
                <div class="text">
                    <h1>Connection</h1>
                </div>
            <div class="form">
                <form>
                    <div class="inputBox">
                        <label>Nom d'utilisateur</label>
                        <input type="text" placeholder="Nom d'utilisateur">
                    </div>
                    <div class="inputBox">
                        <label>Mot de pass</label>
                        <input type="password" placeholder="Mot de pass">
                    </div>
                    <div class="forget">
                        <a href="#">Oublier le mot de pass?</a>
                    </div>        
                    <div class="btn">
                        <div class="inner"></div>
                        <button type="submit">se connecter</button>
                    </div>
                    <div class="signup">n'est pas un membre? <a href="Login">S'inscrire</a></div>
                </form>
            </div>
            </div>
        </div>
        <div class="alert alert-danger alert-dismissible fade in">
    <a href="Internaute" class="close" data-dismiss="alert" aria-label="close">&times;</a>
    <p align="center">les informations sont érronées</p>
  </div>
   			</br></br></br></br>
        <div class="content">
   			</br></br></br>
   
                    <h2 align="center">Nom ou prénom est déja utilisé</h2>
                    <h2 align="center">Réessayer avec des informations valides</h2>

            <br/>
            
        
    </div>
    </body>
</html>