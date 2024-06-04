package src.main.java;

public class Mahasiswa {

	private double ipk;

	public Mahasiswa() {
		this.reset();
	}

	public void reset() {
		ipk = 0.0;
	}

	public void setIpk(double ipk) throws IllegalArgumentException {
		if (ipk < 0.0 || ipk > 4.0) {
			throw new IllegalArgumentException("IPK harus berada di antara 0.0 dan 4.0");
		}
		this.ipk = ipk;
	}

	public double getIpk() {
		return ipk;
	}

	public String getStatusKelulusan() {
		if (ipk >= 4.0) {
			return "Summa Cumlaude";
		} else if (ipk >= 3.70) {
			return "Magna Cumlaude";
		} else if (ipk >= 3.50) {
			return "Cumlaude";
		} else if (ipk >= 2.75) {
			return "Sangat Memuaskan";
		} else if (ipk >= 2.00) {
			return "Memuaskan";
		} else if (ipk >= 1.00) {
			return "Lulus";
		} else {
			return "Tidak Lulus";
		}
	}
}
