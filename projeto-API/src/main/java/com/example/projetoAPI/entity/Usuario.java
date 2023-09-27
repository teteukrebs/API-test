package com.example.projetoAPI.entity;
import jakarta.persistence.*;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome", length = 200, nullable = true)
    private String nome;
    @Column(name = "email", length = 50, nullable = true)
    private String email;
    @Column(name = "senha", columnDefinition = "TEXT", nullable = true)
    private String senha;
    @Column(name = "telefone", length = 15, nullable = true)
    private Integer telefone;

}
