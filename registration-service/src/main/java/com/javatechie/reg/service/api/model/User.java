package com.javatechie.reg.service.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="USER_REG_TBL")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String type;
    private int cpf;
    private int cnpj;
    private int rg;
    private int ies;
    private Date dataRegistry;
    private Boolean active;
    private int telNumber;
}
