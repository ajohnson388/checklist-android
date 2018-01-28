package com.ajohnson.list.models

/**
 * Created by ajohnson on 1/27/18.
 */
data class CheckTaskRequest(val index: Int, val isChecked: Boolean = true)

data class CheckTaskResponse(val errorMessage: String? = null)