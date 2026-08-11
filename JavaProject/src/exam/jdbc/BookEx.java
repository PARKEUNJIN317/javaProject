package exam.jdbc;

import java.sql.*;
import java.util.Scanner;

import jdbc.DBConn;

public class BookEx {

    public static void main(String[] args) {
        DBConn dbCon = new DBConn();
        Connection con = dbCon.getConnection();
        Scanner sc = new Scanner(System.in);
 
        if (con == null) {
            System.out.println("db 생성 실패");
            return;
        }
        System.out.println("db 생성 성공");

        try {
            // ---------- 1. 총 도서 권수 출력 ----------
            String sql1 = "SELECT COUNT(*) AS cnt FROM book";
            Statement stmt1 = con.createStatement();
            ResultSet rs1 = stmt1.executeQuery(sql1);
            if (rs1.next()) {
                System.out.println("총 도서 권수: " + rs1.getInt("cnt") + "권");
            }
            rs1.close();
            stmt1.close();

            // ---------- 2. 특정 년도 이후 발행된 도서만 출력 ----------
            System.out.print("\n기준 년도를 입력하세요: ");
            int year = sc.nextInt();

            String sql2 = "SELECT bookNo, bookName, bookDate FROM book WHERE EXTRACT(YEAR FROM bookDate) >= ?";
            PreparedStatement pstmt2 = con.prepareStatement(sql2);
            pstmt2.setInt(1, year);
            ResultSet rs2 = pstmt2.executeQuery();

            System.out.println("\n--- " + year + "년 이후 발행 도서 ---");
            while (rs2.next()) {
                System.out.format("%-10s %-20s %s\n",
                        rs2.getString("bookNo"), rs2.getString("bookName"), rs2.getDate("bookDate"));
            }
            rs2.close();
            pstmt2.close();

            // ---------- 3. 저자 이름에 특정 문자열이 들어가는 도서 검색 ----------
            sc.nextLine(); 
            System.out.print("\n저자 이름 일부를 입력하세요: ");
            String authorKeyword = sc.nextLine();

            String sql3 = "SELECT bookNo, bookName, bookAuthor FROM book WHERE bookAuthor LIKE ?";
            PreparedStatement pstmt3 = con.prepareStatement(sql3);
            pstmt3.setString(1, "%" + authorKeyword + "%");
            ResultSet rs3 = pstmt3.executeQuery();

            System.out.println("\n--- 저자명에 '" + authorKeyword + "' 포함된 도서 ---");
            while (rs3.next()) {
                System.out.format("%-10s %-20s %s\n",
                        rs3.getString("bookNo"), rs3.getString("bookName"), rs3.getString("bookAuthor"));
            }
            rs3.close();
            pstmt3.close();

            // ---------- 4. 특정 가격 이상인 도서 검색 ----------
            System.out.print("\n기준 가격을 입력하세요: ");
            int price = sc.nextInt();

            String sql4 = "SELECT bookNo, bookName, bookPrice FROM book WHERE bookPrice >= ?";
            PreparedStatement pstmt4 = con.prepareStatement(sql4);
            pstmt4.setInt(1, price);
            ResultSet rs4 = pstmt4.executeQuery();

            System.out.println("\n--- " + price + "원 이상 도서 ---");
            while (rs4.next()) {
                System.out.format("%-10s %-20s %d\n",
                        rs4.getString("bookNo"), rs4.getString("bookName"), rs4.getInt("bookPrice"));
            }
            rs4.close();
            pstmt4.close();

            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}