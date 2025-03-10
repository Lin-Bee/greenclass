import React from 'react'

const BoardWrite = () => {
  return (
    <div className="inner">
      <h3>게시글 작성</h3>
      <table>
        <tbody>
          <tr>
            <th>이름</th>
            <td>
              <input type="text" />
            </td>
          </tr>
          <tr>
            <th>비번</th>
            <td>
              <input type="text" />
            </td>
          </tr>
        </tbody>
      </table>
      <div className="btn-area">
        <button>로그인</button>
      </div>
    </div>
  )
}

export default BoardWrite