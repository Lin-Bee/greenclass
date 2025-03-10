import { useState } from 'react'
import './App.css'
import { Route, Routes } from 'react-router-dom'
import Emp from './components/Emp'
import Header from './components/Header'

function App() {

  return (
    <>
      <Header/>
      <Routes>
        <Route path="/" element={<Emp/>}/>
      </Routes>
    </>
  )
}

export default App
