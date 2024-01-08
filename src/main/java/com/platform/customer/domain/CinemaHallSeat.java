package com.platform.customer.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CinemaHallSeat {
    int seatRow;
    int seatColumn;
    SeatType seatType;
}
