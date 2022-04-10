package com.kh.cafesurfer.domain.bookMark;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Bookmark {

private LocalDateTime bookmarkChkdate;    //  BOOKMARK_CHKDATE	TIMESTAMP(6)
private Long memberId;                    //  MEMBER_ID	NUMBER(5,0)
private Long shopId;                      //  SHOP_ID	NUMBER(5,0)

  private String shopName;               // SHOP_NAME	            NVARCHAR2(30 CHAR)
  private String shopAddress;            // SHOP_ADDRESS          VARCHAR2(105 BYTE)
  private String shopTel;                // SHOP_TEL	            VARCHAR2(15 BYTE)
  private Long viewCnt;                  // VIEW_COUNT	          NUMBER(5,0)
  private Long shopBookmarkCnt;          // SHOP_BOOKMARK_COUNT 	NUMBER(5,0)
  private Long shopReviewCnt;            // SHOP_REVIEW_COUNT     NUMBER(5,0)
  private String ynParking;              // PARKING	              NUMBER
  private String ynAllDay;               // 24HOURS	              NUMBER
  private LocalDateTime shopCdate;       // SHOP_CDATE            TIMESTAMP(6)

  private String store_filename;  //  STORE_FILENAME	VARCHAR2(50 BYTE)
  private String upload_filename; //  UPLOAD_FILENAME	VARCHAR2(50 BYTE)
}
