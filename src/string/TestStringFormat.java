package string;

public class TestStringFormat {
  public static void main(String[] args) {
    String s =
        "select s.id,sa.status,sa.created_date\r\n"
            + "from \r\n"
            + "nextdb.dbo.symbol s\r\n"
            + "left join\r\n"
            + "nextdb.dbo.symbol_audit_log sa\r\n"
            + "on sa.symbol_id=s.id\r\n"
            + "left join \r\n"
            + "symbol_maxdate sm\r\n"
            + "on s.id=sm.symbol\r\n"
            + "where s.Market=:market \r\n"
            + "and (sa.status is null OR sa.status not in ('deleted')) \r\n"
            + "and (sm.date < DATEADD(MONTH,:noOfMonths,:lDate) or sm.date is null)";
    System.out.println(s);
  }
}
