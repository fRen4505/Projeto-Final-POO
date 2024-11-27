package ruahma.renan.task_management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name_task;

    private String descriptionTask;

    private boolean _isComplete;

     // Relacionamento com o Project
    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)  // Define a coluna de chave estrangeira
    private Project project;  // Representando a relação com o Project

    
}