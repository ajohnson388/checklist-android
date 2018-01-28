package com.ajohnson.list.models

/**
 * Created by ajohnson on 1/27/18.
 */
data class DeleteTaskRequest(val index: Int)

data class DeleteTaskResponse(val errorMessage: String? = null)