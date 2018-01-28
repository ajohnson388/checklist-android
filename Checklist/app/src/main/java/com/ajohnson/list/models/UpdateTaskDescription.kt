package com.ajohnson.list.models

/**
 * Created by ajohnson on 1/27/18.
 */
data class UpdateTaskDescriptionRequest(val index: Int, val description: String)

data class UpdateTaskDescriptionResponse(val errorMessage: String? = null)