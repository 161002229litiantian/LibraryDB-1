package DAO;

import java.util.List;

import Bean.kindbook;

public interface KindBookDAO {

	public List<kindbook> searchByC(String callnumber);
	public void updateInfo(kindbook k);
	public boolean updatekindbook(String kkk,String callnumer);// ����ͼ����ϸ��Ϣ
}
