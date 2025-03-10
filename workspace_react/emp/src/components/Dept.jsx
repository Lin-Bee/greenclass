import axios from 'axios'
import React, { useEffect, useState } from 'react'
import DeptList from './DeptList';
import DeptWrite from './DeptWrite';

const Dept = () => {

  return (
    <>
      <div className="inner">
        <DeptWrite/>
        <DeptList/>
      </div>
    </>
  )
}

export default Dept