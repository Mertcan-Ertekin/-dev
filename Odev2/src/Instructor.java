
public class Instructor extends User{
	String CodeCertificate;

	public Instructor(int id, String name, String email, String password, String codeCertificate) {
		super(id, name, email, password);
		CodeCertificate = codeCertificate;
	}


	public Instructor() {
		
	}


	public String getCodeCertificate() {
		return CodeCertificate;
	}

	public void setCodeCertificate(String codeCertificate) {
		CodeCertificate = codeCertificate;
	}

}
