import React from 'react'
import Job from './Job'
import Dept from './Dept'

const Emp = () => {
  return (
    <div className="inner">
      <div className="flex">
        <Dept/>
        <Job/>
      </div>
    </div>
  )
}

export default Emp