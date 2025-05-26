
import React from 'react'
import axios from "axios";

import { axiosInstance } from '../apis/axiosInstance';

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