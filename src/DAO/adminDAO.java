package DAO;

import java.util.List;

import Bean.kindbook;
import Bean.sepcificbook;

public interface adminDAO {

	public List<kindbook> selectKindBook(String callnumber); //(����callnumberѡ����)
	public List<sepcificbook> selectSepcificBook(String barcode);//����barcode��ѯ
}
