package com.generation.todo.api

import com.generation.todo.model.Categoria
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    //, a anotação @GET mapeia solicitações HTTP GET para tratamentos específicos, ou
    //seja, indica que o método listCategoria() responderá à requisições HTTP GET, enviadas ao
    //endereço

    @GET ("categoria")

    /*marcamos a função como suspend indicando que ela só poderá rodar dentro de
    uma Corrotina. Essa função, ainda retorna um Response (que será o objeto responsável por
    guardar a resposta da API) do tipo Lis  (que armazenará os objetos da resposta em sí)

     */
    suspend fun listCategoria(): Response<List<Categoria>>
}