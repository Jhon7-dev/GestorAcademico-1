package entities;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String nome;
    private Departamento departamentos[];
    private  int cont;
    private int max;

   // List<Departamento> departamentos;

    public Universidade(String nome) {
        this.nome = nome;
        cont = 0;
        max = 1000;
        departamentos = new Departamento[max];
    }
    public Departamento buscarPornome(String nome){
        for (int i = 0;i<cont;i++){
            if (departamentos[i].getNome().equals(nome))
                return departamentos[i];
        }
        return null;
    }
    public Departamento buscarDepcod(String cod){ //
        for(int i =0;i<cont;i++){
            if(departamentos [i].getCodigo().equals(cod)){
                return departamentos[i];
            }
        }
        return null;
    }
    public void exibir(){
        System.out.println("Universidade: " + nome);
        System.out.println("Quantidade de Departamentos: " + cont);
        for (int i = 0; i<cont;i++){
            departamentos[i].exibir();
            System.out.println("");
        }
    }
    public int getQtsDepartamento(){
        return cont;
    }
    public void addDepartamento (Departamento d){
        if(cont < max){
            departamentos[cont] = d;
            cont++;
        }
    }

    public void listarDepartamento(){
        for(Departamento depart : departamentos){
            System.out.println(depart);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento listarDepartamentos(String nome){
        for (Departamento depart : departamentos){
            if(depart.getNome().equalsIgnoreCase(nome)){
                return depart;
            }
        }
        return null;
    }
    public void deptoFuncFaixaSalario(double ini, double fin){
    for(int i = 0; i<cont; i++){
            if(departamentos[i].deptoFuncFaixaSalario(ini,fin)){
                System.out.println(" -- " + departamentos[i].getNome());
            }
       }
    }
    public Funcionario buscarFuncNome(String nome){
        Funcionario f = null;
        for(int i = 0; i < cont; i ++){
            f = departamentos[i].buscarFuncNome(nome);
            if(f!=null){
                return f;
            }
        }
        return null;
    }
    public void funcFaixaSalario(double ini,double fin){
        for(int i = 0;i<cont;i++){
            departamentos[i].funcFaixaSalario(ini,fin);
        }
    }
    public void exibirDeptos(){
        for (int i = 0;i<cont;i++){
            System.out.println(" --- Cód: "  + departamentos[i].getCodigo() + " Nome: " + departamentos[i].getNome());

        }
    }
    public void deptoGastoTotal(double ini,double fin){
        for(int i = 0; i<cont;i++){
            double gasto = departamentos[i].gastoTotal();
            if(ini<=gasto && gasto <= fin){
                System.out.println(" --- " + departamentos[i].getNome());
            }
        }
    }
    public void exibirFuncionarios(){
        for(int i = 0; i<cont;i++){
            departamentos[i].exibirFuncionarios();
        }
    }
    public void exibirTecnico() {
        for(int i = 0;i<cont;i++){
            departamentos[i].exibir();
        }
    }
    public void exibirDocentes() {
        for(int i = 0;i<cont;i++){
            departamentos[i].exibirDocentes();
        }
    }
}
