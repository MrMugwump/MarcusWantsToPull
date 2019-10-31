package StudentStuff;

import java.util.ArrayList;

public class StudentGroupManipulation {
    public static Student[][] arrangeStudents(Student[] students, int[] abilityLevelTotals){
        int[] numberOfStudentsAddedPerLevel = new int[6];
        Student[][] studentsArrangedBySkillLevel = new Student[][] {
                new Student[abilityLevelTotals[0]],
                new Student[abilityLevelTotals[1]],
                new Student[abilityLevelTotals[2]],
                new Student[abilityLevelTotals[3]],
                new Student[abilityLevelTotals[4]],
                new Student[abilityLevelTotals[5]]
        };
        for (Student student: students) {
            studentsArrangedBySkillLevel[student.getAbilityLevel()]
                    [numberOfStudentsAddedPerLevel[student.getAbilityLevel()]] = student; //adds student to correct spot
            numberOfStudentsAddedPerLevel[student.getAbilityLevel()] ++;
        }
        return studentsArrangedBySkillLevel;
    }


}
