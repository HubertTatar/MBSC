insert into BOOKING.BOOKINGS (ID, CREATED_DATE, MODIFICATION_DATE, VERSION, USER_ID, RESTAURANT_ID, TABLE_ID, DATE)
values(NEXTVAL('booking.ids_sequence'), now(), now(), 1, 1, 1, 1, now());

