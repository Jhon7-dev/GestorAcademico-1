# GestorAcademico-1
----- Sistema de Gestão Universitária - UniProgram -----

Este é um projeto desenvolvido em Java com foco na prática de conceitos fundamentais da Programação Orientada a Objetos (POO) como :
-- herança
-- encapsulamento 
-- composição de classes

A aplicação simula o gerenciamento de uma universidade fictícia chamada **UniProgram**, permitindo o cadastro e a consulta de **departamentos** e **funcionários técnicos/docentes**, 
além de relatórios personalizados por faixa salarial e estrutura hierárquica.

-----  Objetivos do Projeto ------

- Praticar os conceitos de POO na linguagem Java
- Criar menus interativos em console
- Simular um cenário realista de cadastro e gerenciamento de dados
- Organizar bem as entidades com base em um diagrama de classes



----- Tecnologias Utilizadas -----

- Java 17
- Scanner (entrada de dados via terminal)
- Paradigma de Programação Orientada a Objetos

 

----- 📋 Funcionalidades -----

- Cadastro de departamentos
- Cadastro de funcionários (técnicos e docentes)
- Busca por nome de departamento ou funcionário
- Listagem de:
  - Funcionários por faixa salarial
  - Departamentos por gasto total
  - Todos os departamentos e seus funcionários
  - Somente técnicos ou somente docentes

---

----- Estrutura do Projeto -----

- `aplication.Main`: Classe principal com o menu de opções
- `entities.Universidade`: Armazena e gerencia departamentos e funcionários
- `entities.Departamento`: Classe que representa um departamento
- `entities.Funcionario`: Classe abstrata base
  - `FuncionarioTecnico`
  - `FuncionarioDocente`

---
