import React, { useState } from 'react'
import Modal from './components/Modal';

const back = () => {
  const [isModalOpen, setIsModalOpen] = useState(false);

  return (
    <>
    
    <div className="button-container">
        <button className="btn btn-basic">기본 버튼</button>
      </div>

      <button className="open-button" onClick={() => setIsModalOpen(true)}>
        모달 열기
      </button>

      {/* 모달 컴포넌트 */}
      {isModalOpen && (
        <Modal title="고기" onClose={() => setIsModalOpen(false)}>
          꺄앙 야채도 조아
        </Modal>
      )}
      {/* <Modal isOpen={isModalOpen} onClose={() => setIsModalOpen(false)} title="안내">
        
      </Modal> */}
    
    </>
  )
}

export default back