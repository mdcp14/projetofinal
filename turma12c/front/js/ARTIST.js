function exibirartistas(){
    fetch("http://localhost:8080/artistas")
    .then(res => res.json())
    .then(res => preenchercombo(res));
}

function preenchercombo(lista){

    var saida = "";
    for (contador=0;contador<lista.length;contador++){
        saida += 
        "<option value='" + lista[contador].id + "'>" + lista[contador].nomeArtistico + "</option>";
    }
    document.getElementById("cmbartistas").innerHTML=saida;

}