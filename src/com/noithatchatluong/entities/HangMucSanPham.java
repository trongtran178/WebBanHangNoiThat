package com.noithatchatluong.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "HangMucSanPham")
public class HangMucSanPham {

	private Integer IDHangMuc;
	private String tenHangMuc;
	//private Integer IDHangMucCha;
	private HangMucSanPham hangMucSanPham;
	private List<SanPham> sanPham;
	private Set<HangMucSanPham> listHangMucCon = new HashSet<HangMucSanPham>(0);

	public HangMucSanPham() {

	}

	public HangMucSanPham(int iD, String tenHangMuc) {
		super();
		IDHangMuc = iD;
		this.tenHangMuc = tenHangMuc;
		//IDHangMucCha = iDHangMucCha;
	}

	public HangMucSanPham(HangMucSanPham hangMucSanPham, String tenHangMuc, List<SanPham> listSanPham,
			Set<HangMucSanPham> listHangMucCon) {
		this.hangMucSanPham = hangMucSanPham;
		this.tenHangMuc = tenHangMuc;
		this.listHangMucCon = listHangMucCon;
		this.sanPham = listSanPham;
	}

	@Id
	@Column(name = "IDHangMuc")
	@GeneratedValue(strategy = IDENTITY)
	public Integer getIDHangMuc() {
		return IDHangMuc;
	}

	public void setIDHangMuc(Integer iDHangMuc) {
		IDHangMuc = iDHangMuc;
	}

	public void setTenHangMuc(String tenHangMuc) {
		this.tenHangMuc = tenHangMuc;
	}

	/*
	 * public Integer getID() { return id; }
	 * 
	 * public void setID(Integer iD) { id = iD; }
	 */

	@Column(name = "TenHangMuc")
	public String getTenHangMuc() {
		return tenHangMuc;
	}

	/* @OneToMany(fetch = FetchType.LAZY, mappedBy = "empId") */

	/* @OneToMany(fetch = FetchType.LAZY, mappedBy = "ID") */
	/*@Column(name = "IDHangMucCha")
	public Integer getIDHangMucCha() {
		return IDHangMucCha;
	}

	public void setIDHangMucCha(Integer iDHangMucCha) {
		IDHangMucCha = iDHangMucCha;
	}*/

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hangMucSanPham")
	public List<SanPham> getSanPham() {
		return sanPham;
	}

	public void setSanPham(List<SanPham> sanPham) {
		this.sanPham = sanPham;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDHangMucCha")
	public HangMucSanPham getHangMucSanPham() {
		return hangMucSanPham;
	}

	public void setHangMucSanPham(HangMucSanPham hangMucSanPham) {
		this.hangMucSanPham = hangMucSanPham;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hangMucSanPham")
	public Set<HangMucSanPham> getListHangMucCon() {
		return listHangMucCon;
	}

	public void setListHangMucCon(Set<HangMucSanPham> listHangMucCon) {
		this.listHangMucCon = listHangMucCon;
	}

}
