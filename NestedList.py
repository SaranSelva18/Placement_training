if __name__ == '__main__':
    students=[]
    for _ in range(int(input())):
        name = input()
        score = float(input())
        students.append([name,score])
        
        
    scores=[]
    for student in students:
        scores.append(student[1])
    unique_score=set(scores)
    sorted_score=sorted(unique_score)
    Second_lowest_score=sorted_score[1]
    
    
    Student_second_lowest_score=[]
    for student in students:
        if Second_lowest_score==student[1]:
            Student_second_lowest_score.append(student[0])
            
            
    Student_second_lowest_score.sort()

    for name in Student_second_lowest_score:
        print(name)