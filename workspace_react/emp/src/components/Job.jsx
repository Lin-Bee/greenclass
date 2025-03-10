import React from 'react'
import JobWrite from './JobWrite'
import JobList from './JobList'

const Job = () => {
  return (
    <>
    <div className="inner">
      <JobWrite/>
      <JobList/>
    </div>
    </>
  )
}

export default Job