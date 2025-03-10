import React from "react";
import styles from "./ShopButton.module.css";

const ShopButton = ({ title = "button", size = "bsize_normal", ...props }) => {
  return (
    <>
      <button
        className={[styles.btn, styles[size]].join(" ")}
        type="button"
        {...props}
      >
        {title}
      </button>
    </>
  );
};

export default ShopButton;
