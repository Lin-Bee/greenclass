
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import { BrowserRouter, Router } from 'react-router-dom'

createRoot(document.getElementById('root')).render(
    // 이제 당신은 라우트가 사용이가능하다 이말이에요
    <BrowserRouter> 
    <App />
    </BrowserRouter>
)
