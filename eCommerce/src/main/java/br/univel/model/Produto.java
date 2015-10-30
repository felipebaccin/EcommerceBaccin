package br.univel.model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;
import java.lang.Override;

@Entity
public class Produto implements Serializable
{

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", updatable = false, nullable = false)
   private Long id;
   @Version
   @Column(name = "version")
   private int version;

   @Column
   private String Nome;

   @Column
   private String descricao;

   @Column
   private String imagemProduto;

   @Column
   private String marca;

   @Column
   private double preco;

   public Long getId()
   {
      return this.id;
   }

   public void setId(final Long id)
   {
      this.id = id;
   }

   public int getVersion()
   {
      return this.version;
   }

   public void setVersion(final int version)
   {
      this.version = version;
   }

   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
      {
         return true;
      }
      if (!(obj instanceof Produto))
      {
         return false;
      }
      Produto other = (Produto) obj;
      if (id != null)
      {
         if (!id.equals(other.id))
         {
            return false;
         }
      }
      return true;
   }

   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((id == null) ? 0 : id.hashCode());
      return result;
   }

   public String getNome()
   {
      return Nome;
   }

   public void setNome(String Nome)
   {
      this.Nome = Nome;
   }

   public String getDescricao()
   {
      return descricao;
   }

   public void setDescricao(String descricao)
   {
      this.descricao = descricao;
   }

   public String getImagemProduto()
   {
      return imagemProduto;
   }

   public void setImagemProduto(String imagemProduto)
   {
      this.imagemProduto = imagemProduto;
   }

   public String getMarca()
   {
      return marca;
   }

   public void setMarca(String marca)
   {
      this.marca = marca;
   }

   public double getPreco()
   {
      return preco;
   }

   public void setPreco(double preco)
   {
      this.preco = preco;
   }

   @Override
   public String toString()
   {
      String result = getClass().getSimpleName() + " ";
      if (Nome != null && !Nome.trim().isEmpty())
         result += "Nome: " + Nome;
      if (descricao != null && !descricao.trim().isEmpty())
         result += ", descricao: " + descricao;
      if (imagemProduto != null && !imagemProduto.trim().isEmpty())
         result += ", imagemProduto: " + imagemProduto;
      if (marca != null && !marca.trim().isEmpty())
         result += ", marca: " + marca;
      result += ", preco: " + preco;
      return result;
   }
}