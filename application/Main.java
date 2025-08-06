package aplication;

import entities.*;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Universidade uni = new Universidade("UniProgram");
        Departamento depto;
        FuncionarioTecnico ft;
        FuncionarioDocente fd;
        Funcionario func;
        double ini, fin;

        int opcao;
        do {

            System.out.println("BEM VINDO AO MENU");
            System.out.println("======== Faculdade UniProgram ========");
            System.out.println("1 - Cadastrar Departamento");
            System.out.println("2 - Cadastrar Funcionario Técnico");
            System.out.println("3 - Cadastrar Funcionario Docente");
            System.out.println("4 - Buscar Departamento por Nome");
            System.out.println("5 - Buscar Funcionário por Nome");
            System.out.println("6 - Listar Departamentos com Funcionários com faixa salarial específica");
            System.out.println("7 - Listar Funcionários com Faixa Salarial Específica");
            System.out.println("8 - Listar Departamentos cujo gasto total está entre uma Faixa de Valores Específicas");
            System.out.println("9 - Listar todos os funcionários da Universidade, UniProgram ");
            System.out.println("10 - Listar todos os departamentos da Universidade ");
            System.out.println("11 - Listar todos os departamentos da universidade e seus funcionários");
            System.out.println("12 - Listar todos Funcionários Docente");
            System.out.println("13 - Listar todos Funcionários Técnico");
            System.out.println("0 - Sair");
            System.out.print("Digite Opção: ");
            opcao = Integer.parseInt(scn.nextLine());

            switch (opcao) {
                case 1: {
                    System.out.println("Bem-Vindo ao Cadastro de Departamento");
                    System.out.println("Código de Departamento: ");
                    String codigo = scn.nextLine();
                    System.out.println("Nome do Departamento: ");
                    String nome = scn.nextLine();
                    depto = new Departamento(codigo, nome);
                    uni.addDepartamento(depto);
                    break;
                }
                case 2: {

                    System.out.print("Código do Departamento: ");
                    String codigo = scn.nextLine();
                    depto = uni.buscarDepcod(codigo);

                    if (depto != null) {

                        System.out.println("Bem-Vindo ao Cadastro de Funcionários Técnicos");
                        System.out.print("Nome do funcionário: ");
                        String nome = scn.nextLine();
                        System.out.print("Código do Técnico: ");
                        String cod = scn.nextLine();
                        System.out.print("Salário: R$ ");
                        double salario = scn.nextDouble();
                        System.out.print("Digite seu Nível: ");
                        String nivel = scn.nextLine();
                        ft = new FuncionarioTecnico(codigo, nome, salario, nivel);
                        depto.addFuncionario(ft);

                    } else {
                        System.out.println("Departamento não encontrado.");
                    }
                    break;
                }
                case 3: {

                    System.out.print("Código do Departamento: ");
                    String codigo = scn.nextLine();
                    depto = uni.buscarDepcod(codigo);

                    if (depto != null) {

                        System.out.println("Bem-Vindo ao Cadastro de Funcionários Docentes");
                        System.out.print("Nome do funcionário: ");
                        String nome = scn.nextLine();
                        System.out.print("Código do Técnico: ");
                        String cod = scn.nextLine();
                        System.out.print("Salário: R$ ");
                        double salario = scn.nextDouble();
                        System.out.print("Titulação: ");
                        String titulacao = scn.nextLine();
                        fd = new FuncionarioDocente(codigo, nome, salario, titulacao);
                        depto.addFuncionario(fd);

                    } else {
                        System.out.println("Departamento não encontrado.");
                    }

                    break;

                }
                case 4: {
                    System.out.println("Nome do Departamento: ");
                    String nome = scn.nextLine();
                    depto = uni.buscarPornome(nome);
                    if (depto != null) {
                        depto.exibir();
                    } else {
                        System.out.println("Departamento não Cadastrado!");
                    }
                    break;
                }
                case 5: {

                    System.out.println("Nome do Funcionário: ");
                    String nome = scn.nextLine();
                    func = uni.buscarFuncNome(nome);
                    if (func != null) {
                        func.exibirRelatorio();
                    } else {
                        System.out.println("Funcionário não Cadastrado!");
                    }
                    break;
                }
                case 6: {
                    System.out.println("Salário inicial: ");
                    ini = Double.parseDouble(scn.nextLine());
                    System.out.println("Final inicial: ");
                    fin = Double.parseDouble(scn.nextLine());
                    uni.deptoFuncFaixaSalario(ini, fin);
                    break;
                }
                case 7: {
                    System.out.println("Salário inicial: ");
                    ini = Double.parseDouble(scn.nextLine());
                    System.out.println("Final inicial: ");
                    fin = Double.parseDouble(scn.nextLine());
                    uni.funcFaixaSalario(ini, fin);
                    break;
                }
                case 8: {
                    System.out.println("Salário inicial: ");
                    ini = Double.parseDouble(scn.nextLine());
                    System.out.println("Final inicial: ");
                    fin = Double.parseDouble(scn.nextLine());
                    uni.deptoGastoTotal(ini, fin);
                    break;
                }
                case 9: {
                    uni.exibirFuncionarios();
                    break;
                }
                case 10: {
                    uni.exibirDeptos();
                    break;
                }
                case 11: {
                    uni.exibir();
                    break;
                }
                case 12: {
                    uni.exibirDocentes();
                    break;
                }
                case 13: {
                    uni.exibirTecnico();
                    break;
                }
            }
        } while (opcao != 0) ;

    }
}
