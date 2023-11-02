<!DOCTYPE html>
<html>
    <head>
        <title>Formateur</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="EditProfile.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.3/css/fontawesome.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <script src="https://kit.fontawesome.com/479d8482d2.js" crossorigin="anonymous"></script>
        <link href='https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css'>
        <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
		<link rel="stylesheet" type="text/css" href="css/style.css">
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        
    </head>

    <body>
        
        <div class="menu-bar">
            
                <a href="Formateur"><img src="logo.png"  alt="AMYcation"></a>
            
            <ul>

                <li>
                    <i class="fas fa-home"></i>
                    <a href="Formateur">ACCUEIL</a>
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
        
        <!-- Compte -->
   		
<section class="py-5 my-5">
		<div class="container">
			<h1 class="mb-5">Paremètre du compte</h1>
			<div class="bg-white shadow rounded-lg d-block d-sm-flex">
				<div class="profile-tab-nav border-right">
					<div class="p-4">
						<div class="img-circle text-center mb-3">
							<img src="img/user2.jpg" alt="Image" class="shadow">
						</div>
						<h4 class="text-center">.....</h4>
					</div>
					<div class="nav flex-column nav-pills" id="v-pills-tab" role="tablist" aria-orientation="vertical">
						<a class="nav-link active" id="account-tab" data-toggle="pill" href="#account" role="tab" aria-controls="account" aria-selected="true">
							<i class="fa fa-home text-center mr-1"></i> 
							Mes informations
						</a>
						<a class="nav-link" id="password-tab" data-toggle="pill" href="#password" role="tab" aria-controls="password" aria-selected="false">
							<i class="fa fa-key text-center mr-1"></i> 
							Mot de pass
						</a>
						
					</div>
				</div>
		<form action="UpdateFormateur" method="POST">
				<div class="tab-content p-4 p-md-5" id="v-pills-tabContent">
					<div class="tab-pane fade show active" id="account" role="tabpanel" aria-labelledby="account-tab">
						<h3 class="mb-4">Modifier mes infos</h3>
					
						
					<div class="row">
							
							
							
							<div class="col-md-6">
								<div class="form-group">
								  	<label>Votre nom</label>
								  	<input type="text" class="form-control" name="nom">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
								  	<label>Votre prenom</label>
								  	<input type="text" class="form-control" name="prenom">
								</div>
							</div>
							
							<div class="col-md-6">
								<div class="form-group">
								  	<label>Num-tel</label>
								  	<input type="text" class="form-control" name="num_tel">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
								  	<label>Adresse</label>
								  	<input type="text" class="form-control" name="adresse">
								</div>
							
						</div>
						<div>
						    <input type="submit" class="btn btn-primary" value="Modifier">
							<a href="Etablissement"><button class="btn btn-light">Annuler</button></a>
						</div>	
					</div>
			</form>
			<form action="UpdateFormateurPass" method="POST">		
					<div class="tab-pane fade" id="password" role="tabpanel" aria-labelledby="password-tab">
						<h3 class="mb-4">Modifier mot de pass</h3>
						<div class="row">
							
						</div>
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
								  	<label>Votre email</label>
								  	<input type="email" class="form-control" name="email">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
								  	<label>Nouveau mot de pass</label>
								  	<input type="password" class="form-control" name="password">
								</div>
							</div>
						</div>
						<div>
							<input type="submit" class="btn btn-primary" value="Modifier">
						<a href="Etablissement"><button class="btn btn-light">Annuler</button></a>
						</div>
					</div>
					</form>
					</div>
					
				</div>
	</section>

    </body>
</html>