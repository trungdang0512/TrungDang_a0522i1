use QuanLyBanHang;

insert into Customer
values (1, 'Minh Quan', 10),
		(2, 'Ngoc Oanh', 20),
		(3, 'Hong Ha', 50);

insert into `Order`(oID, cID, oDate)
values (1, 1, '2006-3-21'),
		(2, 2, '2006-3-23'),
		(3, 1, '2006-3-16');

insert into Product 
values (1, 'May Giat', 3),
		(2, 'Tu Lanh', 5),
        (3, 'Dieu Hoa', 7),
        (4, 'Quat', 1),
        (5, 'Bep Dien', 2);
        
insert into Orderdetail
values (1, 1, 3),
		(1, 3, 7),
        (1, 4, 2),
        (2, 1, 1),
        (3, 1, 8),
        (2, 5, 4),
        (2, 3, 3);
        
select oID, cID, oTotalPrice
from `Order`;

select C.cID, C.cName, O.oID, P.pName
from Customer C
INNER join `Order` O on C.cID = o.cID
inner join OrderDetail OD on O.oID = OD.oID
inner join Product P on P.pID = OD.pID;

select C.cID, C.cName
from Customer C
where not exists (select O.oID from `Order` O where O.cID = C.cID);  

select O.oID as 'Order ID', O.oDate as 'Order Date', sum(P.pPrice*OD.odQTY) as 'Total Price'
from `Order` O
inner join OrderDetail OD on OD.oID = O.oID
inner join Product P on OD.pID = P.pID
group by O.oid