function exibirusuario() {
    var usuariostr = localStorage.getItem("userlogado");
    if (usuariostr == null) {
        window.location = "login.html";
    } else {
        var usuariojson = JSON.parse(usuariostr);
        document.getElementById("dados").innerHTML =
            "<h4>Usuario: " + usuariojson.nome + "<br>" +
            "Email: " + usuariojson.email + "(" + usuariojson.id + ") </h4>";

        document.getElementById("foto").innerHTML =
            "<img src=images/" + usuariojson.foto + ">";


    }

}



function logar() {
    var userjson = validateUsernameInput();
  
    var pacote = {
      method: "POST",
      body: JSON.stringify(userjson),
      headers: {
        "Content-type": "application/json",
      },
    };
  
    fetch("http://localhost:8080/login", pacote)
      .then((res) => res.json())
      .then((res) => {
        localStorage.setItem("loggeduser", JSON.stringify(res));
        window.location = "usuario.html";
      })
      .catch((err) => {
        window.alert("Login inválido");
        window.location = "login.html";
      });
  }
  
  function validateUsernameInput() {
    const username = document.getElementById("txtusername").value;
    const senha = document.getElementById("txtsenha").value;
    if(username.indexOf("@") > -1) {
      return ({
        "email": username,
        "senha": senha
      })
    } else {
      return ({
        "racf": username,
        "senha": senha
      })
    }
  }
  