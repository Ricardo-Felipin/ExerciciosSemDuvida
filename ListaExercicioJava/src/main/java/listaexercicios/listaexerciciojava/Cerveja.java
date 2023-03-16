/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package listaexercicios.listaexerciciojava;



/**

 */


public class Cerveja {
    private static int ultimoCodigo = 0;
    private final int codigo;
    public String marca;
    public String tipo;
    public double teorAlcoolico;
    public double preco;

    public Cerveja(String marca) {
        this.marca = marca;
        this.codigo = ++ultimoCodigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }
}
