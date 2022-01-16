package generic;

public class GenericPrinter<T extends Material> { //�ڷ��� �Ű����� , ���� ���� �ڷ����� ���Ե� �� ����.
		private T material;

		public void setMaterial(T material) {
			this.material = material;
		}
		
		public T getMaterial() {
			return material;
		}
		public void doPrinting() {
			material.doPrinting(); //������ ����.
		}
		public void printing() {
			material.printing();
		}
		
}
