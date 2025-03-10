package com.green.First;

public class Board{
	private int no;
	private String subject;
	private String writer;
	private int cnt;
	private String info;

	public Board(int no, String subject, String writer, int cnt, String info) {
		this.no = no;
		this.subject = subject;
		this.writer = writer;
		this.cnt = cnt;
		this.info = info;
	}

	public Board(int no, String subject, String writer, int cnt) {
		this.no = no;
		this.subject = subject;
		this.writer = writer;
		this.cnt = cnt;
	}

	public int getNo() {return no;}
	public void setNo(int no) {this.no = no;}

	public String getSubject() {return subject;	}
	public void setSubject(String subject) {this.subject = subject;	}

	public String getWriter() {return writer;	}
	public void setWriter(String writer) {this.writer = writer;	}

	public int getCnt() {return cnt;	}
	public void setCnt(int cnt) {this.cnt = cnt;	}

	public String getInfo() {return info;	}
	public void setInfo(String info) {this.info = info;	}

	@Override
	public String toString() {
		return "Board{" +
						"no=" + no +
						", subject='" + subject + '\'' +
						", writer='" + writer + '\'' +
						", cnt=" + cnt +
						", info='" + info + '\'' +
						'}';
	}
}