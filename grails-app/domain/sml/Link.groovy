package sml



import javax.persistence.*;
// import com.google.appengine.api.datastore.Key;

@Entity
class Link implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id

	String url

	String title
	
	String name

	static constraints = {
		id visible:false
	}
}
