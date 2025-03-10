import React from 'react'

const BoardList = () => {
  return (
    <>
      <div className="inner">
        <h3>게시글 목록</h3>
        <div>
          <table>
            <thead>
              <tr>
                <th>no</th>
                <th>제목</th>
                <th>작성자</th>
                <th>작성일</th>

                <th>수정</th>
              </tr>
            </thead>
            <tbody>
            <tr>
                <th>{BoardList.no}</th>
                <th>제목</th>
                <th>작성자</th>
                <th>작성일</th>

                <th><button></button></th>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
    </>
  )
}

export default BoardList