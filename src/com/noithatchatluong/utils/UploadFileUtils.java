package com.noithatchatluong.utils;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

public class UploadFileUtils {
	private String SAVE_DIRECTORY = "G:\\webproejct\\WebBanHangNoiThat - Copy\\WebContent\\static\\hinhdaidientintuc";
	private String fileName = null;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getSAVE_DIRECTORY() {
		return SAVE_DIRECTORY;
	}

	public void setSAVE_DIRECTORY(String sAVE_DIRECTORY) {
		SAVE_DIRECTORY = sAVE_DIRECTORY;
	}

	public boolean uploadFile(Part part, HttpServletRequest request) throws ServletException, IOException {
		if (part.getSize() > 0) {
			// Khi upload thành công, lấy được tên file qua getter
			this.setFileName(extractFileName(part));
			this.setFileName(generateUniqueFileName(this.getFileName()));
			if (fileName != null && fileName.length() > 0) {
				
				part.write(SAVE_DIRECTORY + File.separator + fileName);
				part.write(request.getServletContext().getRealPath("") + "static\\images\\" +  File.separator + this.getFileName());
				System.out.println(request.getServletContext().getRealPath("") + "static\\images\\" +  File.separator + this.getFileName());
				System.out.println(SAVE_DIRECTORY + File.separator + fileName);
				return true;
			}
		}
		this.setFileName("None");
		return false;
	}

	private String extractFileName(Part part) {
		// form-data; name="file"; filename="C:\file1.zip"
		// form-data; name="file"; filename="C:\Note\file2.zip"
		String contentDisp = part.getHeader("content-disposition");
		String[] items = contentDisp.split(";");
		for (String s : items) {
			if (s.trim().startsWith("filename")) {
				// C:\file1.zip
				// C:\Note\file2.zip
				String clientFileName = s.substring(s.indexOf("=") + 2, s.length() - 1);
				clientFileName = clientFileName.replace("\\", "/");
				int i = clientFileName.lastIndexOf('/');
				// file1.zip
				// file2.zip
				return clientFileName.substring(i + 1);
			}
		}
		return null;
	}

	private String generateUniqueFileName(String fileName) {
		Calendar date = Calendar.getInstance();
		Long millisecondsDate = date.getTimeInMillis();
		return millisecondsDate.toString() + "-" + fileName;
	}

}
