package com.techelevator;

public class HomeworkAssignment {

	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;

	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}

	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}

	public int getEarnedMarks() {
		return earnedMarks;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}

	public String getSubmitterName() {
		return submitterName;
	}

	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	public String getLetterGrade() {
		String letterGrade = "";

		double percentage = (earnedMarks / (double) possibleMarks) * 100;
		if (percentage >= 90) {
			letterGrade = "A";
			return letterGrade;
		}

		else if (percentage >= 80 && percentage <= 89) {
			letterGrade = "B";
		}

		else if (percentage >= 70 && percentage <= 79) {
			letterGrade = "C";

		}

		else if (percentage >= 60 && percentage <= 69) {
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}

		return letterGrade;

	}
}
