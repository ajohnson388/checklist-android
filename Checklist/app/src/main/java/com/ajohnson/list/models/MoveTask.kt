package com.ajohnson.list.models

/**
 * Created by ajohnson on 1/27/18.
 */
data class MoveTaskRequest(val fromIndex: Int,
                           val toIndex: Int,
                           val shouldSave: Boolean = true)

data class MoveTaskResponse(val errorMessage: String? = null)