package com.github.gabrielbaron01

data class PraiaModel(val nome: String, val cidade: String, val estado: String,val onRemove: (PraiaModel) -> Unit
)