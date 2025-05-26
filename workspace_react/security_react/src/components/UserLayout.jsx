import React from 'react'
import { Link, Outlet } from 'react-router'
import Header from './Header'

const UserLayout = () => {
  return (
    <div>
      <div>
        <h2>UserLayout</h2>
        <Header />
      </div>
      <div>
        <Outlet />
      </div>
    </div>
  )
}

export default UserLayout