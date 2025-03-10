import React from 'react'

const BoardUpdate = () => {
  return (
    <div className="inner">
      <h3>게시글 수정</h3>
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

export default BoardUpdate