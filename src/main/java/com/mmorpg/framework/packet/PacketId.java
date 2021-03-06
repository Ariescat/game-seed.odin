package com.mmorpg.framework.packet;

/**
 * 包协议号
 *
 * @author Ariescat
 * @version 2020/2/19 12:34
 */
public interface PacketId {

	/*
	 * ============================== utils 100 ==============================
	 */
	/** 请求系统心跳 */
	short REQ_SYSTEM_HEART_BEAT = 10001;
	/** 返回系统心跳 */
	short RESP_SYSTEM_HEART_BEAT = 10002;
	/** 返回错误码 或 提示信息 */
	short RESP_MESSAGE = 10003;

	/*
	 * ============================== login 101 ==============================
	 */
	/** 请求登录验证 */
	short REQ_LOGIN_AUTH = 10101;
	/** 返回验证信息 */
	short RESP_LOGIN_AUTH = 10102;
	/** 请求角色列表 */
	short REQ_CHARACTER_LIST = 10103;
	/** 返回角色列表 */
	short RESP_CHARACTER_LIST = 10104;
	/** 请求创建角色 */
	short REQ_CHARACTER_CREATE = 10105;
	/** 返回创建角色 */
	short RESP_CHARACTER_CREATE = 10106;
	/** 请求登录 */
	short REQ_LOGIN_ASK = 10107;
	/** 返回登录结果 */
	short RESP_LOGIN_ASK = 10108;
	/** 返回账号重复登录 */
	short RESP_LOGIN_CONFLICT = 10109;
	// TODO 删除角色，随机名

	/*
	 * ============================== 场景 102 ==============================
	 */
	/** 确认进入场景 */
	short REQ_CONFIRM_ENTER_SCENE = 10201;
	/** 返回确认进入场景 */
	short RESP_CONFIRM_ENTER_SCENE = 10202;
	/** 返回场景信息 */
	short RESP_SCENE_INFO = 10203;
	// TODO monster AI，Robot


	/*
	 * ============================== 技能战斗 103 ==============================
	 */


	/*
	 * ============================== 背包 仓库 104 ==============================
	 */


	/*
	 * ============================== 装备 105 ==============================
	 */


	/*
	 * ============================== 角色信息 106 （属性 形象 公会 人物面板 之类）==============================
	 */


	// TODO 商城 活动 邮件 称号 成就 组队 聊天 任务 好友 排行 交易 摆摊 快捷栏 副本 公会 VIP GM 符文 挖矿

	/*
	 * ============================== 跨服 300 ==============================
	 */
	short CROSS_PROTO_STUFF_PACKET = 30001;
}
