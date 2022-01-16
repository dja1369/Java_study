package generic;

public class GenericPrinter<T extends Material> { //자료형 매개변수 , 여러 참조 자료형이 대입될 수 있음.
		private T material;

		public void setMaterial(T material) {
			this.material = material;
		}
		
		public T getMaterial() {
			return material;
		}
		public void doPrinting() {
			material.doPrinting(); //다형성 구현.
		}
		public void printing() {
			material.printing();
		}
		
}
