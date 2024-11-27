import React, { useState } from "react";
import axios from "axios"; // Para fazer requisições HTTP

function Login() {
  // Estado para armazenar o email, a senha e a mensagem de erro
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [errorMessage, setErrorMessage] = useState("");

  // Função para tratar o submit do formulário
  const handleSubmit = async (event) => {
    event.preventDefault(); // Prevenir o comportamento padrão de envio do formulário

    if (!email || !password) {
      setErrorMessage("Por favor, preencha todos os campos!");
      return;
    }

    try {
      // Enviando os dados do login para o back-end (API do Spring Boot)
      const response = await axios.post("http://localhost:8080/api/login", {
        email,
        password
      });

      // Se o login for bem-sucedido, armazenamos o token JWT no localStorage
      localStorage.setItem("jwtToken", response.data.token);

      // Exibe um sucesso no login, ou pode redirecionar para outra página
      console.log("Login bem-sucedido!", response.data.token);

      // Redireciona ou exibe uma mensagem de sucesso, dependendo da sua lógica
    } catch (error) {
      setErrorMessage("E-mail ou senha incorretos!");
      console.error("Erro ao tentar fazer login", error);
    }
  };

  return (
    <div>
      <h2>Login</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Email</label>
          <input
            type="email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
            required
          />
        </div>
        <div>
          <label>Senha</label>
          <input
            type="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            required
          />
        </div>
        <button type="submit">Entrar</button>
      </form>
      {errorMessage && <p style={{ color: "red" }}>{errorMessage}</p>}
    </div>
  );
}

export default Login;
