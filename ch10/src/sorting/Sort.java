package sorting;

public interface Sort {
	int[] ascedning(int[] arr); //������ �迭�� �μ��� �޾� ������ ������ ����.
	int[] descending(int[] arr);//������ �迭�� �μ��� �޾� ������ ������ ����.
	//int addd(); 				//����� ���� �迭 ������ �ʿ� ���� ����ȯ���� ��ȯ �����ϱ⿡ �ڷ��� ���� 
	//���� �� �صξ �۵��� 
	void description(); // �˰��� ���� ����
	/* default void description(){
	 * ���� ������ �����ؾ� �ϴ� ����Ʈ �޼ҵ� 
	 * syso("���ڸ� �����ϴ� �˰��� �Դϴ�.)
	 * }
	 */
}
