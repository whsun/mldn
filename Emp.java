import java.io.*
import java.util.*;
public Class implements Serializable{
	private Integer empno;
	private String ename;
	private Date hiredate;
	private Double sal;
	private Double comm;
	private Emp mgr;
	public String toString(){
		return "一位雇员";
	}
}