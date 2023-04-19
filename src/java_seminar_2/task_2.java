package java_seminar_2;
public class task_2 {
    public static void main(String[] args) {
        String st1 = "фамилия:Иванов,оценка:5,предмет:Математика";
        String st2 = "фамилия:Петрова,оценка:4,предмет:Информатика";
        parse_str(st1);
        parse_str(st2);
    }
    private static void parse_str(String st) {
        StringBuilder result = new StringBuilder();
        String[] inf = st.split("[:,]");
        result.append("Студент " + inf[1] + " получил " + inf[3] + " по предмету " + inf[5] + ".");
        System.out.printf("%s \n", result.toString());
    }
}