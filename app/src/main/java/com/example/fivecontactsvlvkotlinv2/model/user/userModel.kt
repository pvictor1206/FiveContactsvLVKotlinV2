package com.example.fivecontactsvlvkotlinv2.model.user

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

internal class UserModel {
    var id: String? = null
    var nome: String? = null
    var email: String? = null
    var isLogar = false

    constructor() {}
    constructor(id: String?, nome: String?, email: String?, logar: Boolean) {
        this.id = id
        this.nome = nome
        this.email = email
        isLogar = logar
    }

    fun salvar() {
        val reference = FirebaseDatabase.getInstance().reference
        reference.child("usuarios").child(id!!).setValue(this)
    }
}