/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Maria Emanuelli
 */
@Embeddable
public class EmprestimoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_cliente")
    private int idCliente;
    @Basic(optional = false)
    @Column(name = "id_livro")
    private int idLivro;
    @Basic(optional = false)
    @Column(name = "data_retirada")
    @Temporal(TemporalType.DATE)
    private Date dataRetirada;

    public EmprestimoPK() {
    }

    public EmprestimoPK(int idCliente, int idLivro, Date dataRetirada) {
        this.idCliente = idCliente;
        this.idLivro = idLivro;
        this.dataRetirada = dataRetirada;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCliente;
        hash += (int) idLivro;
        hash += (dataRetirada != null ? dataRetirada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmprestimoPK)) {
            return false;
        }
        EmprestimoPK other = (EmprestimoPK) object;
        if (this.idCliente != other.idCliente) {
            return false;
        }
        if (this.idLivro != other.idLivro) {
            return false;
        }
        if ((this.dataRetirada == null && other.dataRetirada != null) || (this.dataRetirada != null && !this.dataRetirada.equals(other.dataRetirada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.EmprestimoPK[ idCliente=" + idCliente + ", idLivro=" + idLivro + ", dataRetirada=" + dataRetirada + " ]";
    }
    
}
