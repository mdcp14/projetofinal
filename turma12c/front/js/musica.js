function carregardash() {
    fetch("http://localhost:8080/totallancamento" + ducument.getElementById("cmbartistas").value)
        .then(res => res.json())
        .then(res => {
            document.getElementById("dados").innerHTML =
                document.getElementById("cmbartistas").options[document.getElementById("cmbartistas").selectedIndex].text +
                "<br> Total de Lançamentos: " + res;
        });

}



function carregarartistas() {
    fetch("http://localhost:8080/artistas")
        .then(res => res.json())
        .then(res => preenchercombo(res));
}

function preenchercombo(lista) {

    var saida = "";
    for (contador = 0; contador < lista.length; contador++) {
        saida +=
            "<option value='" + lista[contador].id + "'>" + lista[contador].nomeArtistico + "</option>";
    }
    document.getElementById("cmbartistas").innerHTML = saida;

}

function gravar() {
    var musicajson = {
        titulo: document.getElementById("txttitulo").value,
        lancamento: document.getElementById("cmblancamento").value,
        cadastro: document.getElementById("txtcadastro").value,
        artista: {
            id: document.getElementById("cmbartistas").value
        }
    };
    alert("titulo: " +   musicajson.titulo + "\n" +
        "lancamento: " + musicajson.lancamento + "\n" +
        "cadatro: " +    musicajson.cadastro + "\n" +
        "id: " +         musicajson.artista.id)

    var pacote = {
        method: "POST",
        body: JSON.stringify(musicajson),
        headers: {
            "Content-type": "application/json"
        }
    };

    fetch("http://localhost:8080/novamusica", pacote)
        .then((res) => res.json())
        .then((res) => {
            window.alert("Gravado com sucesso");
            window.location = "musicas.html";
        })
        .catch((err) => {
            window.alert("Não foi possível cadastrar.");
        });
}