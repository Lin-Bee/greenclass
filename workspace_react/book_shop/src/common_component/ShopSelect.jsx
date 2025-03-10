import React from 'react'
import styles from './ShopSelect.module.css'

const ShopSelect = ({children, ...props}) => {
  return (
    <>
      <select name="" id="" className={styles.select}
        {...props}
      >
        {children}
      </select>
    </>
  )
}

export default ShopSelect