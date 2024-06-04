package src.test.java;

import static org.junit.Assert.*;
import src.main.java.*;
import org.junit.Test;

public class MahasiswaTest {

	@Test
	public void testReset() {
		Mahasiswa testMahasiswa = new Mahasiswa();
		
		testMahasiswa.setIpk(3.50);
		testMahasiswa.reset();
		
		assertEquals(0.0, testMahasiswa.getIpk(), 0.01);
		assertEquals("Tidak Lulus", testMahasiswa.getStatusKelulusan());
	}

	@Test
	public void testSetIpk() {
		Mahasiswa testMahasiswa = new Mahasiswa();
		
		testMahasiswa.setIpk(3.50);
		assertEquals(3.50, testMahasiswa.getIpk(), 0.01);
		assertEquals("Cumlaude", testMahasiswa.getStatusKelulusan());
		
		testMahasiswa.setIpk(2.50);
		assertEquals(2.50, testMahasiswa.getIpk(), 0.01);
		assertEquals("Memuaskan", testMahasiswa.getStatusKelulusan());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetIpkInvalidLow() {
		Mahasiswa testMahasiswa = new Mahasiswa();
		testMahasiswa.setIpk(-1.0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetIpkInvalidHigh() {
		Mahasiswa testMahasiswa = new Mahasiswa();
		testMahasiswa.setIpk(4.1);
	}
}
