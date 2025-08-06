package entities;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private String codigo;
    private Funcionario funcionarios[];
    private int cont;
    private int max;

    //  private List<Funcionario> funcionarios; // Essa lista agrega o departamento ao funcionário, ou seja , relação de AGREGAÇÃO.

    public Departamento(String nome) {
        this.nome = nome;
        max = 1000;
        cont = 0;
        funcionarios = new Funcionario[max];
    }

    public Departamento(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        cont = 0;
        funcionarios = new Funcionario[max];
    }

    public void addFuncionario(Funcionario f) { // adicionar funcionário
        if (cont < max) {
            funcionarios[cont] = f;
            cont++;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCont() {
        return cont;
    }

    public int getQtdFuncionario() {
        return cont;
    }

    public void exibir() {
        System.out.println("Código: " + getCodigo() + " Nome: " + getNome());
        for (int i = 0; i <= cont; i++) {
            funcionarios[i].exibirRelatorio();
        }
    }

    public void exibirFuncionarios(){
        for (int i = 0; i<cont;i++){
            funcionarios[i].exibirRelatorio();
        }
    }

    public boolean deptoFuncFaixaSalario(double ini, double fin) {
        for (int i = 0; i < cont; i++) {
            double salario = funcionarios[i].calcularSalario();
            if (ini <= salario && salario <= fin) {
                return true;
            }
        }
        return false;
    }

    public Funcionario buscarFuncNome(String nome) {
        for (int i = 0; i < cont; i++) {
            if (funcionarios[i].getNome().equals(nome)) {
                return funcionarios[i];
            }
        }
        return null;
    }

    public void funcFaixaSalario(double ini,double fin){
        for(int i = 0;i<cont;i++){
            double salario = funcionarios[i].calcularSalario() ;
            if (ini<=salario && salario<=fin){
                System.out.println(" -- " + funcionarios[i].getNome());
            }
        }
    }
    public double gastoTotal(){
        double soma = 0;
        for (int i = 0;i<cont;i++){
            soma = soma + funcionarios[i].calcularSalario(); //VAI SOMAR TODOS OS SALÁRIOS DOS FUNCIONARIOS DO DEPARTAMENTO
        }
        return soma;
        }
     public void exibirTecnico() {
        for(int i = 0;i<cont;i++){
            if (funcionarios[i] instanceof FuncionarioTecnico){
                funcionarios[i].exibirRelatorio();
            }
        }
     }
     public void exibirDocentes(){
        for (int i = 0; i<cont;i++){
            if (funcionarios[i] instanceof FuncionarioDocente){
                funcionarios[i].exibirRelatorio();
            }
        }
     }
}

