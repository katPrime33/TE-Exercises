package com.techelevator;

public class HomeworkAssignment {
        //member vars
        private int earnedMarks;
        private int possibleMarks;
        private String submitterName;


        //constructors
        public HomeworkAssignment(int possibleMarks, String submitterName) {
            this.possibleMarks = possibleMarks;
            this.submitterName = submitterName;
        }

        //methods



        //derived properties
        public String getLetterGrade(){
            double grade = (double)earnedMarks / possibleMarks;
            if(grade >= 0.9){
                return "A";
            }
            else if(grade >= 0.8 && grade < 0.9){
                return "B";
            }
            else if(grade >= 0.7 && grade < 0.8){
                return "C";
            }
            else if(grade >= 0.6 && grade < 0.7){
                return "D";
            } else{
                return "F";
            }
            }


        //getters and setters
            public void setEarnedMarks(int earnedMarks){
            this.earnedMarks = earnedMarks;
            }
            public String getSubmitterName(){
            return submitterName;
            }
            public int getPossibleMarks(){
            return possibleMarks;
            }
            public int getEarnedMarks(){
            return earnedMarks;
            }


    }


