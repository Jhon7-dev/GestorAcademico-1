package entities;

public abstract  class Funcionario {
    private String codigo;
    private String nome;
    private double salario;
   // private static int contador = 0;



    public Funcionario(String codigo,String nome,double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() {

    }

    public double calcularSalario(){
        return salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

    public abstract  void exibirRelatorio();
    }
