<!DOCTYPE html>
<html>
    <head>
        <title>Administrateur</title>
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
        
    </head>

    <body>
        
        <div class="menu-bar">
            
                <a href="Administrateur"><img src="logo.png"  alt="AMYcation"></a>
            
            <ul>

                <li>
                    <i class="fas fa-home"></i>
                    <a href="Administrateur">ACCUEIL</a>
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
                    <i class="fas fa-sign-out-alt"></i>
                    <a href="Internaute">D�connection</a>
                    </div> 
                </li>
            </ul>
        </div>
        
        <!-- Compte -->
   		
   		<section class="py-5 my-5">
		<div class="container">
			<h1 class="mb-5"><i class="fas fa-user-circle"></i> Compte</h1>
			<div class="bg-white shadow rounded-lg d-block d-sm-flex">
				<div class="profile-tab-nav border-right">
					<div class="p-4">
						<div class="img-circle text-center mb-3">
							<img src="img/user2.jpg" alt="Image" class="shadow">
						</div>
						<h4 class="text-center">Admin</h4>
					</div>
					<div class="nav flex-column nav-pills" id="v-pills-tab" role="tablist" aria-orientation="vertical">
						
						<a class="nav-link" id="password-tab" data-toggle="pill" href="#password" role="tab" aria-controls="password" aria-selected="true">
							<i class="fa fa-key text-center mr-1"></i> 
							Password
						</a>
						
					</div>
				</div>
				<form action="UpdateAdminPass" method="POST">
				<div class="tab-content p-4 p-md-5" id="v-pills-tabContent">
						<div class="row">
							<div class="tab-pane fade show active" id="password" role="tabpanel" aria-labelledby="password-tab">
								<h3 class="mb-4">Password Settings</h3>
								<div class="row">
									<div class="col-md-6">
										
									</div>
								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											  <label>Votre email</label>
											  <input type="text" class="form-control" name="email">
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
									<button class="btn btn-primary">Update</button>
									<a href="Administrateur"><button class="btn btn-light">Cancel</button></a>
								</div>
							</div>
							</div>
							</div>
							
							
					</form>
		</div>
		</div>
		
	</section>


	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    </div>
    </body>
</html>