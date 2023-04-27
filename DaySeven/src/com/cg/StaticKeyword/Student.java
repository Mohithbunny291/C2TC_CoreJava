package com.cg.StaticKeyword;

public class Student {
		// TODO Auto-generated method stub
		private int id;
		private String name;
		private String collagename;
		
		public Student(int id, String name, String collagename) {
			super();
			this.id = id;
			this.name = name;
			this.collagename = collagename;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCollagename() {
			return collagename;
		}

		public void setCollagename(String collagename) {
			this.collagename = collagename;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", collagename=" + collagename + "]";
		}
		
		
		

}
