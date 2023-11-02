<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
    <head>
        <title>AMYcation</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="Intrenaute.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.3/css/fontawesome.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <script src="https://kit.fontawesome.com/479d8482d2.js" crossorigin="anonymous"></script>
        
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
                            <li><a href="EFfilieres">Par fili�res</a></li>
                            <i class="fas fa-angle-right"></i>
                            <li><a href="EFdiplome">Par diplomes</a></li>
                            <i class="fas fa-angle-right"></i>
                            <li><a href="EFregion">Par r�gion</a></li>
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
        <br/><br/><br/><br/>

        <div class="content">
            <h1>
                <p>Votre avenir commance ici</p>
            </h1>
            <br/>
            <div class="rotate">
                <span>Apprenez �apprendre</span>
                <span>D�couvrez les comp�tences de demain</span>
                <span>Prenez votre carri�re en main</span>
                
            </div>
            

            <div class="inscrire">              
                <a href="SignUp_app"><button class="btn btn2"><label>Apprenant</label></button></a>  
                <a href="SignUp_etab"><button class="btn btn1"><label>Etablissement</label></button></a>
                <a href="SignUp_forma"><button class="btn btn3"><label>Formateur</label></button></a>
                                      
            </div>
        </div>



        <div class="center">
            <input class="cb" type="checkbox" id="show">
            <div class="container">
                <label for="show" class="close-btn fas fa-times"></label>
                <div class="text">
                    <h1>Connection</h1>
                </div>
            <div class="form">
                <form action="/Login" method="POST">
                    <div class="inputBox">
                        <label>Email</label>
                        <input type="email" placeholder="Email" name="email">
                    </div>
                    <div class="inputBox">
                        <label>Password</label>
                        <input type="password" placeholder="password" name="password">
                    </div>
                    <div class="forget">
                        <a href="#">Oublier le mot de pass?</a>
                    </div>        
                    <div class="btn">
                        <div class="inner"></div>
                        <button type="submit">se connecter</button>
                    </div>
                    <div class="signup">n'est pas un membre? <a href="Internaute">S'inscrire</a></div>
                </form>
            </div>
            </div>
        </div>
        
    </div>
    </body>
</html>