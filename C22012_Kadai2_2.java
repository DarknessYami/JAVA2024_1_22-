import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//手順2
class MLogin {

    private int m_id[] = {100, 200, 300, 400, 500};
    private int m_pass = 12345;

    public void chkLogon() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        System.out.println("IDを入力 :");
        String ID_br = br.readLine();
        int ID = Integer.parseInt(ID_br);
    
        System.out.println("パスワードを入力 :");
        String PSW_br = br.readLine();
        int PSW = Integer.parseInt(PSW_br);

        for(int i = 0; i<5; i++){
            //ログイン成功した場合
            if (ID == m_id[i] && PSW == m_pass) {
                System.out.println("ログイン成功!");
                break;
            }
            //パスワード入力エラーした場合
            else if (ID == m_id[i] && PSW != m_pass) {
                System.out.println("ログイン失敗:パスワード入力エラー!");
                break;
            }
            //ID入力エラーした場合
            else if (ID != m_id[i] && PSW == m_pass) {
                System.out.println("ログイン失敗:ID入力エラー!");
                break;
            }
            //両方も入力エラーした場合
            else if (ID != m_id[i] && PSW != m_pass) {
                System.out.println("ログイン失敗:両方も入力エラー!");
                break;
            }
    }
}
    public static void main(String[] args) throws IOException{
        MLogin ML = new MLogin();
        ML.chkLogon();
    }
}