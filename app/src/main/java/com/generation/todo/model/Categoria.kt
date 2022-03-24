package com.generation.todo.model

data class Categoria (
    //Criando modelo de objeto de acordo com o da API

val id: Long, var descricao: String?, var tarefa: List<Tarefa>?

        ) {
}