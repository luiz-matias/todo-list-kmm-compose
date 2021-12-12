package com.luizmatias.todoapp.domain.usecases.taskmanagement

import com.luizmatias.todoapp.domain.entities.Task
import com.luizmatias.todoapp.domain.repositories.TaskManagementRepository
import com.luizmatias.todoapp.domain.repositories.TaskRepository
import com.luizmatias.todoapp.utils.resultHandler
import kotlinx.coroutines.CoroutineDispatcher

class CompleteTaskUseCase(
    private val coroutineDispatcher: CoroutineDispatcher,
    private val taskManagementRepository: TaskManagementRepository
) {

    suspend operator fun invoke(task: Task) = resultHandler(coroutineDispatcher) {
        taskManagementRepository.completeTask(task)
    }

}