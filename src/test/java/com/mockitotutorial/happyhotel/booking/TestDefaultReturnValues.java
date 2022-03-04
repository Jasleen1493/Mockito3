package com.mockitotutorial.happyhotel.booking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class TestDefaultReturnValues {

    private PaymentService paymentServiceMock;
    private RoomService roomServiceMock;
    private BookingDAO bookingDAOMock;
    private MailSender mailSenderMock;
    private BookingService bookingService;

    @BeforeEach
    void setup() {
        this.paymentServiceMock = mock(PaymentService.class);
        this.roomServiceMock = mock(RoomService.class);
        this.bookingDAOMock = mock(BookingDAO.class);
        this.mailSenderMock = mock(MailSender.class);

        this.bookingService = new BookingService(paymentServiceMock, roomServiceMock, bookingDAOMock, mailSenderMock);
        System.out.println("List returned"+ roomServiceMock.getAvailableRooms());
        System.out.println(roomServiceMock.findAvailableRoomId(null));
        System.out.println(roomServiceMock.getRoomCount());
    }

    @Test
    void should_countAvailablePlaces() {
        //given
        int expected = 0;

        //when
        int actual = bookingService.getAvailablePlaceCount();

        //then
        assertEquals(expected,actual);


    }
}
