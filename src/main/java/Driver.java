package src.main.java;

public class Driver {

	public static void main(String[] args) {

		Mahasiswa mahasiswa = new Mahasiswa();

		System.out.println("IPK saat ini: " + mahasiswa.getIpk());
		System.out.println("Status Kelulusan: " + mahasiswa.getStatusKelulusan());

		mahasiswa.setIpk(3.80);

		System.out.println("IPK saat ini: " + mahasiswa.getIpk());
		System.out.println("Status Kelulusan: " + mahasiswa.getStatusKelulusan());

		mahasiswa.setIpk(2.50);

		System.out.println("IPK saat ini: " + mahasiswa.getIpk());
		System.out.println("Status Kelulusan: " + mahasiswa.getStatusKelulusan());
	}
}
