package ss09_DSA.bai_tap.BT_Them02.repository;

import ss09_DSA.bai_tap.BT_Them02.models.HangSanXuat;

import java.util.List;

public interface IHangSxRepository {
    List<HangSanXuat> displayAll();

    String chooseHangSX(int index);
}
