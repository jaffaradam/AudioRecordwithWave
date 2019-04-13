package com.github.axet.audiorecorder.bottomsheet;


/**
 * Created by Thought FactTree on 3/12/2018.
 */

public class ConstantClass {

    public static final String DEFAULT_ISO_CODE = "IN";
    public static final String DEFAULT_FLAG_ISO_CODE = "🇮🇳";
    public static final String CHANNEL_PREFIX = "grp-";
    public static final String USER_INBOX_GROUPCHANNEL_NAME = "INB";
    public static final String SYSTEM_CHANNEL_NAME = "SYSTEM_CHANNEL";
    /*public static final String NOTIFY_FRIENDS_GROUPCHANNEL_NAME = "NF";*/
    public static final String USER_SELF_CHANNEL_NAME = "SELF";
    public static final String ALL_CHANNELS_INDICATOR = "AllChannels";
    public static final String IS_MEMBER_CONSTANT_VALUE = "1";
    public static final String DEVICE_REGISTRATION_TYPE = "2";

    public static final int CONTACT_DETAIL_LEVEL_SIMPLE = 1;
    public static final int CONTACT_DETAIL_LEVEL_DETAILED = 2;

//    public static final String BASE_API_URL = "http://13.233.28.124/services/";
    public static final String BASE_API_URL = "http://13.127.187.72/services/";
    public static final String DEFAULT_OFFLINE_MESSAGE = "";
    public static final String ONLINE_TEXT = "Online";
    public static final String OFFLINE_TEXT = "Offline";
    public static final String UNKNOWN_TEXT = "Unknown";
    public static final String TYPING_INDIC_TEXT = "typing..";

    //todo: this should be sent by server to the app post registration/sign-in
    public static String PUBLISH_KEY = "pub-c-7485f804-57e5-400e-8221-f24aa04bcb19";
    public static String SUBSCRIBE_KEY = "sub-c-84207018-d227-11e6-add0-02ee2ddab7fe";
    public static String FEED_CHANNEL_NAME = "HOME";
    public static final int SUCCESS_CODE = 1;
    public static final int ERROR_CODE = 0;
    public static final int INVITE_PEOPLE_RELATIONS_TAB_POSITION = 0;
    public static final int INVITE_PEOPLE_ALL_TAB_POSITION = 1;
    public static final int INVITE_PEOPLE_BLANK_TAB_POSITION = 2;
    public static final String INVITE_PEOPLE_ALL_TAB_TEXT = "ALL";
    public static final String INVITE_PEOPLE_RELATIONS_TAB_TEXT = "RELATIONS";
    public static final String INVITE_PEOPLE_BLANK_TAB_TEXT = "BLANK";
    public static final String OPEN_BRACES = " (";
    public static final String CLOSE_BRACES = ") ";
    public static final String REGEX_MATCH_TEXT_INSIDE_BRACES = "(?<=\\().*?(?=\\))";
    public static final String RECEIVER = "UserContactsImportReceiver";
    public static final String RECEIVER_RESULT = "ImportStatus";
    public static final String CONTACTS_COUNT = "TotalCount";
    public static final String CONTACTS_MEMBER_COUNT = "FriendsCount";
//    public static final String CONNECTIVITY_CHANGE = "android.net.conn.CONNECTIVITY_CHANGE";
    public static final int UNPUBLISHED_PROCESS_COUNT = 12;
    //        public static final String CHANNEL_TYPE = "ChannelType";
//        public static final String GROUP_NAME = "GroupName";
//        public static final String GROUP_ID = "GroupId";
//        public static final String GROUP_IMG_URI = "GroupImgUri";
//        public static final String GROUP_THUMB_URI = "GroupThumbUri";
    public static final String COMMENT = "Comment";
    public static final String NEW_MESSAGE = "New MessageItem";
    public static final String CONTENT_TYPE_TEXT = "txt";
    public static final String CONTENT_TYPE_IMAGE = "img";
    public static final String CONTENT_TYPE_REMINDER = "rem";
    public static final String CHAT_GROUP_TYPE = "Chat";
    public static final String NOTIFICATION_GROUP_TYPE = "Notification";
    public static final int RECEIVER_RESULT_CODE = 200;
    //        public static final String MODE = "mode";
    public static final String NEW_MODE = "new";

    public static final String EDIT_MODE = "edit";
    public static final String GROUP_DETAILS = "GlobalGroupDetail";
    public static final int SUCCESS_RESULT = 0;
    public static final int FAILURE_RESULT = 1;
    public static final String PACKAGE_NAME =
            "com.knots";
    public static final String LOCATION_RECEIVER = PACKAGE_NAME + ".RECEIVER";
    public static final String RESULT_DATA_KEY = PACKAGE_NAME +
            ".RESULT_DATA_KEY";
    public static final String LOCATION_DATA_EXTRA = PACKAGE_NAME +
            ".LOCATION_DATA_EXTRA";
    public static final String CHANNEL_ID = "ChannelId";
    public static final String MEMBER_ID = "Member_Id";
    public static final String MOBILE_NUMBER = "MobileNumber";
//    public static final String CHANNEL_NAME = "ReceiverChannelName";
    public static final String CLOUDINARY_URL = "CloudinaryUrl";
    public static final String ATTACHMENT_COMMENTS = "AttachmentComments";
    public static final String COVERSATION_ID = "topicId";
    public static final String GALLERY_URL = "GalleryUrl";
    public static final int MAXIMUM_FOLLOWER_COUNT = 5;
    public static final String IS_FROM_CONVERSATION = "ConvType";
    public static final String ACTIVITY_INIT = "Activity_Init";

    public static final String SCROLL_TO_MESSAGE_ID = "ScrollToMessageID";

    public static final int REMINDER_TITLE_LENGTH = 20;

    public static final String UI_ACTION_TEXT_DISCUSS = "DISCUSS";
    public static final String UI_ACTION_TEXT_REPLY = "REPLY";
    public static final String UI_ACTION_TEXT_COMMENT = "COMMENT";

    public static final String INTENT_SCAN_ENTITY_KEY = "shortcode_key";

    public static final String CONTACT_POPULATION_ALL_MEMBERS = "AllContactMembers";
    public static final String REFINED_GROUP_MEMBERS = "RefinedGroupMembers";

    public static final String MY_PHONE_BOOK_CONTACTID = "-99";
    public static final String UNIMPORTED_PHONE_BOOK_CONTACTID = "-1";

    public static final String DATABASE_NAME = "alltime_testings.db";
    public static final int DATABASE_VERSION = 1;

}
