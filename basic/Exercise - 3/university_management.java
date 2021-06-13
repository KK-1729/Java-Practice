class student {
    public String reg_no;
    public String name;
    public student(String s, String t) {
        reg_no = s;
        name = t;
    }
    public void view_students() {
        System.out.println(reg_no + " - " + name);
        System.out.println("**********************");
    }
}
class faculty {
    public String emp_id;
    public String name;
    public String school;
    public faculty(String s, String t, String r) {
        emp_id = s;
        name = t;
        school = r;
    }
    public void view_faculty() {
        System.out.println(emp_id + " - " + name + " - " + school);
        System.out.println("**********************");
    }
}
class assignment {
    public String course_code;
    public String course_name;
    public int marks;
    public assignment(String m, String n, int o) {
        course_code = m;
        course_name = n;
        marks = o;
    }
    public void display_assignment() {
        System.out.println(course_code + " - " + course_name + " - " + marks);
        System.out.println("**********************");
    }
}
class marks {
    public String student_reg_no;
    public String course_code;
    public int marks;
    public marks(String a, String b, int c) {
        student_reg_no = a;
        course_code = b;
        marks = c;
    }
    public void display_marks() {
        System.out.println(student_reg_no + " - " + course_code + " - " + marks);
        System.out.println("**********************");
    }
}
class grade {
    public String student_reg_no;
    public String semester;
    public float grade;
    public grade(String a, String b, float c) {
        student_reg_no = a;
        semester = b;
        grade = c;
    }
    public void display_grade() {
        System.out.println("Reg number - " + student_reg_no);
        System.out.println("Semester - " + semester);
        System.out.println("GPA - " + grade);
        System.out.println("**********************");
    }
}
class course_page {
    public String course;
    public String faculty;
    public String lecture_topic;
    public course_page(String a, String b, String c) {
        course = a; 
        faculty = b;
        lecture_topic = c;
    }
    public void view_course_page() {
        System.out.println("Course - " + course);
        System.out.println("Faculty - " + faculty);
        System.out.println("Lecture topic - " + lecture_topic);
        System.out.println("**********************");
    }
}
class my_curriculum {
    public String course;
    public String basket;
    public int credits;
    public my_curriculum(String a, String b, int c) {
        course = a;
        basket = b;
        credits = c;
    }
    public void view_curriculum() {
        System.out.println(course + " - " + basket + " - " + credits);
        System.out.println("**********************");
    }
}
class payment {
    public String payment_id;
    public int amount;
    public payment(String a, int b) {
        payment_id = a;
        amount = b;
    }
    public void view_payments() {
        System.out.println(payment_id + " - " + amount);
        System.out.println("**********************");
    }
}
class hostel {
    public String student_reg_no;
    public char block;
    public int room_no;
    public hostel(String a, char b, int c) {
        student_reg_no = a;
        block = b;
        room_no = c;
    }
    public void hostel_details() {
        System.out.println(student_reg_no + " - " + block + " - " + room_no);
        System.out.println("**********************");
    }
}
class leave {
    public String student_reg_no;
    public String place;
    public int days;
    public leave(String a, String b, int c) {
        student_reg_no = a;
        place = b;
        days = c;
    }
    public void leave_details() {
        System.out.println("Registration no - " + student_reg_no);
        System.out.println("Place of visit - " + place);
        System.out.println("Number of days - " + days);
        System.out.println("**********************");
    }
}

public class university_management {
    public static void main(String[] args) {
        student s = new student("M Karthik", "19BIT0168");
        faculty f = new faculty("12238", "Satish C.J", "SCOPE");
        assignment a = new assignment("CSE1007", "Java Programming", 10);
        marks m = new marks("19BIT0168", "ITE1001", 92);
        grade g = new grade("19BIT0168", "Winter Sem 19-20", 9.40f);
        course_page c = new course_page("Java Programming", "Satish C.J", "Objects and Classes");
        my_curriculum d = new my_curriculum("Digital Logic and Microprocessor", "PC", 4);
        payment p = new payment("178N92", 20000);
        hostel h = new hostel("19BIT0168", 'Q', 1010);
        leave l = new leave("19BIT0168", "Hyderabad", 4);

        System.out.println("Student Details");
        s.view_students();
        System.out.println("Faculty Details");
        f.view_faculty();
        System.out.println("Digital Assignments");
        a.display_assignment();
        System.out.println("Marks View");
        m.display_marks();
        System.out.println("Grade View");
        g.display_grade();
        System.out.println("Course Page View");
        c.view_course_page();
        System.out.println("My Curriculum View");
        d.view_curriculum();
        System.out.println("Payments History");
        p.view_payments();
        System.out.println("Hostel Details");
        h.hostel_details();
        System.out.println("Leave Details");
        l.leave_details();
    }
}
