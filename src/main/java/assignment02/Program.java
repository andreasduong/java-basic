package assignment02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {

        // Department
        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Lập trình";

        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Kiểm thử";

        Department department3 = new Department();
        department3.id = 3;
        department3.name = "Bảo vệ";

        // Account
        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "tungtungtung67@gmail.com";
        acc1.userName = "bigtung67";
        acc1.fullName = "Tung Sahur";
        acc1.department = department1;
        acc1.position = Position.DEV;
        acc1.createDate = LocalDate.of(2019, 10,22);

        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "kirky67@gmail.com";
        acc2.userName = "bigkirk67";
        acc2.fullName = "Charlie Kirk";
        acc2.department = department2;
        acc2.position = Position.TEST;
        acc2.createDate = LocalDate.of(2020, 5, 9);

        Account acc3 = new Account();
        acc3.id = 2;
        acc3.email = "epstein@gmail.com";
        acc3.userName = "bigstein";
        acc3.fullName = "Jeff Epsteint";
        acc3.department = department2;
        acc3.position = Position.DEV;
        acc3.createDate = LocalDate.of(2020, 5, 9);

       

        // Group
        Group group1 = new Group();
        group1.id = 1;
        group1.name = "nhóm làm web bóng đá";
        group1.creatorId = acc2;
        group1.createDate = LocalDate.of(2022, 12, 9);

        Group group2 = new Group();
        group2.id = 2;
        group2.name = "nhóm làm game bắn súng";
        group2.creatorId = acc2;
        group2.createDate = LocalDate.of(2023, 11, 9);

        Group group3 = new Group();
        group3.id = 3;
        group3.name = "nhóm làm game bắn chim";
        group3.creatorId = acc2;
        group3.createDate = LocalDate.of(2023, 11, 9);

        // Group Account
        GroupAccount groupAcc1 = new GroupAccount();
        groupAcc1.group = group1;
        groupAcc1.accounts = new Account[]{acc1, acc2, acc3};

        GroupAccount groupAcc2 = new GroupAccount();
        groupAcc2.group = group2;
        groupAcc2.accounts = new Account[]{acc1, acc2};


        GroupAccount groupAcc3 = new GroupAccount();
        groupAcc3.group = group3;
        groupAcc3.accounts = new Account[]{ acc2};

        GroupAccount[] groupAccounts = {
        groupAcc1,
        groupAcc2,
        groupAcc3
        };

        // Type Question
        TypeQuestion typeQuestion1 = new TypeQuestion();
        typeQuestion1.id = 1;
        typeQuestion1.name = "Multiple-Choice";

        TypeQuestion typeQuestion2 = new TypeQuestion();
        typeQuestion2.id = 2;
        typeQuestion2.name = "Essay";

        // Question
        Question question1 = new Question();
        question1.id = 1;
        question1.content = "Java là gì?";
        question1.categoryQuestion = CategoryQuestion.JAVA;
        question1.typeQuestion = typeQuestion1;
        question1.creatorId = acc2;
        question1.createDate = LocalDate.of(2023, 9,9);

        Question question2 = new Question();
        question2.id = 2;
        question2.content = "Java có từ năm nào?";
        question2.categoryQuestion = CategoryQuestion.JAVA;
        question2.typeQuestion = typeQuestion1;
        question2.creatorId = acc2;
        question2.createDate = LocalDate.of(2023, 9,9);

        // Answer
        Answer answer1 = new Answer();
        answer1.content = "Java là ngôn ngữ lập trình";
        answer1.question = question1;
        answer1.isCorrect = true;

        Answer answer2 = new Answer();
        answer2.content = "Java có từ 1991";
        answer2.question = question2;
        answer2.isCorrect = true;

        // Exam
        Exam exam1 = new Exam();
        exam1.id = 1;
        exam1.code = "A101";
        exam1.title = "Bài kiểm tra Java cuối kỳ";
        exam1.categoryQuestion = CategoryQuestion.JAVA;
        exam1.createDate = LocalDate.of(2023, 9 , 1);

        // Exam Question
        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.exam = exam1;
        examQuestion1.questions = new Question[]{question1, question2};

      
        // bài tập 1 - câu hỏi 1
        if (acc2.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là " + acc2.department.id);
        }
        

        // bài tập 1 - câu hỏi 2
        int count = 0;
        for (GroupAccount groupAccount : groupAccounts) {
            for (Account account : groupAccount.accounts) {
                if (account.id == acc2.id) {
                    count++;
                    break;
                }
            }
        }
    
 
        if (count == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else if (count == 1 && count ==2) {
            System.out.println("Nhân viên này tham gia " + count + " nhóm");
        } else if (count == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }


        // câu hỏi 3
        String department = (acc2.department == null) ? "Nhân viên này chưa có group" : "Phòng ban của nhân viên này là " + acc2.department.id;
        System.out.println(department);

        // câu hỏi 4
        String position = (acc1.position == Position.DEV) ? "Đây là dev" : "Đây ko phải dev";
        System.out.println(position);

        // switch case
        int countAcc = groupAcc1.accounts.length;
        
        switch (countAcc) {
            case 1:
                System.out.println("Nhóm có 1 thành viên");
                break;
            case 2:
                System.out.println("Nhóm có 2 thành viên");
                break;
            case 3:
                System.out.println("Nhóm có 3 thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
                break;
        }

        // for each
         Account[] accounts = {acc1, acc2, acc3};
         for (Account account : accounts) {
            System.out.println("Tên: " + account.fullName + ", Email: " + account.email);
         }

        Department[] departments = {department1, department2, department3};
        for (Department dep : departments) {
            System.out.println("Tên phòng ban: " + dep.name + ", id: " + dep.id);
        }
        
        System.out.println();

         // for 
        for (int i = 0 ; i < departments.length; i++ ){
               System.out.println("Thông tin phòng ban thứ " + (i+1));
               System.out.println("ID: " + departments[i].id);
               System.out.println("Tên: " + departments[i].name); 
        }

        System.out.println();
        // break
           for (int i = 0 ; i < departments.length; i++ ){
                if (i == 2) break;
               System.out.println("Thông tin phòng ban thứ " + (i+1));
               System.out.println("ID: " + departments[i].id);
               System.out.println("Tên: " + departments[i].name); 
        }
        
        System.out.println();


        // do-while
        int i = 0;
        do {
            System.out.println("Thông tin phòng ban thứ " + (i+1));
            System.out.println("ID: " + departments[i].id);
            System.out.println("Tên: " + departments[i].name); 
            i++;
        } while (i < 2);

        System.out.println();
        
        // bài tập 2
        // câu hỏi 1
        int num = 5;
        System.out.println(num);

        int million = 100000000;
        System.out.printf("%,d%n", million);

        float soThuc = 5.567098f;
        System.out.printf("%.4f", soThuc);

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Nhập tên của bạn: ");
        // String ten = scanner.nextLine();
        // System.out.println("Tên tôi là \"" + ten + "\" và tôi độc thân");

        System.out.println(LocalDateTime.now());
        System.out.println();

        // random number
        Random random = new Random();
        // 1 số nguyên
        int ranNum = random.nextInt();
        System.out.println(ranNum);

        // 1 số thực
        float ranFloat = random.nextFloat();
        System.out.println(ranFloat);

        // random tên 1 bạn
        String[] friends = {"Long", "Linh", "Vũ", "Tuấn", "Phương"};
        System.out.println(friends[random.nextInt(friends.length)]);

        String[] randomFriends;
        randomFriends = new String[3];

        // for (int k = 0; k < friends.length; k++) {
        //     System.out.println("Nhập tên bạn:");
        //     String ten = scanner.nextLine();
        //     randomFriends[k] = ten;
        // }
        // int randomIndex = random.nextInt(friends.length);
        // System.out.println("Tên ngẫu nhiên là: " + randomFriends[randomIndex]);


        // input account
        createAccount();
        
    }

    static void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình tạo account mới");

        while (true) {
            System.out.println("Mời bạn nhập vào chức năng muốn sử dụng");
            System.out.println("1. Tạo account");
            System.out.println("2. Tạo department");
            System.out.println("3. Thoát");        
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Tạo account");
            } else if (choice == 2) {
                System.out.println("Tạo department");
            } else if (choice == 3) {
                System.out.println("Đã thoát chương trình");
                break;
            } else {
                System.out.println("mời bạn nhập lại");
            }
        }
    }





}
