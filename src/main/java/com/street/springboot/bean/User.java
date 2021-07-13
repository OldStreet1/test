package com.street.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version 1.0
 * @author: OldStreetHong
 * @date: 2021/7/10 13:28
 * @desc:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private String acc;
    private String pwd;
    private String name;


}
