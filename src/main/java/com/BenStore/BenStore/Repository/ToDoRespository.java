package com.BenStore.BenStore.Repository;

import com.BenStore.BenStore.Model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRespository extends JpaRepository <Clientes, Long> {
}
