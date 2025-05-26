import './App.css'
import { Link, Route, Routes } from 'react-router'
import UserLayout from './components/UserLayout'
import Login from './components/Login'
import Join from './components/Join'
import Admin from './components/Admin'
import UserPage from './components/UserPage'
import ProtectedRoute from './components/ProtectedRoute'
import ProtectedAdminRoute from './components/ProtectedAdminRoute'
import Header from './components/Header'
import Menu from './components/Menu'
import Anyone from './components/Anyone'


function App() {

  return (
    <div>
      <Header />
      <Menu />

      <Routes>
          <Route path='' element={<div>메인페이지</div>}/>
          <Route path='/login' element={<Login />}/>
          <Route path='/join' element={<Join />}/>
          <Route path='/anyone' element={<Anyone />}/>
          <Route 
            path='/user' 
            element={<ProtectedRoute><UserPage/></ProtectedRoute>} //관리자 사용자 누가쓸거니
          />
          <Route 
            path='/admin' 
            element={<ProtectedAdminRoute><Admin /></ProtectedAdminRoute>}
          />
          
      </Routes>
    </div>
  )
}

export default App


// <div>
//       counter : {counter}
//       <button type='button' onClick={e => dispatch(increase())}>+1 증가</button>
//       <button type='button' onClick={e => dispatch(decrease())}>-1 감소</button>
//       <button type='button' onClick={e => dispatch(handleCount(5))}>count 값 변경</button>
//       <br />
//       name : {name.name}
//       <button type='button' onClick={e => dispatch(handleName('bbb'))}>name 변경</button>
//     </div>

//       <Routes>
//         <Route path='/' element={<UserLayout />}>
//           <Route path='' element={<div>메인페이지</div>}/>
//           <Route path='login' element={<Login />}/>
//           <Route path='join' element={<Join />}/>
//           <Route 
//             path='admin' 
//             element={<ProtectedAdminRoute><Admin /></ProtectedAdminRoute>}
//           />
//           <Route 
//             path='user' 
//             element={<ProtectedRoute><UserPage/></ProtectedRoute>}
//           />
//         </Route>
//       </Routes>