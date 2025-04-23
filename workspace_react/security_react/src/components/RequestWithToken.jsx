
import React from 'react'
import { axiosInstance } from '../apis/axiosInstance';
import { data } from 'react-router-dom';

const RequestWithToken = () => {

  axiosInstance.post('/items', data, {
    Headers : {
      'Authorization' : `Bearer ${token}`
    }
  })
  .then().catch();



  return (
    <div>RequestWithToken</div>
  )
}

export default RequestWithToken