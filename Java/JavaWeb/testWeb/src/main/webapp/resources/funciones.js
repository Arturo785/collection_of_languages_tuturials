

function validateForm(form){
    const usuario = form.userKey
    if(usuario.value === "" || usuario.value === "Escribir usuario" ){
        alert("Debe proporcionar un nombre de usuario")
        usuario.focus()
        usuario.select()
        return false
    }

    const password = form.passwordKey
    if(password.value === "" || password.value.length < 3 ){
        alert("Debe proporcionar un password de almenos 3 caracteres")
        password.focus()
        password.select()
        return false
    }

    const tecnologias = form.tecnologiaKey;
    let checkSelect = false

    tecnologias.forEach(item => {
        if(item.checked){
            checkSelect = true
        }
    })

    if(!checkSelect){
        alert("Debe seleccionar una tecnologia")
        return false
    }

    const genre = form.genreKey
    let radioSelected = false

    genre.forEach( item => {
        if(item.checked){
            radioSelected = true
        }
    })

    if(!radioSelected){
        alert("Debe seleccionar un genero")
        return false
    }

    const ocupation = form.ocupationKey


    if(ocupation.value === ""){
        alert("Debe seleccionar una ocupacion")
        return false
    }

    alert("Success")
    return true

}