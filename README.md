# StoreSystem
### Sumary
1. [Classes](https://github.com/MateusDelatorre/StoreSystem#classes)
## Classes
### Pessoas
#### atributos
- protected name : String<br>
- protected age: String<br>
- protected CPF: String
####  Metodos
- Pessoa(nome, idade, cpf)

### Funcionario
#### **parent**
Pessoa
#### **atributos**
- protected Salario : double<br>
#### **Metodos**
- Funcionario(salario)

### Cliente
#### **parent**
Pessoa
#### **atributos**
protected Senioridade : String<br>
protected TotalComprado: String<br>
#### **Metodos**
Pessoa(nome, idade, cpf)

### Vendedores
#### **parent**
Funcionario
#### **atributos**
- protected vendas_no_mes : double<br>
#### **Metodos**
- Vendedores(vendas_no_mes)

### Gerente
#### **parent**
Funcionario
#### **atributos**
- protected lucro_do_mes : double<br>
#### **Metodos**
- Vendedores(vendas_no_mes)

### Caixas
#### **parent**
Funcionario
#### **atributos**
- protected vendas_no_mes : double<br>
#### **Metodos**
- Vendedores(vendas_no_mes)

### Auditores
#### **parent**
Funcionario
#### **atributos**
- protected vendas_no_mes : double<br>
#### **Metodos**
- Vendedores(vendas_no_mes)

interface
