package com.ajohnson.list.models

/**
 * Created by ajohnson on 1/27/18.
 */
data class UpdateListNameRequest(val name: String)

data class UpdateListNameResponse(val errorMessage: String? = null)