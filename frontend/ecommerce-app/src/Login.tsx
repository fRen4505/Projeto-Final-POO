import { useState } from 'react'

import './Login.css'
import Logo from "./assets/logo.svg";

function App() {
  const [count, setCount] = useState(0)

  return (
    <div className="login-container">
      <div className="login-form-container">
        <h2>Login</h2>
        <div className="login-form">
          <input type="text" placeholder="Email" />
          <input type="password" placeholder="Senha" />
          <button type="submit">Log in</button>
        </div>
        <p className="signup-prompt">
          Não tem conta? <a href="/signup">Cadastre-se</a>
        </p>
      </div>

      <div className="container-login-image-container">
        <div className="login-image-container">
          <img src={Logo} alt='Logotipo do App' />
        </div>
      </div>
    </div>
  )
}

export default App
