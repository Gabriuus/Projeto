package Dados;

public class Pessoa
{
    private String nome;
    private String sobrenome;
    private String telefone;
    private String email;
    private String cpf;
    private String data;
    
    

    public Pessoa() 
    {
        this.nome=null;
        this.sobrenome=null;
        this.telefone=null;
        this.email=null; 
        this.cpf=null;
        this.data=null;
        
    }

    public Pessoa(String nome, String endereco, String telefone, String email, String Cpf, String Nascimento)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;      
        this.data= data;
        this.sobrenome= sobrenome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCpf()
    {
        return cpf;
    }
    
    public void setCpf(String cpf)
    {
        this.cpf= cpf;
    }
    
    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    } 
    
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
       
    } 
    public String getSobrenome()
    {
           return sobrenome;
    
    }
    public void setSobrenome (String sobrenome)
    {
    this.sobrenome= sobrenome;
    
    }
    public String getData(){
    return data;
    
   }
    public void setNascimento(String Nascimento)
    {
    this.data = data;
    }
    
}