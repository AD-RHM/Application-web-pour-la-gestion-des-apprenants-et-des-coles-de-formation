<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="Login.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.3/css/fontawesome.min.css">
    <script src="https://kit.fontawesome.com/479d8482d2.js" crossorigin="anonymous"></script>
</head>
<body>
  
  
    <div class="wrapper">
        
        <div class="title">
          Nouveau formateur
        </div>
        <div class="form">
        <form action="InscForm" method="POST">
           <div class="inputfield">
              <label>Nom</label>
              <input type="text" class="input" name="nom">
           </div>  
            <div class="inputfield">
              <label>Prenom</label>
              <input type="text" class="input" name="prenom">
           </div>
			<div class="inputfield">
              <label>Email</label>
              <input type="email" class="input" name="email">
           </div>
           <div class="inputfield">
              <label>Mot de pass</label>
              <input type="password" class="input" name="password">
           </div>  
          <div class="inputfield">
              <label>Num tel</label>
              <input type="text" class="input" name="num_tel">
           </div> 
          <div class="inputfield">
              <label>Adresse</label>
              <input type="text" class="textarea" name="adresse">
           </div> 
           <div class="inputfield">
                <label>Votre CV</label>
                <input type="file" id="file" name="cv">
           </div>
          <div class="inputfield">
          	
            <a class="btn" href="After_insc"><input type="submit" value="Register" class="btn"></a>
            
          </div>
          <div class="inputfield">
            <a class="btn" href="Internaute" ><input type="button" value="Annuler" class="btn"></a>
          </div>
        </form>

        </div>
    
</div>
</body>
</html>