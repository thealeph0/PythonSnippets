def main():
    """Simply calls to other functions."""
    grades_example()
    grades_example_2()
    #list_from_file('data/sample.txt')
    students = ['Alice, 90 ,98', ' Robert ,58 ,77',
                'Michael, 80', 'Charlie, 60 ,80']
    print_test_scores(students)


def grades_example():
    """Shows creation of a list and determining
    average of elements."""
    grades = [67, 82, 56, 84, 66, 77, 64, 64, 85, 67,
              73, 63, 98, 74, 81, 67, 93, 77, 97, 65,
              77, 91, 91, 74, 93, 56, 96, 90, 91, 99]
    total = 0
    for score in grades:
        total += score
    average = total / len(grades)
    print("Class average =", format(average, '.2f'))


def grades_example_2():
    """Shows creation of a list and determining
    average of elements. This version takes advantage
    of the sum function for sequences."""
    grades = [67, 82, 56, 84, 66, 77, 64, 64, 85, 67,
              73, 63, 98, 74, 81, 67, 93, 77, 97, 65,
              77, 91, 91, 74, 93, 56, 96, 90, 91, 99]
    average = sum(grades) / len(grades)
    print("Class average =", format(average, '.2f'))


def list_from_file(file_path):
    """Read the lines from the given file and print them out."""
    with open(file_path, 'r') as infile:
        lines = [line.strip() for line in infile]
    print('number of lines:', len(lines))
    line_num = 1
    for line in lines:
        print(line_num, ': ', line, sep='')
        line_num += 1


def print_test_scores(student_data):
    """Print the test scores for the elements of student_data.

    student_data is a list of Strings. Each String is of the form:
    '<Name>, <Midterm Score>, <Final Score>'
    Course score is based on 1/3 of midterm score and 2/3s of
    final score.
    """
    print('Name         MT   FN  Course')
    print('----------------------------')
    for student in student_data:
        data = student.split(",")
        if len(data) != 3:
            print('Bad student data:', student)
        else:
            name = data[0].strip()
            midterm = int(data[1].strip())
            final = int(data[2].strip())
            course_score = midterm / 3 + final * 2 / 3
            print(format(name, '10s'), format(midterm, '4d'),
                  format(final, '4d'), format(course_score, '6.2f'))


main()
