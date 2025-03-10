import React from "react";

const Controller = ({changeCount}) => {
  // props.changeCount();
  return (
    <>
      <div>
        <button
          type="button"
          onClick={(e) => {
            changeCount(-1);
          }}
        >
          -1
        </button>
        <button
          type="button"
          onClick={(e) => {
            changeCount(-10);
          }}
        >
          -10
        </button>
        <button
          type="button"
          onClick={(e) => {
            changeCount(-100);
          }}
        >
          -100
        </button>
        <button
          type="button"
          onClick={(e) => {
            changeCount(100);
          }}
        >
          +100
        </button>
        <button
          type="button"
          onClick={(e) => {
            changeCount(10);
          }}
        >
          +10
        </button>
        <button
          type="button"
          onClick={(e) => {
            changeCount(1);
          }}
        >
          +1
        </button>
      </div>
    </>
  );
};

export default Controller;
