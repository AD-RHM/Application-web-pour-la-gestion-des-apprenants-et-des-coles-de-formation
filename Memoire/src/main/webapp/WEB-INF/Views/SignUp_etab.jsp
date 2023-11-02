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
          Nouveau etablissement
        </div>
        <div class="form">
        <form action="InscEtab" method="POST">
           <div class="inputfield">
              <label>Nom d'établissement</label>
              <input type="text" class="input" name="nom_etablissement">
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
              <label>Siege</label>
              <input type="text" class="textarea" name="siege">
           </div> 
           
           
               
           <div class="inputfield">
               <label>Niveau</label>
               <select name="Niveau"  id="Niveau">
                  <option value="Primère">Primère</option>
                  <option value="Moyene">Moyene</option>
                  <option value="Secondaire">Secondaire</option>
                  <option value="Universitaire">Universitaire</option>
               </select>
           </div>
           <div class="inputfield">
               <label>Filiere</label>
               <select name="filiere"  id="filiere">
                  <option value="Initiale">Initiale</option>
                  <option value="Continue">Continue</option>
                  <option value="Professionnelle">Professionnelle</option>
                  <option value="En alternance">En alternance</option>
                  <option value="à distance">à distance</option>
                  <option value="En ligne">En ligne</option>
                  <option value="Pour adulte">Pour adulte</option>
               </select>
           </div>
           <div class="inputfield">
               <label>Diplôme</label>
               <select name="diplome"  id="diplome">
                  <option value="Brevet professionelle">Brevet professionelle</option>
                  <option value="Certaficat d'apitude proffesionnelle">Certaficat d'apitude proffesionnelle</option>
                  <option value="Brevet de technicien supérieur">Brevet de technicien supérieur</option>
                  <option value="Classe préparatoire aux concours">Classe préparatoire aux concours</option>
                  <option value="Bachelor">Bachelor</option>
                  <option value="Licence">Licence</option>
                  <option value="Diplôme d'ingénieur">Diplôme d'ingénieur</option>
                  <option value="Master 2">Master 2</option>
               </select>
           </div>
           <div class="inputfield">
               <label>Région</label>
               <select name="region"  id="region">
                  <option value="Centre">Centre</option>
                  <option value="Région Est">Région Est</option>
                  <option value="Région ouest">Région ouest</option>
                  <option value="Le sud algérien">Le sud algérien</option>
               </select>
           </div>
           <div class="inputfield">
               <label>Ville</label>
               <select name="ville"  id="ville">
                  <option value="Alger">Alger</option>
                  <option value="Constantine">Constantine</option>
                  <option value="Annaba">Annaba</option>
                  <option value="Oran">Oran</option>
                  <option value="Tlemcen">Tlemcen</option>
                  <option value="El Oued">El Oued</option>
                  <option value="Tamanrasset">Tamanrasset</option>
                  <option value="Adrar">Adrar</option>

               </select>
           </div>
           
           
           <div class="inputfield">
                <label>Votre Autorisation</label>
                <input type="file" id="file" name="Autorisation">
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