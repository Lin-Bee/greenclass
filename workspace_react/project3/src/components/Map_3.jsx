import React from 'react'

const Map_3 = () => {
  const localList = ['경기도','강원도','충청도','전라도']
  return (
    <>
      <select name="localList" id="localList">
      {localList.map((local,i)=>{
        return <option value={local} key = {i}>{local}</option>
      })}
      </select>
    </>
  )
}

export default Map_3