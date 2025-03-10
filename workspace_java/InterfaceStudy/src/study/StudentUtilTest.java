package study;

import java.util.function.Function;

public class StudentUtilTest implements StudentUtil {

	@Override
	public int getTotalScore(Student s1) {
		return s1.getKorScore()+s1.getEngScore()+s1.getMathScore();
	}

	@Override
	public Student getHighScoreStudent(Student s1, Student s2) {
		int a = getTotalScore(s1);
		int b = getTotalScore(s2);
		return a>b?s1:s2;
	}

	@Override
	public String getGradeByStudentName(Student[] students, String name) {
		//학생 여러명을 매개변수로 받아, 또 다른 매개변수로
		//받은 학생의 이름과 일치하는 학생의 점수 등급을 문자열로 리턴
		String result ="";
		for (int i = 0; i < students.length; i++) {
			if(students[i].getName().equals(name)){
				double ScoreAvg = getTotalScore(students[i])/3.0;
				result = getScoreAvg(ScoreAvg);
				break;
				/*이 영역을 바꾼데*/
//				if(ScoreAvg>=90&&ScoreAvg<=100){
//					result = "A";
//				} else if (ScoreAvg>=80&&ScoreAvg<=89) {
//					result = "B";
//				}else if (ScoreAvg>=70&&ScoreAvg<=79) {
//					result = "C";
//				}else {
//					result = "D";
//				}
				/*이 영역을 바꾼데*/
			}else {
					result = "학생정보 없음";
					break;
			}
		}
		return result;
	}

	/* 평균점수 (ScoreAvg)로 등급을 구하는 제도 */
	public String getScoreAvg(double ScoreAvg){
		String result = "";
		if(ScoreAvg>=90&&ScoreAvg<=100){
			result = "A";
		} else if (ScoreAvg>=80&&ScoreAvg<=89) {
			result = "B";
		}else if (ScoreAvg>=70&&ScoreAvg<=79) {
			result = "C";
		}else {
			result = "D";
		}
		return result;
	}

	@Override
	public int[] getTotalScoresToArray(Student[] students) {
		int[] studentScore = new int[students.length];
		for (int i = 0; i <students.length ; i++) {
			studentScore[i] = getTotalScore(students[i]);
		}
		return studentScore;
	}
}
