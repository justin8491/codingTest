package kr.co.dong.jdbc;

public class EmpBean {

	private int empno;
	private String ename;
	private String job;
	private String mgr;
	private String hiretime;
	private double sal;
	private double comm;
	private int deptno;

	public EmpBean() {
	}

	public EmpBean(int empno, String ename, String job, String mgr, String hiretime, double sal, double comm,
			int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiretime = hiretime;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMgr() {
		return mgr;
	}

	public void setMgr(String mgr) {
		this.mgr = mgr;
	}

	public String getHiretime() {
		return hiretime;
	}

	public void setHiretime(String hiretime) {
		this.hiretime = hiretime;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "EmpBean [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiretime="
				+ hiretime + ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
	}
	
	
	
}
