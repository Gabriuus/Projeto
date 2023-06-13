package Dados;

public class Login
{
    private String email;
    private String senha;
   

    public Login() 
    {
        this.email=null;
        this.senha=null;
          
    }

    public Login(String nome, String senha)
    {
        this.email = nome;
        this.senha = senha;
         
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String nome)
    {
        this.email = nome;
    }

    public String getSenha()
    {
        return senha;
    }
    
    public void setSenha(String senha)
    {
        this.senha = senha;
    }
    
}