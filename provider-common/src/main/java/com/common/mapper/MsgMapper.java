package com.common.mapper;

public interface MsgMapper {
//    @Insert("insert into msg_info (msg,user_id) values (#{msg},#{userId})")
//    public int addMsg(int userId, String msg);
//
//    @Update("update msg_info set reply_msg = #{msg},reply_user_id = #{userId},reply_time=now() where id = #{id}")
//    public int replyMsg(int userId, String msg, int id);
//
//    @Select("<script>"
//            + "select * from msg_info where 1=1"
//            + "<if test='userId != null'>"
//            + "	and reply_user_id = #{userId}"
//            + "</if>"
//            + "<if test='state != null'>"
//            + "	and state = #{state}"
//            + "</if>"
//            + "</script>")
//    public Page<Map<String, Object>> findMsgPageList(Integer userId, Integer state);
}