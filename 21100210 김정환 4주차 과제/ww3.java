package week;

public class ww3 {

	public class Member {
		private String Name, Id, PassWord;
		private int age;

		String getName() {
			return Name;
		}

		String getId() {
			return Id;
		}

		String getPassword() {
			return PassWord;
		}

		int getage() {
			return age;
		}

		void setMember(String Name, String Id, String PassWord, int age) {
			this.Name = Name;
			this.Id = Id;
			this.PassWord = PassWord;
			this.age = age;
		}

		public Member(String Name, String Id, String PassWord, int age) {
			this.Name = Name;
			this.Id = Id;
			this.PassWord = PassWord;
			this.age = age;
		}
	}



	public class MemberTest {
		public static void main(String[] args) {
			Member sMember = new Member("사람", "하늘색", "1557*", 3900);
			System.out.printf("%s\t%s\t%s\t%d\n", sMember.getName(), sMember.getId(), sMember.getPassword(),
					sMember.getage());
	                
			sMember.setMember("비스너", "아오이", "1557#", 4200);
			System.out.printf("%s\t%s\t%s\t%d\n", sMember.getName(), sMember.getId(), sMember.getPassword(),
					sMember.getage());

		}
	}
}
