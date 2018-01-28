package com.ajohnson.list.models

/**
 * Created by ajohnson on 1/27/18.
 */
data class AddTaskRequest(val description: String)

data class AddTaskResponse(val errorMessage: String? = null)