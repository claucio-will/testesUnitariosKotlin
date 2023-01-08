fun portaria(idade: Int, tpConvite: String, cod: String): String {

    //primeiro teste
    if (idade < 18) {
        return "Negado."
    }

    //Segundo teste
    if (tpConvite != "") {
        val tipoConvite = tpConvite.lowercase()

        //Terceiro teste
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            return "Negado."
        }

        //Quarto teste
        if (cod != "") {
            val codigo = cod.lowercase()
            return if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                "Welcome."
            } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")) {
                "Welcome."
            } else {
                "Negado."
            }
        }
    }
    return "Negado."
}