import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



/*@javax.persistence.TableGenerator(
	    name="Student",
	    table="GENERATOR_TABLE",
	    pkColumnName = "key",
	    valueColumnName = "student_id",
	    pkColumnValue="student",
	    allocationSize=20
	)*/

@Entity
//after mentioning entity, we also need to mention which table is trying to map with this particular class. So, for that purpose we need to give "@Table" annotation.
@Table(name="student")
//we need to mention the table name inside parenthesis to which table we are trying to map. Here we are mentioning that this particular student class is mapping with student table.
public class Student {
	
	/*to restrict the user only to use getters and setters methods we are making all these instance variables as private  no one else can access the variables directly.
	 * So, if they want to call the variables they need to call either get methods or set methods.
	 * so, if we see the below class code this is nothing but a plain class we have written nothing, business logic nothing these kind of classes will be called as "pojo".
				POJO - Plain Old Java Object
	 */
	@Id// we are giving this as primary key, fine. But we are also supposed to mention this particular field is mapped with which column so we have to give "@column"
	//@GeneratedValue(strategy = GenerationType.TABLE)
	//@SequenceGenerator(name = "seqGenerator", sequenceName = "myseq")
	@Column(name = "student_id")//so we are mentioning the column name student_id inside parenthesis
	private int student_id;
	
	@Column(name = "student_name")
	private String student_name;

	@Column(name ="student_age")
	private int student_age;
	
	@Column(name="student_address")
	private String student_address;
	
	@Column(name="country")
	private String country;
	
	@Column(name = "Sex")
	private String Sex;
	
	@Column(name = "nickname")
	private String nickname;

	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getStudent_age() {
		return student_age;
	}

	public void setStudent_age(int student_age) {
		this.student_age = student_age;
	}

	public String getStudent_address() {
		return student_address;
	}

	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		this.Sex = sex;
	}

}