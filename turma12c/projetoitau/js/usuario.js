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

function salvar() {
    var usuariostr = localStorage.getItem("userlogado");
    if (usuariostr == null) {
        window.location = "./login.html";
    } else {
        var usuariojson = {

            nome:  document.getElementById("txtnome").value,
            email: document.getElementById("txtemail").value,
            senha: document.getElementById("txtsenha").value,
            foto:  document.getElementById("txtfoto").value,
        };
        var pacote = {
            method: "POST",
            body: JSON.stringify(usuariojson),
            headers: {
                "Content-type": "application/json"
            }
        };

        fetch("http://localhost:8080/usuario", pacote)
            .then((res) => res.json())
            .then((res) => {
                window.alert("Usuario Criado");
                window.location = "./login.html";
            })
            .catch((err) => {
                window.alert("Erro na Criação");
                window.location = "./novousuario.html";
            });

    }
}



function logar() {

    var userjson = {
        "email": document.getElementById("txtemail").value,
        "senha": document.getElementById("txtsenha").value
    };

    var pacote = {
        method: "POST",
        body: JSON.stringify(userjson),
        headers: {
            "Content-type": "application/json"
        }
    };

    fetch("http://localhost:8080/login", pacote)
        .then(res => res.json())
        .then(res => {
            localStorage.setItem("userlogado", JSON.stringify(res));
            window.location = "usuario.html";
        })
        .catch(err => {
            window.alert("Login Inválido");
        });



}