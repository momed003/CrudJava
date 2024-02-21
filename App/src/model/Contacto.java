/*
numeroTel int not null primary key,
nomeCompleto varchar (100),
idade int,
dataRegistro date  */
package model;

import java.util.Date;

/**
 *
 * @author mmed003
 */
public class Contacto {
    private int numeroTel;
    private String nomeCompleto;
    private int idade;
    private Date dataRegistro;

    public int getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
}
